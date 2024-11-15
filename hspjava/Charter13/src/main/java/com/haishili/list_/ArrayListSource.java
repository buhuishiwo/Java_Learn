package com.haishili.list_;

import java.util.ArrayList;

public class ArrayListSource {
    public static void main(String[] args) {
        // 默认构造器实例化
        ArrayList list = new ArrayList();

        // 此时 elementData 是空数组，没有分配存储空间
        System.out.println("Initial size: " + list.size()); // 输出 0

        // 添加元素，触发内存分配
        list.add("Hello");
        list.add(1);

        // 查看数组容量（通过反射获取，示意用）
        System.out.println("List size: " + list.size()); // 输出 2
    }
}
