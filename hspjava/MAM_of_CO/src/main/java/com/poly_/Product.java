package com.poly_;

abstract class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    abstract String getDetails();

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
