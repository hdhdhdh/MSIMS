<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>双重预防机制文件</title>
    <style>


        #box{
            width:1000px;
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
            height: 315px;
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
            width:800px;
            height:500px;
            background-color: antiquewhite;

            float:left;

            text-align: center;
            align-items: center;
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
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;双重预防机制文件</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="#">新增双重预防机制文件</a> </li>
            <li><a href="${pageContext.request.contextPath}/sysm/toprevefind.do">查询双重预防机制文件</a> </li>
            <li><a href="${pageContext.request.contextPath}/sysm/main.do">返回至主界面</a> </li>
        </ul>
    </div>

    <div id='main'>
        <h2>新增双重预防机制文件</h2>


        <form method="post" action="${pageContext.request.contextPath}/sysm/preveadd.do">
            <p>发文字号:&nbsp;<input size="20px" TYPE="text" NAME="preve_num" id="preve_num" ></p>
            <p>&nbsp;&nbsp;&nbsp;文件名称:&nbsp;<input size="10px" TYPE="text" NAME="preve_name" id="preve_name" >&nbsp;&nbsp;&nbsp;</p>
            <p>颁布部门:&nbsp;<input size="3px" TYPE="text" NAME="preve_dep" id="preve_dep" >
                颁布时间:&nbsp;<input size="3px" TYPE="date" NAME="preve_sdate" id="preve_sdate" >
                &nbsp;&nbsp;&nbsp;实施时间:&nbsp;<input size="3px" TYPE="date" NAME="preve_edate" id="preve_edate" >&nbsp;&nbsp;&nbsp;</p>
            <p>上传文件:&nbsp;<input size="8px" TYPE="text" NAME="preve_path" id="preve_path" ></p>
            <p>上传人:&nbsp;<input size="8px" TYPE="text" NAME="admin_id" id="admin_id" >
                上传时间:&nbsp;<input size="10px" TYPE="date" NAME="preve_date" id="preve_date" ></p>
            <input type="submit" value="添&nbsp;&nbsp;加" name="preve_add" id="preve_add"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重&nbsp;&nbsp;置">

        </form>


    </div>

</div>
</body>
</html>