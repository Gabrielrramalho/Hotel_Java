/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author User
 */
public class Hospede {

    private Integer id;// id do hospede    
    private String nome;//nome do hospede
    private String cpf;// cpf do hospede
    private Integer qtd_Dias;//Quantidade de dias em que o Hospede ficara no hotel no hotel.
    private Integer qtd_Acompanhantes;//Quantidade de acompanhantes junto ao hospede no quarto (MAX 4 POR QUARTO).
    private float conta;//conta do hospede

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getQtd_Dias() {
        return qtd_Dias;
    }

    public int getQtd_Acompanhantes() {
        return qtd_Acompanhantes;
    }

   

    public float getConta() {
        return conta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setQtd_Dias(int qtd_Dias) {
        this.qtd_Dias = qtd_Dias;
    }

    public void setQtd_Acompanhantes(int qtd_Acompanhantes) {
        this.qtd_Acompanhantes = qtd_Acompanhantes;
    }

    

    public void setConta(float conta) {
        this.conta = conta;
    }
    
    
    
}
