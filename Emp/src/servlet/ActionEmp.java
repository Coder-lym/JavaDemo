package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import dao.UserDao;
import entity.User;

@WebServlet("/ActionEmp")
public class ActionEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ActionEmp() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
			//��ȡ�û���������
			String name=request.getParameter("name");
			String password=request.getParameter("password");
		    //����������û��������룬��ѯ���ݿ����Ƿ��ж�Ӧ�ļ�¼
			UserDao dao=new UserDao();
			try {
				User user=dao.findByName(name);
				if (user != null && user.getPassword().equals(password)) {
					//��¼�ɹ�����һЩ���ݰ󶨵�session������
					HttpSession session=request.getSession();
					session.setAttribute("user", user);
					
					response.sendRedirect("loginSuccess.jsp");
				}else {
					request.setAttribute("login_failed", "�û������������");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		
		
		
		
	}

}
