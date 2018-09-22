package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import entity.Employee;
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet{
    public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    	//�������ĵ���������
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
        //��ȡ�����
    	PrintWriter out= response.getWriter();
        //��ȡ���ύ������
    	String name=request.getParameter("name");
    	double salary=Double.valueOf(request.getParameter("salary"));
    	int age=Integer.valueOf(request.getParameter("age"));
       
    	try {
			Employee e = new Employee();
			e.setName(name);
			e.setSalary(salary);
			e.setAge(age);
			
			EmployeeDAO dao = new EmployeeDAO();
			dao.regEmp(e);
			
			out.println("<h1>��ӳɹ���</h1><br>");
			out.println("<a href=\"ListEmp.jsp\"><button>�����б�</button></a>");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
