package com.haishili.spring6.service;

import org.springframework.stereotype.Service;

@Service("vipService")
public class VipService {
    public void save() {
        System.out.println("保存 VIP 信息");
    }
}
