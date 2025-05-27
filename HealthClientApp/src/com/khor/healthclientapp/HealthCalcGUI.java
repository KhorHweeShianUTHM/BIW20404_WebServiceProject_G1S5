package com.khor.healthclientapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class HealthCalcGUI extends javax.swing.JPanel {

    public HealthCalcGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnlUserInfo = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblIdNumber = new javax.swing.JLabel();
        txtIdNumber = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblMET = new javax.swing.JLabel();
        txtMET = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        blnDelete = new javax.swing.JButton();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblResultName = new javax.swing.JLabel();
        txtResultName = new javax.swing.JTextField();
        lblResultIdNumber = new javax.swing.JLabel();
        txtResultIdNumber = new javax.swing.JTextField();
        lblResultGender = new javax.swing.JLabel();
        txtResultGender = new javax.swing.JTextField();
        lblResultAge = new javax.swing.JLabel();
        txtResultAge = new javax.swing.JTextField();
        lblResultWeight = new javax.swing.JLabel();
        txtResultWeight = new javax.swing.JTextField();
        lblResultHeight = new javax.swing.JLabel();
        txtResultHeight = new javax.swing.JTextField();
        lblResultMET = new javax.swing.JLabel();
        lblResultDuration = new javax.swing.JLabel();
        txtResultMET = new javax.swing.JTextField();
        txtResultDuration = new javax.swing.JTextField();
        lblResultBMI = new javax.swing.JLabel();
        txtResultBMI = new javax.swing.JTextField();
        lblResultBFP = new javax.swing.JLabel();
        txtResultBFP = new javax.swing.JTextField();
        lblResultCBR = new javax.swing.JLabel();
        txtResultCBR = new javax.swing.JTextField();
        lblResultLBM = new javax.swing.JLabel();
        lblResultBMR = new javax.swing.JLabel();
        txtResultLBM = new javax.swing.JTextField();
        txtResultBMR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 255, 204));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlUserInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Information ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        pnlUserInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlUserInfo.setOpaque(false);

        Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name.setText("Name:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblIdNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIdNumber.setText("ID Number:");

        txtIdNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGender.setText("Gender:");

        rbGroupGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbMale.setText("Male");

        rbGroupGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbFemale.setText("Female");

        lblWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWeight.setText("Weight (KG):");

        txtWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        lblHeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHeight.setText("Height (CM):");

        txtHeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        lblMET.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMET.setText("Metabolic Equivalent of Task (MET):");

        txtMET.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        blnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        blnDelete.setText("Delete");
        blnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnDeleteActionPerformed(evt);
            }
        });

        lblDuration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDuration.setText("Duration (Minutes):");

        txtDuration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserInfoLayout = new javax.swing.GroupLayout(pnlUserInfo);
        pnlUserInfo.setLayout(pnlUserInfoLayout);
        pnlUserInfoLayout.setHorizontalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbFemale)
                                    .addComponent(rbMale)))
                            .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlUserInfoLayout.createSequentialGroup()
                                    .addComponent(Name)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserInfoLayout.createSequentialGroup()
                                    .addComponent(lblIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserInfoLayout.createSequentialGroup()
                                    .addComponent(lblHeight)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHeight)
                                    .addGap(156, 156, 156)))
                            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                                .addComponent(lblMET)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMET, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blnDelete))
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDuration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlUserInfoLayout.setVerticalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdNumber)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMET)
                    .addComponent(txtMET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blnDelete)
                    .addComponent(btnSubmit))
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display Basic Information ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        lblResultName.setText("Name:");

        txtResultName.setEditable(false);

        lblResultIdNumber.setText("ID Number: ");

        txtResultIdNumber.setEditable(false);

        lblResultGender.setText("Gender:");

        txtResultGender.setEditable(false);

        lblResultAge.setText("Age:");

        txtResultAge.setEditable(false);

        lblResultWeight.setText("Weight:");

        txtResultWeight.setEditable(false);

        lblResultHeight.setText("Height:");

        txtResultHeight.setEditable(false);

        lblResultMET.setText("Metabolic Equivalent of Task (MET):");

        lblResultDuration.setText("Duration (Minutes):");

        txtResultMET.setEditable(false);

        txtResultDuration.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultHeight)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResultHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtResultName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultIdNumber)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResultIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultWeight)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResultWeight))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultAge)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResultAge)
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultGender)
                            .addGap(18, 18, 18)
                            .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblResultDuration)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblResultMET)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultMET, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultName)
                    .addComponent(txtResultName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultIdNumber)
                    .addComponent(txtResultIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultGender)
                    .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultAge)
                    .addComponent(txtResultAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultWeight))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultHeight)
                    .addComponent(txtResultHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultMET)
                    .addComponent(txtResultMET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultDuration)
                    .addComponent(txtResultDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblResultBMI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBMI.setText("Body Mass Index (BMI):");

        txtResultBMI.setEditable(false);
        txtResultBMI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultBFP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBFP.setText("Body Fat Percentage (BFP):");

        txtResultBFP.setEditable(false);
        txtResultBFP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultCBR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultCBR.setText("Calories Burn Rate (CBR):");

        txtResultCBR.setEditable(false);
        txtResultCBR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultLBM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultLBM.setText("Lean Body Mass (LBM):");

        lblResultBMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBMR.setText("Basal Metabolic Rate (BMR):");

        txtResultLBM.setEditable(false);
        txtResultLBM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtResultBMR.setEditable(false);
        txtResultBMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setText("module choose");

        jLabel2.setText("radiobtn: mean of each module (which data needs)");

        jLabel3.setText("comment (baik or not baik)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultBMI)
                            .addComponent(lblResultBFP)
                            .addComponent(lblResultCBR)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResultBMR)
                                    .addComponent(lblResultLBM))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtResultLBM, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txtResultBFP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultBMI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultCBR, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtResultBMR)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultBMI)
                            .addComponent(txtResultBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultBFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResultBFP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultCBR)
                            .addComponent(txtResultCBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultLBM)
                            .addComponent(txtResultLBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultBMR)
                            .addComponent(txtResultBMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Health & Fitness Calculator");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(243, 243, 243))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void blnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnDeleteActionPerformed
        // clear input fields
        txtName.setText("");
        txtIdNumber.setText("");
        rbGroupGender.clearSelection();
        txtWeight.setText("");
        txtHeight.setText("");
        txtMET.setText("");
        txtDuration.setText("");
       
        // clear result fields
        txtResultName.setText("");
        txtResultIdNumber.setText("");
        txtResultGender.setText("");
        txtResultWeight.setText("");
        txtResultHeight.setText("");
        txtResultMET.setText("");
        txtResultDuration.setText("");
        txtResultAge.setText("");
        txtResultBMI.setText("");
        txtResultBFP.setText("");
        txtResultCBR.setText("");
        txtResultLBM.setText("");
        txtResultBMR.setText("");
           
    }//GEN-LAST:event_blnDeleteActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try {
            String name = txtName.getText().trim();
            String idNumber = txtIdNumber.getText().trim();
            
            // name and idnumber vaidation input
            if (name.isEmpty() || idNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both Name and ID Number.");
                return;
            }
            
            // gender vaidation input
            String gender;
            if (rbMale.isSelected()) {
                gender = "Male";
            } else if (rbFemale.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(this, "Please select a gender.");
                return;
            }
            
            // weight and height vaidation input
            String weightStr = txtWeight.getText().trim();
            String heightStr = txtHeight.getText().trim();

            if (weightStr.isEmpty() || heightStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter weight and height.");
                return;
            }

            if (!weightStr.matches("\\d+(\\.\\d+)?") || !heightStr.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(this, "Weight and height must be valid numeric values.");
                return;
            }
            // string convert to double
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);
            
            // add validation
            String metStr = txtMET.getText().trim();
            double met = Double.parseDouble(metStr);
            String durationStr = txtDuration.getText().trim();
            double duration = Double.parseDouble(durationStr);
            
            // call web service
            HealthWebService_Service service = new HealthWebService_Service();
            HealthWebService port = service.getHealthWebServicePort();

            String response = port.getUserInfo(name, idNumber, gender, weight, height, met, duration);
            String[] parts = response.split("\\|");

            if (parts.length != 7) {
                JOptionPane.showMessageDialog(this, "Invalid response from server.");
                return;
            }
            
            // response and display
            txtResultName.setText(parts[0]);
            txtResultIdNumber.setText(parts[1]);
            txtResultGender.setText(parts[2]);
            txtResultWeight.setText(parts[3]);
            txtResultHeight.setText(parts[4]);
            txtResultMET.setText(parts[5]);
            txtResultDuration.setText(parts[6]);

            // call calculateAge
            int age = port.calculateAge(idNumber);
            txtResultAge.setText(String.valueOf(age));

            // call calculateBMI
            String bmiResult = port.calculateBMI(weight, height);
            txtResultBMI.setText(bmiResult);

            // Extract numeric BMI value from bmiResult string (before space or '(' )
            String bmiValueStr = bmiResult.split(" ")[0];  // e.g., "22.45" from "22.45 (Normal weight)"
            double bmiValueForBFP = Double.parseDouble(bmiValueStr);

            // call calculateBFP
            String bfpResult = port.calculateBFP(age, gender, bmiValueForBFP);
            txtResultBFP.setText(bfpResult);
            
            // call calculateCBR 
            String cbrResult = port.calculateCBR(weight, duration, met);
            txtResultCBR.setText(cbrResult);
            
            // call calculateBMR
            String bmrResult = port.calculateBMR(gender, weight, height, age);
            txtResultBMR.setText(bmrResult);
            
            // call calculateLBM
            String lbmResult = port.calculateLBM(weight, height, gender);
            txtResultLBM.setText(lbmResult);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage()); // double fault handing
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JButton blnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblIdNumber;
    private javax.swing.JLabel lblMET;
    private javax.swing.JLabel lblResultAge;
    private javax.swing.JLabel lblResultBFP;
    private javax.swing.JLabel lblResultBMI;
    private javax.swing.JLabel lblResultBMR;
    private javax.swing.JLabel lblResultCBR;
    private javax.swing.JLabel lblResultDuration;
    private javax.swing.JLabel lblResultGender;
    private javax.swing.JLabel lblResultHeight;
    private javax.swing.JLabel lblResultIdNumber;
    private javax.swing.JLabel lblResultLBM;
    private javax.swing.JLabel lblResultMET;
    private javax.swing.JLabel lblResultName;
    private javax.swing.JLabel lblResultWeight;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel pnlUserInfo;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGroupGender;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtMET;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResultAge;
    private javax.swing.JTextField txtResultBFP;
    private javax.swing.JTextField txtResultBMI;
    private javax.swing.JTextField txtResultBMR;
    private javax.swing.JTextField txtResultCBR;
    private javax.swing.JTextField txtResultDuration;
    private javax.swing.JTextField txtResultGender;
    private javax.swing.JTextField txtResultHeight;
    private javax.swing.JTextField txtResultIdNumber;
    private javax.swing.JTextField txtResultLBM;
    private javax.swing.JTextField txtResultMET;
    private javax.swing.JTextField txtResultName;
    private javax.swing.JTextField txtResultWeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(() -> {
                JFrame frame = new JFrame("Health and Fitness Calculator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new HealthCalcGUI());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        }
}