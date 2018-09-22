<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改员工信息</title>
</head>
<body>
<% 
   int id=Integer.parseInt(request.getParameter("id"));
   EmployeeDAO dao=new EmployeeDAO();
   Employee e=new Employee();
   e=dao.selectEmp(id);

   String name=e.getName();
   double salary=e.getSalary();
   int age=e.getAge();
%>

	<form action="UpdateEmpServlet" method="post">
		编号：<%=id %><input type="hidden" name="id" value=<%=id %> /><br>
		姓名：<input name="name" value=<%=name %> /><br>
		薪水：<input name="salary" value=<%=salary %> /><br>
		年龄：<input name="age" value=<%=age %> /><br>
		<input type="submit" value="修改" />
	</form>
</body>
</html>