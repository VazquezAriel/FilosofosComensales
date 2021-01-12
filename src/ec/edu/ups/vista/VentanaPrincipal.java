/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Comedor;
import ec.edu.ups.modelo.Filosofo;
import ec.edu.ups.modelo.Tenedor;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Comedor comedor;

    private Tenedor tenedor1;
    private Tenedor tenedor2;
    private Tenedor tenedor3;
    private Tenedor tenedor4;
    private Tenedor tenedor5;

    private Filosofo centauro;
    private Filosofo ciclope;
    private Filosofo fauno;
    private Filosofo kappa;
    private Filosofo minotauro;

    public VentanaPrincipal() {
        initComponents();

        comedor = new Comedor();

        tenedor1 = new Tenedor(1);
        tenedor2 = new Tenedor(2);
        tenedor3 = new Tenedor(3);
        tenedor4 = new Tenedor(4);
        tenedor5 = new Tenedor(5);

        crearFilosofos();

    }
    
    public void crearFilosofos() {
        centauro = new Filosofo("Centauro", tenedor1, tenedor2, this.jTextFieldCentauro, this.jTextFieldCentaurotxt, comedor, this.jTextAreaMensajes);
        ciclope = new Filosofo("Ciclope", tenedor2, tenedor3, this.jTextFieldCiclope, this.jTextFieldCiclopetxt, comedor, this.jTextAreaMensajes);
        fauno = new Filosofo("Fauno", tenedor3, tenedor4, this.jTextFieldFauno, this.jTextFieldFaunotxt, comedor, this.jTextAreaMensajes);
        kappa = new Filosofo("Kappa", tenedor4, tenedor5, this.jTextFieldKappa, this.jTextFieldKappatxt, comedor, this.jTextAreaMensajes);
        minotauro = new Filosofo("Minotauro", tenedor5, tenedor1, this.jTextFieldMinotauro, this.jTextFieldMinotaurotxt, comedor, this.jTextAreaMensajes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelComedor = new javax.swing.JLabel();
        jLabelCentauro = new javax.swing.JLabel();
        jLabelCiclope = new javax.swing.JLabel();
        jLabelFauno = new javax.swing.JLabel();
        jLabelKappa = new javax.swing.JLabel();
        jLabelMinotauro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCentaurotxt = new javax.swing.JTextField();
        jTextFieldCiclopetxt = new javax.swing.JTextField();
        jTextFieldFaunotxt = new javax.swing.JTextField();
        jTextFieldKappatxt = new javax.swing.JTextField();
        jTextFieldMinotaurotxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMensajes = new javax.swing.JTextArea();
        jButtonPlay = new javax.swing.JButton();
        jButtonPausa = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jLabelVeces = new javax.swing.JLabel();
        jLabelCentauro2 = new javax.swing.JLabel();
        jLabelCiclope2 = new javax.swing.JLabel();
        jLabelFauno2 = new javax.swing.JLabel();
        jLabelKappa2 = new javax.swing.JLabel();
        jLabelMinotuaro2 = new javax.swing.JLabel();
        jTextFieldCentauro = new javax.swing.JTextField();
        jTextFieldMinotauro = new javax.swing.JTextField();
        jTextFieldCiclope = new javax.swing.JTextField();
        jTextFieldKappa = new javax.swing.JTextField();
        jTextFieldFauno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Problema de los Filosofos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelComedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comedor.png"))); // NOI18N

        jLabelCentauro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCentauro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/centauro.png"))); // NOI18N
        jLabelCentauro.setText("Centauro");

        jLabelCiclope.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCiclope.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclope.png"))); // NOI18N
        jLabelCiclope.setText("Ciclope");

        jLabelFauno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelFauno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fauno.png"))); // NOI18N
        jLabelFauno.setText("Fauno");

        jLabelKappa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelKappa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kappa.png"))); // NOI18N
        jLabelKappa.setText("Kappa");

        jLabelMinotauro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMinotauro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minotauro.png"))); // NOI18N
        jLabelMinotauro.setText("Minotauro");

        jTextFieldCentaurotxt.setEditable(false);
        jTextFieldCentaurotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCiclopetxt.setEditable(false);
        jTextFieldCiclopetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldFaunotxt.setEditable(false);
        jTextFieldFaunotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldKappatxt.setEditable(false);
        jTextFieldKappatxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMinotaurotxt.setEditable(false);
        jTextFieldMinotaurotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelKappa)
                                    .addComponent(jTextFieldKappatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelComedor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMinotaurotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMinotauro))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCiclope)
                                .addComponent(jLabelCentauro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCentaurotxt))
                            .addComponent(jTextFieldCiclopetxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFaunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFauno))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabelCentauro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCentaurotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabelCiclope)
                        .addGap(17, 17, 17)
                        .addComponent(jTextFieldCiclopetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabelKappa)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldKappatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMinotauro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMinotaurotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelComedor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFauno)
                .addGap(14, 14, 14)
                .addComponent(jTextFieldFaunotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTextAreaMensajes.setEditable(false);
        jTextAreaMensajes.setColumns(20);
        jTextAreaMensajes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMensajes);

        jButtonPlay.setBackground(new java.awt.Color(102, 255, 102));
        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punta-de-flecha-del-boton-de-reproduccion.png"))); // NOI18N
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jButtonPausa.setBackground(new java.awt.Color(255, 204, 102));
        jButtonPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pausa.png"))); // NOI18N
        jButtonPausa.setEnabled(false);
        jButtonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausaActionPerformed(evt);
            }
        });

        jButtonReiniciar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.png"))); // NOI18N
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jLabelVeces.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelVeces.setText("Cuantas veces han comido:");

        jLabelCentauro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCentauro2.setText("Centauro:");

        jLabelCiclope2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCiclope2.setText("Ciclope:");

        jLabelFauno2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFauno2.setText("Fauno:");

        jLabelKappa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelKappa2.setText("Kappa:");

        jLabelMinotuaro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMinotuaro2.setText("Minotauro:");

        jTextFieldCentauro.setEditable(false);
        jTextFieldCentauro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMinotauro.setEditable(false);
        jTextFieldMinotauro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCiclope.setEditable(false);
        jTextFieldCiclope.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldKappa.setEditable(false);
        jTextFieldKappa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldFauno.setEditable(false);
        jTextFieldFauno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCiclope2)
                                    .addComponent(jLabelCentauro2)
                                    .addComponent(jLabelKappa2))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCiclope, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCentauro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldKappa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelFauno2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldFauno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelMinotuaro2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                        .addComponent(jTextFieldMinotauro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelVeces)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonPausa)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReiniciar)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelVeces)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCiclope2)
                            .addComponent(jTextFieldCiclope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMinotuaro2)
                            .addComponent(jTextFieldMinotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCentauro2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCentauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFauno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFauno2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelKappa2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldKappa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPausa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonPlay, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonReiniciar)))
                        .addGap(33, 33, 33))))
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

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        Filosofo.finalizado = false;
        crearFilosofos();
        centauro.start();
        ciclope.start();
        fauno.start();
        kappa.start();
        minotauro.start();
        this.jButtonPausa.setEnabled(true);
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausaActionPerformed
        Filosofo.finalizado = true;
        this.jButtonPausa.setEnabled(false);
        this.jButtonPlay.setEnabled(false);
    }//GEN-LAST:event_jButtonPausaActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        Filosofo.finalizado = true;
        jTextAreaMensajes.setText("");
        jTextFieldCentaurotxt.setText("");
        jTextFieldCiclopetxt.setText("");
        jTextFieldFaunotxt.setText("");
        jTextFieldKappatxt.setText("");
        jTextFieldMinotaurotxt.setText("");
        jTextFieldCentauro.setText("");
        jTextFieldCiclope.setText("");
        jTextFieldFauno.setText("");
        jTextFieldKappa.setText("");
        jTextFieldMinotauro.setText("");
        this.jButtonPlay.setEnabled(true);
        this.jButtonPausa.setEnabled(false);
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPausa;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCentauro;
    private javax.swing.JLabel jLabelCentauro2;
    private javax.swing.JLabel jLabelCiclope;
    private javax.swing.JLabel jLabelCiclope2;
    private javax.swing.JLabel jLabelComedor;
    private javax.swing.JLabel jLabelFauno;
    private javax.swing.JLabel jLabelFauno2;
    private javax.swing.JLabel jLabelKappa;
    private javax.swing.JLabel jLabelKappa2;
    private javax.swing.JLabel jLabelMinotauro;
    private javax.swing.JLabel jLabelMinotuaro2;
    private javax.swing.JLabel jLabelVeces;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMensajes;
    private javax.swing.JTextField jTextFieldCentauro;
    private javax.swing.JTextField jTextFieldCentaurotxt;
    private javax.swing.JTextField jTextFieldCiclope;
    private javax.swing.JTextField jTextFieldCiclopetxt;
    private javax.swing.JTextField jTextFieldFauno;
    private javax.swing.JTextField jTextFieldFaunotxt;
    private javax.swing.JTextField jTextFieldKappa;
    private javax.swing.JTextField jTextFieldKappatxt;
    private javax.swing.JTextField jTextFieldMinotauro;
    private javax.swing.JTextField jTextFieldMinotaurotxt;
    // End of variables declaration//GEN-END:variables
}
