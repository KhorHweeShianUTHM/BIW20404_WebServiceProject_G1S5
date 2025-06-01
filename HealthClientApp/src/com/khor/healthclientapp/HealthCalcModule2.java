package com.khor.healthclientapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HealthCalcModule2 extends javax.swing.JPanel {

    private final JFrame parentFrame;
    
    HealthWebService_Service service = new HealthWebService_Service();
    HealthWebService port = service.getHealthWebServicePort();
    
    public HealthCalcModule2(JFrame frame, String name, String idNumber, String gender) {
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

        borderCalcBFP = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblWeight = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        borderResult = new javax.swing.JPanel();
        lblResultName = new javax.swing.JLabel();
        txtResultName = new javax.swing.JTextField();
        lblResultIDNumber = new javax.swing.JLabel();
        txtResultIDNumber = new javax.swing.JTextField();
        lblResultGender = new javax.swing.JLabel();
        txtResultGender = new javax.swing.JTextField();
        lblResultAge = new javax.swing.JLabel();
        txtResultAge = new javax.swing.JTextField();
        lblResultBFP = new javax.swing.JLabel();
        txtResultBFP = new javax.swing.JTextField();
        lblResultBFPComments = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultBFPComments = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));

        borderCalcBFP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Body Fat Percentage Calculator ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

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

        lblHeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHeight.setText("Height (CM):");

        txtWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        txtHeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        lblResultBFP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBFP.setText("Body Fat Percentage:");

        txtResultBFP.setEditable(false);
        txtResultBFP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultBFPComments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBFPComments.setText("Comments:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtResultBFPComments.setEditable(false);
        txtResultBFPComments.setColumns(20);
        txtResultBFPComments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResultBFPComments.setLineWrap(true);
        txtResultBFPComments.setRows(5);
        txtResultBFPComments.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtResultBFPComments);

        javax.swing.GroupLayout borderResultLayout = new javax.swing.GroupLayout(borderResult);
        borderResult.setLayout(borderResultLayout);
        borderResultLayout.setHorizontalGroup(
            borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderResultLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultBFPComments)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(borderResultLayout.createSequentialGroup()
                                        .addComponent(lblResultName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtResultName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(borderResultLayout.createSequentialGroup()
                                        .addComponent(lblResultBFP)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtResultBFP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(borderResultLayout.createSequentialGroup()
                                        .addComponent(lblResultAge)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtResultAge, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultIDNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderResultLayout.createSequentialGroup()
                                .addComponent(lblResultGender)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(9, 9, 9)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultGender)
                    .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultAge)
                    .addComponent(txtResultAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultBFP)
                    .addComponent(txtResultBFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultBFPComments)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText(" Body Fat Percentage is calculated using your age,\n gender, and Body Mass Index (BMI). Please enter:");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout borderCalcBFPLayout = new javax.swing.GroupLayout(borderCalcBFP);
        borderCalcBFP.setLayout(borderCalcBFPLayout);
        borderCalcBFPLayout.setHorizontalGroup(
            borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderCalcBFPLayout.createSequentialGroup()
                .addGroup(borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderCalcBFPLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addGroup(borderCalcBFPLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeight)
                            .addComponent(lblWeight))
                        .addGap(18, 18, 18)
                        .addGroup(borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(borderCalcBFPLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(borderResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderCalcBFPLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        borderCalcBFPLayout.setVerticalGroup(
            borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderCalcBFPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(borderResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(borderCalcBFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(borderCalcBFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderCalcBFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            double height = Double.parseDouble(txtHeight.getText()); // in cm

            // Call calculateBMI from web service
            double bmi = port.calcBMIValue(weight, height);

            // Get gender and age from fields
            String gender = txtResultGender.getText();
            int age = Integer.parseInt(txtResultAge.getText());

            // Call calculateBFPValue from web service
            double bfp = port.calcBFPValue(age, gender, bmi);
            txtResultBFP.setText(String.format("%.2f", bfp));

            // Call getBFPCategory from web service
            String bfpCategory = port.getBFPCategories(gender, bfp);
            txtResultBFPComments.setText(bfpCategory);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight and height.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtWeight.setText("");
        txtHeight.setText("");
        txtResultBFP.setText("");
        txtResultBFPComments.setText("");

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
    private javax.swing.JPanel borderCalcBFP;
    private javax.swing.JPanel borderResult;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblResultAge;
    private javax.swing.JLabel lblResultBFP;
    private javax.swing.JLabel lblResultBFPComments;
    private javax.swing.JLabel lblResultGender;
    private javax.swing.JLabel lblResultIDNumber;
    private javax.swing.JLabel lblResultName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtResultAge;
    private javax.swing.JTextField txtResultBFP;
    private javax.swing.JTextArea txtResultBFPComments;
    private javax.swing.JTextField txtResultGender;
    private javax.swing.JTextField txtResultIDNumber;
    private javax.swing.JTextField txtResultName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
