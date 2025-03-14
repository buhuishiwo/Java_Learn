package com.haishili.springtest;

import com.haishili.spring6.bean.User;
import com.haishili.spring6.dao.UserServiceDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void test() {
        //ApplicationContext接口的超级父接口是：BeanFactory
        //BeanFactory 是 IOC 容器的顶级接口
        //Spring 的 IOC 容器底层实际上使用了工厂模式
        //Spring 底层的 IOC 是怎么实现的？XML 解析+工厂模式+反射机制
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testCode(){
        //获取 Spring 容器对象
        //Spring容器
        //ApplicationContext是一个接口
        //ApplicationContext接口下有很多实现类。
        //ClassPathXmlApplicationContext 专门从类路径中加载 spring 配置文件的一个 Spring 上下文对象。
        //这行代码相当于启动了 Spring 容器，解析 spring.xml文件，并且实例化所有的 bean 对象，放到 spring 容器中。

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        //根据 bean 的 id 从 Spring 容器中获取这个对象。
//       Object userBean =  applicationContext.getBean("userBean");
        UserServiceDao userServiceDao = applicationContext.getBean("userDao", UserServiceDao.class);


        userServiceDao.sayHello();
//       System.out.println(userBean);
    }
}
