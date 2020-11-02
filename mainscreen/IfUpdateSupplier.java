/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import javax.swing.JOptionPane;
import model.dao.SupplierDao;
import model.to.SupplierTo;
import useit.Validations;

/**
 *
 * @author Rahul Saini
 */
public class IfUpdateSupplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfUpdateSupplier
     */
    public IfUpdateSupplier() {
        initComponents();
        supplier_combo.removeAllItems();
        supplier_combo.addItem("CHOOSE DAY");
        supplier_combo.addItem("MONDAY");
        supplier_combo.addItem("TUESDAY");
        supplier_combo.addItem("WEDNESDAY");
        supplier_combo.addItem("THURSDAY");
        supplier_combo.addItem("FRIDAY");
        supplier_combo.addItem("SATURDAY");
        supplier_combo.addItem("SUNDAY");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        ld_supplier5 = new javax.swing.JLabel();
        ld_supplier1 = new javax.swing.JLabel();
        bt_supplier = new javax.swing.JButton();
        tf_supplier1 = new javax.swing.JTextField();
        ld_supplier2 = new javax.swing.JLabel();
        tf_supplier2 = new javax.swing.JTextField();
        supplier_combo = new javax.swing.JComboBox();
        ld_supplier3 = new javax.swing.JLabel();
        tf_supplier3 = new javax.swing.JTextField();
        ld_supplier4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane2.setViewportView(textarea);

        ld_supplier5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ld_supplier5.setText("ENTER SUPPLIER NAME :");

        ld_supplier1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ld_supplier1.setText("ENTER SUPPLIER ID :");

        bt_supplier.setText("SAVE DETAILS");
        bt_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_supplierActionPerformed(evt);
            }
        });

        tf_supplier1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        ld_supplier2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ld_supplier2.setText("CHOOSE DAY :");

        tf_supplier2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        supplier_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ld_supplier3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ld_supplier3.setText("ENTER CONTACT NO :");

        tf_supplier3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        ld_supplier4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ld_supplier4.setText("ENTER ADDRESS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_supplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_supplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(ld_supplier3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(ld_supplier4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ld_supplier2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(supplier_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_supplier3)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(ld_supplier5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(ld_supplier1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(bt_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ld_supplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(tf_supplier1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ld_supplier5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(tf_supplier2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ld_supplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_supplier3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(supplier_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ld_supplier4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ld_supplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_supplierActionPerformed
        String msg="";
        String supplier_code=tf_supplier1.getText().trim();
        String pharm_name=tf_supplier2.getText().trim();
        String contact_no=tf_supplier3.getText().trim();
        String address=textarea.getText().trim();

        SupplierTo record=new SupplierTo();
        if(Validations.isEmpty(supplier_code)||Validations.isEmpty(pharm_name)||Validations.isEmpty(contact_no)||Validations.isEmpty(address))
        {
            msg+="PLEASE FILL ALL BOXES \n\n";
        }
        else
        {
            record.setSupplier_code(supplier_code);
            record.setPharm_name(pharm_name);
            record.setContact_no(contact_no);
            record.setAddress(address);
        }
        if(supplier_combo.getSelectedIndex()==0)
        {
            msg+="PLEASE CHOOSE A SUPPLY DAY \n";
        }
        else {
            record.setSupply_day((String) supplier_combo.getSelectedItem());
        }
        SupplierDao action=new SupplierDao();
        if(action.updaterecord(record))
        {
            msg+="SUPPLIER UPDATED SUCCESSFULLY \n";
        }
        else
        {
            msg+="FAILURE DUE TO SOME REASON\n";
        }
        JOptionPane.showMessageDialog(this, msg);

    }//GEN-LAST:event_bt_supplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_supplier;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ld_supplier1;
    private javax.swing.JLabel ld_supplier2;
    private javax.swing.JLabel ld_supplier3;
    private javax.swing.JLabel ld_supplier4;
    private javax.swing.JLabel ld_supplier5;
    private javax.swing.JComboBox supplier_combo;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField tf_supplier1;
    private javax.swing.JTextField tf_supplier2;
    private javax.swing.JTextField tf_supplier3;
    // End of variables declaration//GEN-END:variables
}
