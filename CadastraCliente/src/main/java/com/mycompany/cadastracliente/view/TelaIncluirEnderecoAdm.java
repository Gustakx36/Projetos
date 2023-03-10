/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastracliente.view;

import com.mycompany.cadastracliente.dao.ClienteDAO;
import com.mycompany.cadastracliente.dao.CriaBanco;
import com.mycompany.cadastracliente.dao.EnderecoDAO;
import com.mycompany.cadastracliente.model.Endereco;
import javax.swing.JOptionPane;

/**
 *
 * @author Gu5t4_B
 */
public class TelaIncluirEnderecoAdm extends javax.swing.JFrame {

    EnderecoDAO enderecoInserido = new EnderecoDAO(CriaBanco.conectarBanco());
    ClienteDAO clienteBanco = new ClienteDAO(CriaBanco.conectarBanco());
    
    /**
     * Creates new form TelaAlterarEnderecoPrincipal
     */
    public TelaIncluirEnderecoAdm() {
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

        txtFixoEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btxIncluirEndereco = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtCpfNew = new javax.swing.JTextField();
        txtLoginNew = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFixoEndereco.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtFixoEndereco.setText("Endereço:");

        btxIncluirEndereco.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btxIncluirEndereco.setText("Incluir");
        btxIncluirEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxIncluirEnderecoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtLoginNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtFixoEndereco)
                .addGap(33, 33, 33)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btxIncluirEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginNew, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(txtCpfNew, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(18, 18, 18)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFixoEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpfNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoginNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btxIncluirEndereco)
                            .addComponent(btnVoltar))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btxIncluirEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxIncluirEnderecoActionPerformed
        // TODO add your handling code here:
        inseriInformacaoEndereco();
        voltarTela();
        JOptionPane.showMessageDialog (null, "Endereço incluido.");
    }//GEN-LAST:event_btxIncluirEnderecoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        voltarTela();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtLoginNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginNewActionPerformed

    public void inseriInformacaoEndereco(){
        Endereco inseriEndereco = new Endereco();
        inseriEndereco.setEndereco(txtEndereco.getText());
        inseriEndereco.setLogin(clienteBanco.pesquisaPorId(txtCpfNew.getText()));
        inseriEndereco.setRegistro(txtCpfNew.getText());
        inseriEndereco.setAtivo(true);
        
        enderecoInserido.inseriEndereco(inseriEndereco);
    }
    
    public void voltarTela(){
        TelaEnderecosAdm telaEnderecoAdm = new TelaEnderecosAdm();
        telaEnderecoAdm.enviaNomeCliente(this, txtNome.getText());
        telaEnderecoAdm.enviaCpf(this, txtCpfNew.getText());
        telaEnderecoAdm.enviaLoginSenha(this, txtLoginNew.getText());
        telaEnderecoAdm.setVisible(true);
        telaEnderecoAdm.enderecosTodosClientePorCpf();
        this.dispose();
    }
    
    public void enviaNomeCliente(TelaEnderecosAdm enviado, String nome){
        txtNome.setText(nome);
    }
    
    public void enviaCpf(TelaEnderecosAdm enviado, String cpf){
        txtCpfNew.setText(cpf);
    }
    
    public void enviaLoginSenha(TelaEnderecosAdm enviado, String login){
        txtLoginNew.setText(login);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btxIncluirEndereco;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpfNew;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JLabel txtFixoEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtLoginNew;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
