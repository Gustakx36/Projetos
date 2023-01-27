/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastracliente.view;

import com.mycompany.cadastracliente.dao.ClienteDAO;
import com.mycompany.cadastracliente.dao.CriaBanco;
import com.mycompany.cadastracliente.dao.EnderecoDAO;
import com.mycompany.cadastracliente.model.Endereco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gu5t4_B
 */
public final class TelaEnderecosAdm extends javax.swing.JFrame {

    EnderecoDAO enderecoBanco = new EnderecoDAO(CriaBanco.conectarBanco());
    ClienteDAO clienteBanco = new ClienteDAO(CriaBanco.conectarBanco());
    
    /**
     * Creates new form TelaClienteEndereco
     */
    public TelaEnderecosAdm() {
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
        tblEnderecos = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        txtFixoEnderecoPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Endereço", "Login"
            }
        ));
        jScrollPane1.setViewportView(tblEnderecos);

        btnIncluir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtFixoEnderecoPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtFixoEnderecoPrincipal.setText("Endereco Principal");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("<-------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFixoEnderecoPrincipal)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 197, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFixoEnderecoPrincipal)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnVoltar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 116, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        voltar();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
        telaIncluirEnderecosAdm();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        excluirEndereço();
        enderecosTodosClientePorCpf();
        JOptionPane.showMessageDialog (null, "Endereço excluido.");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        abrirTelaAlterarEnderecos();
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    public void enderecosTodosClientePorCpf(){
        DefaultTableModel modelo = (DefaultTableModel) tblEnderecos.getModel();
        tblEnderecos.setRowSorter(new TableRowSorter(modelo));
        
        modelo.setRowCount(0);
        ArrayList<Endereco> listaEnderecoPorLogin = enderecoBanco.pesquisaTodosEnderecosPorCpf(clienteBanco.pesquisaPorId(txtCpf.getText()));
        
        listaEnderecoPorLogin.forEach(a -> {
            modelo.addRow(new Object[]{
                a.getEndereco(),
                a.getRegistro()}
            );
        });
    }
   
    public void voltar(){
        TelaClienteAdm telaClienteAdm = new TelaClienteAdm();
        telaClienteAdm.enviaLoginSenha(this, txtCpf.getText());
        telaClienteAdm.enviaLoginSenha(this, txtLogin.getText());
        telaClienteAdm.setVisible(true);
        telaClienteAdm.todosClientes();
        this.dispose();
    } 
    
    public void telaIncluirEnderecosAdm(){
        TelaIncluirEnderecoAdm telaIncluirEnderecoAdm = new TelaIncluirEnderecoAdm();
        telaIncluirEnderecoAdm.enviaCpf(this, txtCpf.getText());
        telaIncluirEnderecoAdm.enviaLoginSenha(this, txtLogin.getText());
        telaIncluirEnderecoAdm.setVisible(true);
        this.dispose();
    }
    
    public void excluirEndereço(){
        int Linha = tblEnderecos.getSelectedRow();
        String endereco = tblEnderecos.getModel().getValueAt(Linha, 0).toString();
        enderecoBanco.excluirEndereco(endereco);
    }
    
    public void abrirTelaAlterarEnderecos(){
        int Linha = tblEnderecos.getSelectedRow();
        String endereco = tblEnderecos.getModel().getValueAt(Linha, 0).toString();
        TelaAlterarEnderecoAdm telaAlterarEnderecoAdm = new TelaAlterarEnderecoAdm();
        telaAlterarEnderecoAdm.enviaEndereco(this, endereco);
        telaAlterarEnderecoAdm.enviaCpf(this, txtCpf.getText());
        telaAlterarEnderecoAdm.enviaLogin(this, txtLogin.getText());
        telaAlterarEnderecoAdm.setVisible(true);
        this.dispose();
    }
    
    public void enviaCpf(TelaClienteAdm enviado, String cpf){
        txtCpf.setText(cpf);
    }
    
    public void enviaCpf(TelaIncluirEnderecoAdm enviado, String cpf){
        txtCpf.setText(cpf);
    }
    
    public void enviaLoginSenha(TelaClienteAdm enviado, String login){
        txtLogin.setText(login);
    }
    
    public void enviaLoginSenha(TelaIncluirEnderecoAdm enviado, String login){
        txtLogin.setText(login);
    }
    
    public void enviaLogin(TelaAlterarEnderecoAdm enviado, String login){
        txtLogin.setText(login);
    }
    
    public void enviaCpf(TelaAlterarEnderecoAdm enviado, String cpf){
        txtCpf.setText(cpf);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEnderecos;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JLabel txtFixoEnderecoPrincipal;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
