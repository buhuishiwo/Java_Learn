package com.haishili.reflect;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.haishili.reflect.Service");

        Method dosome = clazz.getDeclaredMethod("dosome");
        Object object = clazz.newInstance();
        dosome.invoke(object);
    }
}
