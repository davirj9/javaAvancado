package br.com.java.advanced.controller;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Davi Maçana
 *
 */
@RequestScoped
@WebServlet(name = "inicio", urlPatterns = { "/inicio"})
public class InicioController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*// Inserindo um atributo no contexto da aplicação
		ServletContext ctx = getServletContext();
		ctx.setAttribute("Atributo Contexto", "Atributo Contexto");
		// Inserindo um atributo na sessão da aplicação
		HttpSession session = request.getSession();
		session.setAttribute("Atributo session", "Atributo session");*/
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		/*// Inserindo um atributo no contexto da aplicação
		System.out.println(getServletContext().getAttribute("Atributo Contexto"));
		// Inserindo um atributo na sessão da aplicação
		System.out.println(request.getSession().getAttribute("Atributo session"));*/
		
		String nomeLivro = request.getParameter("livro");
		System.out.println(nomeLivro);
	}
	
}
