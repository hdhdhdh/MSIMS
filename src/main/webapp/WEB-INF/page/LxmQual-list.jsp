<%--
  Created by IntelliJ IDEA.
  User: fangyichuan
  Date: 2019/10/23
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/quelcss.css">
    <title>主界面</title>
</head>
<body>
<div id="switcher">
    <div class="center">
        <ul>
            <li class="logoTop">
                <a>企业资质证书管理</a>
            </li>
        </ul>
    </div>
</div>
<div class="top">
    <div class="top1">
        <ul id="nav" class="nav clearfix">
            <li class="nLi on" style="border-left: 0;">
                <h1>
                    <a href="${pageContext.request.contextPath}/Lxm/expirequal.do" target="_blank">公司资质证书预警</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="${pageContext.request.contextPath}/Lxm/findAll.do" target="_blank">公司资质证书管理</a>
                </h1>
            </li>
        </ul>
    </div>
</div>
<div class="section">
    <form method="post" action="${pageContext.request.contextPath}/Lxm/addqual.do" name="findquel" class="text-form">
        <div>
            <label for="findquelnum" class="text-label3">请输入证书编号</label>
            <input class="text-label2" type="text" name="findquelnum" id="findquelnum" required="required" placeholder="证书编号长度5位" size="30">
            <input class="text-btn3" type="submit" name="addquel" value="查找">
        </div>
    </form>
    <table id="dataList">
        <caption>公司资质证书信息</caption>
        <thead>
        <tr>
            <th>证书编号</th>
            <th>证书类型</th>
            <th>有效期（起）</th>
            <th>有效期（止）</th>
            <th>发证机关</th>
            <th>发证时间</th>
            <th>上传人</th>
            <th>上传时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${lxmQualInfos}">
            <tr>
                <td>${user.qual_num}</td>
                <td>${user.qual_class}</td>
                <td>${user.qual_sdate}</td>
                <td>${user.qual_edate}</td>
                <td>${user.qual_office}</td>
                <td>${user.qual_time}</td>
                <td>${user.admin_id}</td>
                <td>${user.qual_date}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/Lxm/toupdatequal.do?qual_num=${user.qual_num}" class="quelbtn">更改</a>
                    <a href="${pageContext.request.contextPath}/Lxm/deletequal.do?qual_num=${user.qual_num}" class="quelbtn">删除</a>
                    <a href="${pageContext.request.contextPath}/Lxm/toaddqual.do" class="quelbtn">添加证书</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
