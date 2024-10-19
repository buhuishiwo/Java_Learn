package com.houserent.domain;

/*
* House类代表一个房屋信息
* */
public class House {
    private int id;
    private String ownername;
    private String phonenumber;
    private String address;
    private double rent;
    private String state;

    public House(int id, String ownername, String phonenumber, String address, double rent, String state) {
        this.id = id;
        this.ownername = ownername;
        this.phonenumber = phonenumber;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public House(String ownername, String phonenumber, String address, double rent, String state) {
        this.ownername = ownername;
        this.phonenumber = phonenumber;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  id +
                "\t\t" + ownername  +
                "\t\t" + phonenumber +
                "\t\t" + address +
                "\t\t" + rent +
                "\t\t" + state;
    }
}
