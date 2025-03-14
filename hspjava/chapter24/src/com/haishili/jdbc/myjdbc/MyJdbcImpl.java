package com.haishili.jdbc.myjdbc;

public class MyJdbcImpl implements JdbcInterface {

    @Override
    public Object getConnection() {
        System.out.println("得到 Mysql 连接");
        return null;

    }

    @Override
    public void crud() {
        System.out.println("完成 Mysql 的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 Mysql 的连接");
    }
}
