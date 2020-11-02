/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.to;

import java.sql.Date;

/**
 *
 * @author Rahul Saini
 */
public class BillInfoTo {
    private int bill_no;
    private int customer_code;
    private String customer_name;
    private Date bill_date;
    private String cash_entry;
    
     public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getBill_no() {
        return bill_no;
    }

    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }

    public int getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(int customer_code) {
        this.customer_code = customer_code;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public String getCash_entry() {
        return cash_entry;
    }

    public void setCash_entry(String cash_entry) {
        this.cash_entry = cash_entry;
    }
    public String toString()
    {
       String total=" [ "+bill_no+" ] [ "+customer_name+" ]"; 
       return total;
    }
     
}
