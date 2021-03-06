<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 17:03
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
    ``    <form action="${pageContext.request.contextPath}/res/Emefindall.do" method="post">
    <p>输入演练编号:&nbsp;<input size="7px" type="text" name="findrescue_num" id="findrescue_num">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
</form>
    <table border="1">
        <thead>
        <tr>
            <td>应急救援人员编号</td><td>姓名</td><td >职业</td><td >电话</td><td >所在机构</td>
        </tr>

        </thead>
        <tbody>
        <c:forEach var="d" items="${emeResInfos}">
            <tr>
                <td>${d.rescue_num}</td>
                <td>${d.rescue_name}</td>
                <td>${d.rescue_duty}</td>
                <td>${d.rescue_tel}</td>
                <td>${d.instit_num}</td>

                <td class="text-center">
                    <a href="${pageContext.request.contextPath}/res/EmeResupdate.do">更新</a>
                    <a href="${pageContext.request.contextPath}/res/Emedelete.do?rescue_num=${d.rescue_num}" >删除</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

</body>
</html>

