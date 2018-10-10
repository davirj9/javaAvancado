package br.com.java.advanced.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author DaviMacana
 *
 */
@WebFilter
public class ApplicationFilter implements Filter {

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
