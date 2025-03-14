package com.haishili.homework;

import java.util.HashSet;
import java.util.Objects;

public class HomeWork04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person aa = new Person(1001, "AA");
        Person bb = new Person(1002, "BB");
        hashSet.add(aa);
        hashSet.add(bb);
        aa.name = "CC";
        hashSet.remove(aa);
        System.out.println(hashSet);
        hashSet.add(new Person(1001,"CC"));
        System.out.println(hashSet);
        hashSet.add(new Person(1001,"AA"));
        System.out.println(hashSet);
        hashSet.remove(aa);
        System.out.println(hashSet);
    }
}

class Person {
    String name;
    int id;
    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
}