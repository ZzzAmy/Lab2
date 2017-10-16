<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新图书</title>
<style type="text/css">
h1{
	margin:10px,0,15px,0;
	color:#FFFFFF;
}
 .header{
	padding:10px;
	background-color:#b56663;
}
a{
color:#F5FFFA;
}
.bod{
	height: 640px;
    background-color:#E9967A;
    padding :10px;
    margin: 0 auto;
    border :1Px solid #B56663;
}
</style>
</head>
<body>
<div class="header">
	<h1>更新图书</h1>
	</div>
	<div class="bod">
	<s:form action="Upbutton" >
	<s:textfield name ="Title" label ="请输入要修改的书目名"></s:textfield>
	<hr/>
	<h4>修改信息：</h4>
	<s:textfield name="Name" label="请输入作者姓名"></s:textfield>
    <s:textfield name="Publisher" label="请输入书籍出版商"></s:textfield>
    <s:textfield name="PublisherDate" label="请输入出版日期"></s:textfield>
    <s:textfield name="Price" label="请输入书籍价格"></s:textfield>
    <s:submit value="修改"></s:submit>
	</s:form>
	</div>
</body>
</html>