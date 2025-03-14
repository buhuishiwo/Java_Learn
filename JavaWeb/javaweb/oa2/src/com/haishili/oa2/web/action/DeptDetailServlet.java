package com.haishili.oa2.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        String deptno = req.getParameter("deptno");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
out.print("<!DOCTYPE html>");
out.print("<html lang='en'>");
out.print("<head>");
out.print("    <meta charset='UTF-8'>");
out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
out.print("    <title>部门详情</title>");
out.print("</head>");
out.print("<body>");
out.print("    <h1>部门详情</h1>");
out.print("    <hr>");


        try {
            conn = DBUtils.getConnection();
            String sql = "select * from dept where deptno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deptno);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String deptno1 = rs.getString("deptno");
                String dname1 = rs.getString("dname");
                String location1 = rs.getString("loc");
                out.print("    部门编号："+deptno1+" <br>");
                out.print("    部门名称："+dname1+" <br>");
                out.print("    部门位置："+location1+" ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                DBUtils.close(conn,pstmt,rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        out.print("</body>");
        out.print("</html>");
    }
}
