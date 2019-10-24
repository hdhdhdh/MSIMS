<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel = "stylesheet" type="text/css" href="../../css/Eme.css">
    <title>应急救援信息管理</title>
</head>

<body>

<div class = "header">
    <h1>应急救援信息管理</h1>
</div>

<div class ="nav">
    <li><a href="${pageContext.request.contextPath}/main/EmeMain.do">主&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp页</a> </li>
    <li><a href="${pageContext.request.contextPath}/res/toEmeResadd.do">增加应急救援信息</a></li>
    <li><a href="${pageContext.request.contextPath}/res/toEmeResdelete.do">删除应急救援信息</a></li>
    <li><a href="${pageContext.request.contextPath}/res/Emefindall.do">查找应急救援信息</a></li>
    <li><a href="${pageContext.request.contextPath}/res/EmeResupdate.do">修改应急救援信息</a></li>
</div>
<div class ="section">
    <h2>新增应急救援人员信息</h2>


    <form method="post" action="${pageContext.request.contextPath}/res/EmeResadd.do">
        <p>应急救援人员编号:&nbsp;<input size="20px" TYPE="text" NAME="rescue_num" id="rescue_num" ></p>
        <p>姓名:&nbsp;<input size="10px" TYPE="text" NAME="rescue_name" id="rescue_name" >&nbsp;&nbsp;&nbsp;</p>
        <p>职务:&nbsp;<input size="10px" TYPE="text" NAME="rescue_duty" id="rescue_duty" >&nbsp;&nbsp;&nbsp;</p>
        <p>电话:&nbsp;<input size="13px" TYPE="text" NAME="rescue_tel" id="rescue_tel" >&nbsp;&nbsp;</p>
        <p>所在机构:&nbsp;<input size="8px" TYPE="text" NAME="instit_num" id="instit_num" ></p>

        <input type="submit" value="添&nbsp;&nbsp;加" name="rescue_add" id="rescue_add"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重&nbsp;&nbsp;置">

    </form>
</div>

</body>
</html>

