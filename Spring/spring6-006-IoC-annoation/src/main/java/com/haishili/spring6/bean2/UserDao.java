package com.haishili.spring6.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private UserBean userBean;
    //使用 @Value 注解给 userName 赋值
    @Value("张三")
    private String userName;
    @Value("13")
    private int age;
    public void setUserBean() {
        this.userBean.setAge(age);
        this.userBean.setName(userName);
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userBean=" + userBean +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
