package com.haishili.spring.client;

import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ComponentScan {
    public static void main(String[] args) {
        Map<String , Objects> beanMap = new HashMap<>();

        //只知道一个包名，扫描这个包下所有的类，当这个类上有@Component 注解时，实例化该对象，然后放到 Map 集合中。
        String packageName = "com.haishili.spring.bean";

        //扫描程序
        String s = packageName.replaceAll("\\.", "/");

        //获取绝对路径
        URL url = ClassLoader.getSystemClassLoader().getResource(s);
        String path = url.getPath();

        //获取路径下的所有文件
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            try {
                String className = packageName+"."+f.getName().split("\\.")[0];
                //通过反射机制解析注解
                Class<?> aClass = Class.forName(className);
                if (aClass.isAnnotationPresent(Component.class)) {
                    Component component = aClass.getAnnotation(Component.class);
                    String id = component.value();
                    //创建对象
//                    Objects obj= aClass.newInstance();
//                    beanMap.put(id,obj);
                }
            } catch (Exception e) {

                e.printStackTrace();
            }

        });
        System.out.println(beanMap);
    }

}
