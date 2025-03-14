package com.haishili.set_;

import java.util.HashSet;
import java.util.Iterator;

public class SetMethod {
    public static void main(String[] args) {
        //HashSet 是无序的，不允许重复的
        //HashSet调用 hashCode() 方法计算哈希值，确定元素存储的位置。
        HashSet<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("null");
        //HashSet 只允许有一个 null 值
        strings.add("null");
        //HashSet 不允许使用 for i 循环
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
