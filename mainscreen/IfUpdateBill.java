/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.BillInfoDao;
import model.dao.CustomerDao;
import model.to.BillInfoTo;
import model.to.CustomerTo;
import useit.Validations;

/**
 *
 * @author Rahul Saini
 */
public class IfUpdateBill extends javax.swing.JInternalFrame {

    private List<CustomerTo> list;
    public IfUpdateBill() {
        initComponents();
        bill_combo.removeAllItems();
        bill_combo.addItem("CHOOSE CUSTOMER");
        CustomerDao action=new CustomerDao();
        list=action.getAllRecord();
        for(CustomerTo cus:list)
        {
            bill_combo.addItem(cus);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bill_combo = new javax.swing.JComboBox<java.lang.Object>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_bill2 = new javax.swing.JTextField();
        bt_bill = new javax.swing.JButton();
        panel = new controls.DatePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_bill1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        bill_combo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bill_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bill_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_comboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ENTER BILL DATE :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ENTER CASH RECEIVED :");

        tf_bill2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        bt_bill.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_bill.setText("UPDATE BILL");
        bt_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_billActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CHOOSE CUSTOMER :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ENTER BILL NO :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(bt_bill)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_bill2)
                            .addComponent(bill_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_bill1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_bill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tf_bill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bill_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_comboActionPerformed

    }//GEN-LAST:event_bill_comboActionPerformed

    private void bt_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_billActionPerformed
        String msg="";
        BillInfoTo record =new BillInfoTo();
        CustomerTo cus=new CustomerTo();

        if(bill_combo.getSelectedIndex()==0)
        {
            msg+="PLEASE CHOOSE A CUSTOMER \n";
        }
        else
        {
            cus=(CustomerTo)bill_combo.getSelectedItem();
            int customer_code=cus.getCustomer_code();
            record.setCustomer_code(customer_code);
        }
        String bill_no=tf_bill1.getText().trim();
         String cash=tf_bill2.getText().trim();
        Date dt=panel.getSelectedDate();
        BillInfoDao action=new BillInfoDao();
        
        if(Validations.isInteger(bill_no))
        {
            int num=Integer.parseInt(bill_no);
        }   
        if(Validations.isEmpty(cash)||dt==null||Validations.isEmpty(bill_no))
        {
          
            msg+="PLEASE FLLL OR CHOOSE ALL \n";
        }
        else
        {
                if(Validations.isInteger(bill_no))
               {
                  int num=Integer.parseInt(bill_no);
                   record.setBill_no(num);
               } 
           
            record.setBill_date(dt);
            record.setCash_entry(cash);
            if(action.updaterecord(record))
            {
                cus.setEntry_date(dt);
                CustomerDao action1=new CustomerDao();
                action1.updaterecord(cus);

                msg+="RECORD IS UPDATED \n";
            }
            else
            {
                msg+="FAILURE DUE TO"+action.getError_message();
            }

        }

        JOptionPane.showMessageDialog(this,msg);
    }//GEN-LAST:event_bt_billActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<java.lang.Object> bill_combo;
    private javax.swing.JButton bt_bill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private controls.DatePanel panel;
    private javax.swing.JTextField tf_bill1;
    private javax.swing.JTextField tf_bill2;
    // End of variables declaration//GEN-END:variables
}
