<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息表</title>
<style>
   td{
   text-align:center;
   }
   .row1{
   background-color:#f0f0f0;
   }
   .row2{
   background-color:#fff8dc;
   }
</style>
</head>
<body>
   <table  border="1px" cellpadding="0" cellspacing="0" width="60%">
      <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>薪水</td>
        <td>年龄</td>
        <td>操作</td>
      </tr>
      <%
         //session验证，登录验证
        /*  Object obj=session.getAttribute("user");
        if (obj==null){
        	response.sendRedirect("error.jsp");
        	return;
        } */
      
         EmployeeDAO dao=new EmployeeDAO();   
         List<Employee> employees=dao.findAll();
         for (int i=0;i<employees.size();i++) {
				Employee e=employees.get(i);
      %>
      <tr class="row<%=i%2+1%>">
        <td><%=e.getId() %></td>
        <td><%=e.getName() %></td>
        <td><%=e.getSalary() %></td>
        <td><%=e.getAge() %></td>
        <td><a href="DeleteEmpServlet?id=<%=e.getId() %>" onclick="return confirm('是否确认删除<%=e.getName() %>的信息？')">删除</a>&nbsp;&nbsp;<a href="LoadEmp.jsp?id=<%=e.getId()%>">修改</a></td>
      </tr>
      <% } %>
   </table><br>
   <a href="AddEmp.jsp"><button>添加员工</button></a>
</body>
</html>