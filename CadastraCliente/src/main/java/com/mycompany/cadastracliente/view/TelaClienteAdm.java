/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastracliente.view;

import com.mycompany.cadastracliente.dao.ClienteDAO;
import com.mycompany.cadastracliente.dao.CriaBanco;
import com.mycompany.cadastracliente.model.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gu5t4_B
 */
public class TelaClienteAdm extends javax.swing.JFrame {

    ClienteDAO clienteBanco = new ClienteDAO(CriaBanco.conectarBanco());
    
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnEndereços)
                .addGap(81, 81, 81)
                .addComponent(btnIncluir)
                .addGap(117, 117, 117)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnAlterar)
                .addGap(91, 91, 91)
                .addComponent(btnVoltar)
                .addGap(92, 92, 92))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEndereços)
                    .addComponent(btnIncluir)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addGap(44, 44, 44)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEndereçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndereçosActionPerformed
        // TODO add your handling code here:
        telaClienteEndereco();
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
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        alterarCliente();
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void todosClientes(){
        DefaultTableModel modelo = (DefaultTableModel) tblClienteAdm.getModel();
        tblClienteAdm.setRowSorter(new TableRowSorter(modelo));
        
        modelo.setRowCount(0);
        ArrayList<Cliente> listaLogins = clienteBanco.pesquisaTodosClientesPorLoginAdm(txtLogin.getText());
        
        listaLogins.forEach(a -> {
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getCpf(),
                a.getRg(),
                a.getEmail(),
                a.getTelefone1(),
                a.getTelefone2(),
                a.getDataNascimento(),
                a.getLogin(),
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
    
    public void telaClienteEndereco(){
        int Linha = tblClienteAdm.getSelectedRow();
        String cpf = tblClienteAdm.getModel().getValueAt(Linha, 1).toString();
        TelaEnderecosAdm telaClienteEndereco = new TelaEnderecosAdm();
        telaClienteEndereco.enviaLogin(this, cpf);
        telaClienteEndereco.enviaLoginSenha(this, txtLogin.getText());
        telaClienteEndereco.setVisible(true);
        telaClienteEndereco.EnderecosTodosClientePorPdf();
        this.dispose();
    }
    
    public void alterarCliente(){
        int Linha = tblClienteAdm.getSelectedRow();
        String cpf = tblClienteAdm.getModel().getValueAt(Linha, 1).toString();
        TelaAlterarClienteAdm telaAlterarClienteAdm = new TelaAlterarClienteAdm();
        telaAlterarClienteAdm.enviaLogin(this, txtLogin.getText());
        telaAlterarClienteAdm.enviaLoginSenha(this, cpf);
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
    private javax.swing.JButton btnEndereços;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClienteAdm;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
