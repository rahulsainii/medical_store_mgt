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
import model.to.BillInfoTo;
import model.to.SaleDetailTo;
import useit.ErrorHandler;

/**
 *
 * @author Rahul Saini
 */
public class BillInfoDao extends Dao {
    public boolean insertrecord(BillInfoTo record)
    {
        try{
        String query="insert into billinfo";
        query+="(customer_code,bill_date,cash_entry)";
        query+="values(?,?,?)";
        PreparedStatement stmt=DataConnection.preparestatement(query);
        stmt.setInt(1,record.getCustomer_code());
        stmt.setDate(2,record.getBill_date());
        stmt.setString(3,record.getCash_entry());
        boolean result=stmt.executeUpdate()>0;
        stmt.close();
         return result;

        }
        catch(Exception ex){
           error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return false;
            
        }
        
    }
     public boolean deleterecord(int bill_no)
   {
       try
       {
         String query="delete from billinfo where ";
         query+="bill_no=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setInt(1,bill_no);
         boolean result=stmt.executeUpdate()>0;
         stmt.close();
         return result;
       }
       catch(Exception ex)
       {
           error_message=ex.getMessage();
            ErrorHandler.showErrorStack(ex);
          return false;
       }
   }
   public boolean updaterecord(BillInfoTo record)
   {
     try{
       String query="update billinfo ";
       query+=" set customer_code=?,bill_date=?,cash_entry=? ";
       query+=" where bill_no=?";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setInt(1,record.getCustomer_code());
       stmt.setDate(2,record.getBill_date());
       stmt.setString(3,record.getCash_entry());
       stmt.setInt(4,record.getBill_no());
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
   public BillInfoTo getRecord(int bill_no) {
        try {
            String query = "select bill_no,customer_code,bill_date,cash_entry ";
            query += " from billinfo ";
            query += " where bill_no=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setInt(1,bill_no);
            BillInfoTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new BillInfoTo();
                result.setBill_no(rs.getInt("bill_no"));
                result.setCustomer_code(rs.getInt("customer_code"));
                result.setBill_date(rs.getDate("bill_date"));
                result.setCash_entry(rs.getString("cash_entry"));
              }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             ErrorHandler.showErrorStack(ex);
            return null;
        }
   }
   public List<BillInfoTo> getAllRecord() {
        try {
            String query = "select bill_no,customer.customer_name,bill_date,cash_entry from billinfo join customer\n" +
                            "where billinfo.customer_code=customer.customer_code"; 
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<BillInfoTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    BillInfoTo res = new BillInfoTo();
                    res.setBill_no(rs.getInt("bill_no"));
                    res.setCustomer_name(rs.getString("customer_name"));
                    res.setBill_date(rs.getDate("bill_date"));
                    res.setCash_entry(rs.getString("cash_entry"));
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
