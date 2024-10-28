package com.haishili.spring6.test;

import com.haishili.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {
    @Test
    public void testBeanLifecycle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        User user = context.getBean("userBean", User.class);
        System.out.println("4.使用 Bean" + user);
        ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) context;
        classPathXmlApplicationContext.close();
    }

}
