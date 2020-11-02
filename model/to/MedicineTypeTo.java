/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.to;

/**
 *
 * @author Rahul Saini
 */
public class MedicineTypeTo {
    private String type_id;
    private String type_name;
    private String usedfor;

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getUsedfor() {
        return usedfor;
    }

    public void setUsedfor(String usedfor) {
        this.usedfor = usedfor;
    }
    public String toString()
    {
        return type_name;
    }
    
    
    
}
