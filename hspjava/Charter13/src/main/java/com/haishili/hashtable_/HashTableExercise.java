package com.haishili.hashtable_;

import java.util.Hashtable;

@SuppressWarnings({"all"})
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();//ok
        table.put("john", 100); //ok 14 15 16
        table.put(null, 100); //异常
        table.put("john", null);//异常
        table.put("lucy", 100);//ok 17 18 19
        table.put("lic", 100);//ok
        table.put("lic", 88);//替换
        System.out.println(table);
    }
}
