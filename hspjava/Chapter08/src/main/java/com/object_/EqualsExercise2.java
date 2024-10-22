package com.object_;

import java.util.Objects;

public class EqualsExercise2 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println(it == fl);
        char ch1 = 'A';
        char ch2 = 12;
        Person p1 = new Person("xiaomi",12,'男');
        System.out.println(p1.toString());
        System.out.println(it == ch1);
        System.out.println(12 == ch2);
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode()+" "+str2.hashCode());
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
//        System.out.println("hello" == new java.sql.Date());
    }
}
