/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.potromones.ui;

import java.util.ArrayList;
import mx.itson.potromones.modelos.Potromon;

/**
 *
 * @author Genius Lab
 */
public class PotroInfo extends javax.swing.JFrame {

    static ArrayList<Potromon> potromon = new ArrayList<>();

    /**
     * Creates new form PotroInfo
     */
    public PotroInfo() {
        initComponents();

        for (Potromon p : potromon) {
            lblPotromon.setText(p.getNombre());
            lblLvl.setText(String.valueOf(p.getNivelPoder()));
            lblP1.setText(p.getPoder1());
            lblP2.setText(p.getPoder2());
            lblP3.setText(p.getPoder3());
            lblP4.setText(p.getPoder4());
            lblEntrenador.setText(p.getEntrenador());
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

        lblPotromon = new javax.swing.JLabel();
        lblLvl = new javax.swing.JLabel();
        lblP1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblP3 = new javax.swing.JLabel();
        lblP4 = new javax.swing.JLabel();
        lblEntrenador = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPotromon.setText("Ramon aeae");

        lblLvl.setText("nivel 199");

        lblP1.setText("jLabel3");

        lblP2.setText("jLabel4");

        lblP3.setText("jLabel5");

        lblP4.setText("jLabel6");

        lblEntrenador.setText("maistro");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPotromon)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblP3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblP4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblP1)
                                    .addGap(29, 29, 29)
                                    .addComponent(lblP2))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEntrenador)
                            .addComponent(lblLvl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnRegresar)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotromon)
                    .addComponent(lblLvl))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP1)
                    .addComponent(lblP2)
                    .addComponent(lblEntrenador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP3)
                    .addComponent(lblP4))
                .addGap(33, 33, 33)
                .addComponent(btnRegresar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        EntrenadoresList home = new EntrenadoresList();
        potromon.clear();
        home.show();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(PotroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PotroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PotroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PotroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PotroInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblEntrenador;
    private javax.swing.JLabel lblLvl;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblP3;
    private javax.swing.JLabel lblP4;
    private javax.swing.JLabel lblPotromon;
    // End of variables declaration//GEN-END:variables
}
