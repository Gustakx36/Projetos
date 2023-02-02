/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.dao;

import com.mycompany.cadastracliente.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gu5t4_B
 */
public class EnderecoDAO {
    
    private final Connection conn;
    private boolean sucesso;
    
    public EnderecoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inseriEndereco(Endereco endereco) {

        try ( PreparedStatement queryAddCliente = this.conn
                .prepareStatement("INSERT INTO enderecos(endereco, login, registro, ativo) VALUES (?, ?, ?, ?)");) {

            queryAddCliente.setString(1, endereco.getEndereco());
            queryAddCliente.setInt(2, endereco.getLogin());
            queryAddCliente.setString(3, endereco.getRegistro());
            queryAddCliente.setBoolean(4, endereco.isAtivo());
            
            queryAddCliente.execute();
            queryAddCliente.close();

        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public ArrayList<Endereco> pesquisaTodosEnderecosPorCpf(int login){
        
        ResultSet resultSet;
        ArrayList<Endereco> enderecoTodos = new ArrayList();
        
        try ( PreparedStatement queryPesquisaEndereco = this.conn
                .prepareStatement("SELECT * FROM enderecos "
                        + "WHERE login = ?")){
            
            queryPesquisaEndereco.setInt(1, login);
            
            resultSet = queryPesquisaEndereco.executeQuery();

            while (resultSet.next()){
                
            Endereco endereco = new Endereco();
            endereco.setId(resultSet.getInt("id"));
            endereco.setEndereco(resultSet.getString("endereco"));
            endereco.setRegistro(resultSet.getString("login"));

            enderecoTodos.add(endereco);
            }
            
            queryPesquisaEndereco.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return enderecoTodos;
    }
    
    public void alteraEnderecoPrincipal(String endereco, int login) {

        try ( PreparedStatement queryAlteraEnderecoPrincipal = this.conn
                .prepareStatement("UPDATE enderecos SET endereco = ? "
                        + "WHERE id = (SELECT min(id) FROM enderecos) AND login = ?");) {

            queryAlteraEnderecoPrincipal.setString(1, endereco);
            queryAlteraEnderecoPrincipal.setInt(1, login);
   
            queryAlteraEnderecoPrincipal.execute();
            queryAlteraEnderecoPrincipal.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            
        }
    }
    
    public void excluirEndereco(String endereco){
        
        try ( PreparedStatement queryexcluirLogin = this.conn
                .prepareStatement("DELETE FROM enderecos "
                        + "WHERE endereco = ?")){
            
            
            queryexcluirLogin.setString(1, endereco);
            queryexcluirLogin.execute();
            queryexcluirLogin.close();
                       
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
     
    }
    
    public boolean alteraEnderecoPrincipal(String endereco, String enderecoNovo) {

        try ( PreparedStatement queryAlteraEnderecoPrincipal = this.conn
                .prepareStatement("UPDATE enderecos SET endereco = ? "
                        + "WHERE endereco = ?");) {

            queryAlteraEnderecoPrincipal.setString(1, enderecoNovo);
            queryAlteraEnderecoPrincipal.setString(2, endereco);
   
            queryAlteraEnderecoPrincipal.execute();
            queryAlteraEnderecoPrincipal.close();

            sucesso = true;
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            
        }
        return sucesso;
    }
 
    public Endereco pesquisaEnderecoPrincipal(int login){
        
        ResultSet resultSet;
        Endereco endereco = new Endereco();
        
        try ( PreparedStatement queryPesquisaEndereco = this.conn
                .prepareStatement("SELECT endereco FROM enderecos "
                        + "WHERE id = (SELECT min(id) FROM enderecos) AND login = ?")){
            
            queryPesquisaEndereco.setInt(1, login);
            
            resultSet = queryPesquisaEndereco.executeQuery();
                
            endereco.setEndereco(resultSet.getString("endereco"));

            queryPesquisaEndereco.close();
            resultSet.close();
            
        } catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return endereco;
    }
    
}
