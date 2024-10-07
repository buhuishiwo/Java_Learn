package com.haishili.spring6.service;

import com.haishili.spring6.dao.UserDao;
import com.haishili.spring6.dao.VipDao;

public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save() {
        userDao.insert();
        vipDao.insert();
    }
}
