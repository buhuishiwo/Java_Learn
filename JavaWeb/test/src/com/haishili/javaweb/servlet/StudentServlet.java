package com.haishili.javaweb.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class StudentServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter out = servletResponse.getWriter();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取链接
            String url = "jdbc:mysql://localhost:3306/haishili?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String username = "root";
            String password = "CXHcw9999";
            conn = DriverManager.getConnection(url,username,password);
            //获取预编译的数据库操作对象
            String sql = "select * from t_student";
            pstmt = conn.prepareStatement(sql);
            //执行 SQL
            rs = pstmt.executeQuery();
            //处理结果集
            while (rs.next()) {
                int no = rs.getInt("no");
                String name = rs.getString("name");
                out.println("no:" + no + "\tname:" + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
