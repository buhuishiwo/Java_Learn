package com.haishili.homework;

public class HomeWork06 {
    public static void main(String[] args) {
        Car car = new Car(45);
        Car.Air air = car.new Air();
        air.flow();
    }
}

class Car {
    private int temperature;
    public Car(int temperature) {
        this.temperature = temperature;
    }
    class Air {
        public void flow() {
            if(Car.this.temperature>40){
                System.out.println("吹冷风");
            }
            else if(Car.this.temperature<0){
                System.out.println("吹热风");
            }
            else{
                System.out.println("关闭");
            }
        }
    }
}
