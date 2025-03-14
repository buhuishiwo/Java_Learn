package com.haishili.servlet_;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SuppressWarnings({"all"})
public class StudentList implements Servlet {
    public void init(ServletConfig config) throws ServletException {

    }
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        PrintWriter writer = servletResponse.getWriter();
        try{
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            String url = "jdbc:mysql://localhost:3306/haishili?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "root";
            String password = "CXHcw9999";
            connection = DriverManager.getConnection(url, user, password);
            //获取预编译的数据库操作对象
            String sql = "select no,name from t_student";
            //执行 sql
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            //处理查询结果集
            while(resultSet.next()){
                int id = resultSet.getInt("no");
                String name = resultSet.getString("name");
                writer.println(id + " " +name);
            }
        }catch (Exception e){

        } finally {
            if (resultSet != null) {
                try{
                    resultSet.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try{
                    preparedStatement.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try{
                    connection.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
