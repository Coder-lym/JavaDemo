package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import entity.Employee;

@WebServlet("/UpdateEmpServlet")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateEmpServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文的输入和输出
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
        //获取LoadEmp.jsp表单提交的数据
    	int id=Integer.valueOf(request.getParameter("id"));
    	String name=request.getParameter("name");
    	double salary=Double.valueOf(request.getParameter("salary"));
    	int age=Integer.valueOf(request.getParameter("age"));
		
		try {
			Employee e=new Employee();
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			e.setAge(age);
			
			EmployeeDAO dao=new EmployeeDAO();
			dao.updateEmp(e);
			
			response.sendRedirect("ListEmp.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
