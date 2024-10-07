package com.override;

public class Homework {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 18);
        Student s1 = new Student("王五", 18, 112);
        System.out.println(p1.say());
        System.out.println(s1.say());

    }
}

class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String say() {
        return "Name" + name + " Age" + age;
    }
}

class Student extends Person{
    private int score;
    private int id;
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    public String say() {
        return super.say() + "My id" + id;
    }
}
