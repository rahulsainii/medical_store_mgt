/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import javax.swing.JOptionPane;
import model.dao.CustomerDao;
import model.to.CustomerTo;
import useit.Validations;

/**
 *
 * @author Rahul Saini
 */
public class IfUpdateCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfUpdateCustomer
     */
    public IfUpdateCustomer() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_customer1 = new javax.swing.JLabel();
        tf_customer2 = new javax.swing.JTextField();
        lb_customer2 = new javax.swing.JLabel();
        tf_customer3 = new javax.swing.JTextField();
        lb_customer3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        bt_updatecustomer = new javax.swing.JButton();
        lb_customer4 = new javax.swing.JLabel();
        tf_customer1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("UPADTE RECORD");

        lb_customer1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer1.setText("ENTER ADDRESS OF CUSTOMER:");

        tf_customer2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_customer2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer2.setText("ENTER CUSTOMER CONTACT :");

        tf_customer3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_customer3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer3.setText("ENTER CUSTOMER ID :");

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        bt_updatecustomer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_updatecustomer.setText("UPDATE CUSTOMER");
        bt_updatecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updatecustomerActionPerformed(evt);
            }
        });

        lb_customer4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer4.setText("ENTER CUSTOMER NAME :");

        tf_customer1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lb_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_updatecustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_customer2)
                            .addComponent(lb_customer4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tf_customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lb_customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lb_customer4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lb_customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_updatecustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_updatecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updatecustomerActionPerformed
        String msg="";
        int customer_code=Integer.parseInt(tf_customer1.getText().trim());
        String customer_name=tf_customer2.getText().trim();
        String phone_no=tf_customer3.getText().trim();
        String address=textarea.getText().trim();
        if(Validations.isEmpty(customer_name)||Validations.isEmpty(phone_no)||Validations.isEmpty(address))
        {
            msg+="PLEASE FILL ALL BOXES \n";
        }
        else
        {
            CustomerTo record= new CustomerTo();
            record.setCustomer_code(customer_code);
            record.setPhone_no(phone_no);
            record.setCustomer_name(customer_name);
            record.setAddress(address);
            CustomerDao action=new CustomerDao();
            if(action.updaterecord(record))
            {
                msg+="UPDATED SUCCESSFULLY";
            }
            else
            {
                msg+="FAILURE";
            }
        }
        JOptionPane.showMessageDialog(this,msg);
    }//GEN-LAST:event_bt_updatecustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_updatecustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_customer1;
    private javax.swing.JLabel lb_customer2;
    private javax.swing.JLabel lb_customer3;
    private javax.swing.JLabel lb_customer4;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField tf_customer1;
    private javax.swing.JTextField tf_customer2;
    private javax.swing.JTextField tf_customer3;
    // End of variables declaration//GEN-END:variables
}
