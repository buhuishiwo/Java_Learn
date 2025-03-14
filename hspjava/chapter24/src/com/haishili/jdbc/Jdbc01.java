package com.haishili.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {

        //1.注册驱动
        Driver driver = new Driver();
        //2.得到连接
        String url = "jdbc:mysql://localhost:3306/haishili?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "CXHcw9999");
        Connection conn = driver.connect(url, properties);

        //3.执行 sql
//        String sql = "insert into actor values(2,'孙燕姿','女','1970-11-11','110')";
        String sql = "delete from actor where  id = 1";
        //用于执行静态 sql 并返回其生成结果的对象
        Statement stmt = conn.createStatement();
        //如果是 dml 语句，返回的就是影响行数
        int i = stmt.executeUpdate(sql);

        System.out.println(i > 0 ? "成功" : "失败");

        //4.关闭连接
        stmt.close();
        conn.close();

    }
}
