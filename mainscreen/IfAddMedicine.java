/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.util.List;
import javax.swing.JOptionPane;
import model.dao.CompanyInfoDao;
import model.dao.MedicineInfoDao;
import model.dao.MedicineTypeDao;
import model.to.CompanyInfoTo;
import model.to.MedicineInfoTo;
import model.to.MedicineTypeTo;
import useit.Validations;

/**
 *
 * @author Rahul Saini
 */
public class IfAddMedicine extends javax.swing.JInternalFrame {

    private List<MedicineTypeTo> types;
    private List<CompanyInfoTo> companies;
    
    public IfAddMedicine() {
        initComponents();
        bindtypecombo();
        bindcompanycombo();
        
    }
     
    void bindtypecombo()
    {
        types=new MedicineTypeDao().getAllRecord();
        jcb_medicine1.removeAllItems();
        jcb_medicine1.addItem("CHOOSE MEDICINE TYPE");
        for(MedicineTypeTo med:types)
        {
            jcb_medicine1.addItem(med);
        }
    }
     void bindcompanycombo()
    {
        companies=new CompanyInfoDao().getAllRecord();
        jcb_medicine2.removeAllItems();
        jcb_medicine2.addItem("CHOOSE A COMPANY");
        for(CompanyInfoTo com:companies)
        {
            jcb_medicine2.addItem(com);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_addmedicine1 = new javax.swing.JLabel();
        tf_addmedicine1 = new javax.swing.JTextField();
        lb_addmedicine2 = new javax.swing.JLabel();
        tf_addmedicine2 = new javax.swing.JTextField();
        lb_addmedicine3 = new javax.swing.JLabel();
        jcb_medicine1 = new javax.swing.JComboBox<java.lang.Object>();
        lb_addmedicine4 = new javax.swing.JLabel();
        jcb_medicine2 = new javax.swing.JComboBox();
        bt_addcompany = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        lb_addmedicine = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        lb_addmedicine1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addmedicine1.setText(" ENTER MEDICINE CODE :");

        tf_addmedicine1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_addmedicine2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addmedicine2.setText(" ENTER MEDICINE NAME :");

        tf_addmedicine2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_addmedicine3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addmedicine3.setText("CHOOSE TYPE :");

        jcb_medicine1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcb_medicine1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb_addmedicine4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addmedicine4.setText("CHOOSE  COMPANY:");

        jcb_medicine2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcb_medicine2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bt_addcompany.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_addcompany.setText("ADD MEDICINE");
        bt_addcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addcompanyActionPerformed(evt);
            }
        });

        textarea.setColumns(20);
        textarea.setRows(5);
        textarea.setTabSize(10);
        jScrollPane1.setViewportView(textarea);

        lb_addmedicine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addmedicine.setText("ENTER DESCRIPTION :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lb_addmedicine1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lb_addmedicine2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_addmedicine1)
                            .addComponent(tf_addmedicine2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_addmedicine3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_addmedicine4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_medicine2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcb_medicine1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lb_addmedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(bt_addcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb_addmedicine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_addmedicine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_addmedicine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_addmedicine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_addmedicine3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_medicine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_addmedicine4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_medicine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lb_addmedicine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_addcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addcompanyActionPerformed
        String msg="";
        String medicine_code=tf_addmedicine1.getText().trim();
        String medicine_name=tf_addmedicine2.getText().trim();
        String text=textarea.getText().trim();
         MedicineInfoTo med=new MedicineInfoTo();
        if(jcb_medicine1.getSelectedIndex()==0)
        {
            msg+="PLEASE SELECT USEDFOR \n";
        }
        else
        { 
        MedicineTypeTo medicine_type=(MedicineTypeTo)jcb_medicine1.getSelectedItem();
         med.setMedicine_type(medicine_type.getType_id());
        }
         if(jcb_medicine2.getSelectedIndex()==0)
        {
            msg+="PLEASE SELECT A COMPANY \n";
        }
        else
        { 
          CompanyInfoTo company=(CompanyInfoTo)jcb_medicine2.getSelectedItem();
           med.setCompany_id(company.getCompany_id());
        }
        
         if(Validations.isEmpty(medicine_code)||Validations.isEmpty(medicine_name)||Validations.isEmpty(text))
         {
             msg+="PLEASE ENTER MEDICINE CODE OR NAME  OR DESCRIPTION\n";
         }
         else
         {
             med.setMedicine_code(medicine_code);
             med.setMedicine_name(medicine_name);
             med.setDescription(text);
             MedicineInfoDao action=new MedicineInfoDao();
             if(action.insertrecord(med))
             {
                 msg+="MEDICINE IS INSERTED";
             }   
             else
             {
                 msg+="SOMETHING GOES WRONG";
             }
             
         }
         JOptionPane.showMessageDialog(this, msg);
        
        
    }//GEN-LAST:event_bt_addcompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addcompany;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<java.lang.Object> jcb_medicine1;
    private javax.swing.JComboBox jcb_medicine2;
    private javax.swing.JLabel lb_addmedicine;
    private javax.swing.JLabel lb_addmedicine1;
    private javax.swing.JLabel lb_addmedicine2;
    private javax.swing.JLabel lb_addmedicine3;
    private javax.swing.JLabel lb_addmedicine4;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField tf_addmedicine1;
    private javax.swing.JTextField tf_addmedicine2;
    // End of variables declaration//GEN-END:variables
}
