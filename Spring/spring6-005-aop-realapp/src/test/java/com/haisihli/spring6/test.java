package com.haisihli.spring6;

import com.haishili.spring6.biz.Spring6Config2;
import com.haishili.spring6.biz.UserService;
import com.haishili.spring6.service.AccountService;
import com.haishili.spring6.service.OrderService;
import com.haishili.spring6.service.Spring6Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    @Test
    public void aopRealAppTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        accountService.transfer();
        accountService.withdraw();
        orderService.generateOrder();
        orderService.cancelOrder();
    }
    @Test
    public void aopRealAppSecurityTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config2.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
        userService.seachUser();
    }
}
