package com.haishili.spring6.bean2;

import org.springframework.stereotype.Repository;

@Repository
public class RootDao implements VipDao{

    @Override
    public void insert() {
        System.out.println("Root 信息保存");
    }
}
