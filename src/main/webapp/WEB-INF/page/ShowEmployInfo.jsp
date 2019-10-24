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
    <a href="/tomain.do">主页</a><br>
    <a href="/getemploy.do">员工信息查询</a><br>
    <a href="/toaddemploy.do">添加员工</a><br>
    <a href="/getspecial.do">特种作业证书查询</a><br>
    <a href="/getexpiryspecial.do">特种作业证书预警</a><br>
    <a href="/toaddspecial.do">添加特种作业证书</a><br>
</div>

<div class ="section">
    <form action="/getemploy.do" method="post">
        员工工号：<input type="text" name="employ_num" />
        <input type="submit" value="查询" />
    </form>
    <div  style=" text-align: left">

        <form action="/updateemploy.do" method="post">
            员工工号：<input type="text" value = "${em.employ_num}" disabled = "disabled"/><br><br><br>
            <input type="hidden" value = "${em.employ_num}"  name="employ_num" /><br><br><br>
            姓名:<input type="text"disabled = "disabled"   value = "${em.employ_name}"/><br><br><br>
            性别:<input type="text"disabled = "disabled"  value = "${em.employ_sex}"/><br><br><br>
            身份证:<input type="text"disabled = "disabled"  value = "${em.employ_ID}"/><br><br><br>
            出生日期:<input type="date" disabled = "disabled" value = "${em.employ_born}" /><br><br><br>
            入职日期:<input type="text"  disabled = "disabled" value = "${em.employ_join}"/><br><br><br>
            电话:<input type="text" name="employ_tel" value = "${em.employ_tel}"/><br><br><br>
            职务:<input type="text" name="employ_duty" value = "${em.employ_duty}"/><br><br><br>
            住址:<input type="text" name="employ_address" value ="${em.employ_address}"/><br><br><br>
            登录密码：<input type="text" name="employ_passw" /><br><br><br>
            <input type="submit" value="提交修改" />
        </form>
    </div>


</div>

</body>
</html>
