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
import model.to.LoginInfoTo;
import model.to.MedicineInfoTo;
import useit.ErrorHandler;

public class MedicineInfoDao extends Dao{
  
   public boolean insertrecord(MedicineInfoTo record)
   {
     try{
       String query="insert into medicineinfo ";
       query+="(medicine_code,medicine_name,medicine_type,company_id,qty,description) ";
       query+="values(?,?,?,?,?,?)";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setString(1,record.getMedicine_code());
       stmt.setString(2,record.getMedicine_name());
       stmt.setString(3,record.getMedicine_type());
       stmt.setString(4,record.getCompany_id());
       stmt.setInt(5,record.getQty());
       stmt.setString(6,record.getDescription());
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
   public boolean deleterecord(String medicine_code)
   {
       try
       {
         String query="delete from medicineinfo where ";
         query+="medicine_code=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setString(1,medicine_code);
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
   public boolean updaterecord(MedicineInfoTo record)
   {
     try{
       String query="update medicineinfo ";
       query+="set medicine_name=?,medicine_type=?,company_id=?,description=?,qty=? ";
       query+=" where medicine_code=?";
       PreparedStatement stmt=DataConnection.preparestatement(query);
       stmt.setString(1,record.getMedicine_name());
       stmt.setString(2,record.getMedicine_type());
       stmt.setString(3,record.getCompany_id());
       stmt.setString(4,record.getDescription());
       stmt.setInt(5,record.getQty());
       stmt.setString(6,record.getMedicine_code());
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
    public MedicineInfoTo getRecord(String medicine_code) {
        try {
            String query = "select medicine_name,medicine_type,company_id,qty,description ";
            query += "from medicineinfo ";
            query += " where medicine_code=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1,medicine_code);
            MedicineInfoTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new MedicineInfoTo();
                result.setMedicine_code(rs.getString("medicine_code"));
                result.setMedicine_name(rs.getString("medicine_name"));
                result.setMedicine_type(rs.getString("medicine_type"));
                result.setCompany_id(rs.getString("company_id"));
                result.setQty(rs.getInt("qty"));
                result.setDescription(rs.getString("description"));
              }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             ErrorHandler.showErrorStack(ex);
            return null;
        }
    }
     public List<MedicineInfoTo> getAllRecord() {
        try {
            String query = "select medicineinfo.medicine_code,medicineinfo.medicine_name,";
                   query+="medicinetype.type_name,companyinfo.company_name,medicineinfo.qty,medicineinfo.description from medicineinfo,companyinfo,medicinetype ";
                   query+="where medicineinfo.medicine_type=medicinetype.type_id and medicineinfo.company_id=companyinfo.company_id";
            
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<MedicineInfoTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    MedicineInfoTo res = new MedicineInfoTo();
                    res.setMedicine_code(rs.getString("medicine_code"));
                    res.setMedicine_name(rs.getString("medicine_name"));
                    res.setType_name(rs.getString("type_name"));
                    res.setCompany_name(rs.getString("company_name"));
                    res.setQty(rs.getInt("qty"));
                    res.setDescription(rs.getString("description"));
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
     public List<MedicineInfoTo> getAllRecord1() {
        try {
            String query = "select medicine_code,medicine_name,";
                   query+="medicine_type,company_id,qty,description from medicineinfo ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<MedicineInfoTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    MedicineInfoTo res = new MedicineInfoTo();
                    res.setMedicine_code(rs.getString("medicine_code"));
                    res.setMedicine_name(rs.getString("medicine_name"));
                    res.setMedicine_type(rs.getString("medicine_type"));
                    res.setCompany_id(rs.getString("company_id"));
                    res.setQty(rs.getInt("qty"));
                    res.setDescription(rs.getString("description"));
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
