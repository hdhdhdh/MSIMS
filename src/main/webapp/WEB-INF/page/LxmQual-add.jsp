<%--
  Created by IntelliJ IDEA.
  User: fangyichuan
  Date: 2019/10/23
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <a href="LxmExpireQual.jsp" target="_blank">公司资质证书预警</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="LxmQual-list.jsp" target="_blank">公司资质证书管理</a>
                </h1>
            </li>
        </ul>
    </div>
</div>
<div class="section">
    <div class="text-title"><b>增加证书信息</b></div>
    <form method="post" action="#" name="addqual" class="text-form">
        <div>
            <div>
                <label for="qualnum" class="text-label1">证书编号</label>
                <input class="text-label2" type="text" name="qualnum" id="qualnum" required="required" placeholder="证书编号长度5位" size="30">
            </div>
            <div>
                <label for="qualclass" class="text-label1">证书类型</label>
                <select size="1" name="qualclass" id="qualclass" class="text-label2">
                    <option value="special" selected="selected">总承包特级</option>
                    <option value="first">总承包一级</option>
                    <option value="second">总承包二级</option>
                    <option value="thired">总承包三级</option>
                </select>
            </div>
            <div>
                <label for="qualsdate" class="text-label1">有效期（起）</label>
                <input class="text-label2" type="date" name="qualsdate" id="qualsdate" required="required" placeholder="年/月/日">
            </div>
            <div>
                <label for="qualedate" class="text-label1">有效期（止）</label>
                <input class="text-label2" type="date" name="qualedate" id="qualedate" required="required" placeholder="年/月/日">
            </div>
            <div>
                <label for="qualoffice" class="text-label1">发证机关</label>
                <select size="1" name="qualoffice" id="qualoffice" class="text-label2">
                    <option value="county" selected="selected">县国土资源主管部门</option>
                    <option value="Municipal">市国土资源主管部门</option>
                    <option value="Provincial">省国土资源主管部门</option>
                </select>
            </div>
            <div>
                <label for="qualtime" class="text-label1">发证时间</label>
                <input class="text-label2" type="date" name="qualtime" id="qualtime" required="required" placeholder="年/月/日">
            </div>
            <div>
                <label for="adminid" class="text-label1">上传人</label>
                <input class="text-label2" type="text" name="adminid" id="adminid" required="required" placeholder="上传人长度5位">
            </div>
            <div>
                <label for="qualdate" class="text-label1">上传时间</label>
                <input class="text-label2" type="date" name="qualdate" id="qualdate" required="required" placeholder="年/月/日">
            </div>
            <div>
                <input class="text-btn1" type="submit" name="addquel" value="添加">
                <input class="text-btn2" type="button" name="return" value="返回" onclick="history.back(-1);">
            </div>
        </div>
    </form>
</div>
</body>
</html>
