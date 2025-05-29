package com.khor.healthclientapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HealthCalcModule4 extends javax.swing.JPanel {

    private final JFrame parentFrame;
    
    HealthWebService_Service service = new HealthWebService_Service();
    HealthWebService port = service.getHealthWebServicePort();
        
    public HealthCalcModule4(JFrame frame, String name, String idNumber, String gender) {
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

        borderCalcCBR = new javax.swing.JPanel();
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
        lblResultBMR = new javax.swing.JLabel();
        txtResultBMR = new javax.swing.JTextField();
        txtResultBMRCategory = new javax.swing.JTextField();
        lblResultBMRCategory = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));

        borderCalcCBR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basal Metabolic Rate (BMR) Calculator ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

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

        lblResultBMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBMR.setText("Basal Metabolic Rate (BMR):");

        txtResultBMR.setEditable(false);
        txtResultBMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtResultBMRCategory.setEditable(false);
        txtResultBMRCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblResultBMRCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultBMRCategory.setText("Category:");

        javax.swing.GroupLayout borderResultLayout = new javax.swing.GroupLayout(borderResult);
        borderResult.setLayout(borderResultLayout);
        borderResultLayout.setHorizontalGroup(
            borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderResultLayout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                        .addComponent(lblResultBMRCategory)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultBMRCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addComponent(lblResultBMR)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addComponent(lblResultAge)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultAge, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderResultLayout.createSequentialGroup()
                        .addComponent(lblResultGender)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultGender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
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
                    .addComponent(lblResultBMR)
                    .addComponent(txtResultBMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultBMRCategory)
                    .addComponent(txtResultBMRCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jTextArea2.setText(" Basal Metabolic Rate (BMR) is calculated using\n your gender, weight, height, and age. Please\n enter:");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout borderCalcCBRLayout = new javax.swing.GroupLayout(borderCalcCBR);
        borderCalcCBR.setLayout(borderCalcCBRLayout);
        borderCalcCBRLayout.setHorizontalGroup(
            borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                                .addComponent(lblHeight)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addGap(18, 18, 18)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(borderResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderCalcCBRLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        borderCalcCBRLayout.setVerticalGroup(
            borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderCalcCBRLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderCalcCBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(borderResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(borderCalcCBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            double height = Double.parseDouble(txtHeight.getText());
            
            int age = Integer.parseInt(txtResultAge.getText());
            String gender = txtResultGender.getText();
            
            // Call calculateBMRValue from web service
            double bmr = port.calcBMRValue(gender, weight, height, age);
            txtResultBMR.setText(String.format("%.2f", bmr));

            // Call getBMRCategories from web service
            String bmrCategory = port.getBMRCategories(bmr);
            txtResultBMRCategory.setText(bmrCategory);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight and height.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtWeight.setText("");
        txtHeight.setText("");
        txtResultBMR.setText("");
        txtResultBMRCategory.setText("");
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblResultAge;
    private javax.swing.JLabel lblResultBMR;
    private javax.swing.JLabel lblResultBMRCategory;
    private javax.swing.JLabel lblResultGender;
    private javax.swing.JLabel lblResultIDNumber;
    private javax.swing.JLabel lblResultName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtResultAge;
    private javax.swing.JTextField txtResultBMR;
    private javax.swing.JTextField txtResultBMRCategory;
    private javax.swing.JTextField txtResultGender;
    private javax.swing.JTextField txtResultIDNumber;
    private javax.swing.JTextField txtResultName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
