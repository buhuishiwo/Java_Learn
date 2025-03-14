<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>欢迎使用</title>
    <style>
        a {
            text-decoration: none; 
            color: black;
        }
        a:hover {
            color: blue;
        }
    </style>
</head>
<body>
    <h1>欢迎使用 OA 系统</h1>
<%--    <a href='<%=request.getContextPath() %>/dept/list'>查看部门列表</a>--%>

    <h1>LOGIN</h1>
    <hr>
    <form action="<%=request.getContextPath()%>/user/login" method="post">
        username:<input type="text" name="username"><br>
        password:<input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
</body>

</html>