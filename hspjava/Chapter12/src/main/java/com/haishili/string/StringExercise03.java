package com.haishili.string;

public class StringExercise03 {
    public static void main(String[] args) {
        String s1 = "haishili";
        String s2 = "java";
        String s3 = "haishilijava";
        String s4 = (s1+s2).intern();
        System.out.println(s4 == s3);
        System.out.println(s4.equals(s3));
    }
}
