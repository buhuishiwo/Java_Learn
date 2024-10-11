package com.haishili.spring6.test;

import com.haishili.spring6.service.CustomerService;
import com.haishili.spring6.service.OrderService;
import com.haishili.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    @Test
    public void testsetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-002.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
        userService.saveVip();
    }
    @Test
    public void testconstructDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-003.xml");
        CustomerService csBean = applicationContext.getBean("csBean", CustomerService.class);
        csBean.save();

    }
    @Test
    public void testconstructDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-003-set.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.saveOrder();
    }
    @Test
    public void testconstructDI3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-003-set.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.saveOrder();
    }
}