package com.haishili.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("j");
        treeSet.add("c");
        treeSet.add("b");
        treeSet.add("A");
        treeSet.add("D");
        //默认按照字母顺序排序
        System.out.println(treeSet);
    }
}
