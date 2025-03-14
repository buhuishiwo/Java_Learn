package com.haishili.spring6.test;

import com.haishili.spring6.service.Spring6Config;
import com.haishili.spring6.service.UserService;
import com.haishili.spring6.service.VipService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {
    @Test
    public void AOPtest1() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
        VipService vipService = annotationConfigApplicationContext.getBean("vipService", VipService.class);
        userService.login();
        vipService.save();
    }
}
