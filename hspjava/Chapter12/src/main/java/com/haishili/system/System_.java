package com.haishili.system;

public class System_ {
    public static void main(String[] args) {

        //退出当前程序
        System.out.println("012");
        //exit()
        //0表示正常退出，非零值表示异常退出
        //System.exit(-1);
        System.out.println("013");

        //arraycopy:复制数组元素，比较适合底层调用
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[3];
        //参数含义
        //1.原数组
        //2.从哪里开始拷贝
        //3.目标数组
        //4.从哪里开始粘贴
        //5.拷贝多长
        System.arraycopy(arr, 0, arr2, 0, 3);

        //返回当前时间戳
        System.out.println(System.currentTimeMillis());
    }
}
