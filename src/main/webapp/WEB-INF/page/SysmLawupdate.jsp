<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>粉尘、噪音浓度检测</title>
    <style>


        #box{
            width:1200px;
            margin:0 auto;
            font-size:14px;

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
            font-size: 12px;

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

        input{



            height: 25px;
            margin-top: 10px;
            margin-right: auto;

        }
        input[type="submit"]{
            width:70px;
            height: 30px;
            font-size: 15px;
            font-family:幼圆;
            font-weight: bold;
            text-align: center;
            border-radius: 5px;
            background-color: #f3f5fa;
            color: #9549ff;
        }
        input[type="reset"]{
            width:70px;
            height: 30px;
            font-size: 15px;
            font-family:幼圆;
            font-weight: bold;
            text-align: center;
            border-radius: 5px;
            background-color: #f3f5fa;
            color: #9549ff;
        }



    </style>
</head>
<body>
<div id='box'>
    <div id='logo'>
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;更新安全生产法律法规</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="SysmLawadd.jsp">新增安全生产法律法规</a> </li>
            <li><a href="SysmLawfind.jsp">查询安全生产法律法规</a> </li>
            <li><a href="SysmMain.jsp">返回至主界面</a> </li>
        </ul>
    </div>

    <div id='main'>
        <h2>更新安全生产法律法规</h2>

        <form method="post" action="${pageContext.request.contextPath}/sysm/lawupdate.do?law_num=${d.law_num}">
<%--            <p>发文字号:&nbsp;<input size="20px" TYPE="text" NAME="law_num" id="law_num" ></p>--%>
            <p>法律法规类别:&nbsp;<input size="10px" TYPE="text" NAME="law_class" id="law_class" >
                &nbsp;&nbsp;&nbsp;法律法规标准名称:&nbsp;<input size="10px" TYPE="text" NAME="law_name" id="law_name" >
                &nbsp;&nbsp;&nbsp;</p>
            <p>颁布部门:&nbsp;<input size="3px" TYPE="text" NAME="law_dep" id="law_dep" >
                颁布时间:&nbsp;<input size="3px" TYPE="date" NAME="law_sdate" id="law_sdate" >
                &nbsp;&nbsp;&nbsp;实施时间:&nbsp;<input size="3px" TYPE="date" NAME="law_edate" id="law_edate" >&nbsp;&nbsp;&nbsp;</p>
            <p>审核人:&nbsp;<input size="8px" TYPE="text" NAME="law_checker" id="law_checker" >
                审核时间:&nbsp;<input size="3px" TYPE="date" NAME="law_checktime" id="law_checktime" ></p>
            <p>上传人:&nbsp;<input size="8px" TYPE="text" NAME="admin_id" id="admin_id" >
                上传时间:&nbsp;<input size="10px" TYPE="date" NAME="law_date" id="law_date" ></p>
            <p>备注:&nbsp;<input size="20px" TYPE="text" NAME="law_note" id="law_note" ></p>
            <input type="submit" value="更&nbsp;&nbsp;新" name="law_add" id="law_add"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重&nbsp;&nbsp;置">
        </form>
    </div>

</div>

</body>
</html>