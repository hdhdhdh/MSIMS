<%--
  Created by IntelliJ IDEA.
  User: fangyichuan
  Date: 2019/10/23
  Time: 15:14
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
    <div class="text-title"><b>更改证书信息</b></div>
    <form method="post" action="${pageContext.request.contextPath}/Lxm/updatequal.do" name="updatequal" class="text-form">
        <div>
            <div>
                <label for="qual_num" class="text-label1">证书编号</label>
                <input class="text-label2" type="text" name="qual_num" id="qual_num"
                       value="${qualup.qual_num}" size="30" readonly="readonly">
            </div>
            <div>
                <label for="qual_class" class="text-label1">证书类型</label>
                <select size="1" name="qual_class" id="qual_class" class="text-label2" value="${qualup.qual_class}>
                    <option value="special" selected="selected">总承包特级</option>
                    <option value="总承包一级">总承包一级</option>
                    <option value="总承包二级">总承包二级</option>
                    <option value="总承包三级">总承包三级</option>
                </select>
            </div>
            <div>
                <label for="qual_sdate" class="text-label1">有效期（起）</label>
                <input class="text-label2" type="date" name="qual_sdate" id="qual_sdate" value="${qualup.qual_sdate} required="required" placeholder="年/月/日">
            </div>
            <div>
                <label for="qual_edate" class="text-label1">有效期（止）</label>
                <input class="text-label2" type="date" name="qual_edate" id="qual_edate" value="${qualup.qual_edate} required="required" placeholder="年/月/日">
            </div>
            <div>
                <label for="qual_office" class="text-label1">发证机关</label>
                <select size="1" name="qual_office" id="qual_office" class="text-label2" value="${qualup.qual_office}>
                    <option value="县国土资源主管部门" selected="selected">县国土资源主管部门</option>
                    <option value="市国土资源主管部门">市国土资源主管部门</option>
                    <option value="省国土资源主管部门">省国土资源主管部门</option>
                </select>
            </div>
            <div>
                <label for="qual_time" class="text-label1">发证时间</label>
                <input class="text-label2" type="date" name="qual_time" id="qual_time" value="${qualup.qual_time} required="required" placeholder="年/月/日">
            </div>
            <div>
                <label for="admin_id" class="text-label1">上传人</label>
                <input class="text-label2" type="text" name="admin_id" id="admin_id" value="${qualup.admin_id} required="required" placeholder="上传人长度5位">
            </div>
            <div>
                <label for="qual_date" class="text-label1">上传时间</label>
                <input class="text-label2" type="date" name="qual_date" id="qual_date" value="${qualup.qual_date} required="required" placeholder="年/月/日">
            </div>
            <div>
                <input class="text-btn1" type="submit" name="update_qual" value="更改">
                <input class="text-btn2" type="button" name="return" value="返回" onclick="history.back(-1);">
            </div>
        </div>
    </form>
</div>
</body>
</html>
