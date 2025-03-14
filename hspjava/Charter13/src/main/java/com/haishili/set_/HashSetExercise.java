package com.haishili.set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(18,"jack"));
        employees.add(new Employee(19,"tom"));
        employees.add(new Employee(18,"jack"));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private int age;
    private String name;
    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String  toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}