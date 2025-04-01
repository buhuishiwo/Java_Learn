package com.haishili.oa.web.action;

import com.haishili.oa.bean.Dept;
import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/dept/list","/dept/detail","/dept/delete","/dept/edit","/dept/modify","/dept/save"})
public class DeptServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("loginName") != null) {
            String contextPath = request.getServletPath();
            if("/dept/list".equals(contextPath)) {
                try {
                    doList(request,response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }else if (contextPath.equals("/dept/detail")) {
                doDetail(request,response);
            }else if (contextPath.equals("/dept/delete")) {
                doDelete(request,response);
            } else if (contextPath.equals("/dept/modify")) {
                doModify(request,response);
            }else if (contextPath.equals("/dept/save")) {
                doSave(request,response);
            }
        }
        else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }

    }

    /**
     * 新建部门数据并保存
     * @param request
     * @param response
     */
    private void doSave(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String deptno = request.getParameter("deptno");
        String dname = request.getParameter("dname");
        String loc = request.getParameter("loc");

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
//            request.getRequestDispatcher("/dept/list").forward(request, resp);

            //重定向
            //使用重定向则不会出现 BUG
            response.sendRedirect(request.getContextPath() + "/dept/list");
        }

    }

    /**
     * 修改部门信息
     * @param request
     * @param response
     * @throws IOException
     */
    private void doModify(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String deptno = request.getParameter("deptno");
        String deptname = request.getParameter("dname");
        String loc = request.getParameter("loc");

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
            response.sendRedirect(request.getContextPath() + "/dept/list");
        }

    }

    /**
     * 根据部门编号删除部门的信息
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dno = req.getParameter("dno");
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int i = 0;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("delete from dept where deptno = ?");
            ps.setObject(1, dno);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            try {
                DBUtils.close(conn,ps,rs);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
        if(i == 1) {
            resp.sendRedirect(req.getContextPath() + "/dept/list");
        }
    }

    /**
     * 根据部门编号展示部门信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取属性值
        String dno = request.getParameter("dno");
        //连接数据库
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Dept dept = new Dept();
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select dname,loc from dept where deptno = ?");
            ps.setString(1, dno);
            rs = ps.executeQuery();

            while(rs.next()) {

                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                dept.setDeptLoc(loc);
                dept.setDeptName(dname);
                dept.setDeptNo(dno);
            }
        } catch (SQLException e) {
            try {
                DBUtils.close(conn,ps,rs);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
        request.setAttribute("depts", dept);


        String f = request.getParameter("f");
        if ("d".equals(f)) {
            request.getRequestDispatcher("/detail.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/edit.jsp").forward(request, response);
        }
    }

    /**
     * 展示部门信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @throws SQLException
     */
    private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Dept> depts = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            //获取连接
            conn = DBUtils.getConnection();
            //获取预编译数据库操作对象
            String sql = "select dname,deptno,loc from dept";
            pstmt = conn.prepareStatement(sql);
            //执行sql语句
            rs = pstmt.executeQuery();
            //处理结果集

            while(rs.next()) {
                Dept dept = new Dept();

                String deptName = rs.getString("dname");
                String deptNo = rs.getString("deptno");
                String deptLoc = rs.getString("loc");
                dept.setDeptName(deptName);
                dept.setDeptNo(deptNo);
                dept.setDeptLoc(deptLoc);
                depts.add(dept);
            }
        } catch (SQLException e) {
            DBUtils.close(conn,pstmt,rs);
        }
        //将集合存放到request请求域中
        request.setAttribute("deptList", depts);
        System.out.println(depts);
        //重定向
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

}
