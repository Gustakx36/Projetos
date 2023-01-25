/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gu5t4_B
 */
public class Cliente {
    private Integer id;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String telefone1;
    private String telefone2;
    private Date dataNascimentoInserir;
    private String dataNascimento;
    private boolean ativo;
    private String login;

    public Cliente(String nome, String cpf, String rg, String email, String telefone1, String telefone2, Date dataNascimentoInserir, String dataNascimento , Boolean ativo, String login) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.dataNascimentoInserir = dataNascimentoInserir;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
        this.login = login;
    }

    public Cliente(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone1
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    /**
     * @return the datanascimento
     */
    
    public String getDatanascimentoFormato() {   
        if (this.dataNascimentoInserir != null){
            return new SimpleDateFormat("dd/MM/yyyy").format(this.dataNascimentoInserir);
        }
        return null;
    }

    public Date getDataNascimentoInserir() {
        return dataNascimentoInserir;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimentoInserir(Date dataNascimentoInserir) {
        this.dataNascimentoInserir = dataNascimentoInserir;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
}
