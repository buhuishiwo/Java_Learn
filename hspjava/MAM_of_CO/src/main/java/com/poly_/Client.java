package com.poly_;

public class Client {
    public static void main(String[] args) {
        Product book = new Book("Fay Cry 5","Alisan",200);
        Product phone = new Electronic("Xiaomi 14",3000,"Xiaomi","1 Year");
        System.out.println(book.getDetails());
        System.out.println(phone.getDetails());
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(book);
        cart.addProduct(phone);
        System.out.println(cart.calculateTotalPrice());
        cart.showCartDetails();
    }
}
