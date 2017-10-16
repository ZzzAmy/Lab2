<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>该作者所著书籍</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
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
    background-color:#E9967A;
    padding :10px;
    margin: 0 auto;
    border :1Px solid #B56663;
}
</style>
</head>
	<body>
		
		<div class="header">
		<h1>该作者所著书籍</h1>
		</div>
		<div class="bod">
		<table border="1">
			<s:iterator value="ABList" var="tt" status = "status">
			<tr>
			<td>
				<a href="ShowBook?id=<s:property value="tt"/>"><s:property value="tt"/></a>
			</td>
			</tr>
			</s:iterator>
		</table>
		</div>
	</body>
</html>