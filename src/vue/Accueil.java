/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import model.Edition;

/**
 *
 * @author utiae
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
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
        edition = new javax.swing.JButton();
        inscrireCoureur = new javax.swing.JButton();
        inscrireEquipe = new javax.swing.JButton();
        courses = new javax.swing.JButton();
        classements = new javax.swing.JButton();
        conformite = new javax.swing.JButton();
        validerClassement = new javax.swing.JButton();
        temps = new javax.swing.JButton();
        eliminer = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fédération Française de cyclisme");

        edition.setLabel("Edition");
        edition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editionMouseClicked(evt);
            }
        });
        edition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editionActionPerformed(evt);
            }
        });

        inscrireCoureur.setLabel("S'inscrite à une course");
        inscrireCoureur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscrireCoureurMouseClicked(evt);
            }
        });
        inscrireCoureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrireCoureurActionPerformed(evt);
            }
        });

        inscrireEquipe.setLabel("Inscrire équipe");
        inscrireEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscrireEquipeMouseClicked(evt);
            }
        });
        inscrireEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrireEquipeActionPerformed(evt);
            }
        });

        courses.setText("Consulter courses");

        classements.setText("Consulter classement");

        conformite.setText("Conformité inscriptions");
        conformite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conformiteMouseClicked(evt);
            }
        });
        conformite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conformiteActionPerformed(evt);
            }
        });

        validerClassement.setText("Valider classement");

        temps.setText("Enregistrer temps");

        eliminer.setText("Eliminer coureur");

        jButton5.setText("Sprint");

        jButton6.setText("Col");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edition)
                    .addComponent(inscrireCoureur)
                    .addComponent(inscrireEquipe)
                    .addComponent(courses)
                    .addComponent(classements))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conformite)
                    .addComponent(validerClassement)
                    .addComponent(temps)
                    .addComponent(eliminer)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(40, 40, 40)
                        .addComponent(jButton6)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edition)
                    .addComponent(conformite))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscrireCoureur)
                    .addComponent(validerClassement))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscrireEquipe)
                    .addComponent(temps))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courses)
                    .addComponent(eliminer))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classements)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editionActionPerformed

    private void inscrireCoureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrireCoureurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscrireCoureurActionPerformed

    private void inscrireEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrireEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscrireEquipeActionPerformed

    private void editionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editionMouseClicked
        // TODO add your handling code here:
        OrganisationEdition a;
        a = new OrganisationEdition();
        a.setVisible(true);
        
    }//GEN-LAST:event_editionMouseClicked

    private void inscrireCoureurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireCoureurMouseClicked
        // TODO add your handling code here:
        InscriptionCoureur ic =new InscriptionCoureur();
        ic.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inscrireCoureurMouseClicked

    private void inscrireEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireEquipeMouseClicked
        // TODO add your handling code here:
        InscriptionEquipe inscrireEquipe = new InscriptionEquipe();
        inscrireEquipe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inscrireEquipeMouseClicked

    private void conformiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conformiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conformiteActionPerformed

    private void conformiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conformiteMouseClicked
        // TODO add your handling code here:
        Verification conf = new Verification();
        conf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_conformiteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classements;
    private javax.swing.JButton conformite;
    private javax.swing.JButton courses;
    private javax.swing.JButton edition;
    private javax.swing.JButton eliminer;
    private javax.swing.JButton inscrireCoureur;
    private javax.swing.JButton inscrireEquipe;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton temps;
    private javax.swing.JButton validerClassement;
    // End of variables declaration//GEN-END:variables
}
