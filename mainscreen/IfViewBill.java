/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.awt.List;
import javax.swing.table.DefaultTableModel;
import model.dao.BillInfoDao;
import model.to.BillInfoTo;
import model.to.CustomerTo;

/**
 *
 * @author Rahul Saini
 */
public class IfViewBill extends javax.swing.JInternalFrame {

    private java.util.List<BillInfoTo> bills;
    public IfViewBill() {
        initComponents();
        bindBill();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_bill = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        table_bill.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_bill);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void bindBill()
    {
       String col_names[]={"BILL NO","CUSTOMER NAME","BILL DATE","CASH ENTRY"};
       Object[][] records=null;
       bills=new BillInfoDao().getAllRecord();
       if(bills!=null&&bills.size()>0)
        {
            records=new Object[bills.size()][col_names.length];
            int index=0;
            for(BillInfoTo bl:bills)
            {
                records[index]=new Object[]{bl.getBill_no(),bl.getCustomer_name(),bl.getBill_date(),bl.getCash_entry()};
                index++;
            }
        }   
        else{
            records=new Object[1][col_names.length];
            records[0]=new Object[]{"NO INFORMATION IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATION IS PRESENT","NO INFORMATION IS PRESENT"};
        }
            
        DefaultTableModel model=new DefaultTableModel(records,col_names);
        table_bill.setModel(model);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_bill;
    // End of variables declaration//GEN-END:variables
}
