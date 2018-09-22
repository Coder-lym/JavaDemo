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
			//读取用户名和密码
			String name=request.getParameter("name");
			String password=request.getParameter("password");
		    //依据输入的用户名和密码，查询数据库中是否有对应的记录
			UserDao dao=new UserDao();
			try {
				User user=dao.findByName(name);
				if (user != null && user.getPassword().equals(password)) {
					//登录成功，将一些数据绑定到session对象上
					HttpSession session=request.getSession();
					session.setAttribute("user", user);
					
					response.sendRedirect("loginSuccess.jsp");
				}else {
					request.setAttribute("login_failed", "用户名或密码错误");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		
		
		
		
	}

}
