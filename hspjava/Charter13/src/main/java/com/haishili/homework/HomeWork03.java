package com.haishili.homework;

import java.util.HashMap;
import java.util.TreeSet;

public class HomeWork03 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        m.put("jack",2600);
        for (Object key : m.keySet()) {
            m.put(key,(Integer)m.get(key) + 100);
            System.out.println(m.get(key));
        }

    }
}
