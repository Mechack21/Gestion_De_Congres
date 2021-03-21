/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formulaires;

import Entite.Theme;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MECHACK
 */
public class Ftheme extends javax.swing.JFrame {

    /**
     * Creates new form Ftheme
     */
    Theme thm = new Theme();
    public Ftheme() {
        initComponents();
        thm.Remplir(jTable1, "select * from Themes");
    }
 void Nettoyer() {
        textCodeTheme.setText("");
        IntituleArea.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgP = new javax.swing.JPanel();
        Pvertical = new javax.swing.JPanel();
        BtnIntervenant = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnIdentification = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnTheme = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        LblExit = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        textRecherche = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        textCodeTheme = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        BtnSave1 = new javax.swing.JButton();
        BtnUpdate1 = new javax.swing.JButton();
        BtnDelete1 = new javax.swing.JButton();
        BtnClean = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        IntituleArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BgP.setBackground(new java.awt.Color(255, 255, 255));
        BgP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BgPMouseDragged(evt);
            }
        });
        BgP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BgPMousePressed(evt);
            }
        });
        BgP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pvertical.setBackground(new java.awt.Color(54, 33, 89));
        Pvertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnIntervenant.setBackground(new java.awt.Color(85, 65, 118));
        BtnIntervenant.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnIntervenantMouseMoved(evt);
            }
        });
        BtnIntervenant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIntervenantMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Voice_Presentation_26px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Intervenants");

        javax.swing.GroupLayout BtnIntervenantLayout = new javax.swing.GroupLayout(BtnIntervenant);
        BtnIntervenant.setLayout(BtnIntervenantLayout);
        BtnIntervenantLayout.setHorizontalGroup(
            BtnIntervenantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnIntervenantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        BtnIntervenantLayout.setVerticalGroup(
            BtnIntervenantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnIntervenantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnIntervenantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BtnIntervenantLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Pvertical.add(BtnIntervenant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 190, 40));

        BtnIdentification.setBackground(new java.awt.Color(64, 43, 100));
        BtnIdentification.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnIdentificationMouseMoved(evt);
            }
        });
        BtnIdentification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIdentificationMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Idea_26px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Propositions");

        javax.swing.GroupLayout BtnIdentificationLayout = new javax.swing.GroupLayout(BtnIdentification);
        BtnIdentification.setLayout(BtnIdentificationLayout);
        BtnIdentificationLayout.setHorizontalGroup(
            BtnIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnIdentificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        BtnIdentificationLayout.setVerticalGroup(
            BtnIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnIdentificationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BtnIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnIdentificationLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Pvertical.add(BtnIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 40));

        BtnTheme.setBackground(new java.awt.Color(64, 43, 100));
        BtnTheme.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnThemeMouseMoved(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Connexion");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Login_26px.png"))); // NOI18N

        javax.swing.GroupLayout BtnThemeLayout = new javax.swing.GroupLayout(BtnTheme);
        BtnTheme.setLayout(BtnThemeLayout);
        BtnThemeLayout.setHorizontalGroup(
            BtnThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnThemeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        BtnThemeLayout.setVerticalGroup(
            BtnThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnThemeLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(BtnThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        Pvertical.add(BtnTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 190, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Themes");
        Pvertical.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Gestion des consulations");
        Pvertical.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));
        Pvertical.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 10));

        BgP.add(Pvertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 450));

        jPanel1.setBackground(new java.awt.Color(122, 71, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Liste des Themes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 320, 10));

        BgP.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 730, 80));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_Math__30px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        BgP.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, 20));

        LblExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblExit.setForeground(new java.awt.Color(204, 204, 204));
        LblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_30px.png"))); // NOI18N
        LblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblExitMouseClicked(evt);
            }
        });
        BgP.add(LblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Gestion des consultations");
        BgP.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BgP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 340, 270));
        BgP.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        BgP.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 220, 10));

        textRecherche.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textRecherche.setForeground(new java.awt.Color(54, 33, 89));
        textRecherche.setBorder(null);
        textRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRechercheKeyTyped(evt);
            }
        });
        BgP.add(textRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 190, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_26px.png"))); // NOI18N
        BgP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mise à jours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(54, 33, 89))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 33, 89));
        jLabel7.setText("Code Theme");

        textCodeTheme.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        textCodeTheme.setForeground(new java.awt.Color(54, 33, 89));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(54, 33, 89));
        jLabel13.setText("Intitulé du Theme");

        BtnSave1.setBackground(new java.awt.Color(255, 255, 255));
        BtnSave1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSave1.setForeground(new java.awt.Color(126, 87, 194));
        BtnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Save_25px.png"))); // NOI18N
        BtnSave1.setText("Save");
        BtnSave1.setBorder(null);
        BtnSave1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSave1ActionPerformed(evt);
            }
        });

        BtnUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        BtnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnUpdate1.setForeground(new java.awt.Color(126, 87, 194));
        BtnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Available_Updates_25px.png"))); // NOI18N
        BtnUpdate1.setText("Update");
        BtnUpdate1.setBorder(null);
        BtnUpdate1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdate1ActionPerformed(evt);
            }
        });

        BtnDelete1.setBackground(new java.awt.Color(255, 255, 255));
        BtnDelete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnDelete1.setForeground(new java.awt.Color(126, 87, 194));
        BtnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_25px.png"))); // NOI18N
        BtnDelete1.setText("Delete");
        BtnDelete1.setBorder(null);
        BtnDelete1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelete1ActionPerformed(evt);
            }
        });

        BtnClean.setBackground(new java.awt.Color(255, 255, 255));
        BtnClean.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnClean.setForeground(new java.awt.Color(126, 87, 194));
        BtnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Broom_25px.png"))); // NOI18N
        BtnClean.setText("Clean");
        BtnClean.setBorder(null);
        BtnClean.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        IntituleArea.setColumns(20);
        IntituleArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        IntituleArea.setLineWrap(true);
        IntituleArea.setRows(5);
        jScrollPane2.setViewportView(IntituleArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(BtnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(textCodeTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodeTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        BgP.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 360, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgP, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(920, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void LblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExitMouseClicked
        // TODO add your handlinhg code here:
        System.exit(0);
    }//GEN-LAST:event_LblExitMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int ligne = jTable1.getSelectedRow();
        textCodeTheme.setText(jTable1.getValueAt(ligne, 0).toString());
         IntituleArea.setText(jTable1.getValueAt(ligne, 1).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave1ActionPerformed
        // TODO add your handling code here:
        if (textCodeTheme.getText().equals("") || IntituleArea.getText().equals("")
            ) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "ATTENTION!!", JOptionPane.ERROR_MESSAGE);
        } else {
            thm.setThemeId(textCodeTheme.getText());
            thm.setIntituleTheme(IntituleArea.getText());
            thm.Ajouter();
            thm.Remplir(jTable1, "select * from Themes");
            Nettoyer();
        }
    }//GEN-LAST:event_BtnSave1ActionPerformed

    private void BtnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdate1ActionPerformed
        // TODO add your handling code here:
        int rep = JOptionPane.showConfirmDialog(null, "Etes-vous sur de voiloir MODIFIER ??", "MODIFICATION", JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (textCodeTheme.getText().equals("") || IntituleArea.getText().equals("")
               ) {
                JOptionPane.showMessageDialog(null, "Veuillez selectioner la ligne a modifier", "ATTENTION!!", JOptionPane.ERROR_MESSAGE);
            } else {
                thm.setThemeId(textCodeTheme.getText());
                thm.setIntituleTheme(IntituleArea.getText());
                thm.Modifier();
                thm.Remplir(jTable1, "select * from Themes");
                Nettoyer();
            }

        }
    }//GEN-LAST:event_BtnUpdate1ActionPerformed

    private void BtnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelete1ActionPerformed
        // TODO add your handling code here:
        int rep = JOptionPane.showConfirmDialog(null, "Etes-vous sur de voiloir SUPPRIMER ??", "MODIFICATION", JOptionPane.YES_NO_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            if (textCodeTheme.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez saisir le code du theme à supprimer", "ATTENTION!!", JOptionPane.ERROR_MESSAGE);
            } else {
                thm.setThemeId(textCodeTheme.getText());
                thm.Supprimer();
                JOptionPane.showMessageDialog(null, "La suppression à reussie", "ATTENTION!!", JOptionPane.INFORMATION_MESSAGE);
               thm.Remplir(jTable1, "select * from Themes");
                Nettoyer();
            }

        }
    }//GEN-LAST:event_BtnDelete1ActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        // TODO add your handling code here:
        Nettoyer();
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void BgPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BgPMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_BgPMouseDragged

    private void BgPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BgPMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BgPMousePressed

    private void textRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercheKeyTyped
        // TODO add your handling code here:
        thm.Remplir(jTable1, "select * from Themes where LibeleTheme like '%" + textRecherche.getText() + "%'");
    }//GEN-LAST:event_textRechercheKeyTyped

    private void BtnIntervenantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIntervenantMouseClicked
        // TODO add your handling code here:
        new Fintervenant().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnIntervenantMouseClicked

    private void BtnIdentificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIdentificationMouseClicked
        // TODO add your handling code here:
        new Fproposition().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnIdentificationMouseClicked

    private void BtnIntervenantMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIntervenantMouseMoved
        // TODO add your handling code here:
        setColor(BtnIntervenant);
        resetColor(BtnIdentification);
        resetColor(BtnTheme);
    }//GEN-LAST:event_BtnIntervenantMouseMoved

    private void BtnIdentificationMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIdentificationMouseMoved
        // TODO add your handling code here:
        setColor(BtnIdentification);
        resetColor(BtnIntervenant);
        resetColor(BtnTheme);
    }//GEN-LAST:event_BtnIdentificationMouseMoved

    private void BtnThemeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnThemeMouseMoved
        // TODO add your handling code here:
        setColor(BtnTheme);
        resetColor(BtnIdentification);
        resetColor(BtnIntervenant);
    }//GEN-LAST:event_BtnThemeMouseMoved
void setColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(64, 43, 100));
    }
    int xx;
    int xy;
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
            java.util.logging.Logger.getLogger(Ftheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ftheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ftheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ftheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ftheme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgP;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnDelete1;
    private javax.swing.JPanel BtnIdentification;
    private javax.swing.JPanel BtnIntervenant;
    private javax.swing.JButton BtnSave1;
    private javax.swing.JPanel BtnTheme;
    private javax.swing.JButton BtnUpdate1;
    private javax.swing.JTextArea IntituleArea;
    private javax.swing.JLabel LblExit;
    private javax.swing.JPanel Pvertical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField textCodeTheme;
    private javax.swing.JTextField textRecherche;
    // End of variables declaration//GEN-END:variables
}
