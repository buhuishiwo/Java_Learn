package com.haishili.myspring.test;

import com.haishili.myspring.bean.OrderService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

public class MySpringTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.save();

    }
}
