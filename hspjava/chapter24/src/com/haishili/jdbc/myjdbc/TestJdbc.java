package com.haishili.jdbc.myjdbc;

public class TestJdbc {
    public static void main(String[] args) {
        JdbcInterface  jdbcInterface= new MyJdbcImpl();
        //通过接口来调用实现类【动态绑定】
        //面向接口编程，当需要更改连接的数据库时，只需要修改实现类就行
        jdbcInterface.getConnection();//通过接口来调用实现类【动态绑定】
        jdbcInterface.crud();
        jdbcInterface.close();
    }
}
