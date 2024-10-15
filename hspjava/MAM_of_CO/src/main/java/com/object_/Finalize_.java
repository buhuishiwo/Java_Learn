package com.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car hongse = new Car("hongse");
        hongse = null;

    }
}
class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {

    }
}
