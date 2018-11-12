package br.com.java.advanced.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import br.com.java.advanced.qualifier.QualificadorLogin;
import br.com.java.advanced.qualifier.ServicoLogin;

/**
 * @author Davi Maçana
 *
 */
@SessionScoped
@WebServlet(name = "login", urlPatterns = { "/login"})
@Named
public class LoginController extends HttpServlet implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	@QualificadorLogin
	private transient ServicoLogin servicoLogin;
	
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
			
			servicoLogin.fazerLogin(usuario);
		}
		((HttpServletResponse) response).sendRedirect(((HttpServletRequest) request).getContextPath() + "/inicio");
	}
}
