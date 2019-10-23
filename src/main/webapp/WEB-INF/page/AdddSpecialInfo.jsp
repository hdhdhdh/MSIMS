<%--
  Created by IntelliJ IDEA.
  User: SFH
  Date: 2019/10/23
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${APP_PATH }/css/sfhstyle.css" media="all">
    <title></title>
</head>

<body>

<div class = "header">
    <h1>员工信息管理</h1>
</div>

<div class ="nav">
    <a href="index.html">主页</a><br>
    <a href="/getspecial.do">特种作业证书查询</a><br>
    <a href="/getexpiryspecial.do">特种作业证书预警</a><br>
    <a href="/toaddspecial.do">添加特种作业证书</a><br>
</div>

<div class ="section">
    <form action="/addspecial.do" method="post">
        证书编号:<input type="text" name = "special_id" /><br><br><br>
        所属员工:<input type="text" name = "employ_num" /><br><br><br>
        证书类别:<input type="text" name = "special_class" /><br><br><br>
        发证日期:<input type="date" name = "special_first_date" /><br><br><br>
        有效日期:<input type="date" name = "special_expiry_date" /><br><br><br>
        上传员工:<input type="text" name = "admin_id" /><br><br><br>
        <input type="submit" value="确认" />
    </form>

</div>

</body>
</html>
