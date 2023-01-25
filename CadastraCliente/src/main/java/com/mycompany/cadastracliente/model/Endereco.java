/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.model;

/**
 *
 * @author Gu5t4_B
 */
public class Endereco {
    
    private int id;
    private String endereco;
    private String login;
    private String registro;
    private boolean ativo;

    public Endereco(int id, String endereco, String login, String registro, boolean ativo) {
        this.id = id;
        this.endereco = endereco;
        this.login = login;
        this.registro = registro;
        this.ativo = ativo;
    }
    
    public Endereco(){
        
    }
    
    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLogin() {
        return login;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
      
}
