package com.haishili.generic;

import java.util.ArrayList;
import java.util.Date;

public class HomeWork01 {
    public static void main(String[] args) {
        Employee jack = new Employee("jack", 10000, new MyDate(1999, 2, 1));
        Employee jack1 = new Employee("jack", 20000, new MyDate(1999, 2, 3));
        Employee amy = new Employee("amy", 30000, new MyDate(1999, 2, 2));
        Employee bob = new Employee("bob", 40000, new MyDate(2000, 2, 1));
        Employee bob1 = new Employee("bob", 50000, new MyDate(2000, 2, 2));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(jack1);
        employees.add(amy);
        employees.add(bob);
        employees.add(bob1);
        employees.sort((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) != 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o2.getBirthday().getDay() - o1.getBirthday().getDay();
            }

        });
        System.out.println(employees);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public long getDate() {
        return new Date(year, month, day).getTime();
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

class Employee {
    private String name;
    private int salary;
    private MyDate birthday;

    public Employee(String name, int salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}