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
public class SupplierTo {
    private String supplier_code;
    private String pharm_name;
    private String address;
    private String supply_day;
    private String contact_no;

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getPharm_name() {
        return pharm_name;
    }

    public void setPharm_name(String pharm_name) {
        this.pharm_name = pharm_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSupply_day() {
        return supply_day;
    }

    public void setSupply_day(String supply_day) {
        this.supply_day = supply_day;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }
    public String toString()
    {
        String info=" [ "+supplier_code+" ] "+pharm_name;
        return info;
    }
    
}
