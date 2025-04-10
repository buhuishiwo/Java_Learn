package com.haishili.bank.utils;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author haishili
 */
public class JDBCUtil {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("com.haishili.bank.resources.jdbc");
    private static String driver = resourceBundle.getString("driver");
    private static String url = resourceBundle.getString("url");
    private static String user = resourceBundle.getString("user");
    private static String password = resourceBundle.getString("password");

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                conn.close();
                stmt.close();
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
