package com.haishili.spring6.test;

import com.haishili.spring6.bean.Husband;
import com.haishili.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircualDependency {
    /*
    * 在 Singleton 模式下，Spring 容器能够处理循环依赖，通过三层缓存机制处理
    * 一级缓存：用于存储完全初始化好的单例 Bean。
    * 二级缓存：用于存储实例化完成但未完全初始化的 Bean。
    * 三级缓存：用于存储对象工厂（Object Factory），即 Bean 的提前暴露（early reference）。
    * */
    @Test
    public void Singletontest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        Husband husbandBean = context.getBean("husbandBean", Husband.class);
        Wife wifeBean = context.getBean("wifeBean", Wife.class);
        System.out.println(husbandBean.toString());
        System.out.println(wifeBean.toString());
    }


    /*
    * 在 Singleton 模式下，使用构造器注入 Bean 在循环依赖中会出现问题
    * 报错BeanCurrentlyInCreationException
    * 因为在构造方法在对象被实例化时就会调用，就会导致循环依赖中，一直卡在对象实例化中。
    * */
    @Test
    public void Prototypetest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6-2.xml");
        Husband husbandBean = context.getBean("husbandBean", Husband.class);
        Wife wifeBean = context.getBean("wifeBean", Wife.class);
        System.out.println(husbandBean.toString());
        System.out.println(wifeBean.toString());

    }
}
