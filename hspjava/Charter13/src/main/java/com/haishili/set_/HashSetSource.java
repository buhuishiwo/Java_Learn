package com.haishili.set_;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("python");
        hashSet.add("java");
        System.out.println("set="+hashSet);
    }
}
