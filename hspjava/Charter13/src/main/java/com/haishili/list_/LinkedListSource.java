package com.haishili.list_;

import java.util.LinkedList;

public class LinkedListSource {
    public static void main(String[] args) {
        //LinkedList是双向链表
        LinkedList linkedList = new LinkedList();
        //关键源码
        //    void linkLast(E e) {
        //        final Node<E> l = last;
        //        final Node<E> newNode = new Node<>(l, e, null);
        //        last = newNode;
        //        if (l == null)
        //            first = newNode;
        //        else
        //            l.next = newNode;
        //        size++;
        //        modCount++;
        //    }
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        //删除第一个
        linkedList.remove();
        //删除指定
        linkedList.remove("b");
        //删除最后一个
        linkedList.removeLast();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));//空
        }
    }
}
