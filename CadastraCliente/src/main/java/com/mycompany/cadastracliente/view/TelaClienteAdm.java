/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastracliente.view;

import com.mycompany.cadastracliente.dao.ClienteDAO;
import com.mycompany.cadastracliente.dao.CriaBanco;
import com.mycompany.cadastracliente.dao.LoginDAO;
import com.mycompany.cadastracliente.model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gu5t4_B
 */
public class TelaClienteAdm extends javax.swing.JFrame {

    ClienteDAO clienteBanco = new ClienteDAO(CriaBanco.conectarBanco());
    LoginDAO clienteBancoLogin = new LoginDAO(CriaBanco.conectarBanco());
    
    /**
     * Creates new form ClienteAdm
     */
    public TelaClienteAdm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClienteAdm = new javax.swing.JTable();
        txtLogin = new javax.swing.JTextField();
        btnEndereços = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClienteAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Email", "Telefone 1", "Telefone 2", "Data de Aniversario", "Login", "Ativo"
            }
        ));
        jScrollPane1.setViewportView(tblClienteAdm);

        btnEndereços.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEndereços.setText("Endereços");
        btnEndereços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndereçosActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAtivar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAtivar.setText("Ativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnEndereços)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(206, 206, 206))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtivar)
                    .addComponent(btnIncluir))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEndereços)
                    .addComponent(btnVoltar))
                .addGap(28, 28, 28)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIncluir)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtivar)
                    .addComponent(btnAlterar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEndereçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndereçosActionPerformed
        // TODO add your handling code here:
        telaEnderecosAdm();
        this.dispose();
    }//GEN-LAST:event_btnEndereçosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        botaoVoltar();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        telaIncluirClientesAdm();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        deletaUsuarioLogin();
        JOptionPane.showMessageDialog (null, "Cliente excluido.");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        telaAlterarCliente();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        // TODO add your handling code here:
        ativarCliente();
        todosClientes();
    }//GEN-LAST:event_btnAtivarActionPerformed

    public void todosClientes(){
        DefaultTableModel modelo = (DefaultTableModel) tblClienteAdm.getModel();
        tblClienteAdm.setRowSorter(new TableRowSorter(modelo));
        
        modelo.setRowCount(0);
        ArrayList<Cliente> listaLogins = clienteBanco.pesquisaTodosClientesPorLoginAdm(clienteBancoLogin.pegaIdLogin(txtLogin.getText()));
        
        listaLogins.forEach(a -> {
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getCpf(),
                a.getRg(),
                a.getEmail(),
                a.getTelefone1(),
                a.getTelefone2(),
                a.getDataNascimento(),
                txtLogin.getText(),
                a.isAtivo()}
            );
        });
    }
    
    public void deletaUsuarioLogin(){
        int Linha = tblClienteAdm.getSelectedRow();
        String cpf = tblClienteAdm.getModel().getValueAt(Linha, 1).toString();
        clienteBanco.excluirCliente(cpf);
        todosClientes();
    }
    
    public void ativarCliente(){
        int Linha = tblClienteAdm.getSelectedRow(); 
        String cpf = tblClienteAdm.getModel().getValueAt(Linha, 1).toString();
        clienteBanco.ativarClientePorCpf(cpf);
    }
    
    public void botaoVoltar(){
        TelaLoginsAdm telaLoginsAdm = new TelaLoginsAdm();
        telaLoginsAdm.setVisible(true);
        this.dispose();
    }
    
    public void telaIncluirClientesAdm(){
        TelaIncluirClientesAdm telaIncluirClienteAdm = new TelaIncluirClientesAdm();
        telaIncluirClienteAdm.enviaId(this, txtLogin.getText());
        telaIncluirClienteAdm.setVisible(true);
        this.dispose();
    }
    
    public void telaEnderecosAdm(){
        int Linha = tblClienteAdm.getSelectedRow();
        String cpf = tblClienteAdm.getModel().getValueAt(Linha, 1).toString();
        String nome = tblClienteAdm.getModel().getValueAt(Linha, 0).toString();
        TelaEnderecosAdm telaClienteEndereco = new TelaEnderecosAdm();
        telaClienteEndereco.enviaCpf(this, cpf);
        telaClienteEndereco.enviaNomeCliente(this, nome);
        telaClienteEndereco.enviaLoginSenha(this, txtLogin.getText());
        telaClienteEndereco.setVisible(true);
        telaClienteEndereco.enderecosTodosClientePorCpf();
        this.dispose();
    }
    
    public void telaAlterarCliente(){
        int Linha = tblClienteAdm.getSelectedRow();
        String nome = tblClienteAdm.getModel().getValueAt(Linha, 0).toString();
        String cpf = tblClienteAdm.getModel().getValueAt(Linha, 1).toString();
        String rg = tblClienteAdm.getModel().getValueAt(Linha, 2).toString();
        String email = tblClienteAdm.getModel().getValueAt(Linha, 3).toString();
        String telefone1 = tblClienteAdm.getModel().getValueAt(Linha, 4).toString();
        String telefone2 = tblClienteAdm.getModel().getValueAt(Linha, 5).toString();
        TelaAlterarClienteAdm telaAlterarClienteAdm = new TelaAlterarClienteAdm();
        telaAlterarClienteAdm.enviaLogin(this, txtLogin.getText());
        telaAlterarClienteAdm.enviaLoginSenha(this, cpf);
        telaAlterarClienteAdm.enviaInformacoes(this, nome, cpf, rg, email, telefone1, telefone2);
        telaAlterarClienteAdm.setVisible(true);
        this.dispose();
    }
    
    public void enviaLoginSenha(TelaLoginsAdm enviado, String login){
        txtLogin.setText(login);
    } 
    
    public void enviaLoginSenha(TelaIncluirClientesAdm enviado, String login){
        txtLogin.setText(login);
    } 
    
    public void enviaLoginSenha(TelaEnderecosAdm enviado, String login){
        txtLogin.setText(login);
    }
    
    public void enviaLoginSenha(TelaAlterarClienteAdm enviado, String login){
        txtLogin.setText(login);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtivar;
    private javax.swing.JButton btnEndereços;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClienteAdm;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
