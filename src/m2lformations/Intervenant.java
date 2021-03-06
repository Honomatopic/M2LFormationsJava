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
public class Intervenant extends javax.swing.JFrame {

    BDD bdd = new BDD();
    Connection connexion;
    PreparedStatement reqPreparee;
    ResultSet resultat;

    /**
     * Creates new form Intervenabt
     */
    public Intervenant() {
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\netbeans-workspace\\m2lformations\\resources\\images\\m2l.png");
        this.setIconImage(icone.getImage());
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("SELECT * FROM intervenant");
            resultat = reqPreparee.executeQuery();
            table.setModel(BDD.construireTable(resultat));
        } catch (SQLException ex) {
            Logger.getLogger(Intervenant.class.getName()).log(Level.SEVERE, null, ex);
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

        labelTitreIntervenant = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelIntervenants = new javax.swing.JLabel();
        texteIntervenant = new javax.swing.JTextField();
        boutonCreer = new javax.swing.JButton();
        boutonSupprimer = new javax.swing.JButton();
        boutonModifier = new javax.swing.JButton();
        ScrollPaneIntervenant = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M2L Formations");

        labelTitreIntervenant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitreIntervenant.setText("Les intervenants des sessions de formation de l'association");

        labelId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelIntervenants.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIntervenants.setText("Le nom : ");

        texteIntervenant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
        ScrollPaneIntervenant.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(ScrollPaneIntervenant, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(boutonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(boutonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelIntervenants, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(texteIntervenant, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitreIntervenant, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(labelTitreIntervenant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIntervenants)
                            .addComponent(texteIntervenant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonSupprimer)
                    .addComponent(boutonCreer)
                    .addComponent(boutonModifier))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneIntervenant, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int ligne = table.getSelectedRow();
        labelId.setText(table.getValueAt(ligne, 0).toString());
        texteIntervenant.setText(table.getValueAt(ligne, 1).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void boutonCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonCreerActionPerformed
        // TODO add your handling code here:
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("INSERT INTO intervenant (nom) VALUES ('"
                    + texteIntervenant.getText() + "')");
            int resultatinsert = reqPreparee.executeUpdate();
            if (resultatinsert != 0) {
                JOptionPane.showMessageDialog(boutonCreer, "L'intervenant a été crée", "Evènement crée",
                        JOptionPane.INFORMATION_MESSAGE);
                table.removeAll();
                reqPreparee = connexion.prepareStatement("SELECT * FROM intervenant");
                resultat = reqPreparee.executeQuery();
                table.setModel(BDD.construireTable(resultat));
            } else {
                JOptionPane.showMessageDialog(boutonCreer, "L'intervenant n'a pas été crée", "Evènement non crée",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Intervenant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boutonCreerActionPerformed

    private void boutonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSupprimerActionPerformed
        // TODO add your handling code here:
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("DELETE FROM intervenant WHERE id='" + labelId.getText() + "'");
            int resultatsuppr = reqPreparee.executeUpdate();
            if (resultatsuppr != 0) {
                JOptionPane.showMessageDialog(boutonSupprimer, "L'intervenant a été supprimée", "Evènement supprimé",
                        JOptionPane.INFORMATION_MESSAGE);
                table.removeAll();
                reqPreparee = connexion.prepareStatement("SELECT * FROM intervenant");
                resultat = reqPreparee.executeQuery();
                table.setModel(BDD.construireTable(resultat));
            } else {
                JOptionPane.showMessageDialog(boutonSupprimer, "L'intervenant n'a pas été supprimée", "Evènement non supprimé",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Intervenant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boutonSupprimerActionPerformed

    private void boutonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonModifierActionPerformed
        // TODO add your handling code here:
        try {
            connexion = bdd.gestionnaireDeConnexion();
            reqPreparee = connexion.prepareStatement("UPDATE intervenant SET nom='" + texteIntervenant.getText() + "' WHERE id='" + labelId.getText() + "'");
            int resultatedite = reqPreparee.executeUpdate();
            if (resultatedite != 0) {
                JOptionPane.showMessageDialog(boutonModifier, "L'intervenant a été modifié", "Evènement modifié",
                        JOptionPane.INFORMATION_MESSAGE);
                table.removeAll();
                reqPreparee = connexion.prepareStatement("SELECT * FROM intervenant");
                resultat = reqPreparee.executeQuery();
                table.setModel(BDD.construireTable(resultat));
            } else {
                JOptionPane.showMessageDialog(boutonModifier, "L'intervenant n'a pas été modifié", "Evènement non modifié",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Intervenant.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Intervenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intervenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intervenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intervenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Intervenant intervenant = new Intervenant();
                intervenant.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneIntervenant;
    private javax.swing.JButton boutonCreer;
    private javax.swing.JButton boutonModifier;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIntervenants;
    private javax.swing.JLabel labelTitreIntervenant;
    private javax.swing.JTable table;
    private javax.swing.JTextField texteIntervenant;
    // End of variables declaration//GEN-END:variables
}
