
package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;
public class CreeCompte extends javax.swing.JFrame {

    public void Run() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        getRootPane().setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(208, 208, 208)));
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nom_user = new javax.swing.JTextField();
        Adress_mail = new javax.swing.JTextField();
        Confirmer_mot_pass = new javax.swing.JPasswordField();
        Mot_pass = new javax.swing.JPasswordField();
        Suivant = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Numero_tlph = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        Précedent = new javax.swing.JLabel();
        Prénom = new javax.swing.JTextField();
        Créer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 100));
        setMaximumSize(new java.awt.Dimension(470, 467));
        setMinimumSize(new java.awt.Dimension(470, 467));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(470, 467));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(460, 467));
        jPanel1.setMinimumSize(new java.awt.Dimension(460, 467));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 467));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nom_user.setBackground(new java.awt.Color(236, 240, 241));
        Nom_user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nom_user.setForeground(new java.awt.Color(51, 51, 51));
        Nom_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(Nom_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 270, 30));

        Adress_mail.setBackground(new java.awt.Color(236, 240, 241));
        Adress_mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Adress_mail.setForeground(new java.awt.Color(51, 51, 51));
        Adress_mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(Adress_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 270, 30));

        Confirmer_mot_pass.setBackground(new java.awt.Color(236, 240, 241));
        Confirmer_mot_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Confirmer_mot_pass.setForeground(new java.awt.Color(51, 51, 51));
        Confirmer_mot_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(Confirmer_mot_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 270, 30));

        Mot_pass.setBackground(new java.awt.Color(236, 240, 241));
        Mot_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mot_pass.setForeground(new java.awt.Color(51, 51, 51));
        Mot_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(Mot_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 270, 30));

        Suivant.setForeground(new java.awt.Color(51, 51, 51));
        Suivant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Suivant.setText("Suivant");
        Suivant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Suivant.setOpaque(true);
        Suivant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuivantMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SuivantMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SuivantMouseExited(evt);
            }
        });
        jPanel1.add(Suivant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 30));

        jLabel3.setForeground(new java.awt.Color(193, 57, 43));
        jLabel3.setText("Confirmer mot de passe:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel4.setForeground(new java.awt.Color(193, 57, 43));
        jLabel4.setText("Nom d'utilisateur:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel5.setForeground(new java.awt.Color(193, 57, 43));
        jLabel5.setText("Adress e-mail:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel6.setForeground(new java.awt.Color(193, 57, 43));
        jLabel6.setText("Mot de passe:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/register.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 430));

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
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 50, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Créer Un Compte");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 130, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/register.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel10.setForeground(new java.awt.Color(193, 57, 43));
        jLabel10.setText("Nom:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        Nom.setBackground(new java.awt.Color(236, 240, 241));
        Nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nom.setForeground(new java.awt.Color(51, 51, 51));
        Nom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 270, 30));

        jLabel11.setForeground(new java.awt.Color(193, 57, 43));
        jLabel11.setText("Prenom:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        Numero_tlph.setBackground(new java.awt.Color(236, 240, 241));
        Numero_tlph.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Numero_tlph.setForeground(new java.awt.Color(51, 51, 51));
        Numero_tlph.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.add(Numero_tlph, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 270, 30));

        jLabel12.setForeground(new java.awt.Color(193, 57, 43));
        jLabel12.setText("Numero Telephone:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel13.setForeground(new java.awt.Color(193, 57, 43));
        jLabel13.setText("Sex:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        sex.setBackground(new java.awt.Color(236, 240, 241));
        sex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sex.setForeground(new java.awt.Color(51, 51, 51));
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        sex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 270, 30));

        Précedent.setForeground(new java.awt.Color(51, 51, 51));
        Précedent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Précedent.setText("Précedent");
        Précedent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Précedent.setOpaque(true);
        Précedent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrécedentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrécedentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrécedentMouseExited(evt);
            }
        });
        jPanel3.add(Précedent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 90, 30));

        Prénom.setBackground(new java.awt.Color(236, 240, 241));
        Prénom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Prénom.setForeground(new java.awt.Color(51, 51, 51));
        Prénom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.add(Prénom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 270, 30));

        Créer.setForeground(new java.awt.Color(51, 51, 51));
        Créer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Créer.setText("Créer");
        Créer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Créer.setOpaque(true);
        Créer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CréerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CréerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CréerMouseExited(evt);
            }
        });
        jPanel3.add(Créer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 90, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 470, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuivantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuivantMouseClicked
        Timer timer = new Timer();
       timer.scheduleAtFixedRate(new TimerTask() {
        @Override
            public void run() {
                        jPanel1.setBounds(jPanel1.getX()-1, jPanel1.getY(), jPanel1.getWidth(), jPanel1.getHeight());
                        jPanel3.setBounds(jPanel3.getX()-1, jPanel3.getY(), jPanel3.getWidth(), jPanel3.getHeight());
                        if(jPanel3.getX() == 0) timer.cancel();
                }
          },1, 1);
    }//GEN-LAST:event_SuivantMouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_hover.png")));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png")));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void PrécedentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrécedentMouseClicked
                Timer timer = new Timer();
       timer.scheduleAtFixedRate(new TimerTask() {
        @Override
            public void run() {
                        jPanel1.setBounds(jPanel1.getX()+1, jPanel1.getY(), jPanel1.getWidth(), jPanel1.getHeight());
                        jPanel3.setBounds(jPanel3.getX()+1, jPanel3.getY(), jPanel3.getWidth(), jPanel3.getHeight());
                        if(jPanel1.getX() == 0) timer.cancel();
                }
          },1, 1);
   
    }//GEN-LAST:event_PrécedentMouseClicked

    private void CréerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CréerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CréerMouseClicked

    private void SuivantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuivantMouseEntered
               Suivant.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SuivantMouseEntered

    private void SuivantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuivantMouseExited
               Suivant.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_SuivantMouseExited

    private void PrécedentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrécedentMouseEntered
                Précedent.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_PrécedentMouseEntered

    private void PrécedentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrécedentMouseExited
               Précedent.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_PrécedentMouseExited

    private void CréerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CréerMouseEntered
               Créer.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_CréerMouseEntered

    private void CréerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CréerMouseExited
                Créer.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_CréerMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress_mail;
    private javax.swing.JPasswordField Confirmer_mot_pass;
    private javax.swing.JLabel Créer;
    private javax.swing.JPasswordField Mot_pass;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Nom_user;
    private javax.swing.JTextField Numero_tlph;
    private javax.swing.JLabel Précedent;
    private javax.swing.JTextField Prénom;
    private javax.swing.JLabel Suivant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
