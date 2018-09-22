package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;

@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteEmpServlet() {
        super();
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������Ӧ��ʽ
		response.setContentType("text/html;charset=UTF-8");
		//��ȡ��������е�id
		int id=Integer.parseInt(request.getParameter("id"));
	
		try {
			EmployeeDAO dao=new EmployeeDAO();
			dao.deleteEmp(id);
			response.sendRedirect("ListEmp.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}