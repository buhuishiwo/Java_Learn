package com.jdbclearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCdemo {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取链接
        String url = "jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "CXHcw9999";
        //DriverManager.getConnection()会有返回值
        Connection conn = DriverManager.getConnection(url,username,password);

        //3.定义 sql
        String sql = "update account set money = 2000 where id = 1";

        //4.获取执行 sql 的对象 Statement
        Statement stmt = conn.createStatement();

        //执行 sql
        int count = stmt.executeUpdate(sql);

        //处理结果
        System.out.println(count);

        //释放资源
        stmt.cancel();
        conn.close();
    }
}
