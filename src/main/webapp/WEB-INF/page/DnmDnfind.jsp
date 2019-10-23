<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>粉尘、噪音浓度检测</title>
    <style>


        #box{
            width:1400px;
            margin:0 auto;

        }
        #logo{
            font-family: "幼圆";
            font-size: 20px;
            color: #6cdbff;
            font-weight: bold;
            text-align: center;
            margin-top: 30px;
            margin-bottom: 40px;
        }
        #nav {
            border-radius: 15px;
            display: inline-block;
            width: 200px;
            height: 250px;
            float: left;
            background-color: lightcyan;
            margin-right: 0px;

        }
        #nav ul{
            line-height: 45px;
            list-style-type: none;
            padding: 35px;
            text-align: center;
        }
        #nav a{
            text-decoration:none;
            font-family: 幼圆;
            color: #e722ff;
            font-weight: bold;
            font-size: 20px;

        }
        #main{
            border-radius: 15px;
            display:inline-block;
            width:1200px;
            height:600px;
            background-color: antiquewhite;

            float:left;
            text-align: center;
            align-items: center;
            font-size: 15px;
        }
        h2{
            font-size:25px;
            font-family: 幼圆;
            color: chartreuse;
            text-align: center;

        }
        input[type="submit"]{
            font-family:幼圆;
            border-radius: 5px;

        }
        table{
            margin: auto;
            width: 1150px;
            border: 2px solid #faa5ff;
            border-spacing: 0;
            text-align: center;
            font-family: 宋体;
            border-radius: 5px;
        }
        a{
            color: #791388;
            font-family: 幼圆;
            text-decoration: none;
            font-weight: bold;
        }
        /*ul{*/
        /*    margin-bottom: 0;*/
        /*    margin-top:auto;*/
        /*    margin-left: auto;*/
        /*    margin-right: auto;*/
        /*    width: 300px;*/
        /*    height: 100px;*/
        /*    list-style: none;*/
        /*    align-items: center;*/
        /*    text-align: center;*/
        /*}*/

        /*li{*/
        /*    list-style: none;*/
        /*    width: 20px;*/
        /*    height: 20px;*/
        /*    font-size: 16px;*/
        /*    float: left;*/
        /*    margin: 10px;*/
        /*}*/



    </style>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/jquery.table2excel.js"></script>

</head>
<body>
<div id='box'>
    <div id='logo'>
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;粉尘、噪音浓度检测</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/dnm/todnadd.do">新增采样记录</a> </li>
            <li><a href="">查询采样记录</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>查询采样记录</h2>

        <form action="${pageContext.request.contextPath}/dnm/dnidfind.do" method="post">
            <p>输入采样点ID:&nbsp;<input size="7px" type="text" name="site_id" id="site_id">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>


        <form action="${pageContext.request.contextPath}/dnm/dndatefind.do" method="post">
            <p>输入时间日期:&nbsp;<input size="7px" type="date" name="duno_date" id="duno_date">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>
        <table id="findtable" border="1">
            <thead>
            <tr>
                <td rowspan="2" width="50px">编号</td><td rowspan="2" width="80px">采样点id</td><td colspan="4">粉尘</td><td colspan="5">噪音</td><td rowspan="2">检测人</td><td rowspan="2">检测日期</td><td rowspan="2">操作</td>
            </tr>
            <tr>
                <td width="50px">一</td><td width="60px">二</td><td width="60px">三</td><td width="60px">平均值</td><td width="60px">一</td><td width="60px">二</td><td width="60px">三</td><td width="60px">平均值</td><td width="60px">隔音室</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="d" items="${dnmdninfos}">
                <tr>
                <td width="50px">${d.duno_num}</td>
                <td width="80px">${d.site_id}</td>
                <td width="60px">${d.duno_dust1}</td>
                <td width="60px">${d.duno_dust2}</td>
                <td width="60px">${d.duno_dust3}</td>
                <td width="60px">${d.duno_dusta}</td>
                <td width="60px">${d.duno_noise1}</td>
                <td width="60px">${d.duno_noise2}</td>
                <td width="60px">${d.duno_noise3}</td>
                <td width="60px">${d.duno_noisea}</td>
                <td width="60px">${d.duno_room}</td>
                <td>${d.duno_name}</td>
                <td>${d.duno_date}</td>

                <td >
                    <a href="${pageContext.request.contextPath}/dnm/todnupdate.do?duno_num=${d.duno_num}" >更新</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/dndelete.do?duno_num=${d.duno_num}" >删除</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/dnidfindexcel.do?site_id=${d.site_id}">ID</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/dndatefindexcel.do?duno_date=${d.duno_date}">时间</a>
                </td>
                </tr>

            </c:forEach>
            <tr>

            </tr>

            </tbody>
        </table>


<%--        <script>--%>
<%--        function upexcel(){--%>
<%--        var elTable = document.getElementById("findtable");      //要导出的table id。--%>
<%--        var oRangeRef = document.body.createTextRange();  --%>
<%--        oRangeRef.moveToElementText(elTable); --%>
<%--        oRangeRef.execCommand("Copy"); --%>
<%--        var appExcel = new ActiveXObject("Excel.Application"); --%>
<%--        appExcel.Workbooks.Add().Worksheets.Item(1).Paste(); --%>
<%--        appExcel.Visible = true;  --%>
<%--        appExcel = null; --%>
<%--        }--%>
<%--        </script>--%>


<%--        <button id="excell"  onclick="method5('dataTable')">打印Excel表</button>--%>

<%--        <script>--%>
<%--            //打印表格--%>
<%--            var idTmr;--%>

<%--            function getExplorer() {--%>
<%--                var explorer = window.navigator.userAgent;--%>
<%--                //ie--%>
<%--                if(explorer.indexOf("MSIE") >= 0) {--%>
<%--                    return 'ie';--%>
<%--                }--%>
<%--                //firefox--%>
<%--                else if(explorer.indexOf("Firefox") >= 0) {--%>
<%--                    return 'Firefox';--%>
<%--                }--%>
<%--                //Chrome--%>
<%--                else if(explorer.indexOf("Chrome") >= 0) {--%>
<%--                    return 'Chrome';--%>
<%--                }--%>
<%--                //Opera--%>
<%--                else if(explorer.indexOf("Opera") >= 0) {--%>
<%--                    return 'Opera';--%>
<%--                }--%>
<%--                //Safari--%>
<%--                else if(explorer.indexOf("Safari") >= 0) {--%>
<%--                    return 'Safari';--%>
<%--                }--%>
<%--            }--%>

<%--            function method5(tableid) {--%>
<%--                if(getExplorer() == 'ie') {--%>
<%--                    var curTbl = document.getElementById(tableid);--%>
<%--                    var oXL = new ActiveXObject("Excel.Application");--%>
<%--                    var oWB = oXL.Workbooks.Add();--%>
<%--                    var xlsheet = oWB.Worksheets(1);--%>
<%--                    var sel = document.body.createTextRange();--%>
<%--                    sel.moveToElementText(curTbl);--%>
<%--                    sel.select();--%>
<%--                    sel.execCommand("Copy");--%>
<%--                    xlsheet.Paste();--%>
<%--                    oXL.Visible = true;--%>

<%--                    try {--%>
<%--                        var fname = oXL.Application.GetSaveAsFilename("Excel.xls",--%>
<%--                            "Excel Spreadsheets (*.xls), *.xls");--%>
<%--                    } catch(e) {--%>
<%--                        print("Nested catch caught " + e);--%>
<%--                    } finally {--%>
<%--                        oWB.SaveAs(fname);--%>
<%--                        oWB.Close(savechanges = false);--%>
<%--                        oXL.Quit();--%>
<%--                        oXL = null;--%>
<%--                        idTmr = window.setInterval("Cleanup();", 1);--%>
<%--                    }--%>

<%--                } else {--%>
<%--                    tableToExcel(tableid)--%>
<%--                }--%>
<%--            }--%>

<%--            function Cleanup() {--%>
<%--                window.clearInterval(idTmr);--%>
<%--                CollectGarbage();--%>
<%--            }--%>
<%--            var tableToExcel = (function() {--%>
<%--                var uri = 'data:application/vnd.ms-excel;base64,',--%>
<%--                    template = '<html><head><meta charset="UTF-8"></head><body><table  border="1">{table}</table></body></html>',--%>
<%--                    base64 = function(--%>
<%--                        s) {--%>
<%--                        return window.btoa(unescape(encodeURIComponent(s)))--%>
<%--                    },--%>
<%--                    format = function(s, c) {--%>
<%--                        return s.replace(/{(\w+)}/g, function(m, p) {--%>
<%--                            return c[p];--%>
<%--                        })--%>
<%--                    }--%>
<%--                return function(table, name) {--%>
<%--                    if(!table.nodeType)--%>
<%--                        table = document.getElementById(table)--%>
<%--                    var ctx = {--%>
<%--                        worksheet: name || 'Worksheet',--%>
<%--                        table: table.innerHTML--%>
<%--                    }--%>
<%--                    window.location.href = uri + base64(format(template, ctx))--%>
<%--                }--%>
<%--            })()--%>
<%--        </script>--%>

<%--        <ul >--%>
<%--            <li><a href="">首页</a></li>--%>
<%--            <li><a href="">上一页</a></li>--%>
<%--            <li><a href="">1</a></li>--%>
<%--            <li><a href="">2</a></li>--%>
<%--            <li><a href="">3</a></li>--%>
<%--            <li><a href="">下一页</a></li>--%>
<%--            <li><a href="">尾页</a></li>--%>
<%--        </ul>--%>


    </div>

</div>

</body>
</html>
