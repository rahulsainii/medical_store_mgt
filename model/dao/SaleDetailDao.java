/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.to.CustomerTo;
import model.to.SaleDetailTo;
import useit.ErrorHandler;

public class SaleDetailDao extends Dao {
    public boolean insertrecord(SaleDetailTo record)
    {
        try{
        String query="insert into saledetail";
        query+="(bill_no,medicine_code,qty,price)";
        query+="values(?,?,?,?)";
        PreparedStatement stmt=DataConnection.preparestatement(query);
        stmt.setInt(1,record.getBill_no());
        stmt.setString(2,record.getMedicine_code());
        stmt.setInt(3,record.getQty());
        stmt.setFloat(4, record.getPrice());
        boolean result=stmt.executeUpdate()>0;
          stmt.close();
         return result;

        }
        catch(Exception ex){
          error_message=ex.getMessage();
           ErrorHandler.showErrorStack(ex);
          return false;
            
        }
        
    }
     public boolean deleterecord(int s_no)
   {
       try
       {
         String query="delete from saledetail where";
         query+="s_no=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setInt(1,s_no);
         boolean result=stmt.executeUpdate()>0;
         stmt.close();
         return result;
       }
       catch(Exception ex)
       {
          error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return false;
       }
   }
   public boolean updaterecord(SaleDetailTo record)
   {
     try{
       String query="update customer ";
       query+=" set bill_no=?,medicine_code=?,qty=?,price=? ";
       query+=" where s_no=?";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setInt(1,record.getBill_no());
       stmt.setString(2,record.getMedicine_code());
       stmt.setInt(3,record.getQty());
       stmt.setFloat(4,record.getPrice());
       stmt.setInt(5,record.getS_no());
       boolean result=stmt.executeUpdate()>0;
       return result;
       
       
     }
     catch(Exception ex)
     {
          error_message=ex.getMessage();
           ErrorHandler.showErrorStack(ex);
          return false;
         
     } 
   } 
   public SaleDetailTo getRecord(int s_no) {
        try {
            String query = "select s_no,medicine_code,qty,price ";
            query += " from saledetail ";
            query += " where s_no=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setInt(1,s_no);
            SaleDetailTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new SaleDetailTo();
                result.setS_no(rs.getInt("s_no"));
                result.setMedicine_code(rs.getString("medicine_code"));
                result.setQty(rs.getInt("qty"));
                result.setPrice(rs.getFloat("price"));
              }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return null;
        }
   }
   public List<SaleDetailTo> getAllRecord() {
        try {
            String query = "select saledetail.bill_no,medicineinfo.medicine_name,saledetail.qty,price,customer.customer_name from saledetail,\n" +
                           "billinfo,medicineinfo,customer where saledetail.bill_no=billinfo.bill_no and\n" +
                           "saledetail.medicine_code=medicineinfo.medicine_code and customer.customer_code=billinfo.customer_code; ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<SaleDetailTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    SaleDetailTo res = new SaleDetailTo();
                    res.setBill_no(rs.getInt("bill_no"));
                    res.setMedicine_name(rs.getString("medicine_name"));
                    res.setQty(rs.getInt("qty"));
                    res.setPrice(rs.getFloat("price"));
                    res.setCustomer_name(rs.getString("customer_name"));
                    result.add(res);
                } while (rs.next());
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             ErrorHandler.showErrorStack(ex);
            return null;
        }
    
}
   
   
}
