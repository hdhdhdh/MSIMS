<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel = "stylesheet" type="text/css" href="../../css/Eme.css">
    <title>应急演练信息管理</title>
</head>

<body>

<div class = "header">
    <h1>应急演练信息管理</h1>
</div>

<div class ="nav">
    <li><a href="${pageContext.request.contextPath}/main/EmeMain.do">主&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp页</a> </li>
    <li><a href="${pageContext.request.contextPath}/dir/toEmeDiradd.do">增加应急演练信息</a></li>
    <li><a href="${pageContext.request.contextPath}/dir/toEmeDirdelete.do">删除应急演练信息</a></li>
    <li><a href="${pageContext.request.contextPath}/dir/EmeDirfind.do">查找应急演练信息</a></li>
    <li><a href="${pageContext.request.contextPath}/dir/toEmeDirupdate.do">修改应急演练信息</a></li>
</div>
<div class ="section">
    <h2>修改应急演练信息</h2>


    <form method="post" action="${pageContext.request.contextPath}/dir/E">
        <p>演练编号:&nbsp;<input size="20px" TYPE="text" NAME="dirll_num" id="dirll_num" ></p>
        <p>计划名称:&nbsp;<input size="10px" TYPE="text" NAME="dirll_name" id="dirll_name" >&nbsp;&nbsp;&nbsp;</p>
        <p>年度:&nbsp;<input size="3px" TYPE="text" NAME="dirll_year" id="dirll_year" >&nbsp;&nbsp;</p>
        <p>负责人:&nbsp;<input size="8px" TYPE="text" NAME="employ_num" id="employ_num" ></p>
        <p>上传人:&nbsp;<input size="8px" TYPE="text" NAME="admin_id" id="admin_id" >
            上传时间:&nbsp;<input size="10px" TYPE="date" NAME="dirll_date" id="dirll_date" ></p>
        <p>备注:&nbsp;<input size="20px" TYPE="text" NAME="dirll_note" id="dirll_note" ></p>
        <p>上传文件:&nbsp;<input size="20px" TYPE="text" NAME="dirll_path" id="dirll_path" ></p>

        <input type="submit" value="修&nbsp;&nbsp;改" name="dirll_add" id="dirll_add"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重&nbsp;&nbsp;置">

    </form>
</div>

</body>
</html>
