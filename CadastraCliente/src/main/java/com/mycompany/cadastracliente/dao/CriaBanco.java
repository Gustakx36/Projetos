/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaBanco {

    public static Connection conectarBanco() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:BancoDeDados/BaseDeDados.db");

        } catch (SQLException e) {

            System.err.println(e.getMessage());

        }

        return null;
    }
    
}