package mainscreen;

import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import model.dao.BillInfoDao;
import model.dao.CommonDAO;
import model.dao.CustomerDao;
import model.dao.MedicineInfoDao;
import model.dao.SaleDetailDao;
import model.dao.StockDao;
import model.to.BillInfoTo;
import model.to.CustomerTo;
import model.to.MedicineInfoTo;
import model.to.SaleDetailTo;
import model.to.StockTo;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import useit.Validations;

public class IfAddSales extends javax.swing.JInternalFrame {

    private List<CustomerTo> cus;
    private List<MedicineInfoTo> medicines;
    private List<StockTo> stock;
    private List<StockTo> next_stock;
    private List<StockTo> last_stock;
    String msg;
    float total;
    float sum = 0;
    private int selected_row = -1;
    private int selected_row2 = -1;
    int size = 0;
    int i = 0;
    String req_qty;
    CustomerTo customer = new CustomerTo();
    CustomerDao action1 = new CustomerDao();
    MedicineInfoTo record1 = new MedicineInfoTo();
    MedicineInfoDao action2 = new MedicineInfoDao();
    StockTo stock1 = new StockTo();
    StockTo last_stock1 = new StockTo();
    StockDao action3 = new StockDao();
    BillInfoTo bill = new BillInfoTo();
    BillInfoDao action_bill = new BillInfoDao();
    SaleDetailTo sale = new SaleDetailTo();
    SaleDetailDao action_sale = new SaleDetailDao();
    CommonDAO prev = new CommonDAO();

    public IfAddSales() {
        initComponents();
        bindCustomer_combo();
        bindMedicine_combo();
        bindStock_table();
        bind_next_table();
        lb_customer1.setEnabled(false);
        lb_customer2.setEnabled(false);
        lb_customer3.setEnabled(false);
        tf_customer1.setEnabled(false);
        tf_customer2.setEnabled(false);
        text_area.setEnabled(false);
        combo_sales1.setEnabled(false);
        lb_sale1.setEnabled(false);
        tf_sale.setText("00.00");
        tf_sale.setEditable(false);
        combo_sales1.setEditable(true);
        combo_sales1.setSelectedItem("Enter Or choose customer");
        AutoCompleteDecorator.decorate(combo_sales1);
        combo_sales2.setEditable(true);
        combo_sales2.setSelectedItem("Enter or choose medicine");
        AutoCompleteDecorator.decorate(combo_sales2);

    }

    private void bindCustomer_combo() {
        combo_sales1.removeAllItems();
        combo_sales1.addItem("CHOOSE CUSTOMER");
        cus = action1.getAllRecord();
        for (CustomerTo cus1 : cus) {
            combo_sales1.addItem(cus1);
        }

    }

    private void bindMedicine_combo() {
        combo_sales2.removeAllItems();
        combo_sales2.addItem("CHOOSE MEDICINE");
        medicines = action2.getAllRecord();
        for (MedicineInfoTo record1 : medicines) {
            combo_sales2.addItem(record1);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_group = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sales_tf1 = new javax.swing.JTextField();
        lb_sale1 = new javax.swing.JLabel();
        combo_sales1 = new javax.swing.JComboBox<java.lang.Object>();
        combo_sales2 = new javax.swing.JComboBox<java.lang.Object>();
        rd_sales1 = new javax.swing.JRadioButton();
        rd_sales2 = new javax.swing.JRadioButton();
        tf_customer1 = new javax.swing.JTextField();
        lb_customer2 = new javax.swing.JLabel();
        tf_customer2 = new javax.swing.JTextField();
        lb_customer3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        lb_customer1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sales_table2 = new javax.swing.JTable();
        bt_sales = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sales_table = new javax.swing.JTable();
        bt_sales2 = new javax.swing.JButton();
        bt_sales3 = new javax.swing.JButton();
        panel = new controls.DatePanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_sale = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("ADD SALES");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("CHOOSE A MEDICINE :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ENTER QUANTITY :");

        sales_tf1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_sale1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_sale1.setText("CHOOSE CUSTOMER :");

        combo_sales1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_sales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sales1ActionPerformed(evt);
            }
        });

        combo_sales2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_sales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sales2ActionPerformed(evt);
            }
        });

        bt_group.add(rd_sales1);
        rd_sales1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rd_sales1.setText("OLD CUSTOMER");
        rd_sales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_sales1ActionPerformed(evt);
            }
        });

        bt_group.add(rd_sales2);
        rd_sales2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rd_sales2.setText("NEW CUSTOMER");
        rd_sales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_sales2ActionPerformed(evt);
            }
        });

        tf_customer1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_customer2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer2.setText("ENTER CUSTOMER CONTACT :");

        tf_customer2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lb_customer3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer3.setText("ENTER CUSTOMER NAME :");

        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane2.setViewportView(text_area);

        lb_customer1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_customer1.setText("ENTER ADDRESS OF CUSTOMER:");

        sales_table2.setModel(new javax.swing.table.DefaultTableModel(
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
        sales_table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_table2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(sales_table2);

        bt_sales.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sales.setText(" ADD ITEM");
        bt_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salesActionPerformed(evt);
            }
        });

        sales_table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sales_table.setModel(new javax.swing.table.DefaultTableModel(
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
        sales_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sales_table);

        bt_sales2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sales2.setText("REMOVE ITEM");
        bt_sales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sales2ActionPerformed(evt);
            }
        });

        bt_sales3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sales3.setText("GENERATE BILL");
        bt_sales3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sales3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ENTER BILL DATE :");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL AMOUNT :");

        tf_sale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_sale1)
                                .addComponent(rd_sales1))
                            .addGap(126, 126, 126)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rd_sales2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(343, 343, 343)
                            .addComponent(lb_customer2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(combo_sales1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(sales_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(113, 113, 113)
                            .addComponent(lb_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(combo_sales2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1))
                    .addComponent(bt_sales, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_sales2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_sales3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_sale)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rd_sales2)
                            .addComponent(rd_sales1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_sale1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_sales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(combo_sales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sales_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lb_customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_sales)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_sales2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_sales3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_sales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sales2ActionPerformed

        if (combo_sales2.getSelectedIndex() > 0) {
            record1 = (MedicineInfoTo) combo_sales2.getSelectedItem();
            bindStock_table();
        }
    }//GEN-LAST:event_combo_sales2ActionPerformed

    private void rd_sales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sales1ActionPerformed
        if (rd_sales1.isSelected()) {
            combo_sales1.setEnabled(true);
            lb_sale1.setEnabled(true);
            lb_customer1.setEnabled(false);
            lb_customer2.setEnabled(false);
            lb_customer3.setEnabled(false);
            tf_customer1.setEnabled(false);
            tf_customer2.setEnabled(false);
            text_area.setEnabled(false);
        }
    }//GEN-LAST:event_rd_sales1ActionPerformed

    private void rd_sales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sales2ActionPerformed
        if (rd_sales2.isSelected()) {
            lb_customer1.setEnabled(true);
            lb_customer2.setEnabled(true);
            lb_customer3.setEnabled(true);
            tf_customer1.setEnabled(true);
            tf_customer2.setEnabled(true);
            text_area.setEnabled(true);
            combo_sales1.setEnabled(false);
            lb_sale1.setEnabled(false);
        }
    }//GEN-LAST:event_rd_sales2ActionPerformed

    private void bt_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salesActionPerformed

        if (selected_row != -1 && stock != null && selected_row < stock.size()) {
            if (next_stock == null) {
                next_stock = new ArrayList<>();
            }
            if (last_stock == null) {
                last_stock = new ArrayList<>();
            }
            stock1 = stock.get(selected_row);
            last_stock1 = stock.get(selected_row);
            last_stock.add(last_stock1);
            for (StockTo st : last_stock) {
                System.out.println("IN LAST_STOCK qty is " + st.getQty());
            }
            req_qty = sales_tf1.getText().trim();
            if (Validations.isInteger(req_qty)) {
                int req_qty1 = Integer.parseInt(req_qty);
                if (req_qty1 <= stock1.getQty()) {
                    stock1.setMedicine_code(record1.getMedicine_code());
                    stock1.setQty(req_qty1);
                    next_stock.add(stock1);
                } else {
                    msg += "PLEASE ENTER VALID QUANTITY ";
                }
                bind_next_table();
                total = stock1.getQty() * stock1.getPrice();
                sum = sum + total;
                String sum1;
                sum1 = Float.toString(sum);
                tf_sale.setText(sum1);
            }
        }
    }//GEN-LAST:event_bt_salesActionPerformed

    private void combo_sales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sales1ActionPerformed
        if (combo_sales1.getSelectedIndex() > 0) {
            customer = (CustomerTo) combo_sales1.getSelectedItem();
            bindStock_table();
        }

    }//GEN-LAST:event_combo_sales1ActionPerformed

    private void sales_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_tableMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int row_point = sales_table.rowAtPoint(evt.getPoint());
            sales_table.getSelectionModel().setSelectionInterval(row_point, row_point);
            selected_row = sales_table.getSelectedRow();

        }
    }//GEN-LAST:event_sales_tableMouseClicked

    private void bt_sales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sales2ActionPerformed
        System.out.println(selected_row2);
        System.out.println(next_stock.get(selected_row2));
        StockTo stock2 = next_stock.get(selected_row2);
        System.out.println(stock2.getPrice());
        System.out.println(stock2.getQty());
        System.out.println(stock2.getPrice() * stock2.getQty());
        sum = sum - (stock2.getQty() * stock2.getPrice());
        String sum1 = Float.toString(sum);
        tf_sale.setText(sum1);
        next_stock.remove(selected_row2);
        last_stock.remove(selected_row2);
        bind_next_table();

    }//GEN-LAST:event_bt_sales2ActionPerformed

    private void sales_table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_table2MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int row_point = sales_table2.rowAtPoint(evt.getPoint());
            sales_table2.getSelectionModel().setSelectionInterval(row_point, row_point);
            selected_row2 = sales_table2.getSelectedRow();
        }
    }//GEN-LAST:event_sales_table2MouseClicked

    private void bt_sales3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sales3ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "DO YOU WANT TO GENERATE BILL ?", "Suggestions From System", JOptionPane.YES_NO_OPTION);
        int bill_no = 0;
        if (result == JOptionPane.YES_OPTION) {
            if (rd_sales2.isSelected()) {
                String customer_name = tf_customer1.getText().trim();
                String contact = tf_customer2.getText().trim();
                String address = text_area.getText().trim();
                if (Validations.isEmpty(customer_name) || Validations.isEmpty(contact) || Validations.isEmpty(address)) {
                    msg += "Please fill all customer details ";
                } else {
                    customer.setCustomer_name(customer_name);
                    customer.setPhone_no(contact);
                    customer.setAddress(address);
                    if (action1.insertrecord(customer)) {
                        bill.setCustomer_code(prev.getLastInsertID());

                    }
                }
            } else {
                bill.setCustomer_code(customer.getCustomer_code());
            }
            if (Validations.isInteger(req_qty)) {
                int qty = Integer.parseInt(req_qty);
                sale.setQty(qty);
                Date dt = panel.getSelectedDate();
                if (dt == null) {
                    msg += "please choose date ";
                } else {
                    bill.setBill_date(dt);
                    bill.setCash_entry(tf_sale.getText());
                    if (action_bill.insertrecord(bill)) {
                        bill_no = prev.getLastInsertID();
                        System.out.println(bill_no);
                    }
                }
            }
            if (bill_no != 0) {
                for (StockTo stock1 : next_stock) {
                    sale.setBill_no(bill_no);
                    sale.setMedicine_code(stock1.getMedicine_code());
                    sale.setPrice(stock1.getPrice());
                    sale.setQty(stock1.getQty());
                    if (action_sale.insertrecord(sale)) {
                        stock1.setStock_type("OUT");
                        if (action3.insertrecord(stock1)) {

                            for (StockTo stock6 : last_stock) {
                                System.out.println("QTY BEFORE UPDATION " + stock6.getQty());
                                if (stock6.getQty() != 0) {
                                    stock6.setQty(stock6.getQty() - stock1.getQty());
                                    System.out.println("QTY AFTER UPDATION " + stock6.getQty());
                                    action3.updaterecord(stock6);
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_bt_sales3ActionPerformed
    private void bindStock_table() {
        String medicine_code = record1.getMedicine_code();
        String[] col_names = {"MEDICINE NAME", "BATCH NO", "MFD DATE", "EXP_DATE", "PRICE", "STOCK TYPE", "qty"};
        Object[][] records = null;
        stock = new StockDao().getAllRecord(medicine_code);
        if (stock != null && stock.size() > 0) {
            records = new Object[stock.size()][col_names.length];
            int index = 0;
            for (StockTo cm : stock) {

                int quantity = action3.getQty(cm.getBatch_no(), cm.getMedicine_code()) - action3.getQty1(cm.getBatch_no(), cm.getMedicine_code());
                cm.setQty(quantity);
                records[index] = new Object[]{cm.getMedicine_name(), cm.getBatch_no(), cm.getMfd_date(), cm.getExp_date(), cm.getPrice(), cm.getStock_type(), cm.getQty()};
                index++;
            }
        } else {
            records = new Object[1][col_names.length];
            records[0] = new Object[]{"NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATION IS PRESENT", "NO INFORMATON IS PRESENT"};
        }

        DefaultTableModel model = new DefaultTableModel(records, col_names);
        sales_table.setModel(model);

    }

    private void bind_next_table() {
        String[] col_names = {"MEDICINE NAME", "BATCH NO", "MFD DATE", "EXP_DATE", "PRICE", "qty"};
        Object[][] record = null;
        int index = 0;

        if (next_stock != null && next_stock.size() > 0) {
            record = new Object[next_stock.size()][col_names.length];
            for (StockTo avail_stock : next_stock) {
                System.out.println("IN NEXT_STOCK " + avail_stock.getQty());
                record[index] = new Object[]{avail_stock.getMedicine_name(), avail_stock.getBatch_no(), avail_stock.getMfd_date(), avail_stock.getExp_date(), avail_stock.getPrice(), avail_stock.getQty()};
                index++;
            }
        } else {
            record = new Object[1][col_names.length];
            record[0] = new Object[]{"NO INFORMATION IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATON IS PRESENT", "NO INFORMATION IS PRESENT", "NO INFORMATON IS PRESENT"};
        }

        DefaultTableModel model = new DefaultTableModel(record, col_names);
        sales_table2.setModel(model);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bt_group;
    private javax.swing.JButton bt_sales;
    private javax.swing.JButton bt_sales2;
    private javax.swing.JButton bt_sales3;
    private javax.swing.JComboBox<java.lang.Object> combo_sales1;
    private javax.swing.JComboBox<java.lang.Object> combo_sales2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_customer1;
    private javax.swing.JLabel lb_customer2;
    private javax.swing.JLabel lb_customer3;
    private javax.swing.JLabel lb_sale1;
    private controls.DatePanel panel;
    private javax.swing.JRadioButton rd_sales1;
    private javax.swing.JRadioButton rd_sales2;
    private javax.swing.JTable sales_table;
    private javax.swing.JTable sales_table2;
    private javax.swing.JTextField sales_tf1;
    private javax.swing.JTextArea text_area;
    private javax.swing.JTextField tf_customer1;
    private javax.swing.JTextField tf_customer2;
    private javax.swing.JTextField tf_sale;
    // End of variables declaration//GEN-END:variables
}
