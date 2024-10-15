package com.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person lihua = new Person("lihua", 13, 'M');
        Person lihua2 = new Person("lihua", 13, 'M');
        System.out.println(lihua == lihua2);
        System.out.println(lihua.getName().equals(lihua2.getName()));
        System.out.println(lihua.equals(lihua2));

        String s1 = new String("lihua");
        String s2 = new String("lihua");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    //重写 equals方法
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//        if((obj instanceof Person)) {
//            Person person = (Person) obj;
//            return name.equals(person.name) && age == person.age && gender == person.gender;
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
