package com.haishili.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Collections_ {
    public static void main(String[] args) {
        ArrayList strings = new ArrayList();
        strings.add("milan");
        strings.add("jack");
        strings.add("chen");

        Collections.sort(strings, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.toString().length() - o1.toString().length();
            }
        });

        Collections.max(strings);
        System.out.println(strings);
    }
}
