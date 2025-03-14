package com.haishili.spring6.service;

import com.haishili.spring6.bean2.UserDao;
import com.haishili.spring6.bean2.VipDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private VipDao vipDao;

    @Autowired
    @Qualifier("rootDao")
    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void save() {
        vipDao.insert();
    }
}
