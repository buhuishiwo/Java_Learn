package com.haishili.oa2.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deptno = req.getParameter("deptno");
        String dname = req.getParameter("dname");
        String loc = req.getParameter("loc");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            conn = DBUtils.getConnection();
            String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deptno);
            pstmt.setString(2, dname);
            pstmt.setString(3, loc);
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                DBUtils.close(conn,pstmt,rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(count == 1) {
            //转发
            //会出现刷新 BUG
//            req.getRequestDispatcher("/dept/list").forward(req, resp);

            //重定向
            //使用重定向则不会出现 BUG
            resp.sendRedirect(req.getContextPath() + "/dept/list");
        }
    }
}
