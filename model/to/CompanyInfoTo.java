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
public class CompanyInfoTo {
    private String company_id;
    private String company_name;

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
     public String toString()
    {
        return company_name;
    }
   
    
}
