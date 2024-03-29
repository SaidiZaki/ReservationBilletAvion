/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modele.Passager;
import modele.Siege;
import modele.Vol;
import utils.Manipulation;

/**
 *
 * @author Zaki
 */
public class FenUser extends javax.swing.JFrame {

    /**
     * Creates new form FenUser
     */
    public FenUser() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtNPassport = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        javax.swing.JButton btnVoirVol = new javax.swing.JButton();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReservation = new javax.swing.JTable();
        btnEnregistrer = new javax.swing.JButton();
        txtNomR = new javax.swing.JTextField();
        txtPrenomR = new javax.swing.JTextField();
        txtSiegeR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrixR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnFermer = new javax.swing.JButton();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListeVol = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        txtNVol = new javax.swing.JTextField();
        javax.swing.JButton btnChoisirSiege = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAD = new javax.swing.JTextField();
        txtAA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDD = new javax.swing.JTextField();
        txtDA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHD = new javax.swing.JTextField();
        txtHA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resevation de vol");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jInternalFrame2.setTitle("Vos informations");
        jInternalFrame2.setToolTipText("");
        jInternalFrame2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame2.setVisible(true);

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        jLabel4.setText("N.Passport");

        jLabel5.setText("Adresse");

        btnVoirVol.setText("Voir la liste des vols");
        btnVoirVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoirVolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoirVol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrenom)
                            .addComponent(txtNom)
                            .addComponent(txtNPassport)
                            .addComponent(txtAdresse))))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnVoirVol)
                .addContainerGap())
        );

        jInternalFrame3.setTitle("Vos reservations");
        jInternalFrame3.setVisible(true);

        jtReservation.setBackground(new java.awt.Color(240, 240, 240));
        jtReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num vol", "Aeroport de depart", "Aeroport d'arrivée", "Date depart", "Date arrivée", "Heure depart", "Heure arrivée"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtReservation);

        btnEnregistrer.setText("Enregistrer mes vols");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        txtNomR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomR.setEnabled(false);

        txtPrenomR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrenomR.setEnabled(false);

        txtSiegeR.setBackground(new java.awt.Color(240, 240, 240));
        txtSiegeR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSiegeR.setEnabled(false);

        jLabel12.setText("SIEGE");

        jLabel13.setText("PRENOM");

        jLabel14.setText("NOM");

        jLabel15.setText("PRIX");

        txtPrixR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrixR.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("$");

        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrenomR))
                                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(txtNomR, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSiegeR, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(txtPrixR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSiegeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtPrenomR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtPrixR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer)
                    .addComponent(btnFermer))
                .addGap(20, 20, 20))
        );

        jInternalFrame4.setTitle("Liste des vols");
        jInternalFrame4.setVisible(true);

        jtListeVol.setBackground(new java.awt.Color(240, 240, 240));
        jtListeVol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num vol", "Aeroport de depart", "Aeroport d'arrivée", "date depart", "date arrivée", "heure depart", "heure arrivée"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtListeVol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListeVolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListeVol);

        jInternalFrame1.setTitle("Information du vol");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setVisible(true);

        txtNVol.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNVol.setEnabled(false);

        btnChoisirSiege.setText("Choisir siege");
        btnChoisirSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoisirSiegeActionPerformed(evt);
            }
        });

        jLabel1.setText("N.Vol");

        jLabel6.setText("Aeroport depart ");

        txtAD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAD.setEnabled(false);

        txtAA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAA.setEnabled(false);

        jLabel7.setText("Aeroport d'arrivée");

        txtDD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDD.setEnabled(false);

        txtDA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDA.setEnabled(false);

        jLabel8.setText("Date depart");

        jLabel9.setText("Date arrivée");

        jLabel10.setText("Heure depart");

        jLabel11.setText("Heure arrivée");

        txtHD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHD.setEnabled(false);

        txtHA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHA.setEnabled(false);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNVol, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtAD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnChoisirSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAA, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAA))
                .addGap(10, 10, 10)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(11, 11, 11)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDA)
                            .addComponent(txtDD)
                            .addComponent(txtHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(btnChoisirSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInternalFrame1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInternalFrame3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInternalFrame2)
                    .addComponent(jInternalFrame3))
                .addGap(10, 10, 10)
                .addComponent(jInternalFrame4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //afficher la liste des vols
    private void btnVoirVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoirVolActionPerformed

        String nom = txtNom.getText(), prenom = txtPrenom.getText(), adresse = txtAdresse.getText();

        try { 
            int numPassport = Integer.parseInt(txtNPassport.getText());
            if (nom.length() == 0 || prenom.length() == 0 || adresse.length() == 0) {
                JOptionPane.showMessageDialog(null, "remplir tous vos information", "erreur de saisi", JOptionPane.ERROR_MESSAGE);
            } else {
                // pour visualiser les vols diponible 
                Object[] lines = Manipulation.chargerVols();

                DefaultTableModel model = (DefaultTableModel) jtListeVol.getModel();
                model.setRowCount(0);
                for (int i = 0; i < lines.length; i++) {
                    String[] row = lines[i].toString().split(" ");
                    model.addRow(row);

                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Fichier de données des vols introuvable", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "erreur sur le numero de passport", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnVoirVolActionPerformed

// Selectionner un vol et afficher les details:
    private void jtListeVolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListeVolMouseClicked

        int i = jtListeVol.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jtListeVol.getModel();
        txtNVol.setText(model.getValueAt(i, 0).toString());
        txtAD.setText(model.getValueAt(i, 1).toString());
        txtAA.setText(model.getValueAt(i, 2).toString());
        txtDD.setText(model.getValueAt(i, 3).toString());
        txtDA.setText(model.getValueAt(i, 4).toString());
        txtHD.setText(model.getValueAt(i, 5).toString());
        txtHA.setText(model.getValueAt(i, 6).toString());

        int j = jtReservation.getSelectedRow();
        DefaultTableModel Vol = (DefaultTableModel) jtReservation.getModel();
        txtNVol.setText(model.getValueAt(i, 0).toString());
        txtAD.setText(model.getValueAt(i, 1).toString());
        txtAA.setText(model.getValueAt(i, 2).toString());
        txtDD.setText(model.getValueAt(i, 3).toString());
        txtDA.setText(model.getValueAt(i, 4).toString());
        txtHD.setText(model.getValueAt(i, 5).toString());
        txtHA.setText(model.getValueAt(i, 6).toString());

    }//GEN-LAST:event_jtListeVolMouseClicked

    //Choisir un siege:
    private void btnChoisirSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoisirSiegeActionPerformed

        DefaultTableModel model = (DefaultTableModel) jtReservation.getModel();
        model.addRow(new Object[]{txtNVol.getText(), txtAD.getText(), txtAA.getText(), txtDD.getText(), txtDA.getText(), txtHD.getText(), txtHA.getText()});
        
        if (txtNVol.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Vous devez remplir vos informations et choisir un vol", "erreur de saisi", JOptionPane.ERROR_MESSAGE);
        } else {
            FenSiege fs = new FenSiege();
            fs.setVisible(true);
            txtNomR.setText(txtNom.getText());
            txtPrenomR.setText(txtPrenom.getText());
        }

    }//GEN-LAST:event_btnChoisirSiegeActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // Enregistrer le vol:
        int numPassport = Integer.parseInt(txtNPassport.getText());
        String nom= txtNom.getText();
        String prenom= txtPrenom.getText();
        
        String numVol= txtNVol.getText();
        String aeroportD = txtAD.getText();
        String aeroportA= txtAA.getText();
        String dateD = txtDD.getText();
        String dateA = txtDA.getText();
        String heureA = txtHA.getText();
        String heureD= txtHD.getText();
        
        String numSiege = txtSiegeR.getText();
        double prix = Double.parseDouble(txtPrixR.getText());
        
        Passager passager= new Passager(nom, prenom, txtAdresse, numPassport);
        Vol vol= new Vol(numVol, aeroportD, aeroportA, isDefaultLookAndFeelDecorated(),dateA, heureD, heureA);
        Siege siege= new Siege(numSiege, prix);
        
        
        Manipulation.enregistrerVols("src\\data\\volsEnregigtrer.txt", passager, vol, siege);
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // fermer la fenetre
        dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnFermer;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtListeVol;
    private javax.swing.JTable jtReservation;
    private javax.swing.JTextField txtAA;
    private javax.swing.JTextField txtAD;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtDA;
    private javax.swing.JTextField txtDD;
    private javax.swing.JTextField txtHA;
    private javax.swing.JTextField txtHD;
    private javax.swing.JTextField txtNPassport;
    private javax.swing.JTextField txtNVol;
    public static javax.swing.JTextField txtNom;
    public static javax.swing.JTextField txtNomR;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtPrenomR;
    public static javax.swing.JTextField txtPrixR;
    public static javax.swing.JTextField txtSiegeR;
    // End of variables declaration//GEN-END:variables
}
