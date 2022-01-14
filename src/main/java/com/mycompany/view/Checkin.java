/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.classes.Hospede;
import com.mycompany.classes.Quarto;
import com.mycompany.connection.InserirDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class Checkin extends javax.swing.JFrame {

    /**
     * Creates new form Checkin
     */
    public Checkin() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) Table_HospedesCadastrados.getModel();
        DefaultTableModel modeloQ = (DefaultTableModel) Table_QuartosLivres.getModel();
        Table_HospedesCadastrados.setRowSorter(new TableRowSorter(modelo));
        Table_QuartosLivres.setRowSorter(new TableRowSorter(modeloQ));

        LertableHospedes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ButtonGroup_TipodeQuarto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_HospedesCadastrados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_QuartosLivres = new javax.swing.JTable();
        Label_TabelaQuatosL = new javax.swing.JLabel();
        Label_tabelaHospedes1 = new javax.swing.JLabel();
        Label_TextoCheckIn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RadioSimples = new javax.swing.JRadioButton();
        RadioPremium = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        TextField_NumeroQuarto = new javax.swing.JTextField();
        TextField_IdHospede = new javax.swing.JTextField();
        Button_SalvarCheckin = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Table_HospedesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "Nº  DIAS", "Nº  ACOMPANHANTES"
            }
        ));
        jScrollPane1.setViewportView(Table_HospedesCadastrados);

        Table_QuartosLivres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nº Quarto", "Tipo de Quarto", "Diaria"
            }
        ));
        jScrollPane2.setViewportView(Table_QuartosLivres);

        Label_TabelaQuatosL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_TabelaQuatosL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TabelaQuatosL.setText("Quartos livres");

        Label_tabelaHospedes1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_tabelaHospedes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_tabelaHospedes1.setText("Hospedes Cadastrados");

        Label_TextoCheckIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_TextoCheckIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TextoCheckIn.setText("CheckIn");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID do Hospede:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tipo de Quarto:");

        RadioSimples.setBackground(new java.awt.Color(102, 102, 102));
        ButtonGroup_TipodeQuarto.add(RadioSimples);
        RadioSimples.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioSimples.setText("Simples");
        RadioSimples.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioSimplesMouseClicked(evt);
            }
        });
        RadioSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSimplesActionPerformed(evt);
            }
        });

        RadioPremium.setBackground(new java.awt.Color(102, 102, 102));
        ButtonGroup_TipodeQuarto.add(RadioPremium);
        RadioPremium.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RadioPremium.setText("Premium");
        RadioPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioPremiumMouseClicked(evt);
            }
        });
        RadioPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPremiumActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Numero do Quarto:");

        TextField_NumeroQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NumeroQuartoActionPerformed(evt);
            }
        });

        TextField_IdHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_IdHospedeActionPerformed(evt);
            }
        });

        Button_SalvarCheckin.setText("Salvar");
        Button_SalvarCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SalvarCheckinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Label_TextoCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RadioSimples)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioPremium))
                            .addComponent(TextField_NumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_IdHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Button_SalvarCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Label_tabelaHospedes1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Label_TabelaQuatosL, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addComponent(jScrollPane1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_tabelaHospedes1)
                    .addComponent(Label_TextoCheckIn))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextField_IdHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(RadioSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioPremium))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextField_NumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(Label_TabelaQuatosL)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_SalvarCheckin)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RadioSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSimplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioSimplesActionPerformed

    private void RadioPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPremiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioPremiumActionPerformed

    private void TextField_NumeroQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NumeroQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NumeroQuartoActionPerformed

    private void TextField_IdHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_IdHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_IdHospedeActionPerformed

    private void Button_SalvarCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SalvarCheckinActionPerformed
        InserirDAO dao = new InserirDAO();
        int numeroQuarto;
        int idHospede;
        numeroQuarto = Integer.parseInt(TextField_NumeroQuarto.getText());
        idHospede = Integer.parseInt(TextField_IdHospede.getText());
        dao.updateCheckin(numeroQuarto,idHospede);
       
    }//GEN-LAST:event_Button_SalvarCheckinActionPerformed

    private void RadioSimplesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioSimplesMouseClicked
        if(RadioSimples.isSelected()){
        LertableQuartosSimples();
        }
    }//GEN-LAST:event_RadioSimplesMouseClicked

    private void RadioPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioPremiumMouseClicked
        if(RadioPremium.isSelected()){
            LertableQuartosPremium();
        }
    }//GEN-LAST:event_RadioPremiumMouseClicked

    public void LertableHospedes() {
        DefaultTableModel modelo = (DefaultTableModel) Table_HospedesCadastrados.getModel();
        modelo.setNumRows(0);
        InserirDAO dao = new InserirDAO();
        for (Hospede h : dao.readHospedes()) {
            modelo.addRow(new Object[]{
                h.getId(),
                h.getNome(),
                h.getQtd_Dias(),
                h.getQtd_Acompanhantes()
            });
        }
    }

    public void LertableQuartosSimples() {
        DefaultTableModel modeloQ = (DefaultTableModel) Table_QuartosLivres.getModel();
        modeloQ.setNumRows(0);
        InserirDAO dao = new InserirDAO();
        String tipoQuarto = "Simples";
        for (Quarto q : dao.readQuartos()) {
            if (q.getStatus() == 0 && q.getTipodeQuarto()==0) {
                modeloQ.addRow(new Object[]{
                    q.getNumeroQuarto(),
                    tipoQuarto,
                    q.getDiaria()
                });

            }
        }
    }
    
    public void LertableQuartosPremium() {
        DefaultTableModel modeloQ = (DefaultTableModel) Table_QuartosLivres.getModel();
        modeloQ.setNumRows(0);
        InserirDAO dao = new InserirDAO();
        String tipoQuarto = "Premium";
        for (Quarto q : dao.readQuartos()) {
            if (q.getStatus() == 0 && q.getTipodeQuarto() == 1) {
                modeloQ.addRow(new Object[]{
                    q.getNumeroQuarto(),
                    tipoQuarto,
                    q.getDiaria()
                });

            }
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup_TipodeQuarto;
    private javax.swing.JButton Button_SalvarCheckin;
    private javax.swing.JLabel Label_TabelaQuatosL;
    private javax.swing.JLabel Label_TextoCheckIn;
    private javax.swing.JLabel Label_tabelaHospedes1;
    private javax.swing.JRadioButton RadioPremium;
    private javax.swing.JRadioButton RadioSimples;
    private javax.swing.JTable Table_HospedesCadastrados;
    private javax.swing.JTable Table_QuartosLivres;
    private javax.swing.JTextField TextField_IdHospede;
    private javax.swing.JTextField TextField_NumeroQuarto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}