<%--
  Created by IntelliJ IDEA.
  User: SFH
  Date: 2019/10/23
  Time: 19:33
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
    <a href="alethistory.cgi">员工信息查询</a><br>
    <a href="changt.html">添加员工</a><br>
    <a href="changh.html">修改员工信息</a><br>
</div>

<div class ="section">
    <form action="/getemploy.do" method="post">
        员工工号：<input type="text" name="employ_num" />
        <input type="submit" value="查询" />
    </form>
    <div  style=" text-align: left">
        员工工号:${em.employ_num}<br><br><br>
        姓名:${em.employ_name}<br><br><br>
        性别:${em.employ_sex}<br><br><br>
        身份证:${em.employ_ID}<br><br><br>
        出生日期:${em.employ_born}<br><br><br>
        电话:${em.employ_tel}<br><br><br>
        职务:${em.employ_duty}<br><br><br>
        住址:${em.employ_address}<br><br><br>
        入职日期:${em.employ_join}<br><br><br>
        离职日期:${em.employ_exit}<br><br><br>
    </div>


</div>

</body>
</html>
