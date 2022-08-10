package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;public class AjouterCli_Four extends javax.swing.JFrame {
    private int Type;
    public void Run(int TYPE){
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        switch(TYPE){
            case 1:
                titles.setText("Modifier Le Client");
                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modifiClients.png")));
                ajouter.setText("Modifier");
                break;
            case 2:
                titles.setText("Ajouter Un Fournisseur");
                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addFournis.png")));
                break;
            case 3:
                titles.setText("Modifier Le Fournisseur");
                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modifiFournis.png")));
                ajouter.setText("Modifier");
                break;
        
        }
        Type=TYPE;
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        returns = new javax.swing.JLabel();
        titles = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        annuler = new javax.swing.JLabel();
        Prenom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        NTelephone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 50, 50));

        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
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
        jPanel1.add(returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        titles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titles.setForeground(new java.awt.Color(255, 255, 255));
        titles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titles.setText("Ajouter un Client");
        jPanel1.add(titles, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nom.setBackground(new java.awt.Color(236, 240, 241));
        Nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nom.setForeground(new java.awt.Color(51, 51, 51));
        Nom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 270, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 57, 43));
        jLabel3.setText("Nom:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

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
        jPanel2.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 100, 30));

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
        jPanel2.add(annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 100, 30));

        Prenom.setBackground(new java.awt.Color(236, 240, 241));
        Prenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Prenom.setForeground(new java.awt.Color(51, 51, 51));
        Prenom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(Prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 270, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(193, 57, 43));
        jLabel6.setText("Prénom:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(193, 57, 43));
        jLabel7.setText("Address:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 30));

        Address.setBackground(new java.awt.Color(236, 240, 241));
        Address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Address.setForeground(new java.awt.Color(51, 51, 51));
        Address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 270, 30));

        NTelephone.setBackground(new java.awt.Color(236, 240, 241));
        NTelephone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NTelephone.setForeground(new java.awt.Color(51, 51, 51));
        NTelephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(NTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 270, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(193, 57, 43));
        jLabel9.setText("Num_Téléphone:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 30));

        credit.setBackground(new java.awt.Color(236, 240, 241));
        credit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        credit.setForeground(new java.awt.Color(51, 51, 51));
        credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 270, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(193, 57, 43));
        jLabel10.setText("Crédit:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, 30));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 490));

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

    private void returnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseClicked
        switch(Type){
            case 0 : case 1:
                Client client =new Client();
                this.dispose();
                client.Run();
                break;
            case 2: case 3:
                Fournisseur fournisseur =new Fournisseur();
                this.dispose();
                fournisseur.Run();
                break;
        
        }
    }//GEN-LAST:event_returnsMouseClicked

    private void returnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseEntered
        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_hover.png")));
    }//GEN-LAST:event_returnsMouseEntered

    private void returnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseExited
        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png")));
    }//GEN-LAST:event_returnsMouseExited

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField NTelephone;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Prenom;
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel annuler;
    private javax.swing.JTextField credit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel returns;
    private javax.swing.JLabel titles;
    // End of variables declaration//GEN-END:variables
}
