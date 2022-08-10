
package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class Commande extends javax.swing.JFrame {

    public void Run() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        getRootPane().setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(208, 208, 208)));
        iniTableHeader();
        this.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fermer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Titre = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Produit_Fenetre = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Achat_Fenetre = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Vente_Fenetre = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Fournisseur_Fenetre = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Client_Fenetre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Donner_Commande = new javax.swing.JTable();
        Ajouter = new javax.swing.JPanel();
        Ajouter_Commande = new javax.swing.JLabel();
        Modifier = new javax.swing.JPanel();
        Modifier_Commande = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Suprrimer_Commande = new javax.swing.JLabel();
        Rechercher = new javax.swing.JLabel();
        Recherche = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 60));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Titre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Titre.setForeground(new java.awt.Color(255, 255, 255));
        Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titre.setText("Commande");
        jPanel2.add(Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 820, 50));

        jPanel9.setBackground(new java.awt.Color(193, 57, 43));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/box_hover.png"))); // NOI18N
        Produit_Fenetre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel9.add(Produit_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 39, 39));

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/min/panier_hover.png"))); // NOI18N
        Achat_Fenetre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel9.add(Achat_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 39, 39));

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

        jPanel9.add(Vente_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 39, 39));

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

        jPanel9.add(Fournisseur_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 39, 39));

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

        jPanel9.add(Client_Fenetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 39, 39));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 490));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Donner_Commande.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Donner_Commande.setForeground(new java.awt.Color(51, 51, 51));
        Donner_Commande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Designation", "Qt", "Date", "Fournisseur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Donner_Commande.setGridColor(new java.awt.Color(193, 57, 43));
        Donner_Commande.setPreferredSize(new java.awt.Dimension(375, 16));
        Donner_Commande.setRowSelectionAllowed(false);
        Donner_Commande.setSelectionBackground(new java.awt.Color(232, 76, 61));
        jScrollPane1.setViewportView(Donner_Commande);
        if (Donner_Commande.getColumnModel().getColumnCount() > 0) {
            Donner_Commande.getColumnModel().getColumn(0).setResizable(false);
            Donner_Commande.getColumnModel().getColumn(1).setResizable(false);
            Donner_Commande.getColumnModel().getColumn(2).setResizable(false);
            Donner_Commande.getColumnModel().getColumn(3).setResizable(false);
            Donner_Commande.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 820, 360));

        Ajouter.setBackground(new java.awt.Color(255, 255, 255));
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
        Ajouter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ajouter_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_commande_hover.png"))); // NOI18N
        Ajouter.add(Ajouter_Commande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        Modifier.setBackground(new java.awt.Color(255, 255, 255));
        Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModifierMouseExited(evt);
            }
        });
        Modifier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modifier_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edi_commande_hover.png"))); // NOI18N
        Modifier.add(Modifier_Commande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

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

        Suprrimer_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del_commande_hover.png"))); // NOI18N
        jPanel13.add(Suprrimer_Commande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 820, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseEntered
        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_hover.png")));
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
       fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png")));
    }//GEN-LAST:event_fermerMouseExited

    private void fermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseClicked
       this.dispose();
    }//GEN-LAST:event_fermerMouseClicked

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
        MouseEntred(Produit_Fenetre, jLabel3, "box");
    }//GEN-LAST:event_Produit_FenetreMouseEntered

    private void Produit_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produit_FenetreMouseExited
        MouseOut(Produit_Fenetre, jLabel3, "box");
    }//GEN-LAST:event_Produit_FenetreMouseExited

    private void Achat_FenetreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Achat_FenetreMouseClicked
        Achat Achat = new Achat();
        this.dispose();
        Achat.Run();
    }//GEN-LAST:event_Achat_FenetreMouseClicked

    private void Achat_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Achat_FenetreMouseEntered
        MouseEntred(Achat_Fenetre, jLabel4, "panier");
    }//GEN-LAST:event_Achat_FenetreMouseEntered

    private void Achat_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Achat_FenetreMouseExited
        MouseOut(Achat_Fenetre, jLabel4, "panier");
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

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked
        AddCommande ajoutercommande = new AddCommande();
        this.dispose();
        ajoutercommande.Run(false);

    }//GEN-LAST:event_AjouterMouseClicked

    private void AjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseEntered
        Ajouter_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_commande.png")));
    }//GEN-LAST:event_AjouterMouseEntered

    private void AjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseExited
        Ajouter_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_commande_hover.png")));
    }//GEN-LAST:event_AjouterMouseExited

    private void ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseClicked
        AddCommande ajoutercommande = new AddCommande();
        this.dispose();
        ajoutercommande.Run(true);
    }//GEN-LAST:event_ModifierMouseClicked

    private void ModifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseEntered
        Modifier_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edi_commande.png")));
    }//GEN-LAST:event_ModifierMouseEntered

    private void ModifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseExited
        Modifier_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edi_commande_hover.png")));
    }//GEN-LAST:event_ModifierMouseExited

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        Suprrimer_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del_commande.png")));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        Suprrimer_Commande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del_commande_hover.png")));
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

    private void Client_FenetreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_FenetreMouseEntered
        MouseEntred(Client_Fenetre, jLabel7, "profile");
    }//GEN-LAST:event_Client_FenetreMouseEntered

    private void Client_FenetreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_FenetreMouseExited
        MouseOut(Client_Fenetre, jLabel7, "profile");
    }//GEN-LAST:event_Client_FenetreMouseExited

    private JTableHeader head ;
    private DefaultTableCellRenderer CellRender;
    private DefaultTableModel model;
    private void iniTableHeader() {
        head = Donner_Commande.getTableHeader();
        head.setBackground(new java.awt.Color(232, 76, 61));
        head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 240, 241)));
        head.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        head.setForeground(new java.awt.Color(51,51,51));
        ((DefaultTableCellRenderer)head.getDefaultRenderer()).setHorizontalAlignment(javax.swing.JLabel.CENTER);
        CellRender = new DefaultTableCellRenderer();
        CellRender.setHorizontalAlignment( javax.swing.JLabel.CENTER );
        CellRender.setBackground(new java.awt.Color(255,255,255));
        CellRender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 57, 43)));
        CellRender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CellRender.setForeground(new java.awt.Color(193, 57, 43));
        Donner_Commande.setDefaultRenderer(Integer.class, CellRender);
        Donner_Commande.setDefaultRenderer(String.class, CellRender);
        
         model = (DefaultTableModel) Donner_Commande.getModel();
        Object[] rowData = {15, "TEST", 15, 15, 15};
        model.addRow(rowData);
         model.addRow(rowData);

    }
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
    private javax.swing.JPanel Ajouter;
    private javax.swing.JLabel Ajouter_Commande;
    private javax.swing.JPanel Client_Fenetre;
    private javax.swing.JTable Donner_Commande;
    private javax.swing.JPanel Fournisseur_Fenetre;
    private javax.swing.JPanel Modifier;
    private javax.swing.JLabel Modifier_Commande;
    private javax.swing.JPanel Produit_Fenetre;
    private javax.swing.JTextField Recherche;
    private javax.swing.JLabel Rechercher;
    private javax.swing.JLabel Suprrimer_Commande;
    private javax.swing.JLabel Titre;
    private javax.swing.JPanel Vente_Fenetre;
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
