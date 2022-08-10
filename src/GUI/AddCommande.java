/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author gamer
 */
public class AddCommande extends javax.swing.JFrame {

     public void Run(boolean TYPE) {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        if(TYPE){ // Moifier
           titles.setText("Modifier Une Commande"); 
         //  ICONSS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modifierPRD.png")));
           ajouter.setText("Modifier");
        }
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closes = new javax.swing.JLabel();
        returns = new javax.swing.JLabel();
        titles = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Fournisseur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Dates = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ICONSS = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        Anuller = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Donner_commande = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 76, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        closes.setText("jLabel5");
        closes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closesMouseExited(evt);
            }
        });
        jPanel1.add(closes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, -1));

        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        returns.setText("jLabel6");
        returns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnsMouseExited(evt);
            }
        });
        jPanel1.add(returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        titles.setBackground(new java.awt.Color(255, 255, 255));
        titles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titles.setForeground(new java.awt.Color(255, 255, 255));
        titles.setText("Ajouter commande");
        jPanel1.add(titles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(232, 76, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fournisseur.setBackground(new java.awt.Color(236, 240, 241));
        Fournisseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fournisseur.setForeground(new java.awt.Color(51, 51, 51));
        Fournisseur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(Fournisseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 57, 43));
        jLabel3.setText("Fournisseur:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(193, 57, 43));
        jLabel9.setText("Designation et Quantité:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        Dates.setBackground(new java.awt.Color(236, 240, 241));
        Dates.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dates.setForeground(new java.awt.Color(51, 51, 51));
        Dates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(Dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 270, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(193, 57, 43));
        jLabel8.setText("Date :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        ICONSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ICONSS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addCommands.png"))); // NOI18N
        jPanel2.add(ICONSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 100));

        ajouter.setBackground(new java.awt.Color(232, 76, 61));
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ajouter.setText("Ajouter");
        ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        ajouter.setOpaque(true);
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterMouseExited(evt);
            }
        });
        jPanel2.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 100, 30));

        Anuller.setBackground(new java.awt.Color(255, 255, 255));
        Anuller.setForeground(new java.awt.Color(51, 51, 51));
        Anuller.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anuller.setText("Annuler");
        Anuller.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Anuller.setOpaque(true);
        Anuller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnullerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnullerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnullerMouseExited(evt);
            }
        });
        jPanel2.add(Anuller, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 100, 30));

        Donner_commande.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Donner_commande.setForeground(new java.awt.Color(51, 51, 51));
        Donner_commande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Designation", "Qt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Donner_commande.setGridColor(new java.awt.Color(193, 57, 43));
        Donner_commande.setPreferredSize(new java.awt.Dimension(375, 16));
        Donner_commande.setRowSelectionAllowed(false);
        Donner_commande.setSelectionBackground(new java.awt.Color(232, 76, 61));
        jScrollPane1.setViewportView(Donner_commande);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 580, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked

    }//GEN-LAST:event_ajouterMouseClicked

    private void ajouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseEntered
        ajouter.setBackground(new java.awt.Color(255, 255, 255));
        ajouter.setForeground(new java.awt.Color(232, 76, 61));
    }//GEN-LAST:event_ajouterMouseEntered

    private void ajouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseExited
        ajouter.setBackground(new java.awt.Color(232, 76, 61));
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_ajouterMouseExited

    private void AnullerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnullerMouseClicked

    }//GEN-LAST:event_AnullerMouseClicked

    private void AnullerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnullerMouseEntered
        Anuller.setForeground(new java.awt.Color(193, 57, 43));
        Anuller.setBackground(new java.awt.Color(236, 240, 241));
    }//GEN-LAST:event_AnullerMouseEntered

    private void AnullerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnullerMouseExited
        Anuller.setForeground(new java.awt.Color(51, 51, 51));
        Anuller.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_AnullerMouseExited

    private void returnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseClicked
        Fournisseur fournisseur = new Fournisseur();
        this.dispose();
        fournisseur.Run();
    }//GEN-LAST:event_returnsMouseClicked

    private void returnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseEntered
       returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_hover.png")));
    }//GEN-LAST:event_returnsMouseEntered

    private void returnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseExited
        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png")));
    }//GEN-LAST:event_returnsMouseExited

    private void closesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closesMouseEntered
        closes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_hover.png")));
    }//GEN-LAST:event_closesMouseEntered

    private void closesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closesMouseExited
        closes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png")));
    }//GEN-LAST:event_closesMouseExited

    private void closesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closesMouseClicked
        this.dispose();
    }//GEN-LAST:event_closesMouseClicked

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anuller;
    private javax.swing.JTextField Dates;
    private javax.swing.JTable Donner_commande;
    private javax.swing.JTextField Fournisseur;
    private javax.swing.JLabel ICONSS;
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel closes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel returns;
    private javax.swing.JLabel titles;
    // End of variables declaration//GEN-END:variables
}
