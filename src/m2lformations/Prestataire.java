/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2lformations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Honoré
 */
public class Prestataire extends javax.swing.JFrame {

    BDD bdd = new BDD();
    Connection connexion;
    PreparedStatement reqPreparee;
    ResultSet resultat;

    /**
     * Creates new form Prestatare
     */
    public Prestataire() {
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\netbeans-workspace\\m2lformations\\resources\\images\\m2l.png");
        this.setIconImage(icone.getImage());
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("SELECT * FROM prestataire");
            resultat = reqPreparee.executeQuery();
            table.setModel(BDD.construireTable(resultat));
        } catch (SQLException ex) {
            Logger.getLogger(Prestataire.class.getName()).log(Level.SEVERE, null, ex);
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

        labelTitrePrestataire = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelPrestataires = new javax.swing.JLabel();
        textePrestataire = new javax.swing.JTextField();
        boutonCreer = new javax.swing.JButton();
        boutonSupprimer = new javax.swing.JButton();
        boutonModifier = new javax.swing.JButton();
        ScrollPanePrestataire = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M2L Formations");

        labelTitrePrestataire.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitrePrestataire.setText("Les prestataires des sessions de formation");

        labelId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelPrestataires.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPrestataires.setText("Le nom : ");

        textePrestataire.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        boutonCreer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boutonCreer.setText("Créer");
        boutonCreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonCreerActionPerformed(evt);
            }
        });

        boutonSupprimer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boutonSupprimer.setText("Supprimer");
        boutonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSupprimerActionPerformed(evt);
            }
        });

        boutonModifier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boutonModifier.setText("Modifier");
        boutonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonModifierActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        ScrollPanePrestataire.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitrePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(boutonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(boutonSupprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollPanePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(labelPrestataires, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitrePrestataire)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrestataires, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonCreer)
                    .addComponent(boutonSupprimer)
                    .addComponent(boutonModifier))
                .addGap(18, 18, 18)
                .addComponent(ScrollPanePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int ligne = table.getSelectedRow();
        labelId.setText(table.getValueAt(ligne, 0).toString());
        textePrestataire.setText(table.getValueAt(ligne, 1).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void boutonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonCreerActionPerformed
        // TODO add your handling code here:
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("INSERT INTO prestataire (nom) VALUES ('"
                    + textePrestataire.getText() + "')");
            int resultatinsert = reqPreparee.executeUpdate();
            if (resultatinsert != 0) {
                JOptionPane.showMessageDialog(boutonCreer, "Le prestataire a été crée", "Evènement crée",
                        JOptionPane.INFORMATION_MESSAGE);
                table.removeAll();
                reqPreparee = connexion.prepareStatement("SELECT * FROM prestataire");
                resultat = reqPreparee.executeQuery();
                table.setModel(BDD.construireTable(resultat));
            } else {
                JOptionPane.showMessageDialog(boutonCreer, "Le prestataire n'a pas été crée", "Evènement non crée",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestataire.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boutonCreerActionPerformed

    private void boutonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSupprimerActionPerformed
        // TODO add your handling code here:
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("DELETE FROM prestataire WHERE id='" + labelId.getText() + "'");
            int resultatsuppr = reqPreparee.executeUpdate();
            if (resultatsuppr != 0) {
                JOptionPane.showMessageDialog(boutonSupprimer, "Le prestataire a été supprimé", "Evènement supprimé",
                        JOptionPane.INFORMATION_MESSAGE);
                table.removeAll();
                reqPreparee = connexion.prepareStatement("SELECT * FROM prestataire");
                resultat = reqPreparee.executeQuery();
                table.setModel(BDD.construireTable(resultat));
            } else {
                JOptionPane.showMessageDialog(boutonSupprimer, "Le prestataire n'a pas été supprimé", "Evènement non supprimé",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestataire.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boutonSupprimerActionPerformed

    private void boutonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonModifierActionPerformed
        // TODO add your handling code here:
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("UPDATE prestataire SET nom='" + textePrestataire.getText() + "' WHERE id='" + labelId.getText() + "'");
            int resultatedite = reqPreparee.executeUpdate();
            if (resultatedite != 0) {
                JOptionPane.showMessageDialog(boutonModifier, "Le prestataire a été modifié", "Evènement modifié",
                        JOptionPane.INFORMATION_MESSAGE);
                table.removeAll();
                reqPreparee = connexion.prepareStatement("SELECT * FROM prestataire");
                resultat = reqPreparee.executeQuery();
                table.setModel(BDD.construireTable(resultat));
            } else {
                JOptionPane.showMessageDialog(boutonModifier, "Le prestataire n'a pas été modifié", "Evénement non modifié",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestataire.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boutonModifierActionPerformed

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
            java.util.logging.Logger.getLogger(Prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Prestataire prestataire = new Prestataire();
                prestataire.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPanePrestataire;
    private javax.swing.JButton boutonCreer;
    private javax.swing.JButton boutonModifier;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelPrestataires;
    private javax.swing.JLabel labelTitrePrestataire;
    private javax.swing.JTable table;
    private javax.swing.JTextField textePrestataire;
    // End of variables declaration//GEN-END:variables
}
