package com.khor.healthclientapp;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HealthCalcGUI extends javax.swing.JPanel {
    
    private final JFrame parentFrame;

    public HealthCalcGUI(JFrame frame) {
        initComponents();
        this.parentFrame = frame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupGender = new javax.swing.ButtonGroup();
        rbGroupCalculation = new javax.swing.ButtonGroup();
        pnlUserInfo = new javax.swing.JPanel();
        pnlGetInfo = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblIDNumber = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblCalculation = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        rbBMI = new javax.swing.JRadioButton();
        spBMI = new javax.swing.JScrollPane();
        txtareaBMI = new javax.swing.JTextArea();
        rbBFP = new javax.swing.JRadioButton();
        spBFP = new javax.swing.JScrollPane();
        txtareaBFP = new javax.swing.JTextArea();
        rbCBR = new javax.swing.JRadioButton();
        spCBR = new javax.swing.JScrollPane();
        txtareaCBR = new javax.swing.JTextArea();
        rbBMR = new javax.swing.JRadioButton();
        spBMR = new javax.swing.JScrollPane();
        txtareaBMR = new javax.swing.JTextArea();
        rbLBM = new javax.swing.JRadioButton();
        spLBM = new javax.swing.JScrollPane();
        txtareaLBM = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlGetInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Health & Fitness Calculator ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        pnlGetInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlGetInfo.setOpaque(false);

        Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name.setText("Name:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblIDNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIDNumber.setText("ID Number:");

        txtIDNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIDNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNumberActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGender.setText("Gender:");

        rbGroupGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbMale.setText("Male");

        rbGroupGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbFemale.setText("Female");

        lblCalculation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCalculation.setText("Calculation:");

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        rbGroupCalculation.add(rbBMI);
        rbBMI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbBMI.setText("Body Mass Index (BMI)");

        spBMI.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spBMI.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        spBMI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtareaBMI.setEditable(false);
        txtareaBMI.setColumns(20);
        txtareaBMI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtareaBMI.setLineWrap(true);
        txtareaBMI.setRows(5);
        txtareaBMI.setText(" BMI is a measures of body fat based on height and weight that applies to adult\n men and women.");
        txtareaBMI.setWrapStyleWord(true);
        txtareaBMI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spBMI.setViewportView(txtareaBMI);

        rbGroupCalculation.add(rbBFP);
        rbBFP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbBFP.setText("Body Fat Percentage (BFP)");

        spBFP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spBFP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtareaBFP.setEditable(false);
        txtareaBFP.setColumns(20);
        txtareaBFP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtareaBFP.setLineWrap(true);
        txtareaBFP.setRows(5);
        txtareaBFP.setText(" BFP is the proportion of your body weight that is made up of fat, compared to\n muscle and bone.");
        txtareaBFP.setWrapStyleWord(true);
        spBFP.setViewportView(txtareaBFP);

        rbGroupCalculation.add(rbCBR);
        rbCBR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbCBR.setText("Calories Burn Rate (CBR)");
        rbCBR.setActionCommand("");
        rbCBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCBRActionPerformed(evt);
            }
        });

        spCBR.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spCBR.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtareaCBR.setEditable(false);
        txtareaCBR.setColumns(20);
        txtareaCBR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtareaCBR.setLineWrap(true);
        txtareaCBR.setRows(5);
        txtareaCBR.setText(" CBR is the speed at which your body uses energy.");
        txtareaCBR.setWrapStyleWord(true);
        spCBR.setViewportView(txtareaCBR);

        rbGroupCalculation.add(rbBMR);
        rbBMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbBMR.setText("Basal Metabolic Rate (BMR)");
        rbBMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBMRActionPerformed(evt);
            }
        });

        spBMR.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spBMR.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtareaBMR.setEditable(false);
        txtareaBMR.setColumns(20);
        txtareaBMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtareaBMR.setLineWrap(true);
        txtareaBMR.setRows(5);
        txtareaBMR.setText(" BMR is the number of calories your body needs to accomplish its most basic\n (basal) life-sustaining function.");
        txtareaBMR.setToolTipText("");
        txtareaBMR.setWrapStyleWord(true);
        spBMR.setViewportView(txtareaBMR);

        rbGroupCalculation.add(rbLBM);
        rbLBM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbLBM.setText("Lean Body Mass (LBM)");

        spLBM.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spLBM.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtareaLBM.setEditable(false);
        txtareaLBM.setColumns(20);
        txtareaLBM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtareaLBM.setLineWrap(true);
        txtareaLBM.setRows(5);
        txtareaLBM.setText(" LBM is the weight of your body excluding fat tissue.");
        txtareaLBM.setWrapStyleWord(true);
        spLBM.setViewportView(txtareaLBM);

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGetInfoLayout = new javax.swing.GroupLayout(pnlGetInfo);
        pnlGetInfo.setLayout(pnlGetInfoLayout);
        pnlGetInfoLayout.setHorizontalGroup(
            pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGetInfoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGetInfoLayout.createSequentialGroup()
                        .addComponent(lblCalculation)
                        .addGap(18, 18, 18)
                        .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spBMR)
                            .addComponent(spLBM)
                            .addComponent(spBFP)
                            .addComponent(spCBR)
                            .addComponent(rbLBM)
                            .addComponent(rbBMR)
                            .addComponent(rbCBR)
                            .addComponent(rbBFP)
                            .addComponent(rbBMI)
                            .addComponent(spBMI)))
                    .addGroup(pnlGetInfoLayout.createSequentialGroup()
                        .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGetInfoLayout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addGap(18, 18, 18)
                                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbFemale)
                                    .addComponent(rbMale)))
                            .addGroup(pnlGetInfoLayout.createSequentialGroup()
                                .addComponent(Name)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlGetInfoLayout.createSequentialGroup()
                                .addComponent(lblIDNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 282, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(pnlGetInfoLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(btnSubmit)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGetInfoLayout.setVerticalGroup(
            pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGetInfoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDNumber)
                    .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbFemale)
                .addGap(18, 18, 18)
                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalculation)
                    .addComponent(rbBMI))
                .addGap(18, 18, 18)
                .addComponent(spBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbBFP)
                .addGap(18, 18, 18)
                .addComponent(spBFP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbCBR)
                .addGap(18, 18, 18)
                .addComponent(spCBR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbBMR)
                .addGap(18, 18, 18)
                .addComponent(spBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbLBM)
                .addGap(18, 18, 18)
                .addComponent(spLBM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlGetInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addComponent(btnSubmit))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout pnlUserInfoLayout = new javax.swing.GroupLayout(pnlUserInfo);
        pnlUserInfo.setLayout(pnlUserInfoLayout);
        pnlUserInfoLayout.setHorizontalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGetInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlUserInfoLayout.setVerticalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlGetInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        // clear input fields
        txtName.setText("");
        txtIDNumber.setText("");
        rbGroupGender.clearSelection();
        rbGroupCalculation.clearSelection();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try {
            String name = txtName.getText().trim();
            String idNumber = txtIDNumber.getText().trim();
            
            if (name.isEmpty() || idNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both Name and ID Number.");
                return;
            }
            
            String gender;
            if (rbMale.isSelected()) {
                gender = "Male";
            } else if (rbFemale.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(this, "Please select a gender.");
                return;
            }
            
            // call web service
            HealthWebService_Service service = new HealthWebService_Service();
            HealthWebService port = service.getHealthWebServicePort();

            String response = port.getUserInfo(name, idNumber, gender);
            String[] parts = response.split("\\|");

            if (parts.length != 3) {
                JOptionPane.showMessageDialog(this, "Invalid response from server.");
                return;
            }

            String selectedOption = null;

            if (rbBMI.isSelected()) {
                selectedOption = "BMI";
            } else if (rbBFP.isSelected()) {
                selectedOption = "BFP";
            } else if (rbCBR.isSelected()) {
                selectedOption = "Calories";
            } else if (rbBMR.isSelected()) {
                selectedOption = "BMR";
            } else if (rbLBM.isSelected()) {
                selectedOption = "LBM";
            }

            if (selectedOption == null) {
                JOptionPane.showMessageDialog(this, "Please select a calculation type.");
                return;
            }


            // navigate to selected page
            switch (selectedOption) {
                case "BMI":
                    HealthCalcModule1 page2 = new HealthCalcModule1(parentFrame, name, idNumber, gender);
                    parentFrame.setContentPane(page2);
                    break;
                case "BFP":
                    HealthCalcModule2 page3 = new HealthCalcModule2(parentFrame, name, idNumber, gender);
                    parentFrame.setContentPane(page3);
                    break;
                case "Calories":
                    HealthCalcModule3 page4 = new HealthCalcModule3(parentFrame, name, idNumber, gender);
                    parentFrame.setContentPane(page4);
                    break;
                case "BMR":
                    HealthCalcModule4 page5 = new HealthCalcModule4(parentFrame, name, idNumber, gender);
                    parentFrame.setContentPane(page5);
                    break;
                case "IBW":
                    HealthCalcModule5 page6 = new HealthCalcModule5(parentFrame, name, idNumber, gender);
                    parentFrame.setContentPane(page6);
                    break;
            }

            parentFrame.pack();
            parentFrame.setLocationRelativeTo(null);
            parentFrame.revalidate();
            parentFrame.repaint();
        
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter again."); // double fault handing
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void rbCBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCBRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCBRActionPerformed

    private void txtIDNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNumberActionPerformed

    private void rbBMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBMRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBMRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblCalculation;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIDNumber;
    private javax.swing.JPanel pnlGetInfo;
    private javax.swing.JPanel pnlUserInfo;
    private javax.swing.JRadioButton rbBFP;
    private javax.swing.JRadioButton rbBMI;
    private javax.swing.JRadioButton rbBMR;
    private javax.swing.JRadioButton rbCBR;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGroupCalculation;
    private javax.swing.ButtonGroup rbGroupGender;
    private javax.swing.JRadioButton rbLBM;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JScrollPane spBFP;
    private javax.swing.JScrollPane spBMI;
    private javax.swing.JScrollPane spBMR;
    private javax.swing.JScrollPane spCBR;
    private javax.swing.JScrollPane spLBM;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtareaBFP;
    private javax.swing.JTextArea txtareaBMI;
    private javax.swing.JTextArea txtareaBMR;
    private javax.swing.JTextArea txtareaCBR;
    private javax.swing.JTextArea txtareaLBM;
    // End of variables declaration//GEN-END:variables

    
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(() -> {
                JFrame frame = new JFrame("Health and Fitness Calculator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                HealthCalcGUI page1 = new HealthCalcGUI(frame);
                frame.add(page1);

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        }
}