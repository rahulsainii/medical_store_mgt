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
import model.to.MedicineTypeTo;
import useit.ErrorHandler;

/**
 *
 * @author Rahul Saini
 */
public class MedicineTypeDao extends Dao {
     public boolean insertRecord(MedicineTypeTo record)
    {
        try
        {
           String query="insert into medicinetype";
           query+="(type_id,type_name,usedfor)";
           query+="values(?,?,?)";
           PreparedStatement stmt=DataConnection.preparestatement(query);
           stmt.setString(1,record.getType_id());
           stmt.setString(2,record.getType_name());
           stmt.setString(3,record.getUsedfor());
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
     public boolean deleteRecord(String type_id)
     {
         try{
         String query="delete from medicinetype ";
         query+="where type_id=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setString(1,type_id);
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
     public boolean updateRecord(MedicineTypeTo record) {
        try {
            String query = "update medicinetype";
            query +=" set type_name=?,usedfor=? ";
            query += " where type_id=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, record.getType_name());
            stmt.setString(2, record.getUsedfor());
            stmt.setString(3, record.getType_id());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ex.printStackTrace();
            return false;
        }
    }
     public MedicineTypeTo getRecord(String type_id) {
        try {
            String query = "select type_id,type_name,usedfor ";
            query += " from medicinetype ";
            query += " where type_id=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1,type_id);
            MedicineTypeTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new MedicineTypeTo();
                result.setType_id(rs.getString("type_id"));
                result.setType_name(rs.getString("type_name"));
                result.setType_name(rs.getString("usedfor"));
                
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             ErrorHandler.showErrorStack(ex);
            return null;
        }
    }
    public List<MedicineTypeTo> getAllRecord() {
        try {
            String query = "select type_id,type_name,usedfor ";
            query += "from medicinetype";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<MedicineTypeTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    MedicineTypeTo res = new MedicineTypeTo();
                    res.setType_id(rs.getString("type_id"));
                    res.setType_name(rs.getString("type_name"));
                    res.setUsedfor(rs.getString("usedfor"));
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
