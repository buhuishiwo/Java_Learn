package com.haishili.map_;

import java.util.HashMap;
@SuppressWarnings({"all"})
public class HashMap_ {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        System.out.println(map);
        map.remove("1");

    }
}