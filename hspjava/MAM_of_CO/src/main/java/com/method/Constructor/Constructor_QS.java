package com.method.Constructor;

public class Constructor_QS {
    public static void main(String[] args) {
        PersonA person = new PersonA("张三",12);
        System.out.println(person.name+" "+person.age);
    }
}

class PersonA {
     String name;
     int age;
    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public PersonA(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}