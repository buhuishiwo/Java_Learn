package com.haishili.spring6.bean2;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserBean {
    private String name;
    private int age;

    @Resource(name="userDao")
    private UserDao userDao;

    public void save() {
        userDao.insert();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
