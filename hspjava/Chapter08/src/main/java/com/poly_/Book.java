package com.poly_;

public class Book extends Product{
    private String author;
    public Book(String name, String author, int price) {
        super(name, price);
        this.author = author;
    }
    public String getDetails() {
        return "Name"+super.getName() +" "+"Price"+super.getPrice()+" "+"Author"+author;
    }
}
