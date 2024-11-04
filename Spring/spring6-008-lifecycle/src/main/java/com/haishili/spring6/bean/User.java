package com.haishili.spring6.bean;

//Bean 生命周期的五步法
//第一步：实例化Bean
//第二步：Bean属性赋值
//第三步：初始化Bean
//第四步：使用Bean
//第五步：销毁Bean

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Bean生命周期的七步法
//第一步：实例化Bean
//第二步：Bean属性赋值
//Bean后处理器 before
//第三步：初始化Bean
//Bean 后处理器 after
//第四步：使用Bean
//第五步：销毁Bean
public class User  implements BeanNameAware, BeanClassLoaderAware, InitializingBean, DisposableBean {
    private String name;
    private Student student = new Student();
    public User() {
        System.out.println(student);
        System.out.println("1.实例化 Bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.给 Bean 赋值");
    }

    public void initBean() {
        System.out.println("6.初始化 Bean");
    }

    public void destroyBean() {
        System.out.println("10.销毁 Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("3.2.生产这个Bean的工厂对象是："+classLoader);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3.1.Bean 名称是："+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9.DisposableBean的destroy执行了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5.InitializingBean的afterPropertiesSet执行");
    }
}
