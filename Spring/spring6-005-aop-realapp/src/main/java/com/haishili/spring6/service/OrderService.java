package com.haishili.spring6.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {
    public void generateOrder() {
        System.out.println("正在生成订单...");
    }
    public void cancelOrder() {
        System.out.println("取消订单");
        //异常示例
        //String s = null;
        //s.toString();
    }
}
