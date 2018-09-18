/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author SAIFUL
 */
@ManagedBean
@SessionScoped
public class Booked {

    private String UName;
    private String email;
    private int noOfPassengar;
    private String fromLocation;
    private String toLocation;
    private Date date;
    private double totalCost;
    private SelectItem[] locations = new SelectItem[]{
        new SelectItem("Dhaka", "Dhaka"),
        new SelectItem("Chattagram", "Chattagram"),
        new SelectItem("Narayanganj", "Narayanganj"),
        new SelectItem("Gazipur", "Gazipur"),
        new SelectItem("Rajshahi", "Rajshahi")};

       public String FormattedDate() {
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }
    public boolean book() {
        return true;
    }

    public SelectItem[] getLocations() {
        return locations;
    }

    public void setLocations(SelectItem[] locations) {
        this.locations = locations;
    }
    

    public Booked() {
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoOfPassengar() {
        return noOfPassengar;
    }

    public void setNoOfPassengar(int noOfPassengar) {
        this.noOfPassengar = noOfPassengar;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

}
