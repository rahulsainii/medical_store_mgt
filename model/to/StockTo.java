/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.to;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author Rahul Saini
 */
public class StockTo {
    private int sr_no;
    private String medicine_code;
    private String medicine_name;
    private String supplier_code;
    private String pharm_name;
    private String batch_no;
    private Date mfd_date;
    private Date exp_date;
    private float price;
    private String updated_by;
    private Timestamp last_updated;
    private Date stock_date;
    private String stock_type;
    private int qty;

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getPharm_name() {
        return pharm_name;
    }

    public void setPharm_name(String pharm_name) {
        this.pharm_name = pharm_name;
    }
    
    
    public Date getStock_date() {
        return stock_date;
    }

    public void setStock_date(Date stock_date) {
        this.stock_date = stock_date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public String getMedicine_code() {
        return medicine_code;
    }

    public void setMedicine_code(String medicine_code) {
        this.medicine_code = medicine_code;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public Date getMfd_date() {
        return mfd_date;
    }

    public void setMfd_date(Date mfd_date) {
        this.mfd_date = mfd_date;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public Timestamp getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Timestamp last_updated) {
        this.last_updated = last_updated;
    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }
    
    
    
}
