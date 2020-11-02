
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.to.CompanyInfoTo;
import useit.ErrorHandler;


public class CompanyInfoDao extends Dao{
     public boolean insertRecord(CompanyInfoTo record)
    {
        try
        {
           String query="insert into companyinfo";
           query+="(company_id,company_name)";
           query+="values(?,?)";
           PreparedStatement stmt=DataConnection.preparestatement(query);
           stmt.setString(1,record.getCompany_id());
           stmt.setString(2,record.getCompany_name());
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
     public boolean deleteRecord(String company_id)
     {
         try{
         String query="delete from CompanyInfo ";
         query+="where company_id=?";
         PreparedStatement stmt=DataConnection.preparestatement(query);
         stmt.setString(1,company_id);
         boolean result=stmt.executeUpdate()>0;
         stmt.close();
         return result;
         }
         catch(Exception ex)
         {
             error_message=ex.getMessage();
             ex.printStackTrace();
             return false;
             
         }
                 
     }
     public boolean updateRecord(CompanyInfoTo record) {
        try {
            String query = "update companyinfo ";
            query += " set company_name=? ";
            query += " where company_id=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, record.getCompany_name());
            stmt.setString(2, record.getCompany_id());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return false;
        }
    }
     public CompanyInfoTo getRecord(String cateogryid) {
        try {
            String query = "select company_id,company_name ";
            query += " from comapnyinfo ";
            query += " where company_id=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, cateogryid);
            CompanyInfoTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new CompanyInfoTo();
                result.setCompany_id(rs.getString("company_id"));
                result.setCompany_name(rs.getString("company_name"));
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
             ErrorHandler.showErrorStack(ex);
            return null;
        }
    }
    public List<CompanyInfoTo> getAllRecord() {
        try {
            String query = "select company_id,company_name ";
            query += " from companyinfo ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<CompanyInfoTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    CompanyInfoTo res = new CompanyInfoTo();
                    res.setCompany_id(rs.getString("company_id"));
                    res.setCompany_name(rs.getString("company_name"));
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