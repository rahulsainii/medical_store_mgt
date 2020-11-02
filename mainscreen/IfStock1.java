/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.JOptionPane;
import model.dao.CompanyInfoDao;
import model.dao.LoginInfoDao;
import model.dao.MedicineInfoDao;
import model.dao.StockDao;
import model.dao.SupplierDao;
import model.to.CompanyInfoTo;
import model.to.LoginInfoTo;
import model.to.MedicineInfoTo;
import model.to.StockTo;
import model.to.SupplierTo;
import useit.Operations;
import useit.Validations;

/**
 *
 * @author Rahul Saini
 */
public class IfStock1 extends javax.swing.JInternalFrame {

    
    private List<SupplierTo>sup;
    private List<CompanyInfoTo>com;
    SupplierDao action2=new SupplierDao();
    CompanyInfoDao action1=new CompanyInfoDao();
    
    
    
    public IfStock1() {
        initComponents();
        lb_addcompany1.setEnabled(false);
        lb_addcompany2.setEnabled(false);
        tf_company1.setEnabled(false);
        tf_company2.setEnabled(false);
        tf_company3.setEnabled(false);
        tf_company4.setEnabled(false);
        combo_stock1.setEnabled(false);
        combo_stock2.setEnabled(false);
        tf_supplier3.setEnabled(false);
        lb_supplier3.setEnabled(false);
        lb_supplier2.setEnabled(false);
        supplier_combo.setEnabled(false);
        lb_supplier4.setEnabled(false);
        textarea.setEnabled(false);
        combo_stock2.removeAllItems();
        combo_stock2.addItem("CHOOSE SUPPLIER");
        sup=action2.getAllRecord();
        for(SupplierTo med:sup)
        {
            combo_stock2.addItem(med);
        }
        combo_stock1.removeAllItems();
        combo_stock1.addItem("CHOOSE COMPANY");
        com=action1.getAllRecord();
        for(CompanyInfoTo med:com)
        {
            combo_stock1.addItem(med);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        lb_addcompany1 = new javax.swing.JLabel();
        tf_company1 = new javax.swing.JTextField();
        lb_addcompany2 = new javax.swing.JLabel();
        tf_company2 = new javax.swing.JTextField();
        combo_stock1 = new javax.swing.JComboBox();
        combo_stock2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        lb_addcompany3 = new javax.swing.JLabel();
        tf_company3 = new javax.swing.JTextField();
        lb_addcompany4 = new javax.swing.JLabel();
        tf_company4 = new javax.swing.JTextField();
        lb_supplier2 = new javax.swing.JLabel();
        supplier_combo = new javax.swing.JComboBox();
        lb_supplier3 = new javax.swing.JLabel();
        tf_supplier3 = new javax.swing.JTextField();
        lb_supplier4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        lb_stock6 = new javax.swing.JLabel();
        tf_stock3 = new javax.swing.JTextField();
        lb_stock8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_stock9 = new javax.swing.JLabel();
        panel3 = new controls.DatePanel();
        rd_stock1 = new javax.swing.JRadioButton();
        lb_stock3 = new javax.swing.JLabel();
        rd_stock2 = new javax.swing.JRadioButton();
        lb_stock4 = new javax.swing.JLabel();
        bt_stock2 = new javax.swing.JButton();
        panel2 = new controls.DatePanel1();
        bt_stock1 = new javax.swing.JButton();
        tf_stock2 = new javax.swing.JTextField();
        lb_stock7 = new javax.swing.JLabel();
        lb_stock5 = new javax.swing.JLabel();
        panel1 = new controls.DatePanel();
        tf_stock1 = new javax.swing.JTextField();
        combo_stock3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("STOCK ENTRY");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CHOOSE COMPANY :");

        buttonGroup1.add(rd1);
        rd1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rd1.setText("EXISTING COMPANY");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd2);
        rd2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rd2.setText("NEW COMPANY");
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });

        lb_addcompany1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_addcompany1.setText("ENTER COMPANY ID :");

        tf_company1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_addcompany2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_addcompany2.setText("ENTER COMPANY NAME :");

        tf_company2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        combo_stock1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_stock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_stock1ActionPerformed(evt);
            }
        });

        combo_stock2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_stock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_stock2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CHOOSE SUPPLIER :");

        buttonGroup2.add(rd3);
        rd3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rd3.setText("EXISTING SUPPLIER");
        rd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rd4);
        rd4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rd4.setText("NEW SUPPLIER");
        rd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd4ActionPerformed(evt);
            }
        });

        lb_addcompany3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_addcompany3.setText("ENTER SUPPLIER ID :");

        tf_company3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_addcompany4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_addcompany4.setText("ENTER SUPPLIER NAME :");
        lb_addcompany4.setToolTipText("");

        tf_company4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_supplier2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_supplier2.setText("CHOOSE DAY :");

        supplier_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb_supplier3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_supplier3.setText("ENTER CONTACT NO :");

        tf_supplier3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_supplier4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_supplier4.setText("ENTER ADDRESS:");

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane2.setViewportView(textarea);

        lb_stock6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock6.setText("UPDATED BY:");
        lb_stock6.setToolTipText("");

        tf_stock3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_stock8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock8.setText("ENTER QUANTITY :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ENTER BATCH NO :");

        lb_stock9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock9.setText("STOCK TYPE :");
        lb_stock9.setToolTipText("");

        rd_stock1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rd_stock1.setText("IN");
        rd_stock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_stock1ActionPerformed(evt);
            }
        });

        lb_stock3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock3.setText("CHOOSE MFD DATE :");
        lb_stock3.setToolTipText("");

        rd_stock2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rd_stock2.setText("OUT");

        lb_stock4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock4.setText("CHOOSE EXP DATE :");
        lb_stock4.setToolTipText("");

        bt_stock2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_stock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Go-back-icon.png"))); // NOI18N
        bt_stock2.setText("BACK");
        bt_stock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stock2ActionPerformed(evt);
            }
        });

        bt_stock1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_stock1.setText("ADD STOCK");
        bt_stock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stock1ActionPerformed(evt);
            }
        });

        tf_stock2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_stock7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock7.setText("CHOOSE STOCK DATE :");
        lb_stock7.setToolTipText("");

        lb_stock5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_stock5.setText("ENTER PRICE :");

        tf_stock1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        combo_stock3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo_stock3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");
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
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_stock5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lb_stock6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lb_stock8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lb_stock7)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tf_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_stock3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(combo_stock3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bt_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rd_stock1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rd_stock2)
                                        .addGap(62, 62, 62)))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lb_stock4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_stock3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(rd2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lb_addcompany1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lb_supplier4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_addcompany3)
                                            .addComponent(rd4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(lb_supplier3)))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_supplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_company4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lb_supplier2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(supplier_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))
                                .addGap(22, 22, 22))))
                    .addComponent(rd1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_company3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_addcompany4)
                                .addGap(9, 9, 9))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(combo_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lb_addcompany2))
                            .addComponent(tf_company1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_company2))))
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_stock9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd1)
                    .addComponent(rd2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_addcompany1)
                    .addComponent(jLabel3)
                    .addComponent(tf_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_company1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_stock4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_stock3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_addcompany2)
                                    .addComponent(combo_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tf_company2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rd3)
                                    .addComponent(rd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lb_addcompany3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_company3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(combo_stock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_stock6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lb_addcompany4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_company4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_supplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_stock5))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_stock8)
                                    .addComponent(tf_stock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_supplier3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_supplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supplier_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_stock7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lb_stock9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_supplier4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rd_stock2)
                            .addComponent(rd_stock1))
                        .addGap(18, 18, 18)
                        .addComponent(bt_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        if(rd1.isSelected())
        {
            combo_stock1.setEnabled(true);
            lb_addcompany1.setEnabled(false);
            lb_addcompany2.setEnabled(false);
            tf_company1.setEnabled(false);
            tf_company2.setEnabled(false);
        }
    }//GEN-LAST:event_rd1ActionPerformed

    private void rd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd3ActionPerformed
        {
        combo_stock2.setEnabled(true);
        tf_company3.setEnabled(false);
        tf_company4.setEnabled(false);
        tf_supplier3.setEnabled(false);
        lb_supplier3.setEnabled(false);
        lb_supplier2.setEnabled(false);
        supplier_combo.setEnabled(false);
        lb_supplier4.setEnabled(false);
        textarea.setEnabled(false);
        }
    }//GEN-LAST:event_rd3ActionPerformed

    private void combo_stock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_stock2ActionPerformed
        {
         lb_addcompany1.setEnabled(true);
         lb_addcompany2.setEnabled(true);
         tf_company1.setEnabled(true);
         tf_company2.setEnabled(true);
         combo_stock1.setEnabled(false);
        }
    }//GEN-LAST:event_combo_stock2ActionPerformed

    private void bt_stock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stock2ActionPerformed
        dispose();
    }//GEN-LAST:event_bt_stock2ActionPerformed

    private void bt_stock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stock1ActionPerformed
        String msg="";
        StockTo record =new StockTo();
        StockDao action=new StockDao();
        MedicineInfoTo medicine=new MedicineInfoTo();
        MedicineInfoDao action1=new MedicineInfoDao();
        LoginInfoTo user=new LoginInfoTo();
        LoginInfoDao action2=new LoginInfoDao();

        if(combo_stock1.getSelectedIndex()==0)
        {
            msg+="PLEASE CHOOSE A MEDICINE \n";
        }
        else
        {
            medicine=(MedicineInfoTo)combo_stock1.getSelectedItem();
            String medicine_code=medicine.getMedicine_code();
            record.setMedicine_code(medicine_code);
        }

        SupplierTo sup=new SupplierTo();
        if(combo_stock2.getSelectedIndex()==0)
        {
            msg+="PLEASE CHOOSE A SUPPLIER \n";
        }
        else
        {
            sup=(SupplierTo)combo_stock2.getSelectedItem();
            String supplier_code=sup.getSupplier_code();
            record.setSupplier_code(supplier_code);
        }

        if(combo_stock3.getSelectedIndex()==0)
        {
            msg+="PLEASE CHOOSE USER \n";
        }
        else
        {
            user=(LoginInfoTo)combo_stock3.getSelectedItem();
            String user_name=user.getUser_name();
            record.setUpdated_by(user_name);
        }
        String batch_no=tf_stock1.getText().trim();
        Date mfd_date=panel3.getSelectedDate();
        Date exp_date=panel2.getSelectedDate();
        Date stock_date=panel3.getSelectedDate();
        String price=tf_stock2.getText().trim();
        String qty=tf_stock3.getText().trim();
        String stocktype="";
        if(rd_stock1.isSelected())
        {
            stocktype="IN";
            record.setStock_type(stocktype);
        }
        else if(rd_stock2.isSelected()){
            stocktype="OUT";
            record.setStock_type(stocktype);

        }
        else
        {
            msg+="PLEASE CHOOSE STOCKTYPE \n";
        }

        if(Validations.isEmpty(batch_no)||exp_date==null||mfd_date==null||stock_date==null||Validations.isEmpty(price)||Validations.isEmpty(qty))
        {
            msg+="PLEASE FLLL OR CHOOSE ALL \n";
        }
        else
        {
            record.setBatch_no(batch_no);
            record.setMfd_date(mfd_date);
            record.setExp_date(exp_date);
            record.setStock_date(stock_date);
            record.setLast_updated(new Timestamp(System.currentTimeMillis()));

            if(Validations.isFloat(price))
            {
                record.setPrice(Float.parseFloat(price));
            }
            else
            {
                msg+="PLEASE ENTER A VALID PRICE ";
            }

            if(Validations.isInteger(qty))
            {
                int q=Integer.parseInt(qty);
                if(q>0)
                {
                    record.setQty(q);
                    if (stocktype.equalsIgnoreCase("IN")) {
                        if (action.insertrecord(record)) {
                            medicine.setQty(medicine.getQty() + record.getQty());
                            System.out.println(medicine.getQty());
                            System.out.println(medicine.getMedicine_type());
                            System.out.println(medicine.getCompany_id());

                            if(action1.updaterecord(medicine))
                            {
                                msg+= "MEDICINE is Added in Stock";
                            }
                        }else{
                            msg+= " Failure due to : " + action.getError_message();

                        }
                    } else {
                        if (record.getQty() <= medicine.getQty())
                        {
                            if (action.insertrecord(record))
                            {
                                medicine.setQty(medicine.getQty() - record.getQty());
                                if(action1.updaterecord(medicine))
                                {
                                    msg+= "MEDICINE is Added in Stock";
                                }
                            }
                            else
                            {
                                msg+=" Failure due to :"+ action.getError_message();

                            }
                        }
                    }
                }
            }
            else
            {
                msg+="ENTER VALID QUANTITY \n";
            }
        }

        JOptionPane.showMessageDialog(this, msg);

    }//GEN-LAST:event_bt_stock1ActionPerformed

    private void rd_stock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_stock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_stock1ActionPerformed

    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
       if(rd4.isSelected())
       {
        tf_company3.setEnabled(true);
        tf_company4.setEnabled(true);
        tf_supplier3.setEnabled(true);
        lb_supplier3.setEnabled(true);
        lb_supplier2.setEnabled(true);
        supplier_combo.setEnabled(true);
        lb_supplier4.setEnabled(true);
        textarea.setEnabled(true);
         combo_stock2.setEnabled(false);
       }
    }//GEN-LAST:event_rd4ActionPerformed

    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed
        lb_addcompany1.setEnabled(true);
         lb_addcompany2.setEnabled(true);
         tf_company1.setEnabled(true);
         tf_company2.setEnabled(true);
         combo_stock1.setEnabled(false);
    }//GEN-LAST:event_rd2ActionPerformed

    private void combo_stock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_stock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_stock1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Operations.openInternalFrame(getDesktopPane(), new InternalFrame());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_stock1;
    private javax.swing.JButton bt_stock2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox combo_stock1;
    private javax.swing.JComboBox combo_stock2;
    private javax.swing.JComboBox combo_stock3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_addcompany1;
    private javax.swing.JLabel lb_addcompany2;
    private javax.swing.JLabel lb_addcompany3;
    private javax.swing.JLabel lb_addcompany4;
    private javax.swing.JLabel lb_stock3;
    private javax.swing.JLabel lb_stock4;
    private javax.swing.JLabel lb_stock5;
    private javax.swing.JLabel lb_stock6;
    private javax.swing.JLabel lb_stock7;
    private javax.swing.JLabel lb_stock8;
    private javax.swing.JLabel lb_stock9;
    private javax.swing.JLabel lb_supplier2;
    private javax.swing.JLabel lb_supplier3;
    private javax.swing.JLabel lb_supplier4;
    private controls.DatePanel panel1;
    private controls.DatePanel1 panel2;
    private controls.DatePanel panel3;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd4;
    private javax.swing.JRadioButton rd_stock1;
    private javax.swing.JRadioButton rd_stock2;
    private javax.swing.JComboBox supplier_combo;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField tf_company1;
    private javax.swing.JTextField tf_company2;
    private javax.swing.JTextField tf_company3;
    private javax.swing.JTextField tf_company4;
    private javax.swing.JTextField tf_stock1;
    private javax.swing.JTextField tf_stock2;
    private javax.swing.JTextField tf_stock3;
    private javax.swing.JTextField tf_supplier3;
    // End of variables declaration//GEN-END:variables
}
