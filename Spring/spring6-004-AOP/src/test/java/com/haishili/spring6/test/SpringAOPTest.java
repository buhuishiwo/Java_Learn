package com.haishili.spring6.test;

import com.haishili.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {
    @Test
    public void AOPtest1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }
}
