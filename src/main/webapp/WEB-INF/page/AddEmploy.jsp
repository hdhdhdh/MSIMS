<%--
  Created by IntelliJ IDEA.
  User: SFH
  Date: 2019/10/23
  Time: 20:53
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
</div>

<div class ="section">
    <form action="/addemploy.do" method="post">
        员工工号：<input type="text" name="employ_num" /><br><br><br>
        姓名:<input type="text" name="employ_name" /><br><br><br>
        性别:<input type="text" name="employ_sex" /><br><br><br>
        身份证:<input type="text" name="employ_ID" /><br><br><br>
        出生日期:<input type="date" name="employ_born" /><br><br><br>
        电话:<input type="text" name="employ_tel" /><br><br><br>
        职务:<input type="text" name="employ_duty" /><br><br><br>
        所属部门:<input type="text" name="depart_num" /><br><br><br>
        住址:<input type="text" name="employ_address" /><br><br><br>
        入职日期:<input type="date" name="employ_join" /><br><br><br>
        登录密码：<input type="text" name="employ_passw" /><br><br><br>
        <input type="submit" value="确认" />
    </form>
    <div  style=" text-align: left">

    </div>


</div>

</body>
</html>
