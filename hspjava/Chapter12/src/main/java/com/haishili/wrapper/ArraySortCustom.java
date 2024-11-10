package com.haishili.wrapper;

import java.util.Comparator;

public class ArraySortCustom {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,2,1,6,-1,0};
        BubbleSort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i1 - i2;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void BubbleSort(int[] arr, Comparator comparator) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
