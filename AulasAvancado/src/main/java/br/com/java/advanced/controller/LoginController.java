package br.com.java.advanced.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Davi Maçana
 *
 */
@WebServlet(name = "login", urlPatterns = { "/login"})
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		if (StringUtils.isNotBlank(usuario) && StringUtils.isNotBlank(senha)) {
			// Inserindo um atributo na sessão da aplicação
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
		}
		((HttpServletResponse) response).sendRedirect(((HttpServletRequest) request).getContextPath() + "/inicio");
	}
	
}
