package com.haishili.map_;

import java.util.*;

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
//            Object o1 = map.get(o.toString());
//            System.out.println(map.get(o.toString()));
//            System.out.println(o1.toString());
            System.out.println(o+":"+map.get(o));
        }

        //第二种：取出所有的 value
        Collection values = map.values();
        //可以使用所有 Collection 遍历的方法
        //增强 for
        for (Object o : values) {
            System.out.println(o);
        }
        //迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        //第三种：通过 EntrySet 来获取
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
