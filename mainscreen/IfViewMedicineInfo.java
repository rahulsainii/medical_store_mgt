/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.dao.CompanyInfoDao;
import model.dao.MedicineInfoDao;
import model.to.CompanyInfoTo;
import model.to.MedicineInfoTo;

/**
 *
 * @author Rahul Saini
 */
public class IfViewMedicineInfo extends javax.swing.JInternalFrame {

    private List<MedicineInfoTo> medicines;
    /**
     * Creates new form IfViewMedicineInfo
     */
    public IfViewMedicineInfo() {
        initComponents();
        bindMedicineInfo();
    }
    private void bindMedicineInfo()
    {
        String[] col_names={"MEDICINE ID","MEDICINE NAME","MEDICINE TYPE","COMPANY NAME","qty","DESCRIPRTION"};
        Object[][] records=null;
        medicines=new MedicineInfoDao().getAllRecord();
        if(medicines!=null&&medicines.size()>0)
        {
            records=new Object[medicines.size()][col_names.length];
            int index=0;
            for(MedicineInfoTo cm:medicines)
            {
                records[index]=new Object[]{cm.getMedicine_code(),cm.getMedicine_name(),cm.getType_name(),cm.getCompany_name(),cm.getQty(),cm.getDescription()};
                index++;
            }
        }   
        else{
            records=new Object[1][col_names.length];
            records[0]=new Object[]{"NO INFORMATION IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT"};
        }
            
        DefaultTableModel model=new DefaultTableModel(records,col_names);
        table_medicine1.setModel(model);
               
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_medicine1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        table_medicine1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_medicine1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_medicine1;
    // End of variables declaration//GEN-END:variables
}
