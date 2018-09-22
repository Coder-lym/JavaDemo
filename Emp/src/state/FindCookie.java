package state;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FindCookie")
public class FindCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FindCookie() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();

		Cookie[] cookies=request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie c = cookies[i];
				String name=c.getName();
				String value=c.getValue();
				out.println("cookieName:"+name+"<br>");
				out.println("cookieValue:"+URLDecoder.decode(value, "utf-8")+"<br>");
			}
		}else {
			out.println("找不到任何cookie！");
		}
		out.close();
		
	}

}
