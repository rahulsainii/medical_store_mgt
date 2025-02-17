/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import javax.swing.JOptionPane;
import model.dao.CompanyInfoDao;
import model.to.CompanyInfoTo;
import useit.Validations;

/**
 *
 * @author Rahul Saini
 */
public class InternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public InternalFrame() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_addcompany1 = new javax.swing.JLabel();
        tf_company1 = new javax.swing.JTextField();
        lb_addcompany2 = new javax.swing.JLabel();
        tf_company2 = new javax.swing.JTextField();
        bt_addcompany = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("ADD COMANY DETAILS");

        lb_addcompany1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addcompany1.setText("ENTER COMPANY ID :");

        tf_company1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_addcompany2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_addcompany2.setText("ENTER COMPANY NAME :");

        tf_company2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        bt_addcompany.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_addcompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        bt_addcompany.setText("ADD COMPANY ");
        bt_addcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addcompanyActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Go-back-icon.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_company2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(tf_company1))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lb_addcompany2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lb_addcompany1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bt_addcompany)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lb_addcompany1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_company1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_addcompany2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_company2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addcompanyActionPerformed
        String message="";
        String company_id=tf_company1.getText().trim();
        String company_name=tf_company2.getText().trim();
        if(Validations.isEmpty(company_id)||Validations.isEmpty(company_name))
        {
            message+="Please fill all the boxes \n";
        }
        else
        {    
          CompanyInfoTo record=new CompanyInfoTo();
          record.setCompany_id(company_id);
          record.setCompany_name(company_name);
          CompanyInfoDao action=new CompanyInfoDao();
          if(action.insertRecord(record))
          {
             message+="new company is inserted \n";
            
          }
          else{
          message="failure \n";
        }
       }  
        JOptionPane.showMessageDialog(this,message);    
    }//GEN-LAST:event_bt_addcompanyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addcompany;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb_addcompany1;
    private javax.swing.JLabel lb_addcompany2;
    private javax.swing.JTextField tf_company1;
    private javax.swing.JTextField tf_company2;
    // End of variables declaration//GEN-END:variables
}
