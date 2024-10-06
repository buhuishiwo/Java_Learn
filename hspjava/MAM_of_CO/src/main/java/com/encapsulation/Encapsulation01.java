package com.encapsulation;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person liming = new Person();
        liming.setName("Liming9");
        liming.setAge(20);
        System.out.println(liming.getAge());
        System.out.println(liming.getName());

    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6) {
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<=120) {
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
