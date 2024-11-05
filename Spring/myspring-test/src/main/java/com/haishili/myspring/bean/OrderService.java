package com.haishili.myspring.bean;

public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void save() {
        orderDao.insert();
    }
}
