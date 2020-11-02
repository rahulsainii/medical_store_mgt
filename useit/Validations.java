/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package useit;

/**
 *
 * @author Rahul Saini
 */
public class Validations {
    public static boolean isEmpty(String value)
    {
        if(value!=null)
        {
            return value.trim().isEmpty();
        }
        return false;
    }
     public static boolean isInteger(String value)
    {
        try
        {
          if(value!=null)
          {
             Integer.parseInt(value.trim());
             return true;
          }
        }
        catch(Exception ex){}
           return false;
    }
     public static boolean isFloat(String value)
    {
        try
        {
          if(value!=null)
          {
             Float.parseFloat(value.trim());
             return true;
          }
        }
        catch(Exception ex){}
           return false;
    }
    
}
