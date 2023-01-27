/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.dao;

import com.mycompany.cadastracliente.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gu5t4_B
 */
public class ClienteDAO {

    private final Connection conn;
    private boolean sucesso;
    
    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }

    public void inseriCliente(Cliente nome) {

        try ( PreparedStatement queryAddCliente = this.conn
                .prepareStatement("INSERT INTO cliente(nome, cpf, rg, email, telefone1, telefone2, datanascimento, login, ativo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");) {

            queryAddCliente.setString(1, nome.getNome());
            queryAddCliente.setString(2, nome.getCpf());
            queryAddCliente.setString(3, nome.getRg());
            queryAddCliente.setString(4, nome.getEmail());
            queryAddCliente.setString(5, nome.getTelefone1());
            queryAddCliente.setString(6, nome.getTelefone2());
            queryAddCliente.setString(7, nome.getDatanascimentoFormato());
            queryAddCliente.setInt(8, nome.getLogin());
            queryAddCliente.setBoolean(9, nome.isAtivo());
            
            queryAddCliente.execute();
            queryAddCliente.close();

        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public Cliente pesquisaCliente(int id){
        
        ResultSet resultSet;
        Cliente cliente = new Cliente();
        
        try ( PreparedStatement queryPesquisaCliente = this.conn
                .prepareStatement("SELECT * FROM cliente "
                        + "WHERE id = ?");){
            
            queryPesquisaCliente.setInt(1, id);
            
            resultSet = queryPesquisaCliente.executeQuery();
                
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setRg(resultSet.getString("rg"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setTelefone1(resultSet.getString("telefone1"));
            cliente.setTelefone2(resultSet.getString("telefone2"));
            cliente.setDataNascimento(resultSet.getString("datanascimento"));
           
            queryPesquisaCliente.close();
            resultSet.close();       
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return cliente;
    }
    
    public Cliente pesquisaClienteCpf(String cpf){
        
        ResultSet resultSet;
        Cliente cliente = new Cliente();
        
        try ( PreparedStatement queryPesquisaCliente = this.conn
                .prepareStatement("SELECT * FROM cliente "
                        + "WHERE cpf = ?");){
            
            queryPesquisaCliente.setString(1, cpf);
            
            resultSet = queryPesquisaCliente.executeQuery();
                
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setRg(resultSet.getString("rg"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setTelefone1(resultSet.getString("telefone1"));
            cliente.setTelefone2(resultSet.getString("telefone2"));
            cliente.setDataNascimento(resultSet.getString("datanascimento"));
            cliente.setAtivo(resultSet.getBoolean("ativo"));
           
            queryPesquisaCliente.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return cliente;
    }
    
    public ArrayList<Cliente> pesquisaTodosClientes(){
        
        ResultSet resultSet;
        ArrayList<Cliente> clienteTodos = new ArrayList();
        
        try ( PreparedStatement queryPesquisaCliente = this.conn
                .prepareStatement("SELECT * FROM cliente")){
            
            resultSet = queryPesquisaCliente.executeQuery();
             
            while (resultSet.next()){
                
            Cliente cliente = new Cliente();
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setRg(resultSet.getString("rg"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setTelefone1(resultSet.getString("telefone1"));
            cliente.setTelefone2(resultSet.getString("telefone2"));
            cliente.setDataNascimento(resultSet.getString("datanascimento"));
            cliente.setAtivo(resultSet.getBoolean("ativo"));

            clienteTodos.add(cliente);
            }
            
            queryPesquisaCliente.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return clienteTodos;
    }
    
    public ArrayList<Cliente> pesquisaTodosClientesPorLogin(int id){
        
        ResultSet resultSet;
        ArrayList<Cliente> clienteTodos = new ArrayList();
        
        try ( PreparedStatement queryPesquisaCliente = this.conn
                .prepareStatement("SELECT * FROM cliente "
                        + "WHERE login = ? AND ativo = 1")){
            
            queryPesquisaCliente.setInt(1, id);
            
            resultSet = queryPesquisaCliente.executeQuery();

            while (resultSet.next()){
                
            Cliente cliente = new Cliente();
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setRg(resultSet.getString("rg"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setTelefone1(resultSet.getString("telefone1"));
            cliente.setTelefone2(resultSet.getString("telefone2"));
            cliente.setDataNascimento(resultSet.getString("datanascimento"));
            cliente.setLogin(resultSet.getInt("login"));
            cliente.setAtivo(resultSet.getBoolean("ativo"));

            clienteTodos.add(cliente);
            }
            
            queryPesquisaCliente.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return clienteTodos;
    }
    
    public boolean alteraCliente(String nome, String email, String telefone1, String telefone2, String cpf) {

        try ( PreparedStatement queryAlteraCliente = this.conn
                .prepareStatement("UPDATE cliente SET nome = ?,email = ?,telefone1 = ?,telefone2 = ? WHERE cpf = ?");) {

            queryAlteraCliente.setString(1, nome);
            queryAlteraCliente.setString(2, email);
            queryAlteraCliente.setString(3, telefone1);
            queryAlteraCliente.setString(4, telefone2);
            queryAlteraCliente.setString(5, cpf);

            queryAlteraCliente.execute();
            queryAlteraCliente.close();

            sucesso = true;
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            
        }
        return sucesso;
    }
    
    public ArrayList<String> verificaCpf(){
        
        ResultSet resultSet;
        ArrayList<String> listaCpf = new ArrayList();
        
        try ( PreparedStatement queryVerificaCpf = this.conn
                .prepareStatement("SELECT cpf FROM cliente")){
            
           resultSet = queryVerificaCpf.executeQuery();
           
           while (resultSet.next()){
               
               String cpf = resultSet.getString("cpf");
               
               listaCpf.add(cpf);
               
           } 
           
            resultSet.close();
                       
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        
        return listaCpf;
        
    }
   
    public Integer pesquisaPorId(String cpf){
        
        ResultSet resultSet;
        Cliente cliente = new Cliente();
        
        try ( PreparedStatement queryPesquisaPorUltimoId = this.conn
                .prepareStatement("SELECT id FROM cliente "
                        + "WHERE cpf = ?")){
            
            queryPesquisaPorUltimoId.setString(1, cpf);
            
            resultSet = queryPesquisaPorUltimoId.executeQuery();
                
            cliente.setId(resultSet.getInt("id"));
 
            queryPesquisaPorUltimoId.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return cliente.getId();
    }
    
    public void desativarClientePorCpf(String cpf) {

        try ( PreparedStatement queryExcluiTodosCursos = this.conn
                .prepareStatement("UPDATE cliente SET ativo = 0 WHERE cpf = ?");) {

            queryExcluiTodosCursos.setString(1, cpf);

            queryExcluiTodosCursos.execute();
            queryExcluiTodosCursos.close();

            sucesso = true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Cliente> pesquisaTodosClientesPorLoginAdm(int id){
        
        ResultSet resultSet;
        ArrayList<Cliente> clienteTodos = new ArrayList();
        
        try ( PreparedStatement queryPesquisaCliente = this.conn
                .prepareStatement("SELECT * FROM cliente "
                        + "WHERE login = ?")){
            
            queryPesquisaCliente.setInt(1, id);
            
            resultSet = queryPesquisaCliente.executeQuery();

            while (resultSet.next()){
                
            Cliente cliente = new Cliente();
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setRg(resultSet.getString("rg"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setTelefone1(resultSet.getString("telefone1"));
            cliente.setTelefone2(resultSet.getString("telefone2"));
            cliente.setDataNascimento(resultSet.getString("datanascimento"));
            cliente.setLogin(resultSet.getInt("login"));
            cliente.setAtivo(resultSet.getBoolean("ativo"));

            clienteTodos.add(cliente);
            }
            
            queryPesquisaCliente.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return clienteTodos;
    }
    
    public void excluirCliente(String cpf){
        
        try ( PreparedStatement queryexcluirLogin = this.conn
                .prepareStatement("DELETE FROM cliente "
                        + "WHERE cpf = ?")){
            
            
            queryexcluirLogin.setString(1, cpf);
            queryexcluirLogin.execute();
            queryexcluirLogin.close();
                       
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
     
    }
    
    public boolean alteraClienteAdm(Cliente alterar, String cpf) {

        try ( PreparedStatement queryAlteraCliente = this.conn
                .prepareStatement("UPDATE cliente SET nome = ?, cpf = ?, rg = ?, email = ?, telefone1 = ?, telefone2 = ?, datanascimento = ?  WHERE cpf = ?");) {

            queryAlteraCliente.setString(1, alterar.getNome());
            queryAlteraCliente.setString(2, alterar.getCpf());
            queryAlteraCliente.setString(3, alterar.getRg());
            queryAlteraCliente.setString(4, alterar.getEmail());
            queryAlteraCliente.setString(5, alterar.getTelefone1());
            queryAlteraCliente.setString(6, alterar.getTelefone2());
            queryAlteraCliente.setString(7, alterar.getDatanascimentoFormato());
            queryAlteraCliente.setString(8, cpf);

            queryAlteraCliente.execute();
            queryAlteraCliente.close();

            sucesso = true;
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            
        }
        return sucesso;
    }
    
}
