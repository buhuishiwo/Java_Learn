package com.haishili.wrapper;

public class StringExercise01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "haishili";
        Person person2 = new Person();
        person2.name = "haishili";
        //两个属性都指向同一个地址
        System.out.println(person.name == person2.name);
        System.out.println(person.name.equals(person2.name));
        System.out.println(person.name == "haishili");

        String s1 = new String("helo");
        s1 = "haha";
        System.out.println(s1);
    }
}
