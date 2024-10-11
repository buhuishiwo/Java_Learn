package com.haishili.spring6.service;

import com.haishili.spring6.dao.OrderDao;
import org.apache.logging.log4j.core.config.Order;

public class OrderService {
    private OrderDao orderDao;
    private int age;
    //使用 set 注入
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void saveOrder() {
        System.out.println(age);
        orderDao.insertOrder();
    }
}
