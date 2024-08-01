/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.diagnostico;

import java.util.ArrayList; // Importe a classe ArrayList
import java.util.List; // Importe a classe List

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 05750329011
 */
public class TelaCadastro extends javax.swing.JFrame {
private List<String> sintomasDoenca = new ArrayList<>();
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
       
        try {

        Connection conexao = conectarBanco();   
        String sql = "SELECT nome FROM sintomas";       
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        
        List<String> sintomas = new ArrayList<>();
        while (rs.next()) {//pega elemento por elemento da table
            String nomeSintoma = rs.getString("nome");
                sintomas.add(nomeSintoma);//Adicionando em uma array para usos futuros
                cbbx.addItem(nomeSintoma);//Adicionando na comboBox
            
        }
         pstmt.close();
        conexao.close();
        
        
    } catch (SQLException ex) {
        Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDefinicao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTratamentos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbbx = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome da Doença ou infecção:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Definição");

        txtDefinicao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDefinicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDefinicaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Observações");

        txtObservacoes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtObservacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacoesActionPerformed(evt);
            }
        });

        jLabel4.setText("Explique em poucas palavras a Doença ou infecção.");

        txtTratamentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTratamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTratamentosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Tratamentos");

        jLabel7.setText("Comente sobre as formas de tratamento.");

        cbbx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        JTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sintomas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jButton1.setText("voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRemover)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDefinicao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(cbbx, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTratamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDefinicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTratamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover)
                .addGap(7, 7, 7))
        );

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDefinicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDefinicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDefinicaoActionPerformed

    private void txtTratamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTratamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTratamentosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
       
       try {
           String nome = txtNome.getText();
           String Definicao = txtDefinicao.getText();
           String Observacoes = txtObservacoes.getText();
           String Tratamentos = txtTratamentos.getText();
        Connection conexao = conectarBanco();   
        String sqlDoenca = "INSERT INTO doencas (nome, definicao, observacao, tratamentos) VALUES (?, ?, ?, ?)";  
        
        PreparedStatement pstmt = conexao.prepareStatement(sqlDoenca);
        
        pstmt.setString(1, nome);
        pstmt.setString(2, Definicao);
        pstmt.setString(3, Observacoes);
        pstmt.setString(4, Tratamentos);
        
        pstmt.executeUpdate();
        
        for(int i = 0;i<sintomasDoenca.size();i++){
            String sqlConexao = "INSERT INTO sintomas_doencas (id_sintoma, id_doenca) VALUES (?,?)";
            pstmt = conexao.prepareStatement(sqlConexao);
            pstmt.setString(1, sintomasDoenca.get(i));
            pstmt.setString(2, nome);
            pstmt.executeUpdate();
        }
         pstmt.close();
        conexao.close();
        
        JOptionPane.showMessageDialog(null, "Doenca cadastrada com sucesso");
       txtNome.setText("");
    txtDefinicao.setText("");
    txtObservacoes.setText("");
    txtTratamentos.setText("");
    
    // Limpar a tabela
    DefaultTableModel model = (DefaultTableModel) JTable.getModel();
    model.setRowCount(0);
    
    // Limpar a lista de sintomas
    sintomasDoenca.clear();
    } catch (SQLException ex) {
        Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtObservacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacoesActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Object selecionado = cbbx.getSelectedItem();
        String selecionadoConvertido = selecionado.toString();
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
        
        
        sintomasDoenca.add(selecionadoConvertido);

// Adicionando uma nova linha com a string "Febre" na coluna "sintomas"
model.addRow(new Object[]{selecionado});

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int selectedRow = JTable.getSelectedRow();
 
        
        String valorLinha = JTable.getValueAt(selectedRow, 0).toString();//aqui eu capturo o valor da linha a ser removida para tirar da array que adiciona no banco de dados
        
    if (selectedRow != -1) {
        boolean removed = sintomasDoenca.remove(valorLinha);//Aqui é removido da arraylist
        
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
        model.removeRow(selectedRow);
        
       
        JOptionPane.showMessageDialog(this, "Linha deletada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } else {
        
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha para deletar.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          TelaMenu voltar = new TelaMenu();

        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        // Limpar os campos de texto
    txtNome.setText("");
    txtDefinicao.setText("");
    txtObservacoes.setText("");
    txtTratamentos.setText("");
    
    // Limpar a tabela
    DefaultTableModel model = (DefaultTableModel) JTable.getModel();
    model.setRowCount(0);
    
    // Limpar a lista de sintomas
    sintomasDoenca.clear();
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }
     private Connection conectarBanco() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/diagnosticoJava";
        String usuario = "root";
        String senha = "31082021";
        return DriverManager.getConnection(url,usuario,senha);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbbx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDefinicao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextField txtTratamentos;
    // End of variables declaration//GEN-END:variables
}
