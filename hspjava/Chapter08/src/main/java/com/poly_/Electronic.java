package com.poly_;

public class Electronic extends Product{
    private String brand;
    private String warranty;

    public Electronic(String name,int price,String brand, String warranty) {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
    }
    public String getDetails() {
        return "Name"+super.getName()+" "+"Price"+super.getPrice()+" "+"Brand"+brand+"Warranty"+warranty;
    }
}

