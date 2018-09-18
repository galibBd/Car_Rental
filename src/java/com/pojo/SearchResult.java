/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author SAIFUL
 */
@ManagedBean
@SessionScoped
public class SearchResult {
    Date date;
    String times;
    Vehicles selectedvcl;
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean bookNow(){
        return true;
    }
    public Vehicles getSelectedvcl() {
        return selectedvcl;
    }

    public void setSelectedvcl(Vehicles selectedvcl) {
        this.selectedvcl = selectedvcl;
    }
    

    public String getTime() {
        return times;
    }

    public void setTime(String times) {
        this.times= times;
    }
    
}
