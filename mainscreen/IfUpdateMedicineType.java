/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import javax.swing.JOptionPane;
import model.dao.MedicineTypeDao;
import model.to.MedicineTypeTo;

/**
 *
 * @author Rahul Saini
 */
public class IfUpdateMedicineType extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfUpdateMedicineType
     */
    public IfUpdateMedicineType() {
        initComponents();
        type_combo.removeAllItems();
        type_combo.addItem("choose one");
        type_combo.addItem("HUMAN");
        type_combo.addItem("VETRINARY");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        type_combo = new javax.swing.JComboBox();
        tf_type22 = new javax.swing.JTextField();
        tf_type21 = new javax.swing.JTextField();
        lb_type3 = new javax.swing.JLabel();
        lb_type22 = new javax.swing.JLabel();
        bt_type = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("ENTER TYPE ID :");

        type_combo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        type_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_comboActionPerformed(evt);
            }
        });

        tf_type22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tf_type21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_type3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_type3.setText("USED FOR :");

        lb_type22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_type22.setText("ENTER TYPE NAME :");

        bt_type.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_type.setText("UPDATE MEDICINE TYPE");
        bt_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_type22)
                            .addComponent(tf_type21, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lb_type22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lb_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(bt_type)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(jLabel21)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(tf_type21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_type22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_type22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_type, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void type_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_comboActionPerformed
    
    }//GEN-LAST:event_type_comboActionPerformed

    private void bt_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_typeActionPerformed
         String st="";
        String type_id=tf_type21.getText().trim();
        String type_name=tf_type22.getText().trim();
        MedicineTypeTo record=new MedicineTypeTo();
        String usedfor=null;
        
        if(type_combo.getSelectedIndex()==0)
        {
            st+="select something \n";
     
            usedfor=null;
        }
        else
        {
           usedfor=(String)type_combo.getSelectedItem();
        }  
        record.setType_id(type_id);
        record.setType_name(type_name);
        record.setUsedfor(usedfor);
        MedicineTypeDao action=new MedicineTypeDao();
        if(action.updateRecord(record))
        {
            st+="MEDICINE TYPE IS UPDATED \n";
            
        }
        else{
            st+="FAILURE \n";
        }
        JOptionPane.showMessageDialog(this,st); 
    }//GEN-LAST:event_bt_typeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_type;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel lb_type22;
    private javax.swing.JLabel lb_type3;
    private javax.swing.JTextField tf_type21;
    private javax.swing.JTextField tf_type22;
    private javax.swing.JComboBox type_combo;
    // End of variables declaration//GEN-END:variables
}
