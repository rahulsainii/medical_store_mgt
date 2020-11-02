package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.to.LoginInfoTo;
import useit.ErrorHandler;


public class LoginInfoDao extends Dao{
    public boolean insertRecord(LoginInfoTo record)
    {
        try
        {
           String query="insert into logininfo";
           query+="(user_name,password_set,role_name)";
           query+="values(?,?,?)";
           PreparedStatement stmt=DataConnection.preparestatement(query);
           stmt.setString(1,record.getUser_name());
           stmt.setString(2,record.getPassword_set());
           stmt.setString(3,record.getRole_name());
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
    public boolean deleteRecord(String user_name)
     {
         try
         {
           String query="delete from logininfo ";
           query+="where user_name=?";
           PreparedStatement stmt=DataConnection.preparestatement(query);
           stmt.setString(1,user_name);
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
     public boolean updateRecord(LoginInfoTo record) {
            try 
            {
              String query = "update logininfo ";
              query +="set password_set=?,role_name=?,last_login=?";
              query += " where user_name=?";
              PreparedStatement stmt = DataConnection.preparestatement(query);
              stmt.setString(1, record.getPassword_set());
              stmt.setString(2, record.getRole_name());
              stmt.setTimestamp(3,record.getLast_login());
              stmt.setString(4, record.getUser_name());
              boolean result = stmt.executeUpdate() > 0;
              stmt.close();
              return result;
            
            }
            catch (Exception ex) 
            {
              error_message = ex.getMessage();
               ErrorHandler.showErrorStack(ex);
              return false;
            }
    }
     public LoginInfoTo getRecord(String user_name) {
        try {
            String query = "select user_name,password_set,role_name,last_login ";
            query += " from logininfo ";
            query += " where user_name=? ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1,user_name);
            LoginInfoTo result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new LoginInfoTo();
                result.setUser_name(rs.getString("user_name"));
                result.setPassword_set(rs.getString("password_set"));
                 result.setRole_name(rs.getString("role_name"));
                 result.setLast_login(rs.getTimestamp("last_login"));
                
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return null;
        }
    }
    public List<LoginInfoTo> getAllRecord() {
        try {
            String query = "select user_name,password_set,role_name,last_login ";
            query += " from logininfo ";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<LoginInfoTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    LoginInfoTo res = new LoginInfoTo();
                    res.setUser_name(rs.getString("user_name"));
                    res.setPassword_set(rs.getString("password_set"));
                    res.setRole_name(rs.getString("role_name"));
                    res.setLast_login(rs.getTimestamp("last_login"));
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
