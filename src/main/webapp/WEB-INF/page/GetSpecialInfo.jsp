<%--
  Created by IntelliJ IDEA.
  User: SFH
  Date: 2019/10/23
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <form action="/getspecial.do" method="post">
        员工工号：<input type="text" name="employ_num" />
        <input type="submit" value="查询" />
    </form>
    <table border="1">
        <thead>
        <tr>
            <td>证书编号</td>
            <td width="300px">所属员工</td>
            <td width="150px">有效日期</td>
            <td width="150px">证书类别</td>
        </tr>

        </thead>
        <tbody>
        <c:forEach var="s" items="${all}">
            <td>${s.special_id}</td>
            <td>${s.employ_num}</td>
            <td>${s.special_expiry_date}</td>
            <td>${s.special_class}</td>
        </td>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
