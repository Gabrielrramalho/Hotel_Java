/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connection;

import com.mycompany.classes.Hospede;
import com.mycompany.classes.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class InserirDAO {

    public void create(Hospede h) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        java.sql.Date dtI = new java.sql.Date(h.getData_Entrega_Quarto().getTime());
        java.sql.Date dtF = new java.sql.Date(h.getData_Saida_Quarto().getTime());
        try {
            stmt = con.prepareStatement("INSERT INTO hospede(nome,cpf,qtd_Dias,qtd_Acompanhantes,data_inicial,data_Final)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, h.getNome());
            stmt.setString(2, h.getCpf());
            stmt.setInt(3, h.getQtd_Dias());
            stmt.setInt(4, h.getQtd_Acompanhantes());
            stmt.setDate(5, dtI);
            stmt.setDate(6, dtF);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro.." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void cretae(Quarto q) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO quarto(numero_Quarto,qtd_Pessoa,qtd_Cama,diaria,cama_Casal,status,tipodeQuarto)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, q.getNumeroQuarto());
            stmt.setInt(2, q.getQtd_Pessoa());
            stmt.setInt(3, q.getQtd_Cama());
            stmt.setDouble(4, q.getDiaria());
            stmt.setString(5, q.getCama_casal());
            stmt.setInt(6, q.getStatus());
            stmt.setInt(7, q.getTipodeQuarto());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void updateCheckin(int id, int idHospede) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Quarto quarto = new Quarto();
        int qtd_Pessoas = 0;
        for (Hospede h : readHospedes()) {
            if (h.getId() == idHospede) {
                qtd_Pessoas = h.getQtd_Acompanhantes();
            }
        }
        for (Quarto q : readQuartos()) {
            if (q.getNumeroQuarto() == id) {
                quarto = q;
            }
        }
        try {
            stmt = con.prepareStatement("UPDATE quarto SET qtd_Pessoa = ?,status = ?,hospede_Atual = ? WHERE numero_Quarto = ?");
            stmt.setInt(1, qtd_Pessoas);
            stmt.setInt(2, 1);
            stmt.setInt(3, idHospede);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Checkin Completo..");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro...");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void updateCheckout(int id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        int qtd_Pessoas = 0;
        try {
            stmt = con.prepareStatement("UPDATE quarto SET qtd_Pessoa = ?,status = ? WHERE numero_Quarto = ?");
            stmt.setInt(1, qtd_Pessoas);
            stmt.setInt(2, 0);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Checkout Completo..");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro...");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    List<Hospede> hospedes = new ArrayList<>();

    public List<Hospede> readHospedes() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM hospede");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Hospede hospede = new Hospede();
                hospede.setId(rs.getInt("id"));
                hospede.setNome(rs.getString("nome"));
                hospede.setQtd_Dias(rs.getInt("qtd_Dias"));
                hospede.setQtd_Acompanhantes(rs.getInt("qtd_Acompanhantes"));
                hospedes.add(hospede);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InserirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConection(con, stmt, rs);
        }
        return hospedes;

    }

    List<Quarto> quartos = new ArrayList<>();

    public List<Quarto> readQuartos() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM quarto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Quarto quarto = new Quarto();
                quarto.setNumeroQuarto(rs.getInt("numero_Quarto"));
                quarto.setQtd_Pessoa(rs.getInt("qtd_Pessoa"));
                quarto.setQtd_Cama(rs.getInt("qtd_Cama"));
                quarto.setDiaria(rs.getDouble("diaria"));
                quarto.setCama_casal(rs.getString("cama_Casal"));
                quarto.setStatus(rs.getInt("status"));
                quarto.setTipodeQuarto(rs.getInt("tipodeQuarto"));
                quarto.setHospede_Atual(rs.getInt("hospede_Atual"));
                quartos.add(quarto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InserirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConection(con, stmt, rs);
        }
        return quartos;
    }

}
