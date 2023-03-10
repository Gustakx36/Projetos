/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastracliente.view;

import com.mycompany.cadastracliente.dao.CriaBanco;
import com.mycompany.cadastracliente.dao.EnderecoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Gu5t4_B
 */
public class TelaAlterarEnderecoAdm extends javax.swing.JFrame {

    EnderecoDAO enderecoAlterado = new EnderecoDAO(CriaBanco.conectarBanco());
    
    /**
     * Creates new form TelaAlterarEnderecoPrincipal
     */
    public TelaAlterarEnderecoAdm() {
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
        btxAlterarEndereco = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtEnderecoAntigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFixoEndereco.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtFixoEndereco.setText("Endereço Novo:");

        btxAlterarEndereco.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btxAlterarEndereco.setText("Alterar");
        btxAlterarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxAlterarEnderecoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtFixoEndereco)
                        .addGap(33, 33, 33)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtEnderecoAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btxAlterarEndereco)
                        .addGap(134, 134, 134)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)
                        .addGap(73, 73, 73)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFixoEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnderecoAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btxAlterarEndereco)
                            .addComponent(btnVoltar))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btxAlterarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxAlterarEnderecoActionPerformed
        // TODO add your handling code here:
        telaAlteraEndereco();
        voltarTela();
        JOptionPane.showMessageDialog (null, "Endereço alterado.");
    }//GEN-LAST:event_btxAlterarEnderecoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        voltarTela();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    public void telaAlteraEndereco(){
        enderecoAlterado.alteraEnderecoPrincipal(txtEnderecoAntigo.getText(), txtEndereco.getText());
    }
    
    public void voltarTela(){
        TelaEnderecosAdm telaEnderecoAdm = new TelaEnderecosAdm();
        telaEnderecoAdm.enviaNomeCliente(this, txtNome.getText());
        telaEnderecoAdm.enviaLogin(this, txtId.getText());
        telaEnderecoAdm.enviaCpf(this, txtCpf.getText());
        telaEnderecoAdm.setVisible(true);
        telaEnderecoAdm.enderecosTodosClientePorCpf();
        this.dispose();
    }
    
    public void enviaCpf(TelaEnderecosAdm enviado, String cpf){
        txtCpf.setText(cpf);
    }
    
    public void enviaLogin(TelaEnderecosAdm enviado, String id){
        txtId.setText(id);
    }
    
    public void enviaEndereco(TelaEnderecosAdm enviado, String endereco){
        txtEnderecoAntigo.setText(endereco);
    }
    
    public void enviaNomeCliente(TelaEnderecosAdm enviado, String nome){
        txtNome.setText(nome);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btxAlterarEndereco;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEnderecoAntigo;
    private javax.swing.JLabel txtFixoEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
