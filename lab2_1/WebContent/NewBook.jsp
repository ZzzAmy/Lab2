<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加新书籍</title>
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
</head>
<body>
<div class="header">
	<h1>添加书籍</h1>
	</div>
	<div class="bod">
	<s:form action="NBbutton" >
	<s:textfield name="ISBN" label="请输入书籍ISBN编码"></s:textfield>
    <s:textfield name="Title" label="请输入书籍名称"></s:textfield>
    <s:textfield name="Name" label="请输入作者姓名"></s:textfield>
    <s:textfield name="Publisher" label="请输入出版商"></s:textfield>
    <s:textfield name="Publisherdate" label="请输入出版日期" placeholder="日期请按xxxx-xx-xx格式输入"></s:textfield>
    <s:textfield name="Price" label="请输入书籍价格"></s:textfield>
    <s:submit value="添加"></s:submit>
	</s:form>
	</div>
</body>
</html>