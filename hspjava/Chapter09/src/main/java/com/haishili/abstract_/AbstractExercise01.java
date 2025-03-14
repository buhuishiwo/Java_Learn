package com.haishili.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("Jack", 10001, 3000);
        jack.work();
    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    abstract public void work();
}

class Manager extends Employee {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }


    @Override
    public void work() {
        System.out.println("Manager："+super.getName()+"is working");
    }
}
