<%--
  Created by IntelliJ IDEA.
  User: fangyichuan
  Date: 2019/10/23
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/maincss.css">
    <title>主界面</title>
</head>
<body>
<div id="switcher">
    <div class="center">
        <ul>
            <li class="logoTop">
                <a>矿山安全信息管理平台</a>
            </li>
        </ul>
    </div>
</div>
<div class="top">
    <div class="top1">
        <ul id="nav" class="nav clearfix">
            <li class="nLi on" style="border-left: 0;">
                <h1>
                    <a href="${pageContext.request.contextPath}/Lxm/qual.do" target="_blank">企业资质证书管理</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="${pageContext.request.contextPath}/sysm/main.do" target="_blank">安全制度与体系管理</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="/getemploy.do" target="_blank">员工安全信息管理</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="#" target="_blank">作业场所危害检测</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="#" target="_blank">应急救援信息管理</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="#" target="_blank">系统维护与管理</a>
                </h1>
            </li>
        </ul>
    </div>
</div>
</body>
</html>
