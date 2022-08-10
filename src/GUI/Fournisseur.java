/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author gamer
 */
public class Fournisseur extends javax.swing.JFrame {

    public void Run() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        getRootPane().setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(208, 208, 208)));
        setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        fermer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Produit_Fenetre = new javax.swing.JPanel();
        Produit_FenetreL = new javax.swing.JLabel();
        Achat_Fenetre = new javax.swing.JPanel();
        Achat_FenetreL = new javax.swing.JLabel();
        Vente_Fenetre = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Fournisseur_Fenetre = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Client_Fenetre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Donner_Fournisseur = new javax.swing.JTable();
        Ajouter_events = new javax.swing.JPanel();
        Ajouter_Fournisseur = new javax.swing.JLabel();
        Modifier_events = new javax.swing.JPanel();
        Modifier_Fournisseur = new javax.swing.JLabel();
        Suprimer_events = new javax.swing.JPanel();
        Suprrimer_Fournisseur = new javax.swing.JLabel();
        Rechercher = new javax.swing.JLabel();
        Recherche = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        Ajouter_Commande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 60));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel12.setText("Fournisseur");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 820, 50));

        jPanel3.setBackground(new java.awt.Color(193, 57, 43));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Produit_Fenetre.setBackground(new java.awt.Color(193, 57, 43));
        Produit_Fenetre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Produit_FenetreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Produit_FenetreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Produit_FenetreMouseExited(evt);
            }
        });
        Produit_Fenetre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Produit_FenetreL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Produit_FenetreL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/box_hover.png"))); // NOI18N
        Produit_Fenetre.add(Produit_FenetreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel3.add(Produit_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 39, 39));

        Achat_Fenetre.setBackground(new java.awt.Color(193, 57, 43));
        Achat_Fenetre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Achat_FenetreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Achat_FenetreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Achat_FenetreMouseExited(evt);
            }
        });
        Achat_Fenetre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Achat_FenetreL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Achat_FenetreL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/panier_hover.png"))); // NOI18N
        Achat_Fenetre.add(Achat_FenetreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel3.add(Achat_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 39, 39));

        Vente_Fenetre.setBackground(new java.awt.Color(193, 57, 43));
        Vente_Fenetre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vente_FenetreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Vente_FenetreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Vente_FenetreMouseExited(evt);
            }
        });
        Vente_Fenetre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/mainPanier_hover.png"))); // NOI18N
        Vente_Fenetre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel3.add(Vente_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 39, 39));

        Fournisseur_Fenetre.setBackground(new java.awt.Color(193, 57, 43));
        Fournisseur_Fenetre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fournisseur_FenetreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fournisseur_FenetreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fournisseur_FenetreMouseExited(evt);
            }
        });
        Fournisseur_Fenetre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/man_hover.png"))); // NOI18N
        Fournisseur_Fenetre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel3.add(Fournisseur_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 39, 39));

        Client_Fenetre.setBackground(new java.awt.Color(193, 57, 43));
        Client_Fenetre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_FenetreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Client_FenetreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Client_FenetreMouseExited(evt);
            }
        });
        Client_Fenetre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/profile_hover.png"))); // NOI18N
        Client_Fenetre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel3.add(Client_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 39, 39));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 490));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Donner_Fournisseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Donner_Fournisseur.setForeground(new java.awt.Color(51, 51, 51));
        Donner_Fournisseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Address", "Num Téléphone", "Crédit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        Donner_Fournisseur.setGridColor(new java.awt.Color(193, 57, 43));
        Donner_Fournisseur.setPreferredSize(new java.awt.Dimension(375, 16));
        Donner_Fournisseur.setRowSelectionAllowed(false);
        Donner_Fournisseur.setSelectionBackground(new java.awt.Color(232, 76, 61));
        jScrollPane1.setViewportView(Donner_Fournisseur);
        if (Donner_Fournisseur.getColumnModel().getColumnCount() > 0) {
            Donner_Fournisseur.getColumnModel().getColumn(0).setResizable(false);
            Donner_Fournisseur.getColumnModel().getColumn(1).setResizable(false);
            Donner_Fournisseur.getColumnModel().getColumn(2).setResizable(false);
            Donner_Fournisseur.getColumnModel().getColumn(3).setResizable(false);
            Donner_Fournisseur.getColumnModel().getColumn(4).setResizable(false);
            Donner_Fournisseur.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 820, 360));

        Ajouter_events.setBackground(new java.awt.Color(255, 255, 255));
        Ajouter_events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ajouter_eventsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ajouter_eventsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ajouter_eventsMouseExited(evt);
            }
        });
        Ajouter_events.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ajouter_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_fournisseur_hover.png"))); // NOI18N
        Ajouter_events.add(Ajouter_Fournisseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.add(Ajouter_events, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        Modifier_events.setBackground(new java.awt.Color(255, 255, 255));
        Modifier_events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modifier_eventsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modifier_eventsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modifier_eventsMouseExited(evt);
            }
        });
        Modifier_events.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modifier_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edi_fournisseur_hover.png"))); // NOI18N
        Modifier_events.add(Modifier_Fournisseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.add(Modifier_events, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        Suprimer_events.setBackground(new java.awt.Color(255, 255, 255));
        Suprimer_events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Suprimer_eventsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Suprimer_eventsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Suprimer_eventsMouseExited(evt);
            }
        });
        Suprimer_events.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Suprrimer_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del_fournisseur_hover.png"))); // NOI18N
        Suprimer_events.add(Suprrimer_Fournisseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.add(Suprimer_events, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 50));

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
        jPanel9.add(Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 30));

        Recherche.setBackground(new java.awt.Color(236, 240, 241));
        Recherche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Recherche.setForeground(new java.awt.Color(51, 51, 51));
        Recherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Recherche.setText("Recherche");
        Recherche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel9.add(Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 270, 30));

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

        Ajouter_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_commande_hover.png"))); // NOI18N
        jPanel11.add(Ajouter_Commande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 820, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void Produit_FenetreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produit_FenetreMouseClicked
        ProduitList produitlist = new ProduitList();
        this.dispose();
        produitlist.Run();
    }//GEN-LAST:event_Produit_FenetreMouseClicked

    private void Produit_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produit_FenetreMouseEntered
        MouseEntred(Produit_Fenetre, Produit_FenetreL, "box");
    }//GEN-LAST:event_Produit_FenetreMouseEntered

    private void Produit_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produit_FenetreMouseExited
        MouseOut(Produit_Fenetre, Produit_FenetreL, "box");
    }//GEN-LAST:event_Produit_FenetreMouseExited

    private void Achat_FenetreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Achat_FenetreMouseClicked
        Achat Achat = new Achat();
        this.dispose();
        Achat.Run();
    }//GEN-LAST:event_Achat_FenetreMouseClicked

    private void Achat_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Achat_FenetreMouseEntered
        MouseEntred(Achat_Fenetre, Achat_FenetreL, "panier");
    }//GEN-LAST:event_Achat_FenetreMouseEntered

    private void Achat_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Achat_FenetreMouseExited
        MouseOut(Achat_Fenetre, Achat_FenetreL, "panier");
    }//GEN-LAST:event_Achat_FenetreMouseExited

    private void Vente_FenetreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vente_FenetreMouseClicked
        Vente Vente = new Vente();
        this.dispose();
        Vente.Run();
    }//GEN-LAST:event_Vente_FenetreMouseClicked

    private void Vente_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vente_FenetreMouseEntered
        MouseEntred(Vente_Fenetre, jLabel5, "mainPanier");
    }//GEN-LAST:event_Vente_FenetreMouseEntered

    private void Vente_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vente_FenetreMouseExited
        MouseOut(Vente_Fenetre, jLabel5, "mainPanier");
    }//GEN-LAST:event_Vente_FenetreMouseExited

    private void Fournisseur_FenetreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fournisseur_FenetreMouseClicked
        Fournisseur Fournisseur = new Fournisseur();
        this.dispose();
        Fournisseur.Run();
    }//GEN-LAST:event_Fournisseur_FenetreMouseClicked

    private void Fournisseur_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fournisseur_FenetreMouseEntered
        MouseEntred(Fournisseur_Fenetre, jLabel6, "man");
    }//GEN-LAST:event_Fournisseur_FenetreMouseEntered

    private void Fournisseur_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fournisseur_FenetreMouseExited
        MouseOut(Fournisseur_Fenetre, jLabel6, "man");
    }//GEN-LAST:event_Fournisseur_FenetreMouseExited

    private void Client_FenetreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_FenetreMouseClicked
        Client Client = new Client();
        this.dispose();
        Client.Run();
    }//GEN-LAST:event_Client_FenetreMouseClicked

    private void Client_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_FenetreMouseEntered
        MouseEntred(Client_Fenetre, jLabel7, "profile");
    }//GEN-LAST:event_Client_FenetreMouseEntered


    private void Ajouter_eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajouter_eventsMouseClicked
        AjouterCli_Four addfournisseur = new AjouterCli_Four();
        this.dispose();
        addfournisseur.Run(2);

    }//GEN-LAST:event_Ajouter_eventsMouseClicked

    private void Ajouter_eventsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajouter_eventsMouseEntered
        Ajouter_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_fournisseur.png")));
    }//GEN-LAST:event_Ajouter_eventsMouseEntered

    private void Ajouter_eventsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajouter_eventsMouseExited
        Ajouter_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_fournisseur_hover.png")));
    }//GEN-LAST:event_Ajouter_eventsMouseExited

    private void Modifier_eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modifier_eventsMouseClicked
        AjouterCli_Four Modifierfournisseur = new AjouterCli_Four();
        this.dispose();
        Modifierfournisseur.Run(3);
    }//GEN-LAST:event_Modifier_eventsMouseClicked

    private void Modifier_eventsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modifier_eventsMouseEntered
        Modifier_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edi_fournisseur.png")));
    }//GEN-LAST:event_Modifier_eventsMouseEntered

    private void Modifier_eventsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modifier_eventsMouseExited
        Modifier_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edi_fournisseur_hover.png")));
    }//GEN-LAST:event_Modifier_eventsMouseExited

    private void Suprimer_eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Suprimer_eventsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Suprimer_eventsMouseClicked

    private void Suprimer_eventsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Suprimer_eventsMouseEntered
        Suprrimer_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del_fournisseur.png")));
    }//GEN-LAST:event_Suprimer_eventsMouseEntered

    private void Suprimer_eventsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Suprimer_eventsMouseExited
        Suprrimer_Fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del_fournisseur_hover.png")));
    }//GEN-LAST:event_Suprimer_eventsMouseExited

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

    private void Client_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_FenetreMouseExited

        MouseOut(Client_Fenetre, jLabel7, "profile");    
    }//GEN-LAST:event_Client_FenetreMouseExited

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        AddCommande cmd = new AddCommande();
        this.dispose();
        cmd.Run(false);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        Ajouter_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_commande.png")));
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        Ajouter_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_commande_hover.png")));
    }//GEN-LAST:event_jPanel11MouseExited

    /**
     * @param args the command line arguments
     */
         private void MouseEntred(javax.swing.JPanel panel,javax.swing.JLabel label, String iconName){
         panel.setBackground(new Color(243, 113, 91));   
         label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/"+iconName+".png")));
    }
    private void MouseOut(javax.swing.JPanel panel,javax.swing.JLabel label, String iconName){
        panel.setBackground(new Color(193, 57, 43));
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/"+iconName+"_hover.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Achat_Fenetre;
    private javax.swing.JLabel Achat_FenetreL;
    private javax.swing.JLabel Ajouter_Commande;
    private javax.swing.JLabel Ajouter_Fournisseur;
    private javax.swing.JPanel Ajouter_events;
    private javax.swing.JPanel Client_Fenetre;
    private javax.swing.JTable Donner_Fournisseur;
    private javax.swing.JPanel Fournisseur_Fenetre;
    private javax.swing.JLabel Modifier_Fournisseur;
    private javax.swing.JPanel Modifier_events;
    private javax.swing.JPanel Produit_Fenetre;
    private javax.swing.JLabel Produit_FenetreL;
    private javax.swing.JTextField Recherche;
    private javax.swing.JLabel Rechercher;
    private javax.swing.JPanel Suprimer_events;
    private javax.swing.JLabel Suprrimer_Fournisseur;
    private javax.swing.JPanel Vente_Fenetre;
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
