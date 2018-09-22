package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;

//@WebFilter("/*")
public class LoginFilter implements Filter {

    public LoginFilter() {
    }
    
	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		HttpSession session=req.getSession();
		//获得用户请求的页面URI
		String path=req.getRequestURI();
		System.out.println(path);
		User user = (User)session.getAttribute("user");
		if (user!=null) {
			    chain.doFilter(request, response);
			  } else {
			  res.sendRedirect("/Emp/error.jsp");
			  }
		if(path.indexOf("/login.jsp") > -1) {
			   chain.doFilter(req, res);
			   return;
			}
			  
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
