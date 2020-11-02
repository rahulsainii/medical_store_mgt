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
import java.util.function.Supplier;
import model.to.SupplierTo;
import useit.ErrorHandler;

/**
 *
 * @author Rahul Saini
 */
public class SupplierDao extends Dao {
    public boolean insertrecord(SupplierTo record)
    {
        try{
        String query="insert into supplier";
        query+="(supplier_code,pharm_name,address,supply_day,contact_no)";
        query+="values(?,?,?,?,?)";
        PreparedStatement stmt=DataConnection.preparestatement(query);
        stmt.setString(1,record.getSupplier_code());
        stmt.setString(2,record.getPharm_name());
        stmt.setString(3,record.getAddress());
        stmt.setString(4, record.getSupply_day());
        stmt.setString(5, record.getContact_no());
        
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
     public boolean deleterecord(String supplier_code)
   {
       try
       {
         String query="delete from supplier where";
         query+="supplier_code=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setString(1,supplier_code);
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
   public boolean updaterecord(SupplierTo record)
   {
     try{
       String query="update supplier ";
       query+=" set pharm_name=?,address=?,supply_day=?,contact_no=? ";
       query+=" where supplier_code=?";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setString(1,record.getPharm_name());
       stmt.setString(2,record.getAddress());
       stmt.setString(3,record.getSupply_day());
       stmt.setString(4,record.getContact_no());
       stmt.setString(5,record.getSupplier_code());
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
   public SupplierTo getRecord(String supplier_code) {
        try {
            String query = "select supplier_code,pharm_name,address,supply_day,contact_no ";
            query += " from supplier ";
            query += " where supplier_code=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1,supplier_code);
            SupplierTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new SupplierTo();
                result.setSupplier_code(rs.getString("supplier_code"));
                result.setPharm_name(rs.getString("pharm_name"));
                result.setAddress(rs.getString("address"));
                result.setSupply_day(rs.getString("Supply_day"));
                result.setContact_no(rs.getString("contact_no"));
              }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             ErrorHandler.showErrorStack(ex);
            return null;
        }
   }
   public List<SupplierTo> getAllRecord() {
        try {
            String query = "select supplier_code,pharm_name,address,supply_day,contact_no ";
            query += " from supplier ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<SupplierTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    SupplierTo res = new SupplierTo();
                    res.setSupplier_code(rs.getString("supplier_code"));
                    res.setPharm_name(rs.getString("pharm_name"));
                    res.setAddress(rs.getString("address"));
                    res.setSupply_day(rs.getString("supply_day"));
                    res.setContact_no(rs.getString("contact_no"));
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
