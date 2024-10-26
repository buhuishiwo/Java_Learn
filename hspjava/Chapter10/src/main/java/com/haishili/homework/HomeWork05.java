package com.haishili.homework;

import java.util.Random;

public class HomeWork05 {
    public static void main(String[] args) {
        String[] map = {"河流","马路"};
        Person person = new Person("唐僧",VehicleFactory.getHorse());
        int i = 0;
        while(i<6) {
            Random r = new Random();
            int randomNum = r.nextInt(2);
            if(map[randomNum] == "河流") {
                person.passRiver();
            }
            else{
                person.passRoad();
            }
            i++;
        }
    }
}

interface Vehicles {
    void work(String name);
}

class Horse implements Vehicles {

    private static Horse instance;

    private Horse(){};

    public static synchronized Horse getInstance(){
        if(instance == null) {
            instance = new Horse();
        }
        return instance;
    }
    @Override
    public void work(String name) {
        System.out.println(name+"Horse work");
    }
}

class Boat implements Vehicles {

    @Override
    public void work(String name) {
        System.out.println(name+"Boat work");
    }
}

class VehicleFactory {
    public static Horse getHorse() {
        return Horse.getInstance();
    }
    public static Boat getBoat() {
        return new Boat();
    }

}
class Person {
    private String name;
    private Vehicles vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
        if(!(vehicles instanceof Boat)) {
            vehicles = VehicleFactory.getBoat();
        }

        vehicles.work(name);
    }
    public void passRoad() {
        if(!(vehicles instanceof Horse)) {
            vehicles = VehicleFactory.getHorse();
        }
        vehicles.work(name);
    }
}
