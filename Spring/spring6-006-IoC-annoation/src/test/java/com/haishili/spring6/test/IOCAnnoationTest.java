package com.haishili.spring6.test;

import com.haishili.spring6.Spring6Configuration;
import com.haishili.spring6.bean.A;
import com.haishili.spring6.bean2.*;
import com.haishili.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAnnoationTest {
    @Test
    public void testDIByAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        UserDao userDao = context.getBean("userDao", UserDao.class);
        UserBean userBean = context.getBean("userBean", UserBean.class);
        userBean.save();
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
//        userDao.setUserBean();
//        System.out.println(userDao.toString());
//        System.out.println(userBean.getAge());
    }
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        A a = applicationContext.getBean("a", A.class);

    }
    @Test
    public void test2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        applicationContext.getBean("userService",UserService.class).save();
    }
}
