
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AjouterProduit extends javax.swing.JFrame {

    public void Run(boolean TYPE) {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        if(TYPE){ // Moifier
           titles.setText("Modifier Un Produit"); 
           jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modifierPRD.png")));
           ajouter.setText("Modifier");
        }
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titles = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        designation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        annuler = new javax.swing.JLabel();
        type_produit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date_exp = new javax.swing.JTextField();
        quantite_min = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantite_stock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        prix_vente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(200, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 76, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        titles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titles.setForeground(new java.awt.Color(255, 255, 255));
        titles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titles.setText("Ajouter Un Produit");
        jPanel1.add(titles, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 8, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        designation.setBackground(new java.awt.Color(236, 240, 241));
        designation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        designation.setForeground(new java.awt.Color(51, 51, 51));
        designation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 57, 43));
        jLabel3.setText("Designation:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

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
        jPanel2.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 100, 30));

        annuler.setBackground(new java.awt.Color(255, 255, 255));
        annuler.setForeground(new java.awt.Color(51, 51, 51));
        annuler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        annuler.setText("Annuler");
        annuler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        annuler.setOpaque(true);
        annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                annulerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                annulerMouseExited(evt);
            }
        });
        jPanel2.add(annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 100, 30));

        type_produit.setBackground(new java.awt.Color(236, 240, 241));
        type_produit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type_produit.setForeground(new java.awt.Color(51, 51, 51));
        type_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(type_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 270, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(193, 57, 43));
        jLabel6.setText("Type de Produit:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(193, 57, 43));
        jLabel7.setText("Date d'expiration");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        date_exp.setBackground(new java.awt.Color(236, 240, 241));
        date_exp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date_exp.setForeground(new java.awt.Color(51, 51, 51));
        date_exp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(date_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 30));

        quantite_min.setBackground(new java.awt.Color(236, 240, 241));
        quantite_min.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantite_min.setForeground(new java.awt.Color(51, 51, 51));
        quantite_min.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        quantite_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantite_minActionPerformed(evt);
            }
        });
        jPanel2.add(quantite_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 270, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(193, 57, 43));
        jLabel9.setText("Quantité Minimum:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        quantite_stock.setBackground(new java.awt.Color(236, 240, 241));
        quantite_stock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantite_stock.setForeground(new java.awt.Color(51, 51, 51));
        quantite_stock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(quantite_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 270, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(193, 57, 43));
        jLabel10.setText("Quantité En Stock:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(193, 57, 43));
        jLabel11.setText("Prix De Vente:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, 30));

        prix_vente.setBackground(new java.awt.Color(236, 240, 241));
        prix_vente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prix_vente.setForeground(new java.awt.Color(51, 51, 51));
        prix_vente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(prix_vente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 270, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddProduit.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();  
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_hover.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png")));
    }//GEN-LAST:event_jLabel1MouseExited

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

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        
    }//GEN-LAST:event_annulerMouseClicked

    private void annulerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseEntered
        annuler.setForeground(new java.awt.Color(193, 57, 43));
        annuler.setBackground(new java.awt.Color(236, 240, 241));
    }//GEN-LAST:event_annulerMouseEntered

    private void annulerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseExited
        annuler.setForeground(new java.awt.Color(51, 51, 51));
        annuler.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_annulerMouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_hover.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Produit P = new Produit();
        this.dispose();
        P.Run();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void quantite_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantite_minActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantite_minActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel annuler;
    private javax.swing.JTextField date_exp;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField prix_vente;
    private javax.swing.JTextField quantite_min;
    private javax.swing.JTextField quantite_stock;
    private javax.swing.JLabel titles;
    private javax.swing.JTextField type_produit;
    // End of variables declaration//GEN-END:variables
}
