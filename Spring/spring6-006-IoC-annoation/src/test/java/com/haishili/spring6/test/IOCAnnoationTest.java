package com.haishili.spring6.test;

import com.haishili.spring6.bean.A;
import com.haishili.spring6.bean2.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAnnoationTest {
    @Test
    public void testDIByAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        UserBean userBean = context.getBean("userBean", UserBean.class);
        userDao.setUserBean();
        System.out.println(userDao.toString());
        System.out.println(userBean.getAge());
    }
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        A a = applicationContext.getBean("a", A.class);

    }
}
