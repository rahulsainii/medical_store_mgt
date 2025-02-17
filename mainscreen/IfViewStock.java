/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainscreen;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.dao.StockDao;
import model.to.StockTo;


public class IfViewStock extends javax.swing.JInternalFrame {

   private List<StockTo> stock; 
    public IfViewStock() {
        initComponents();
        bindStock();
    }
    private void bindStock()
    {
         String[] col_names={"SR NO.","MEDICINE NAME","PHARM NAME","BATCH NO","MFD DATE","EXP_DATE","PRICE","UPDATED BY","LAST UPDATED","STOCK TYPE","qty","STOCK_DATE"};
        Object[][] records=null;
        stock=new StockDao().getAllRecord();
        if(stock!=null&&stock.size()>0)
        {
            records=new Object[stock.size()][col_names.length];
            int index=0;
            for(StockTo cm:stock)
            {
                records[index]=new Object[]{cm.getSr_no(),cm.getMedicine_name(),cm.getPharm_name(),cm.getBatch_no(),cm.getMfd_date(),cm.getExp_date(),cm.getPrice(),cm.getUpdated_by(),cm.getLast_updated(),cm.getStock_type(),cm.getQty(),cm.getStock_date()};
                index++;
            }
        }   
        else{
            records=new Object[1][col_names.length];
            records[0]=new Object[]{"NO INFORMATION IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATION IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT","NO INFORMATON IS PRESENT"};
        }
            
        DefaultTableModel model=new DefaultTableModel(records,col_names);
        table_stock.setModel(model);
        
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
        table_stock = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        table_stock.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_stock);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_stock;
    // End of variables declaration//GEN-END:variables
}
