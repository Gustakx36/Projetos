/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastracliente.dao;
import com.mycompany.cadastracliente.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gu5t4_B
 */
public class LoginDAO {
    
    private final Connection conn;
    private boolean sucesso;
    
    public LoginDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inseriLogin(Login cpf) {

        try ( PreparedStatement queryAddLogin = this.conn
                .prepareStatement("INSERT INTO login(usuario, senha, ativo) VALUES (?, ?, ?)");) {

            queryAddLogin.setString(1, cpf.getUsuarioLogin());
            queryAddLogin.setString(2, cpf.getSenhaLogin());
            queryAddLogin.setBoolean(3, cpf.isAtivoLogin());

            queryAddLogin.execute();
            queryAddLogin.close();

        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
    }
    
    public Login pesquisaLogin(String usuario, String senha){
        
        ResultSet resultSet;
        Login login = new Login();
        
        try ( PreparedStatement queryPesquisaLogin = this.conn
                .prepareStatement("SELECT * FROM login "
                        + "WHERE usuario = ?, senha = ?");){
            
            queryPesquisaLogin.setString(1, usuario);
            queryPesquisaLogin.setString(2, senha);
            
            resultSet = queryPesquisaLogin.executeQuery();
                
            login.setUsuarioLogin(resultSet.getString("usuario"));
            login.setSenhaLogin(resultSet.getString("senha"));
           
            queryPesquisaLogin.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return login;
    }
    
    public ArrayList<Login> verificaUsuarioseSenha(){
        
        ResultSet resultSet;
        ArrayList<Login> listaCpfeSenha = new ArrayList();
        
        try ( PreparedStatement queryVerificaUsuarioeSenha = this.conn
                .prepareStatement("SELECT usuario, senha FROM login")){
            
           resultSet = queryVerificaUsuarioeSenha.executeQuery();
           
           while (resultSet.next()){
               
               Login login = new Login();
               
               login.setUsuarioLogin(resultSet.getString("usuario"));
               login.setSenhaLogin(resultSet.getString("senha"));
               
               listaCpfeSenha.add(login);
               
           } 
           
           queryVerificaUsuarioeSenha.close();
           resultSet.close();
           
           
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        
        return listaCpfeSenha;
        
    }
    
        public ArrayList<Login> pesquisaTodosLogins(){
        
        ResultSet resultSet;
        ArrayList<Login> loginTodos = new ArrayList();
        
        try ( PreparedStatement queryPesquisaCliente = this.conn
                .prepareStatement("SELECT * FROM login")){
            
            resultSet = queryPesquisaCliente.executeQuery();
             
            while (resultSet.next()){
                
            Login login = new Login();
            login.setId(resultSet.getInt("id"));
            login.setUsuarioLogin(resultSet.getString("usuario"));
            login.setSenhaLogin(resultSet.getString("senha"));


            loginTodos.add(login);
            }
            queryPesquisaCliente.close();
            resultSet.close();
            
        }catch(SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        return loginTodos;
    }
        
        public boolean alteraLogin(String senha, String usuarioAlterado, String usuario) {

        try ( PreparedStatement queryAlteraLogin = this.conn
                .prepareStatement("UPDATE login SET usuario = ?, senha = ? WHERE usuario = ?");) {

            queryAlteraLogin.setString(1, senha);
            queryAlteraLogin.setString(2, usuarioAlterado);
            queryAlteraLogin.setString(3, usuario);
   
            queryAlteraLogin.execute();
            queryAlteraLogin.close();

            sucesso = true;
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            
        }
        return sucesso;
    }
   
    public ArrayList<String> verificaUsuario(){
        
        ResultSet resultSet;
        ArrayList<String> listaUsuarios = new ArrayList();
        
        try ( PreparedStatement queryVerificaUsuario = this.conn
                .prepareStatement("SELECT usuario FROM login")){
            
           resultSet = queryVerificaUsuario.executeQuery();
           
           
           while (resultSet.next()){
               
               String usuario = resultSet.getString("usuario");
               
               listaUsuarios.add(usuario);
               
           } 
           
            resultSet.close();
                       
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        
        return listaUsuarios;
        
    }
    
    public void excluirLogin(String usuario){
        
        try ( PreparedStatement queryexcluirLogin = this.conn
                .prepareStatement("DELETE FROM login "
                        + "WHERE usuario = ?")){
            
            
            queryexcluirLogin.setString(1, usuario);
            queryexcluirLogin.execute();
            queryexcluirLogin.close();
                       
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
     
    }
        
}
