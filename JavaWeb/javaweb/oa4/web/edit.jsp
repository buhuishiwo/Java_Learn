<%@ page import="com.haishili.oa.bean.Dept" %>
<%@page contentType="text/html; charset=UTF-8" %>

<%
    Dept dept = (Dept)request.getAttribute("depts");
%>
<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>修改页面</title>
</head>
<body>
    <h1>修改部门</h1>
    <hr>
    <form action='<%=request.getContextPath()%>/dept/modify' method='post'>
        部门编号<input type='text' name='deptno' value='<%=dept.getDeptNo()%>' readonly><br>
        部门名称<input type='text' name='dname' value='<%=dept.getDeptName()%>'><br>
        部门位置<input type='text' name='loc' value='<%=dept.getDeptLoc()%>'><br>
        <input type='submit' value='保存'>
    </form>
</body>
</html>