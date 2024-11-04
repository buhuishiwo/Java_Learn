package com.haishili.spring6.test;

import com.haishili.spring6.bean.Student;
import com.haishili.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {

    /*
    * Spring容器只对 singleton 的 Bean 进行完整的生命周期管理。
    * 如果是 prototype 作用域的 Bean，Spring 容器只负责将该 Bean 初始化完毕。等客户端程序一旦获取到该 Bean 之后，
    * Spring 容器就不再管理该对象的生命周期了。
    * */
    @Test
    public void testBeanLifecycle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        User user = context.getBean("userBean", User.class);
        System.out.println("8.使用 Bean" + user);
        ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) context;
        classPathXmlApplicationContext.close();
    }

    @Test
    public void testBeanLifecycle2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        Student studentBean = context.getBean("student", Student.class);
        System.out.println(studentBean);
    }
}
