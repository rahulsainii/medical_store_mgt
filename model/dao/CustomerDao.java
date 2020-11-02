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
import org.xml.sax.ErrorHandler;

/**
 *
 * @author Rahul Saini
 */
public class CustomerDao extends Dao{
    
   public boolean insertrecord(CustomerTo record)
   {
     try{
       String query="insert into customer";
       query+="(customer_name,phone_no,address) ";
       query+="values(?,?,?)";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setString(1,record.getCustomer_name());
       stmt.setString(2,record.getPhone_no());
       stmt.setString(3,record.getAddress());
       boolean result=stmt.executeUpdate()>0;
       stmt.close();
       return result;
       
     }
     catch(Exception ex)
     {
          error_message=ex.getMessage();
           useit.ErrorHandler.showErrorStack(ex);
          return false;
     }
   } 
   public boolean deleterecord(int customer_code)
   {
       try
       {
         String query="delete from customer where ";
         query+="customer_code=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setInt(1,customer_code);
         boolean result=stmt.executeUpdate()>0;
         stmt.close();
         return result;
       }
       catch(Exception ex)
       {
           error_message=ex.getMessage();
           useit.ErrorHandler.showErrorStack(ex);
          return false;
       }
          
   }
   public boolean updaterecord(CustomerTo record)
   {
     try{
       String query="update customer ";
       query+=" set customer_name=?,phone_no=?,address=?,entry_date=? ";
       query+=" where customer_code=?";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setString(1,record.getCustomer_name());
       stmt.setString(2,record.getPhone_no());
       stmt.setString(3,record.getAddress());
       stmt.setDate(4,record.getEntry_date());
       stmt.setInt(5,record.getCustomer_code());
       boolean result=stmt.executeUpdate()>0;
       return result;
       
       
     }
     catch(Exception ex)
     {
          error_message=ex.getMessage();
          ex.printStackTrace();
          return false;
         
     }
   }      
    public CustomerTo getRecord(String customer_code) {
        try {
            String query = "select customer_code,customer_name,phone_no,address,entry_date ";
            query += " from customer ";
            query += " where customer_code=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1,customer_code);
            CustomerTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new CustomerTo();
                result.setCustomer_code(rs.getInt("customer_code"));
                result.setCustomer_name(rs.getString("customer_name"));
                result.setPhone_no(rs.getString("Phone_no"));
                result.setAddress(rs.getString("address"));
                result.setEntry_date(rs.getDate("entry_date"));
              }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             useit.ErrorHandler.showErrorStack(ex);
            return null;
        }
    }
     public List<CustomerTo> getAllRecord() {
        try {
            String query = "select * ";
            query += " from customer ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<CustomerTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    CustomerTo res = new CustomerTo();
                     res.setCustomer_code(rs.getInt("customer_code"));
                     res.setCustomer_name(rs.getString("customer_name"));
                     res.setPhone_no(rs.getString("Phone_no"));
                     res.setAddress(rs.getString("address"));
                     res.setEntry_date(rs.getDate("entry_date"));
                     result.add(res);
                } while (rs.next());
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             useit.ErrorHandler.showErrorStack(ex);
            return null;
        }
    
}
       
    



    
}
