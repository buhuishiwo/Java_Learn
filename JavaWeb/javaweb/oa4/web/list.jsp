<%@page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.haishili.oa.bean.Dept" %>
<%@ page import="java.util.List" %>
<%@ page import="com.haishili.oa.bean.Dept" %>


<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>部门列表页面</title>
    <style>
        a {
            text-decoration: none;
            color: black;
        }
        a:hover {
            color: rgb(10, 31, 168);
        }
    </style>
    <script>
        function del(dno) {
            let ok = window.confirm("确认删除?")
            if(ok) {
                document.location.href="<%=request.getContextPath()%>/dept/delete?dno="+dno
            }
        }
    </script>
</head>
<body>
    <a href="<%=request.getContextPath()+"/user/exit"%>">退出登录</a>
    <h1 style='text-align: center;'>部门列表</h1>
    <hr>
    <table border='1px' align='center' width='50%'>
        <tr>
            <th>序号</th>
            <th>部门编号</th>
            <th>部门名称</th>
            <th>操作</th>
        </tr>
        <%
           List<Dept> deptList = (List<Dept>) request.getAttribute("deptList");
           int i = 0;
           for(Dept dept : deptList) {
        %>
        <tr>
            <td><%=++i%></td>
            <td><%=dept.getDeptNo()%></td>
            <td><%=dept.getDeptName()%></td>
            <td>
                <a href="javascript:void(0)" onclick="del(<%=dept.getDeptNo()%>)">
                    删除
                </a>
                <a href='<%=request.getContextPath()%>/dept/detail?f=m&dno=<%=dept.getDeptNo()%>'>
                    修改
                </a>
                <a href='<%=request.getContextPath()%>/dept/detail?f=d&dno=<%=dept.getDeptNo()%>'>
                    详情
                </a>
            </td>
        </tr>
        <%
           }
        %>

    </table>
    <a href='<%=request.getContextPath()%>/add.jsp'>新增部门</a>
</body>
</html>