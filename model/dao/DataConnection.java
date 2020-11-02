
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import useit.ConfigurationDetails;

/**
 *
 * @author Rahul Saini
 */
public class DataConnection{
    
    private DataConnection()
    {
    }
     private static Connection con=null;
     public static Connection getConnection()throws Exception
     {
         if(con==null)
         {
             Class.forName(ConfigurationDetails.DRIVER_NAME);
             con=DriverManager.getConnection(ConfigurationDetails.CONNECTION_URL,ConfigurationDetails.USER_NAME,ConfigurationDetails.USER_PASSWORD);
         }
         return con;
     }
     public static void closeConnection() throws Exception
     {
         if(con!=null)
         {
             con.close();
         }
         con=null;
     }
     public static PreparedStatement preparestatement(String query)throws Exception
     {
         return getConnection().prepareStatement(query);
     }
}
