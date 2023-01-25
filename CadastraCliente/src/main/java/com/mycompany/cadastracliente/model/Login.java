/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.model;

/**
 *
 * @author Gu5t4_B
 */
public class Login {
    
    private int id;
    private String UsuarioLogin;
    private String senhaLogin;
    private boolean ativoLogin;

    public Login() {
    }
    
    public Login(int id, String cpfLogin, String senhaLogin,boolean ativoLogin) {
        this.id = id;
        this.UsuarioLogin = cpfLogin;
        this.senhaLogin = senhaLogin;
        this.ativoLogin = ativoLogin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isAtivoLogin() {
        return ativoLogin;
    }

    public void setAtivoLogin(boolean ativoLogin) {
        this.ativoLogin = ativoLogin;
    }

    public String getUsuarioLogin() {
        return UsuarioLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setUsuarioLogin(String cpfLogin) {
        this.UsuarioLogin = cpfLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
    
}
