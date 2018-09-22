<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
			form{
				width: 400px;
				margin: 100px auto;
				border: 1px solid #CCCCCC;
			}
			form h3{
				text-align: center;
				margin: 10px;
			}
			form p{
				text-align: center;
			}
			
		</style>
</head>
<body>
<%
  String msg=(String)request.getAttribute("login_failed");
%>
<form action="/Emp/ActionEmp" method="post">
<h3>登录</h3>
<p style="color:red;"><%=(msg == null ? "" : msg) %></p>
<p>用户名：<input type="text" name="name" value="${param.name }"></p><br>
<p>密码：<input type="password" name="password" value="${param.password }"></p><br>
<p><input type="submit" value="登录" ></p>
</form>
</body>
</html>