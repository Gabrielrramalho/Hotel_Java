/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author User
 */
public class Quarto {

    private Integer numeroQuarto;
    private Integer qtd_Pessoa;
    private Integer qtd_Cama;
    private double diaria;
    private String cama_casal;
    private Integer status;
    private Integer tipodeQuarto;
    private Integer hospede_Atual;

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public Integer getQtd_Pessoa() {
        return qtd_Pessoa;
    }

    public Integer getQtd_Cama() {
        return qtd_Cama;
    }

    public double getDiaria() {
        return diaria;
    }

    public String getCama_casal() {
        return cama_casal;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getTipodeQuarto() {
        return tipodeQuarto;
    }

    public Integer getHospede_Atual() {
        return hospede_Atual;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public void setQtd_Pessoa(Integer qtd_Pessoa) {
        this.qtd_Pessoa = qtd_Pessoa;
    }

    public void setQtd_Cama(Integer qtd_Cama) {
        this.qtd_Cama = qtd_Cama;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public void setCama_casal(String cama_casal) {
        this.cama_casal = cama_casal;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setTipodeQuarto(Integer tipodeQuarto) {
        this.tipodeQuarto = tipodeQuarto;
    }

    public void setHospede_Atual(Integer hospede_Atual) {
        this.hospede_Atual = hospede_Atual;
    }
}
