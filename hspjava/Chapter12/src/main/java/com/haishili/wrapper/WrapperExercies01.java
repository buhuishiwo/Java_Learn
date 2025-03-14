package com.haishili.wrapper;

public class WrapperExercies01 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        //new 了两个不同的对象，所以不相等
        System.out.println(i == j);//False
        /**
         *Integer 类有一个小整数缓存池（small integer cache），
         * 主要是为了优化和减少内存使用。当使用 Integer.valueOf(int)
         * 方法创建 Integer 对象时，如果传入的整数值在 -128 到 127 之间，
         * Java 会从缓存中返回一个已经存在的 Integer 对象，而不是创建一个新的对象
         */
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//Ture
        //超过了 127，所以会返回新对象
        Integer m1 = 128;
        Integer n1 = 128;
        System.out.println(m1 == n1);//False
    }
}
