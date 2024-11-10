package com.haishili.wrapper;

import java.util.Arrays;

public class ArraryMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //二分查找，需要是排序好的数组，传入待查找的值，返回目标索引，没找到返回-(寻找次数+1)
        System.out.println(Arrays.binarySearch(arr, -1));
        //
        int[] ints = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(ints));
    }
}
