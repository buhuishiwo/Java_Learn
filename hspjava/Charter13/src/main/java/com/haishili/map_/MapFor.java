package com.haishili.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapFor {
    //Map遍历的六种方法
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("虞书欣","丁禹兮");
        map.put("王宝强","马蓉");
        map.put("关晓彤","鹿晗");

        //第一种：先取出所有的 key，通过 key 取出对应的 Value
        Set set = map.keySet();
        //迭代器方法
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Object o = map.get(next);
            System.out.println(o.toString());
        }
        //增强 for循环
        for (Object o : set) {
            Object o1 = map.get(o.toString());
            System.out.println(map.get(o.toString()));
            System.out.println(o1.toString());
        }

        //第二种：
    }
}
