package com.haishili.arrary;

import java.util.Arrays;
import java.util.List;

public class ArraryMethod {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        //二分查找，需要是排序好的数组，传入待查找的值，返回目标索引，没找到返回-(寻找次数+1)
        System.out.println(Arrays.binarySearch(arr, -1));
        //将指定索引后的值复制到一个新数组
        Integer[] ints = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(ints));
        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1,2,3,4};
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println(equals);
        //asList将一组数组转换成 List 集合
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        System.out.println(list.getClass());
    }
}
