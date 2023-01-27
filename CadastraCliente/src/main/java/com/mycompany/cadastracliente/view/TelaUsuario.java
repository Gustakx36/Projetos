/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastracliente.view;

import com.mycompany.cadastracliente.dao.CriaBanco;
import com.mycompany.cadastracliente.dao.ClienteDAO;
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
public final class TelaUsuario extends javax.swing.JFrame {

    ClienteDAO clienteBanco = new ClienteDAO(CriaBanco.conectarBanco());
    LoginDAO clienteBancoLogin = new LoginDAO(CriaBanco.conectarBanco());
    
    /**
     * Creates new form TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtCpf.setEditable(false);
        txtRg.setEditable(false);
        txtDataNascimento.setEditable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFixoNome = new javax.swing.JLabel();
        txtFixoCpf = new javax.swing.JLabel();
        txtFixoRg = new javax.swing.JLabel();
        txtFixoEmail = new javax.swing.JLabel();
        txtFixoTelefone1 = new javax.swing.JLabel();
        txtFixoTelefone2 = new javax.swing.JLabel();
        txtFixoDataDeNascimento = new javax.swing.JLabel();
        txtTelefone2 = new javax.swing.JTextField();
        txtTelefone1 = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEnderecos = new javax.swing.JButton();
        btnCarrega = new javax.swing.JButton();
        btnVolta = new javax.swing.JButton();
        txtDataNascimento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnDesativar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnIncluirClientes = new javax.swing.JButton();
        txtCpfEnvia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFixoNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoNome.setText("Nome:");

        txtFixoCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoCpf.setText("CPF:");

        txtFixoRg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoRg.setText("RG:");

        txtFixoEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoEmail.setText("Email:");

        txtFixoTelefone1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoTelefone1.setText("Telefone1:");

        txtFixoTelefone2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoTelefone2.setText("Telefone2:");

        txtFixoDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFixoDataDeNascimento.setText("Data de Nascimento:");

        txtTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone2ActionPerformed(evt);
            }
        });

        txtTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone1ActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEnderecos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEnderecos.setText("Endereços");
        btnEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnderecosActionPerformed(evt);
            }
        });

        btnCarrega.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCarrega.setText("Carregar");
        btnCarrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregaActionPerformed(evt);
            }
        });

        btnVolta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnVolta.setText("Voltar");
        btnVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaActionPerformed(evt);
            }
        });

        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Email", "Telefone 1", "Telefone 2", "Data de Nascimento"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        btnDesativar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDesativar.setText("Desativar");
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnIncluirClientes.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnIncluirClientes.setText("Incluir Clientes");
        btnIncluirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirClientesActionPerformed(evt);
            }
        });

        txtCpfEnvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfEnviaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIncluirClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btnEnderecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDesativar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtCpfEnvia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCarrega, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtFixoTelefone1)
                                                .addComponent(txtFixoTelefone2)
                                                .addComponent(txtFixoDataDeNascimento))
                                            .addComponent(txtFixoRg, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(txtFixoEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtFixoCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFixoNome)
                                .addGap(127, 127, 127)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(txtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(txtTelefone2)
                                .addComponent(txtEmail)
                                .addComponent(txtTelefone1)
                                .addComponent(txtDataNascimento))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFixoNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFixoCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFixoRg)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFixoEmail))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFixoTelefone1)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFixoTelefone2)
                    .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFixoDataDeNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCarrega))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesativar)
                            .addComponent(btnIncluirClientes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolta)
                            .addComponent(btnEnderecos))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpfEnvia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaActionPerformed
        // TODO add your handling code here:
        botaoVoltar();
    }//GEN-LAST:event_btnVoltaActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        // TODO add your handling code here:
        desativarCliente();
        todosOsClientesPorId();
        JOptionPane.showMessageDialog (null, "Cliente desativado.");
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnIncluirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirClientesActionPerformed
        // TODO add your handling code here:
        abrirTelaIncluirClientes();
    }//GEN-LAST:event_btnIncluirClientesActionPerformed

    private void btnEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnderecosActionPerformed
        // TODO add your handling code here:
        abrirTelaEnderecos();
    }//GEN-LAST:event_btnEnderecosActionPerformed

    private void btnCarregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregaActionPerformed
        // TODO add your handling code here:
        CarregaLinhaTabela();
    }//GEN-LAST:event_btnCarregaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        alteraInformacao();
        apagarCampos();
        todosOsClientesPorId();
        JOptionPane.showMessageDialog (null, "Alterado com sucesso.");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone1ActionPerformed

    private void txtTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone2ActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void txtCpfEnviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfEnviaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfEnviaActionPerformed

        public void todosOsClientesPorId(){
        
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        tblCliente.setRowSorter(new TableRowSorter(modelo));
        
        modelo.setRowCount(0);
        ArrayList<Cliente> listaClientePorId = clienteBanco.pesquisaTodosClientesPorLogin(clienteBancoLogin.pegaIdLogin(txtId.getText()));
        
        listaClientePorId.forEach(a -> {
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getCpf(),
                a.getRg(),
                a.getEmail(),
                a.getTelefone1(),
                a.getTelefone2(),
                a.getDataNascimento()}
            );
        });
    }
    
    public void CarregaLinhaTabela(){
        int Linha = tblCliente.getSelectedRow();
        
        txtNome.setText(tblCliente.getModel().getValueAt(Linha, 0).toString());
        txtCpf.setText(tblCliente.getModel().getValueAt(Linha, 1).toString());
        txtRg.setText(tblCliente.getModel().getValueAt(Linha, 2).toString());
        txtEmail.setText(tblCliente.getModel().getValueAt(Linha, 3).toString());
        txtTelefone1.setText(tblCliente.getModel().getValueAt(Linha, 4).toString());
        txtTelefone2.setText(tblCliente.getModel().getValueAt(Linha, 5).toString());
        txtDataNascimento.setText(tblCliente.getModel().getValueAt(Linha, 6).toString());
    }
    
    public void apagarCampos(){
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtEmail.setText("");
        txtTelefone1.setText("");
        txtTelefone2.setText("");
        txtDataNascimento.setText("");
    }
    
    public void alteraInformacao(){
        clienteBanco.alteraCliente(txtNome.getText(),
       txtEmail.getText(), txtTelefone1.getText(),
        txtTelefone2.getText(), txtCpf.getText());
    }
    
    public void desativarCliente(){
        int Linha = tblCliente.getSelectedRow();
        
        String cpf = tblCliente.getModel().getValueAt(Linha, 1).toString();
        
        clienteBanco.desativarClientePorCpf(cpf);
    }
    
    public void abrirTelaEnderecos(){
        int Linha = tblCliente.getSelectedRow();
        TelaEnderecos telaEnderecos = new TelaEnderecos();
        telaEnderecos.enviaCpf(this, tblCliente.getModel().getValueAt(Linha, 1).toString());
        telaEnderecos.enviaId(this, txtId.getText());
        telaEnderecos.setVisible(true);
        telaEnderecos.todosOsEnderecosPorId();
        this.dispose(); 
    }
    
    public void abrirTelaIncluirClientes(){
        TelaIncluirClientes telaIncluirClientes = new TelaIncluirClientes();
        telaIncluirClientes.enviaId(this, txtId.getText());
        telaIncluirClientes.setVisible(true);
        this.dispose();
    }
    
    public void botaoVoltar(){
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        this.dispose();
    }
 
    public void enviaId(TelaLogin enviado, String id){
        txtId.setText(id);
    }
    
    public void enviaId(TelaIncluirClientes enviado, String id){
        txtId.setText(id);
    }
    
    public void enviaCpf(TelaEnderecos enviado, String cpf){
        txtCpfEnvia.setText(cpf);          
    }
    
    public void enviaId(TelaEnderecos enviado, String id){
        txtId.setText(id);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrega;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnEnderecos;
    private javax.swing.JButton btnIncluirClientes;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVolta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpfEnvia;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtFixoCpf;
    private javax.swing.JLabel txtFixoDataDeNascimento;
    private javax.swing.JLabel txtFixoEmail;
    private javax.swing.JLabel txtFixoNome;
    private javax.swing.JLabel txtFixoRg;
    private javax.swing.JLabel txtFixoTelefone1;
    private javax.swing.JLabel txtFixoTelefone2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefone1;
    private javax.swing.JTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables
}