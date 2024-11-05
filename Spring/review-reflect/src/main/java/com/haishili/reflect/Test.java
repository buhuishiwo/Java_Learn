package com.haishili.reflect;

import java.lang.reflect.Method;

//使用反射机制调用方法
public class Test {
    public static void main(String[] args) throws Exception {
        //使用反射机制怎么调用方法
        //获取类
        Class<?> clazz = Class.forName("com.haishili.reflect.Service");

        //获取方法
        Method doSomeMethod = clazz.getDeclaredMethod("dosome", String.class, int.class);

        //调用方法
        //四要素：调用哪个对象，哪个方法，传什么参数，返回什么值
        //object：哪个对象
        //doSomeMethod：哪个方法
        //“hello”，1：传什么参数
        //retValue：返回什么值
        Object object = clazz.newInstance();
        Object retValue = doSomeMethod.invoke(object, "hello", 1);
        System.out.println(retValue);

        Method doSomeMethod1 = clazz.getDeclaredMethod("dosome", String.class);
        Object retValue1 = doSomeMethod1.invoke(object, "hello");
        System.out.println(retValue1);

        Method doSomeMethod2 = clazz.getDeclaredMethod("dosome");
        Object retValue2 = doSomeMethod2.invoke(object);
    }
}
