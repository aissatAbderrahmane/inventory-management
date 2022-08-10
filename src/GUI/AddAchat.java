
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AddAchat extends javax.swing.JFrame {

   private int TYPE ;
    public void Run(int TYPE) {
    this.TYPE=TYPE;
        initComponents();
           if (TYPE==1){
               titre.setText("Modifier un Achat");
                Ajouter.setText("Modifier");
           }
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        getRootPane().setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(208, 208, 208)));
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Ajouter = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Donner_Vente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 76, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        titre.setBackground(new java.awt.Color(255, 255, 255));
        titre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setText("Ajouter Achat");
        jPanel1.add(titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(232, 76, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(236, 240, 241));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 57, 43));
        jLabel3.setText("Commande:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(193, 57, 43));
        jLabel9.setText("Designation et Quantité:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        jTextField3.setBackground(new java.awt.Color(236, 240, 241));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 270, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(193, 57, 43));
        jLabel8.setText("Date :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addAchats.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 100));

        Ajouter.setBackground(new java.awt.Color(232, 76, 61));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ajouter.setText("Ajouter");
        Ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        Ajouter.setOpaque(true);
        Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AjouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AjouterMouseExited(evt);
            }
        });
        jPanel2.add(Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 100, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Annuler");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 100, 30));

        Donner_Vente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Donner_Vente.setForeground(new java.awt.Color(51, 51, 51));
        Donner_Vente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Designation", "Qt", "Prix_H.T", "Validation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Donner_Vente.setGridColor(new java.awt.Color(193, 57, 43));
        Donner_Vente.setPreferredSize(new java.awt.Dimension(375, 16));
        Donner_Vente.setRowSelectionAllowed(false);
        Donner_Vente.setSelectionBackground(new java.awt.Color(232, 76, 61));
        jScrollPane1.setViewportView(Donner_Vente);
        if (Donner_Vente.getColumnModel().getColumnCount() > 0) {
            Donner_Vente.getColumnModel().getColumn(0).setResizable(false);
            Donner_Vente.getColumnModel().getColumn(1).setResizable(false);
            Donner_Vente.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 580, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked

    }//GEN-LAST:event_AjouterMouseClicked

    private void AjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseEntered
        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(232, 76, 61));
    }//GEN-LAST:event_AjouterMouseEntered

    private void AjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseExited
        jLabel5.setBackground(new java.awt.Color(232, 76, 61));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_AjouterMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(new java.awt.Color(193, 57, 43));
        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ajouter;
    private javax.swing.JTable Donner_Vente;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
