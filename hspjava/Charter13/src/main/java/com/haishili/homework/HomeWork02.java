package com.haishili.homework;

import java.util.ArrayList;

public class HomeWork02 {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 400000);
        Car bentli = new Car("Bentli", 5000000);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(bentli);
        System.out.println(cars.size());

    }
}
class Car {
    private String name;
    private double price;
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
