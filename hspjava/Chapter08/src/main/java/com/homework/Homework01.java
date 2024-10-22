package com.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("张三",18);
        persons[1] = new Person("李四",20);
        persons[2] = new Person("王五",22);
        persons[3] = new Person("李明",23);
        persons[4] = new Person("陈毅",17);
        Person p;
        for(int i=0; i<persons.length - 1; i++){
            for(int j=0; j<persons.length - 1 -i; j++){
                if(persons[j].age>persons[j+1].age){
                    p=persons[j];
                    persons[j]=persons[j+1];
                    persons[j+1]=p;
                }
            }
        }
        for(int i=0; i<persons.length; i++){
            System.out.println(persons[i].toString());
        }
    }

}

class Person {
    String name;
    int age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
