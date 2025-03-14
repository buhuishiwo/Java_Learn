package com.haishili.spring6.service;

import com.haishili.spring6.dao.UserDao;
import com.haishili.spring6.dao.VipDao;

public class UserService {

    private UserDao userDao;
    private VipDao vipDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveUser() {
        userDao.insert();
    }
    public void saveVip() {
        vipDao.insert();
    }

}
