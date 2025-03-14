package com.haishili.spring6.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

//自己的数据源，数据源存在的目的是为了提供 Connection 对象
//只要实现了 DataSource 接口的都是数据源
//德鲁伊连接池。。。。都实现了DataSource 接口
@Component
public class MyDataSource implements DataSource {

    private String url;
    private String username;
    private String password;
    private String driver;

    @Value("jdbc:mysql://localhost:3306/test_demo")
    public void setUrl(String url) {
        this.url = url;
    }
    @Value("root")
    public void setUsername(String username) {
        this.username = username;
    }
    @Value("hunjian123")
    public void setPassword(String password) {
        this.password = password;
    }
    @Value("com.mysql.cj.jdbc.Driver")
    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public Connection getConnection() throws SQLException {
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
