package com.pojo;
// Generated Jul 27, 2018 11:38:02 PM by Hibernate Tools 4.3.1



/**
 * Vehicless generated by hbm2java
 */
public class Vehicless  implements java.io.Serializable {


     private Integer vid;
     private String vname;
     private String driverName;
     private String DPhone;
     private int seatNumber;
     private double rentCost;
     private byte[] vimg;
     private String location;
     private String status;

    public Vehicless() {
    }

    public Vehicless(String vname, String driverName, String DPhone, int seatNumber, double rentCost, byte[] vimg, String location, String status) {
       this.vname = vname;
       this.driverName = driverName;
       this.DPhone = DPhone;
       this.seatNumber = seatNumber;
       this.rentCost = rentCost;
       this.vimg = vimg;
       this.location = location;
       this.status = status;
    }
   
    public Integer getVid() {
        return this.vid;
    }
    
    public void setVid(Integer vid) {
        this.vid = vid;
    }
    public String getVname() {
        return this.vname;
    }
    
    public void setVname(String vname) {
        this.vname = vname;
    }
    public String getDriverName() {
        return this.driverName;
    }
    
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getDPhone() {
        return this.DPhone;
    }
    
    public void setDPhone(String DPhone) {
        this.DPhone = DPhone;
    }
    public int getSeatNumber() {
        return this.seatNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public double getRentCost() {
        return this.rentCost;
    }
    
    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }
    public byte[] getVimg() {
        return this.vimg;
    }
    
    public void setVimg(byte[] vimg) {
        this.vimg = vimg;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


