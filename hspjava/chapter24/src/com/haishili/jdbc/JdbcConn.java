package com.haishili.jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcConn {

    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/haishili?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "CXHcw9999");
        Connection conn = driver.connect(url, properties);

        //3.执行 sql
        String sql = "insert into actor values(2,'孙燕姿','女','1970-11-11','110')";
//        String sql = "delete from actor where  id = 1";
        //用于执行静态 sql 并返回其生成结果的对象
        Statement stmt = conn.createStatement();
        //如果是 dml 语句，返回的就是影响行数
        int i = stmt.executeUpdate(sql);

        System.out.println(i > 0 ? "成功" : "失败");

        //4.关闭连接
        stmt.close();
        conn.close();
    }

    public void connect02() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //使用反射加载 Driver 类，动态加载，更加灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc");
        Driver driver = (Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/haishili?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "CXHcw9999");
        Connection conn = driver.connect(url, properties);
    }

    public static void connect03() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/haishili";
        String username = "root";
        String password = "CXHcw9999";
        Connection connection = DriverManager.getConnection(url, username,password);
        System.out.println(connection);
    }

    public static void connect04() throws SQLException, ClassNotFoundException, IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/haishili/jdbc/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user,password);
        System.out.println(connection);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
//        connect03();
        connect04();
    }

}
