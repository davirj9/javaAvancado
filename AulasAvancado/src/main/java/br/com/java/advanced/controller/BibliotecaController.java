package br.com.java.advanced.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import br.com.java.advanced.bo.BibliotecaBO;
import br.com.java.advanced.entity.Biblioteca;
import br.com.java.advanced.entity.Livro;

/**
 * @author Davi Maçana
 *
 * http://localhost:8080/AulasAvancado/bibliotecaController?Nome=Davi (caso tenha mais de 1 parâmetro usar "&")
 */
@WebServlet(urlPatterns = "/biblioteca",
initParams = @WebInitParam(name = "Projeto", value = "Java avançado !"))
public class BibliotecaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
    private BibliotecaBO bibliotecaBO;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("Nome");
		
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
		
		Biblioteca biblioteca = bibliotecaBO.consultaBiblioteca();
		
		if (StringUtils.isNotBlank(nome)) {
			out.println("Olá " + nome + ", bem vindo !");
		}
		
		out.println("Nome do Projeto: " + getInitParameter("Projeto"));
		out.println("<table border=1>");
		
        for (Livro livro : biblioteca.getLivros()) {
            out.println("<tr>");
            out.println("<td>" + livro.getId() + "</td>");
            out.println("<td>" + livro.getIsbn() + "</td>");
            out.println("<td>" + livro.getTitulo() + "</td>");
            out.println("<td>" + livro.getIdioma() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.close();
        
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Aqui se inicia o ciclo de vida do Servlet");
		super.init();
	}
	
	@Override
	public void destroy() {
		System.out.println("Fim do ciclo de vida do Servlet.");
		super.destroy();
    }
}
