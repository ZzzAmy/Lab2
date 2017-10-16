<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统</title>
<style type = "text/css">
h1{
	margin:10px,0,15px,0;
	color:#FFFFFF;
	text-align:center;
}
h4{
	margin:10px,0,15px,0;
	color:#FFFFFF;
	text-align:center;
}
h6{
    color:#8B0000;
	text-align:center;
}

 .header{
	padding:10px;
	background-color:#b56663;
}
.function{
	height: 640px;
    background-color:#E9967A;
    padding :10px;
    margin: 0 auto;
    border :1Px solid #B56663;
}
.div0{
            border: 1px solid #CCC;
            width:65px;
            height:40px;
            margin:auto;
            display: table;
            *position: relative;
            overflow: hidden;
        }
.div1{
            border: 1px solid #CCC;
            width:1120px;
            height:40px;
            margin:auto;
            display: table;
            *position: relative;
            overflow: hidden;
        }
        .div2 {
            vertical-align: middle;
            display: table-cell;
            *position: absolute;
            *top: 50%;
        }
        .div3 {
            *position: relative;
            *top: -50%;
            float:right;
            padding-right:10px;
        }
.sub{
padding:10px;
background-color:#E9967A;
margin: 0 auto;
padding-left:10px;
}
p{
color:#FFFFFF;
	text-align:center;
}
</style>
</head>
<body>
	<div class = "header">
	<h1>图书管理系统</h1>
	<h4>你的心是一座庭院,请不要让它荒芜</h4>
	</div>
	
	<div class = "function">
	<h6>作者有：东野圭吾、蒋方舟、村上春树、加西亚·马尔克斯</h6>
	<s:form action="search" >
		<h4>请输入作者：</h4>
		<div class="div1">
    <div class="div2">
        <div class="div3">
        <input type="text" name="author" size="190">
        </div>
    </div>
</div>
        <p></p>
        	<div class="div0">
    <div class="div2">
        <div class="div3">
        <input type="submit" value="查询" size="200">
        </div>
    </div>
</div>
    </s:form>
    <div class="sub">
    <form action="NewBook">
    <div class="div0">
    <div class="div2">
        <div class="div3"> 
		<input type="submit" value="加书">  
		 </div>
    </div>
</div>
	</form>
	</div>
	</div>
</body>
</html>
