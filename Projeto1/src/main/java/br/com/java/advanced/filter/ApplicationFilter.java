package br.com.java.advanced.filter;

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

/**
 * @author Davi Maçana
 *
 */
@WebFilter(filterName = "applicationFilter" ,urlPatterns = {"/inicio", "/*.jsp"})
public class ApplicationFilter implements Filter {

	FilterConfig config;  
	  
	public void init(FilterConfig config) throws ServletException {  
	    this.config=config;  
	} 
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession(false);
		
		if(session != null && session.getAttribute("usuario") != null) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse) response).sendRedirect(((HttpServletRequest) request).getContextPath() + "/login");
		}
	}

}
