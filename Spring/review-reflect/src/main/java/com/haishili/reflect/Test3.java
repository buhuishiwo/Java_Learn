package com.haishili.reflect;

import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws Exception {
        /**
         *你知道以下这几条信息：
         * ● 类名是：com.powernode.reflect.User
         * ● 该类中有String类型的name属性和int类型的age属性。
         * ● 另外你也知道该类的设计符合javabean规范。（也就是说属性私有化，对外提供setter和getter方法）
         * 你如何通过反射机制给User对象的name属性赋值zhangsan，给age属性赋值20岁。
         */
        String className = "com.haishili.reflect.User";
        String propertyName = "age";

        //获取对象
        Class clazz = Class.forName(className);
        //获取方法名
        String setMethodName = "set" + propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
        String getMethodName = "get" + propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
        //获取方法
        Method setAgeMethod = clazz.getDeclaredMethod(setMethodName, int.class);
        Method getAgeMethod = clazz.getDeclaredMethod(getMethodName);
        //准备对象
        Object object = clazz.newInstance();
        setAgeMethod.invoke(object, 40);
        System.out.println(object);

        Object invoke = getAgeMethod.invoke(object);
        System.out.println(invoke);

    }
}
