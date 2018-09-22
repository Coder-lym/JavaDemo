package state;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SomeServlet")
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SomeServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String sessionId=session.getId();
		Integer count=(Integer)session.getAttribute("count");
		if (count==null) {
			//第一次访问
			count=1;
		}else {
			//不是第一次访问
			count++;
		}
		session.setAttribute("count", count);
		out.println("你是第"+count+"次访问");
		out.close();
	}

}
