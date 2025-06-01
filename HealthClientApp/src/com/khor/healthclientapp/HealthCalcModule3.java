package com.khor.healthclientapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HealthCalcModule3 extends javax.swing.JPanel {

    private final JFrame parentFrame;
    
    HealthWebService_Service service = new HealthWebService_Service();
    HealthWebService port = service.getHealthWebServicePort();
        
    public HealthCalcModule3(JFrame frame, String name, String idNumber, String gender) {
        initComponents();
        this.parentFrame = frame;
        
        txtResultName.setText(name);
        txtResultIDNumber.setText(idNumber);
        txtResultGender.setText(gender);
        
        // Call web service to calculate age
        try {
            int age = port.calcAge(idNumber); // Use your web service method
            txtResultAge.setText(String.valueOf(age)); // Display age in result field
            
        } catch (Exception ex) {
            txtResultAge.setText("Error");
            System.out.println("Error calculating age: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        borderCalcCBR = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblWeight = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        borderResult = new javax.swing.JPanel();
        lblResultName = new javax.swing.JLabel();
        txtResultName = new javax.swing.JTextField();
        lblResultIDNumber = new javax.swing.JLabel();
        txtResultIDNumber = new javax.swing.JTextField();
        lblResultGender = new javax.swing.JLabel();
        txtResultGender = new javax.swing.JTextField();
        lblResultAge = new javax.swing.JLabel();
        txtResultAge = new javax.swing.JTextField();
        lblResultCBR = new javax.swing.JLabel();
        txtResultCBR = new javax.swing.JTextField();
        lblResultCBRComments = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultCBRComments = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        lblMET = new javax.swing.JLabel();
        txtMET = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(204, 255, 204));

        borderCalcCBR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calories Burn Rate Calculator ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWeight.setText("Weight (KG):");

        lblDuration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDuration.setText("Duration (Minutes):");

        txtWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        txtDuration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        borderResult.setBackground(new java.awt.Color(255, 255, 255));
        borderResult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Result ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        lblResultName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultName.setText("Name:");

        txtResultName.setEditable(false);
        txtResultName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResultName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultNameActionPerformed(evt);
            }
        });

        lblResultIDNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultIDNumber.setText("ID Number:");

        txtResultIDNumber.setEditable(false);
        txtResultIDNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultGender.setText("Gender:");

        txtResultGender.setEditable(false);
        txtResultGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultAge.setText("Age:");

        txtResultAge.setEditable(false);
        txtResultAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResultAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultAgeActionPerformed(evt);
            }
        });

        lblResultCBR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultCBR.setText("Calories Burn Rate:");

        txtResultCBR.setEditable(false);
        txtResultCBR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultCBRComments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultCBRComments.setText("Comments:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtResultCBRComments.setEditable(false);
        txtResultCBRComments.setColumns(20);
        txtResultCBRComments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResultCBRComments.setLineWrap(true);
        txtResultCBRComments.setRows(5);
        txtResultCBRComments.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtResultCBRComments);

        javax.swing.GroupLayout borderResultLayout = new javax.swing.GroupLayout(borderResult);
        borderResult.setLayout(borderResultLayout);
        borderResultLayout.setHorizontalGroup(
            borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderResultLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addComponent(lblResultCBRComments)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultName)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultIDNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultCBR)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultCBR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultAge)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultAge, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultGender)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        borderResultLayout.setVerticalGroup(
            borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderResultLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultName)
                    .addComponent(txtResultName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultIDNumber)
                    .addComponent(txtResultIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultGender)
                    .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultAge)
                    .addComponent(txtResultAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultCBR)
                    .addComponent(txtResultCBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultCBRComments)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText(" Calories Burn Rate is calculated using your weight,\n duration, and Metabolic Equivalent of Task (MET).\n Please enter:");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        lblMET.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMET.setText("Metabolic Equivalent of Task (MET):");

        txtMET.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout borderCalcCBRLayout = new javax.swing.GroupLayout(borderCalcCBR);
        borderCalcCBR.setLayout(borderCalcCBRLayout);
        borderCalcCBRLayout.setHorizontalGroup(
            borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                                .addComponent(lblDuration)
                                .addGap(18, 18, 18)
                                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addGap(18, 18, 18)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblMET)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMET, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(borderResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderCalcCBRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        borderCalcCBRLayout.setVerticalGroup(
            borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMET)
                    .addComponent(txtMET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(borderResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnCalculate)
                    .addComponent(btnReset))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderCalcCBR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderCalcCBR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        parentFrame.setContentPane(new HealthCalcGUI(parentFrame)); // Pass parentFrame
        parentFrame.pack();
        parentFrame.setLocationRelativeTo(null);
        parentFrame.revalidate();
        parentFrame.repaint();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try {
            double weight = Double.parseDouble(txtWeight.getText());
            double duration = Double.parseDouble(txtDuration.getText());
            double met = Double.parseDouble(txtMET.getText());

            // Call calculateCaloriesValue from web service
            double cbr = port.calcCaloriesValue(weight, duration, met);
            txtResultCBR.setText(String.format("%.2f", cbr));

            // Call getCaloriesCategories from web service
            String cbrCategory = port.getCaloriesCategories(cbr);
            txtResultCBRComments.setText(cbrCategory);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight and height.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtWeight.setText("");
        txtDuration.setText("");
        txtMET.setText("");
        txtResultCBR.setText("");
        txtResultCBRComments.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtResultNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultNameActionPerformed

    private void txtResultAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borderCalcCBR;
    private javax.swing.JPanel borderResult;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblMET;
    private javax.swing.JLabel lblResultAge;
    private javax.swing.JLabel lblResultCBR;
    private javax.swing.JLabel lblResultCBRComments;
    private javax.swing.JLabel lblResultGender;
    private javax.swing.JLabel lblResultIDNumber;
    private javax.swing.JLabel lblResultName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtMET;
    private javax.swing.JTextField txtResultAge;
    private javax.swing.JTextField txtResultCBR;
    private javax.swing.JTextArea txtResultCBRComments;
    private javax.swing.JTextField txtResultGender;
    private javax.swing.JTextField txtResultIDNumber;
    private javax.swing.JTextField txtResultName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
