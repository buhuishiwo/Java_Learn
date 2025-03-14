package com.haishili.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//Log后处理器

public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("4.执行 Bean 后处理器的 before 方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    //方法有两个参数
    //一个是 Bean 对象，一个是 Bean 名称
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("7.执行 Bean 后处理器的 after 方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
