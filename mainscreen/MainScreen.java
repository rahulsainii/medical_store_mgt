
package mainscreen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import loginscreen.LoginScreen;

public class MainScreen extends javax.swing.JFrame {
    
    public MainScreen() {
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
        deskpane = new javax.swing.JDesktopPane();
        backGround1 = new controls.BackGround();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bt_project1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_company = new javax.swing.JMenu();
        add_company = new javax.swing.JMenuItem();
        delete_company = new javax.swing.JMenuItem();
        view_company = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        medicine_type = new javax.swing.JMenu();
        add_type = new javax.swing.JMenuItem();
        menu_viewtype = new javax.swing.JMenuItem();
        delete_type = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        add_medicine = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-list-add-user-icon.png"))); // NOI18N
        jButton1.setText("CREATE USER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton2.setText("DELETE USER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton3.setText("UPDATE USER");

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jButton4.setText("VIEW ALL USERS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        bt_project1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_project1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Drug-basket-icon.png"))); // NOI18N
        bt_project1.setText("ADD NEW STOCK");
        bt_project1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_project1ActionPerformed(evt);
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

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGround1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bt_project1)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                    .addGroup(backGround1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGround1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_project1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(22, 22, 22))
        );
        backGround1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(bt_project1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        backGround1.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskpaneLayout = new javax.swing.GroupLayout(deskpane);
        deskpane.setLayout(deskpaneLayout);
        deskpaneLayout.setHorizontalGroup(
            deskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskpaneLayout.setVerticalGroup(
            deskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskpane.setLayer(backGround1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(deskpane, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 0));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(600, 32769));
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 40));

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

        medicine_type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/category-item-icon.png"))); // NOI18N
        medicine_type.setText("MEDICINE TYPE");

        add_type.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add_type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        add_type.setText("ADD_MEDICINE TYPE");
        add_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_typeActionPerformed(evt);
            }
        });
        medicine_type.add(add_type);

        menu_viewtype.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menu_viewtype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        menu_viewtype.setText("VIEW ALL TYPES");
        menu_viewtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_viewtypeActionPerformed(evt);
            }
        });
        medicine_type.add(menu_viewtype);

        delete_type.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete_type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        delete_type.setText("DELETE MEDICINE TYPE");
        delete_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_typeActionPerformed(evt);
            }
        });
        medicine_type.add(delete_type);

        jMenuItem13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem13.setText("UPDATE MEDICINE TYPE");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        medicine_type.add(jMenuItem13);

        jMenuBar1.add(medicine_type);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pill-add-icon.png"))); // NOI18N
        jMenu1.setText("MEDICINE");

        add_medicine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add_medicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        add_medicine.setText("ADD NEW MEDICINE");
        add_medicine.setToolTipText("");
        add_medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_medicineActionPerformed(evt);
            }
        });
        jMenu1.add(add_medicine);

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

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-list-add-user-icon.png"))); // NOI18N
        jMenu3.setText("CUSTOMER");

        jMenuItem9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        jMenuItem9.setText("ADD NEW CUSTOMER");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jMenuItem10.setText("DELETE CUSTOMER");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem11.setText("UPDATE CUSTOMER");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem12.setText("VIEW ALL CUSTOMER");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Drug-basket-icon.png"))); // NOI18N
        jMenu5.setText("STOCK");

        jMenuItem19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop-cart-add-icon.png"))); // NOI18N
        jMenuItem19.setText("ADD STOCK");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem20.setText("VIEW STOCK");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-list-add-user-icon.png"))); // NOI18N
        jMenu2.setText("SUPPLIER");

        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        jMenuItem5.setText("ADD NEW SUPPLIER");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jMenuItem6.setText("DELETE SUPPLIER");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem7.setText("UPDATE SUPPLIER");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem8.setText("VIEW ALL SUPPLIER");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sales-report-icon.png"))); // NOI18N
        jMenu4.setText("BILLS");

        jMenuItem14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sales-report-icon.png"))); // NOI18N
        jMenuItem14.setText("ADD BILL DETAILS");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jMenuItem15.setText("DELETE BILL DETAILS");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem16.setText("UPDATE BILL DETAILS");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem17.setText("VIEW ALL BILLS");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop-cart-add-icon.png"))); // NOI18N
        jMenu6.setText("SALE");

        jMenuItem18.setText("ADD SALE DETAILS");
        jMenuItem18.setToolTipText("");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop-cart-add-icon.png"))); // NOI18N
        jMenu7.setText("SALES");

        jMenuItem21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        jMenuItem21.setText("ADD NEW SALE");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuItem22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jMenuItem22.setText("VIEW SALES");
        jMenuItem22.setToolTipText("");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_companyActionPerformed
       InternalFrame dsc =new InternalFrame();
       deskpane.add(dsc);
       dsc.setVisible(true);
    }//GEN-LAST:event_add_companyActionPerformed

    private void add_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_typeActionPerformed
      InternalFrameType inf=new InternalFrameType();
      deskpane.add(inf);
      inf.setVisible(true);
    }//GEN-LAST:event_add_typeActionPerformed

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

    private void menu_viewtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_viewtypeActionPerformed
        IfViewMedicineType view1=new IfViewMedicineType();
        deskpane.add(view1);
        view1.setVisible(true);
    }//GEN-LAST:event_menu_viewtypeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IfUpdateCompany up=new IfUpdateCompany();
        deskpane.add(up);
        up.setVisible(true);  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void delete_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_typeActionPerformed
        IfDeleteMedicineType del2=new IfDeleteMedicineType();
        deskpane.add(del2);
        del2.setVisible(true);  
        
    }//GEN-LAST:event_delete_typeActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        IfUpdateMedicineType up1=new IfUpdateMedicineType();
        deskpane.add(up1);
        up1.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        IfAddSupplier add1=new IfAddSupplier();
        deskpane.add(add1);
        add1.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        IfDeleteSupplier del4=new IfDeleteSupplier();
        deskpane.add(del4);
        del4.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        IfViewSupplier view3=new IfViewSupplier();
        deskpane.add(view3);
        view3.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        IfUpdateSupplier up2=new IfUpdateSupplier();
        deskpane.add(up2);
        up2.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       IfDeleteCustomer del4=new IfDeleteCustomer();
        deskpane.add(del4);
        del4.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        IfUpdateCustomer up3=new IfUpdateCustomer();
        deskpane.add(up3);
        up3.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        IfViewCustomer view4=new IfViewCustomer();
        deskpane.add(view4);
        view4.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IfAddUser user=new IfAddUser();
       deskpane.add(user);
       user.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         IfDeleteUser del5 =new IfDeleteUser();
       deskpane.add(del5);
       del5.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        IfViewUser view5=new IfViewUser();
        deskpane.add(view5);
        view5.setVisible(true); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LoginScreen login=new LoginScreen();
        login.setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(login,"YOU ARE LOGGED OUT");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        IfUpdateBill up4=new IfUpdateBill();
         deskpane.add(up4);
        up4.setVisible(true); 
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
      IfAddBill add3=new IfAddBill();
      deskpane.add(add3);
      add3.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      IfAddCustomer add4=new  IfAddCustomer();
      deskpane.add(add4);
      add4.setVisible(true);
            
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        IfDeleteBill del6=new IfDeleteBill();
        deskpane.add(del6);
        del6.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        IfViewBill view5=new  IfViewBill();
        deskpane.add(view5);
        view5.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
      IfAddSaleDetail add5=new  IfAddSaleDetail();
      deskpane.add(add5);
      add5.setVisible(true);       
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
      IfAddStock add6=new  IfAddStock();
      deskpane.add(add6);
      add6.setVisible(true);       
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
     IfViewStock view6=new  IfViewStock();
        deskpane.add(view6);
        view6.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
       IfAddSales add7=new IfAddSales();
       deskpane.add(add7);
       add7.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new MainScreen();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         IfAddSales add7=new IfAddSales();
       deskpane.add(add7);
       add7.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       IfViewSales view7=new  IfViewSales();
        deskpane.add(view7);
        view7.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void bt_project1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_project1ActionPerformed
       IfStock1 add8=new  IfStock1();
        deskpane.add(add8);
        add8.setVisible(true);
    }//GEN-LAST:event_bt_project1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_company;
    private javax.swing.JMenuItem add_medicine;
    private javax.swing.JMenuItem add_type;
    private controls.BackGround backGround1;
    private controls.BackGround backGround2;
    private javax.swing.JButton bt_project1;
    private javax.swing.JMenuItem delete_company;
    private javax.swing.JMenuItem delete_type;
    public javax.swing.JDesktopPane deskpane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu medicine_type;
    private javax.swing.JMenu menu_company;
    private javax.swing.JMenuItem menu_viewtype;
    private javax.swing.JMenuItem view_company;
    // End of variables declaration//GEN-END:variables
}
