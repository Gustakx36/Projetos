/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gu5t4_B
 */
public class CriaTabela {
        
    public void criaTabelas(Connection conn){
        
        try ( PreparedStatement queryLogin = conn.prepareStatement("CREATE TABLE IF NOT EXISTS login ("
                + "id INTEGER PRIMARY KEY,"
                + "usuario TEXT,"
                + "senha TEXT,"
                + "ativo INTEGER NOT NULL DEFAULT 1)");
                
                PreparedStatement queryCliente = conn.prepareStatement("CREATE TABLE IF NOT EXISTS cliente ("
                + "id INTEGER PRIMARY KEY,"
                + "nome TEXT NOT NULL,"
                + "cpf TEXT,"
                + "rg TEXT,"
                + "email TEXT,"
                + "telefone1 TEXT,"
                + "telefone2 TEXT,"
                + "datanascimento TEXT,"
                + "login INTEGER,"
                + "ativo INTEGER NOT NULL DEFAULT 1)");                 
                
                PreparedStatement queryEndereco = conn.prepareStatement("CREATE TABLE IF NOT EXISTS enderecos ("
                + "id INTEGER PRIMARY KEY,"
                + "endereco TEXT,"
                + "login TEXT,"
                + "registro INTEGER,"
                + "ativo INTEGER NOT NULL DEFAULT 1)")){
            
            queryCliente.execute();
            queryLogin.execute();
            queryEndereco.execute();

            queryCliente.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
  
}

