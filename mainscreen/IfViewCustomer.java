/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.dao.CustomerDao;
import model.dao.SupplierDao;
import model.to.CustomerTo;
import model.to.SupplierTo;

/**
 *
 * @author Rahul Saini
 */
public class IfViewCustomer extends javax.swing.JInternalFrame {

    private List<CustomerTo> customer;
    public IfViewCustomer() {
        initComponents();
        bindCustomer();
    }

     private void bindCustomer()
     {
         
        String[] col_names={"CUSTOMER ID","CUSTOMER NAME","CONTACT NO","ENTRY_DATE","ADDRESS"};
        Object[][] records=null;
        customer=new CustomerDao().getAllRecord();
        if(customer!=null&&customer.size()>0)
        {
            records=new Object[customer.size()][col_names.length];
            int index=0;
            for(CustomerTo cm:customer)
            {
                records[index]=new Object[]{cm.getCustomer_code(),cm.getCustomer_name(),cm.getPhone_no(),cm.getEntry_date(),cm.getAddress()};
                index++;
            }
        }   
        else{
            records=new Object[1][col_names.length];
            records[0]=new Object[]{"NO INFORMATION IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATION IS PRESENT","NO INFORMATION IS PRESENT","NO INFORMATION IS PRESENT"};
        }
            
        DefaultTableModel model=new DefaultTableModel(records,col_names);
        table_customer.setModel(model);
         
         
         
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("CUSTOMERS");

        table_customer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_customer);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CUSTOMER LIST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_customer;
    // End of variables declaration//GEN-END:variables
}
