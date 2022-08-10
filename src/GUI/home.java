
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class home extends javax.swing.JFrame {

    public void Run() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
         getRootPane().setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(208, 208, 208)));
        this.setVisible(true);
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
        Ventes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Achats = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fournisseurs = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Clients = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Commandes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 50));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ventes.setBackground(new java.awt.Color(232, 76, 61));
        Ventes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Ventes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VentesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VentesMouseExited(evt);
            }
        });
        Ventes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mainPanier_hover.png"))); // NOI18N
        Ventes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 60));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vente");
        Ventes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        jPanel1.add(Ventes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 110, 100));

        Achats.setBackground(new java.awt.Color(232, 76, 61));
        Achats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Achats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AchatsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AchatsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AchatsMouseExited(evt);
            }
        });
        Achats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/panier_hover.png"))); // NOI18N
        Achats.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Achat");
        Achats.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        jPanel1.add(Achats, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, 100));

        jPanel6.setBackground(new java.awt.Color(232, 76, 61));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/box_hover.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Produit");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 110, 100));

        Fournisseurs.setBackground(new java.awt.Color(232, 76, 61));
        Fournisseurs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Fournisseurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FournisseursMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FournisseursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FournisseursMouseExited(evt);
            }
        });
        Fournisseurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man_hover.png"))); // NOI18N
        Fournisseurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fournisseur");
        Fournisseurs.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, -1));

        jPanel1.add(Fournisseurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 110, 100));

        Clients.setBackground(new java.awt.Color(232, 76, 61));
        Clients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClientsMouseExited(evt);
            }
        });
        Clients.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile_hover.png"))); // NOI18N
        Clients.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Client");
        Clients.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        jPanel1.add(Clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 110, 100));

        Commandes.setBackground(new java.awt.Color(232, 76, 61));
        Commandes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Commandes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CommandesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CommandesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CommandesMouseExited(evt);
            }
        });
        Commandes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/commande_hover.png"))); // NOI18N
        Commandes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Commandes");
        Commandes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        jPanel1.add(Commandes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 864, 320));

        jPanel2.setBackground(new java.awt.Color(232, 76, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stc.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, 90));

        jLabel15.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 20, 7));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Stock");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 70, 50));

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(61, 61, 61));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Gestion");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 50));

        jLabel17.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("De");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 40, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 864, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        MouseEntred(jPanel6,jLabel1,"box");
        
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        MouseOut(jPanel6,jLabel1,"box");
    }//GEN-LAST:event_jPanel6MouseExited

    private void VentesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentesMouseEntered
       MouseEntred(Ventes,jLabel2,"mainPanier");
    }//GEN-LAST:event_VentesMouseEntered

    private void VentesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentesMouseExited
       MouseOut(Ventes,jLabel2,"mainPanier");
    }//GEN-LAST:event_VentesMouseExited

    private void FournisseursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FournisseursMouseEntered
       MouseEntred(Fournisseurs,jLabel6,"man");
    }//GEN-LAST:event_FournisseursMouseEntered

    private void FournisseursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FournisseursMouseExited
        MouseOut(Fournisseurs,jLabel6,"man");
    }//GEN-LAST:event_FournisseursMouseExited

    private void ClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientsMouseEntered
       MouseEntred(Clients,jLabel5,"profile");
    }//GEN-LAST:event_ClientsMouseEntered

    private void ClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientsMouseExited
        MouseOut(Clients,jLabel5,"profile");
    }//GEN-LAST:event_ClientsMouseExited

    private void AchatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AchatsMouseEntered
       MouseEntred(Achats,jLabel3,"panier");
    }//GEN-LAST:event_AchatsMouseEntered

    private void AchatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AchatsMouseExited
        MouseOut(Achats,jLabel3,"panier");
    }//GEN-LAST:event_AchatsMouseExited

    private void CommandesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CommandesMouseEntered
        MouseEntred(Commandes,jLabel4,"commande");
    }//GEN-LAST:event_CommandesMouseEntered

    private void CommandesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CommandesMouseExited
       MouseOut(Commandes,jLabel4,"commande");
    }//GEN-LAST:event_CommandesMouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
      jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_hover.png")));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png")));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void CommandesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CommandesMouseClicked
        Commande stock = new Commande();
        this.dispose();
        stock.Run();
    }//GEN-LAST:event_CommandesMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        ProduitList produitlist = new ProduitList();
        this.dispose();
        produitlist.Run();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientsMouseClicked
       Client Client = new Client();
        this.dispose();
        Client.Run();
    }//GEN-LAST:event_ClientsMouseClicked

    private void FournisseursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FournisseursMouseClicked
        Fournisseur Fournisseur = new Fournisseur();
        this.dispose();
        Fournisseur.Run();
    }//GEN-LAST:event_FournisseursMouseClicked

    private void AchatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AchatsMouseClicked
        Achat Achat = new Achat();
        this.dispose();
        Achat.Run();
    }//GEN-LAST:event_AchatsMouseClicked

    private void VentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentesMouseClicked
        Vente Vente = new Vente();
        this.dispose();
        Vente.Run();
    }//GEN-LAST:event_VentesMouseClicked
    private void MouseEntred(javax.swing.JPanel panel,javax.swing.JLabel label, String iconName){
         panel.setBackground(new Color(243, 113, 91));   
         label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/"+iconName+".png")));
    }
    private void MouseOut(javax.swing.JPanel panel,javax.swing.JLabel label, String iconName){
        panel.setBackground(new Color(232, 76, 61));
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/"+iconName+"_hover.png")));
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Achats;
    private javax.swing.JPanel Clients;
    private javax.swing.JPanel Commandes;
    private javax.swing.JPanel Fournisseurs;
    private javax.swing.JPanel Ventes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}