package com.haishili.oa.web.action;

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

public class DeptModifyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deptno = req.getParameter("deptno");
        String deptname = req.getParameter("dname");
        String loc = req.getParameter("loc");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;

        try {
            conn = DBUtils.getConnection();
            String sql = "update dept set dname=?,loc=? where deptno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deptname);
            pstmt.setString(2, loc);
            pstmt.setString(3, deptno);
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DBUtils.close(conn,pstmt,rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(count == 1) {
            resp.sendRedirect(req.getContextPath() + "/dept/list");
        }
    }
}
