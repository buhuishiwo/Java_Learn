package com.haishili.oa2.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtils {

    //静态变量：类加载时执行
    //自上而下执行
    private static ResourceBundle bundle = ResourceBundle.getBundle("com.haishili.oa.resources.jdbc");
    private static String driver = bundle.getString("driver");
    private static String url = bundle.getString("url");
    private static String user = bundle.getString("user");
    private static String password = bundle.getString("password");

    static {
        //注册驱动（只需要注册一次，放在静态代码块中，类加载时会执行一次）
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取数据库连接对象
     * @return connection 连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
        if(conn != null) {
            conn.close();
        }
        if(stmt != null) {
            stmt.close();
        }
        if(rs != null) {
            rs.close();
        }
    }

}
