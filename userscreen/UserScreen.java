
package userscreen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import loginscreen.LoginScreen;
import mainscreen.*;

public class UserScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public UserScreen() {
        try{
            ImageIcon image=new ImageIcon(getClass().getResource("/icons/icon.png"));
            setIconImage(image.getImage());
           }
        catch(Exception ex)
        {
            
        }
        initComponents();
        setSize(1000,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround2 = new controls.BackGround();
        bt_project1 = new javax.swing.JButton();
        deskpane = new javax.swing.JDesktopPane();
        backGround1 = new controls.BackGround();
        bt_project2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_company = new javax.swing.JMenu();
        add_company = new javax.swing.JMenuItem();
        delete_company = new javax.swing.JMenuItem();
        view_company = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        add_medicine = new javax.swing.JMenuItem();

        bt_project1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_project1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Drug-basket-icon.png"))); // NOI18N
        bt_project1.setText("ADD NEW STOCK");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bt_project2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_project2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Drug-basket-icon.png"))); // NOI18N
        bt_project2.setText("ADD NEW STOCK");
        bt_project2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_project2ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop-cart-add-icon.png"))); // NOI18N
        jButton7.setText("ADD NEW SALES");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Apps-session-logout-icon.png"))); // NOI18N
        jButton5.setText("LOG OUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Go-back-icon.png"))); // NOI18N
        jButton6.setText("REFRESH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGround1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(bt_project2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGround1Layout.createSequentialGroup()
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_project2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        backGround1.setLayer(bt_project2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskpaneLayout = new javax.swing.GroupLayout(deskpane);
        deskpane.setLayout(deskpaneLayout);
        deskpaneLayout.setHorizontalGroup(
            deskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskpaneLayout.setVerticalGroup(
            deskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskpane.setLayer(backGround1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(deskpane, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 0));
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(175, 40));

        menu_company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/companies-icon.png"))); // NOI18N
        menu_company.setText("COMPANY");

        add_company.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add_company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        add_company.setText("ADD_COMPANY");
        add_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_companyActionPerformed(evt);
            }
        });
        menu_company.add(add_company);

        delete_company.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete_company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        delete_company.setText("DELETE_COMPANY");
        delete_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_companyActionPerformed(evt);
            }
        });
        menu_company.add(delete_company);

        view_company.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        view_company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        view_company.setText("VIEW_COMPANIES");
        view_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_companyActionPerformed(evt);
            }
        });
        menu_company.add(view_company);

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem1.setText("UPDATE_COMPANY");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_company.add(jMenuItem1);

        jMenuBar1.add(menu_company);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pill-add-icon.png"))); // NOI18N
        jMenu1.setText("MEDICINE");

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jMenuItem2.setText("DELETE MEDICINE");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem3.setText("UPDATE MEDICINE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem4.setText("VIEW ALL MEDICINES");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Drug-basket-icon.png"))); // NOI18N
        jMenu5.setText("STOCK");

        add_medicine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add_medicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        add_medicine.setText("ADD NEW MEDICINE");
        add_medicine.setToolTipText("");
        add_medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_medicineActionPerformed(evt);
            }
        });
        jMenu5.add(add_medicine);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_companyActionPerformed
       InternalFrame dsc =new InternalFrame();
       deskpane.add(dsc);
       dsc.setVisible(true);
    }//GEN-LAST:event_add_companyActionPerformed

    private void view_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_companyActionPerformed
        IfViewCompany view=new IfViewCompany();
        deskpane.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_view_companyActionPerformed

    private void delete_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_companyActionPerformed
        IfDeleteCompany del=new IfDeleteCompany();
        deskpane.add(del);
        del.setVisible(true);
        
    }//GEN-LAST:event_delete_companyActionPerformed

    private void add_medicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_medicineActionPerformed
        IfAddMedicine del1=new IfAddMedicine();
        deskpane.add(del1);
        del1.setVisible(true);
    }//GEN-LAST:event_add_medicineActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IfUpdateCompany up=new IfUpdateCompany();
        deskpane.add(up);
        up.setVisible(true);  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     IfDeleteMedicineInfo del3=new IfDeleteMedicineInfo();
        deskpane.add(del3);
        del3.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     IfViewMedicineInfo view2=new IfViewMedicineInfo();
        deskpane.add(view2);
        view2.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        IfAddSales add7=new IfAddSales();
        deskpane.add(add7);
        add7.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LoginScreen login=new LoginScreen();
        login.setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(login,"YOU ARE LOGGED OUT");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new MainScreen();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bt_project2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_project2ActionPerformed
      IfAddMedicine del1=new IfAddMedicine();
        deskpane.add(del1);
        del1.setVisible(true);
    }//GEN-LAST:event_bt_project2ActionPerformed

   
    public static void main(String args[]) {
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_company;
    private javax.swing.JMenuItem add_medicine;
    private controls.BackGround backGround1;
    private controls.BackGround backGround2;
    private javax.swing.JButton bt_project1;
    private javax.swing.JButton bt_project2;
    private javax.swing.JMenuItem delete_company;
    private javax.swing.JDesktopPane deskpane;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menu_company;
    private javax.swing.JMenuItem view_company;
    // End of variables declaration//GEN-END:variables
}
