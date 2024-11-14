package com.haishili.list_;

import java.util.ArrayList;
import java.util.Comparator;

public class List_ {
    public static void main(String[] args) {
        //List集合类中元素有序（添加顺序和取出顺序一致）且可重复
        ArrayList list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("jerry");
        list.add("tom");
        System.out.println(list);
        //List集合中每个元素都有对应的顺序索引
        System.out.println(list.get(1));//jack

        System.out.println(list.indexOf("amt"));

        System.out.println(list.subList(0, 3));
        list.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                 return 0;
            }
        });
        System.out.println(list);
    }
}
