<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书目介绍</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function deletes(e)
{
	var ISBN = document.getElementById("ISBN");
	alert("删除成功！");
	window.location.href = "Delete?ISBN="+ISBN.innerHTML;
}

function updates(s){
	var ISBN = document.getElementById("ISBN");
	window.location.href = "Update?ISBN="+ISBN.innerHTML;
}
</script>
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
    background-color:#FFE4B5;
    padding :10px;
    margin: 0 auto;
    border :1Px solid #B56663;
}
</style>
</head>


	<body>
	<div class="header">
		<h1>图书简介</h1>
		</div>
		<div class="bod">
		图书ISBN编码：<p id="ISBN"><s:property value = "ISBN"/></p>
		<hr/>
		作者姓名:<s:property value = "Name"/>
		<hr/>
		作者ID:<s:property value = "AuthorID"/>
		<hr/>
		年龄:<s:property value = "Age"/>
		<hr/>
		国籍:<s:property value = "Country"/>
		<hr/>
		<hr/>
		作品名:<s:property value = "Title"/>
		<hr/>
		出版商:<s:property value = "Publisher"/>
		<hr/>
		出版日期:<s:property value = "PublisherDate"/>
		<hr/>
		价格:<s:property value = "Price"/>
		<hr/>
		
		<p clickable="clickable" onclick="deletes(this);">
		删除本书记录
		</p>
		<p clickable="clickable" onclick="updates(this);">
		更新本书数据
		</p>
		</div>
	</body>
</html>
	