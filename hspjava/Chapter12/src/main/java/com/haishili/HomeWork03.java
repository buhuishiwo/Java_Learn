package com.haishili;

public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Donald John Trump";
        System.out.println(nameChange(name));
    }
    public static String nameChange(String str) {
        String[] s = str.split(" ");
        char c = s[1].toUpperCase().charAt(0);
        return s[2]+","+s[0]+"."+c;
    }
}
