package com.geniisys.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.geniisys.util.MyAppSqlConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ServletFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		HttpSession session = req.getSession();
		Boolean valid = false;
		System.out.println("adhocUser: " + session.getAttribute("adhocUser"));
		if(session.getAttribute("adhocUser") != null){
			valid = true;
			chain.doFilter(request, response);
		} else {
			Cookie[] cookies = req.getCookies();
			if(cookies != null){
				for(Cookie c: cookies){
					if("adhocUser".equals(c.getName())){
						valid = true;
						session.setAttribute("adhocUser", c.getValue());
						//session.setMaxInactiveInterval(1800);
						session.setMaxInactiveInterval(4 * 60 * 60);
						chain.doFilter(request, response);
						
					}
				}
			}
		}
		
		if(!valid){
			request.getRequestDispatcher("/pages/invalid.jsp").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
