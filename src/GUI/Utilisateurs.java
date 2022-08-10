
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Utilisateurs extends javax.swing.JFrame {

    public Utilisateurs() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Donner_Utilisateurs = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        Ajouter_Utilisateurs = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Modifier_Utilisateurs = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Suprrimer_Utilisateurs = new javax.swing.JLabel();
        Rechercher = new javax.swing.JLabel();
        Recherche = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        fermer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Donner_Utilisateurs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Donner_Utilisateurs.setForeground(new java.awt.Color(51, 51, 51));
        Donner_Utilisateurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Email", "N.Telephone", "Date Enregistrement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Donner_Utilisateurs.setGridColor(new java.awt.Color(193, 57, 43));
        Donner_Utilisateurs.setPreferredSize(new java.awt.Dimension(375, 16));
        Donner_Utilisateurs.setRowSelectionAllowed(false);
        Donner_Utilisateurs.setSelectionBackground(new java.awt.Color(232, 76, 61));
        jScrollPane1.setViewportView(Donner_Utilisateurs);
        if (Donner_Utilisateurs.getColumnModel().getColumnCount() > 0) {
            Donner_Utilisateurs.getColumnModel().getColumn(0).setResizable(false);
            Donner_Utilisateurs.getColumnModel().getColumn(1).setResizable(false);
            Donner_Utilisateurs.getColumnModel().getColumn(2).setResizable(false);
            Donner_Utilisateurs.getColumnModel().getColumn(3).setResizable(false);
            Donner_Utilisateurs.getColumnModel().getColumn(4).setResizable(false);
            Donner_Utilisateurs.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 820, 360));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ajouter_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adduser_hover.png"))); // NOI18N
        jPanel11.add(Ajouter_Utilisateurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modifier_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ediuser_hover.png"))); // NOI18N
        jPanel12.add(Modifier_Utilisateurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suprrimer_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deluser_hover.png"))); // NOI18N
        jPanel13.add(Suprrimer_Utilisateurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 50));

        Rechercher.setBackground(new java.awt.Color(232, 76, 61));
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Rechercher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rechercher.setText("Recherche");
        Rechercher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Rechercher.setOpaque(true);
        Rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RechercherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RechercherMouseExited(evt);
            }
        });
        jPanel10.add(Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 30));

        Recherche.setBackground(new java.awt.Color(236, 240, 241));
        Recherche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Recherche.setForeground(new java.awt.Color(51, 51, 51));
        Recherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Recherche.setText("Recherche");
        Recherche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel10.add(Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 270, 30));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, 440));

        jPanel2.setBackground(new java.awt.Color(232, 76, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        fermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fermerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fermerMouseExited(evt);
            }
        });
        jPanel2.add(fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_hover.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Utilisateurs");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        AjouterProduit addProduit = new AjouterProduit();
        this.dispose();
        addProduit.Run(false);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        Ajouter_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adduser.png")));
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        Ajouter_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adduser_hover.png")));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        AjouterProduit addProduit = new AjouterProduit();
        this.dispose();
        addProduit.Run(true);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        Modifier_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ediuser.png")));
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        Modifier_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ediuser_hover.png")));
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        Suprrimer_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deluser.png")));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        Suprrimer_Utilisateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deluser_hover.png")));
    }//GEN-LAST:event_jPanel13MouseExited

    private void RechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercherMouseClicked

    }//GEN-LAST:event_RechercherMouseClicked

    private void RechercherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercherMouseEntered
        Rechercher.setBackground(new java.awt.Color(255, 255, 255));
        Rechercher.setForeground(new java.awt.Color(232, 76, 61));
    }//GEN-LAST:event_RechercherMouseEntered

    private void RechercherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercherMouseExited
        Rechercher.setBackground(new java.awt.Color(232, 76, 61));
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_RechercherMouseExited

    private void fermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseClicked
        this.dispose();
    }//GEN-LAST:event_fermerMouseClicked

    private void fermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseEntered
        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_hover.png")));
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png")));
    }//GEN-LAST:event_fermerMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        home h = new home();
        this.dispose();
        h.Run();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_hover.png")));
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ajouter_Utilisateurs;
    private javax.swing.JTable Donner_Utilisateurs;
    private javax.swing.JLabel Modifier_Utilisateurs;
    private javax.swing.JTextField Recherche;
    private javax.swing.JLabel Rechercher;
    private javax.swing.JLabel Suprrimer_Utilisateurs;
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
