package com.haishili.spring6.test;

import com.haishili.spring6.bean.Person;
import com.haishili.spring6.bean.SetArrayDI;
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-004-set.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.saveOrder();
    }
    @Test
    public void testconstructDI3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-004-set.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.saveOrder();
    }
    @Test
    public void testsetArrayDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-005-array.xml");
        SetArrayDI setArrayDI = applicationContext.getBean("setArrayDI", SetArrayDI.class);
        System.out.println(setArrayDI.toString());

    }
    @Test
    public void testsetJiheDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-006.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean.toString());
    }

    @Test
    public void testconstructDI4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6-007.xml");
        com.haishili.spring6.test.UserService userService = applicationContext.getBean("userService", com.haishili.spring6.test.UserService.class);
        userService.addUser();
    }
}
