/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.dao.CompanyInfoDao;
import model.dao.SupplierDao;
import model.to.CompanyInfoTo;
import model.to.SupplierTo;

/**
 *
 * @author Rahul Saini
 */
public class IfViewSupplier extends javax.swing.JInternalFrame {

   private List<SupplierTo> supplier;
    public IfViewSupplier() {
        initComponents();
        bindSupplier();
    }
    private void bindSupplier()
    {
       
        String[] col_names={"SUPPLIER ID","SUPPLIER NAME","SUPPLIER CONTACT NO","SUPPLY DAY","ADDRESS"};
        Object[][] records=null;
        supplier=new SupplierDao().getAllRecord();
        if(supplier!=null&&supplier.size()>0)
        {
            records=new Object[supplier.size()][col_names.length];
            int index=0;
            for(SupplierTo cm:supplier)
            {
                records[index]=new Object[]{cm.getSupplier_code(),cm.getPharm_name(),cm.getContact_no(),cm.getSupply_day(),cm.getAddress()};
                index++;
            }
        }   
        else{
            records=new Object[1][col_names.length];
            records[0]=new Object[]{"NO INFORMATION IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATION IS PRESENT","NO INFORMATION IS PRESENT","NO INFORMATION IS PRESENT"};
        }
            
        DefaultTableModel model=new DefaultTableModel(records,col_names);
        table_supplier.setModel(model);
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_supplier = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        table_supplier.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_supplier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_supplier;
    // End of variables declaration//GEN-END:variables
}
