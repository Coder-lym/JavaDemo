<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加员工</title>
</head>
<body>
<form action="/Emp/AddEmpServlet" method="post">
   <fieldset>
       <legend>添加员工</legend>
       姓名：<input name="name" /><br />
       薪水：<input name="salary" /><br />
       年龄：<input name="age" /><br />
       <input type="submit" value="添加" />
       <input type="reset" value="重置" /> 
   </fieldset>
</form>
</body>
</html>