<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>查询安全生产法律法规</title>
    <style>


        #box{
            width:1200px;
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
            line-height: 20px;
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
            width:1000px;
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
            width: 920px;
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
</head>
<body>
<div id='box'>
    <div id='logo'>
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;查询安全生产法律法规</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/sysm/tolawadd.do">新增安全生产法律法规</a> </li>
            <li><a href="">查询安全生产法律法规</a> </li>
            <li><a href="${pageContext.request.contextPath}/sysm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>查询安全生产法律法规</h2>
        <form action="${pageContext.request.contextPath}/sysm/lawfind.do" method="post">
            <p>输入发文字号:&nbsp;<input size="7px" type="text" name="findLawnum" id="findLawnum">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>
        <table border="1">
            <thead>
            <tr>
                <td>发文字号</td><td>法律法规类别</td><td >法律法规标准名称</td><td >颁布部门</td><td >颁布时间</td><td >实施时间</td><td>审核人</td><td>审核时间</td><td >上传人</td><td >上传时间</td><td >备注</td>
            </tr>

            </thead>
            <tbody>
            <c:forEach var="d" items="${sysmLawInfos}">
               <tr>
                <td>${d.law_num}</td>
                <td>${d.law_class}</td>
                <td>${d.law_name}</td>
                <td>${d.law_dep}</td>
                <td>${d.law_sdate}</td>
                <td>${d.law_edate}</td>
                <td>${d.law_checker}</td>
                <td>${d.law_checktime}</td>
                <td>${d.admin_id}</td>
                <td>${d.law_date}</td>
                <td>${d.law_note}</td>

                <td class="text-center">
                    <a href="${pageContext.request.contextPath}/sysm/tolawupdate.do">更新</a>
                    <a href="${pageContext.request.contextPath}/sysm/lawdelete.do?law_num=${d.law_num}" >删除</a>
                </td>
               </tr>
            </c:forEach>


            </tbody>
        </table>

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