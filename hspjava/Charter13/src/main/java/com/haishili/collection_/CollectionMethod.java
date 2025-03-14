package com.haishili.collection_;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");//增加
        list.add(100);
        list.add(true);
        System.out.println(list);
        list.remove("a");//移除
        System.out.println(list);
        System.out.println(list.size());//集合元素多少
        System.out.println(list.isEmpty());//是否为空
        System.out.println(list.contains("b"));//是否包含
        list.clear();//集合清空
        ArrayList arrayList = new ArrayList();
        arrayList.add("c");
        arrayList.add(100);
        list.addAll(arrayList);//添加多个
        System.out.println(list);
        System.out.println(list.removeAll(arrayList));//移除多个


    }
}
