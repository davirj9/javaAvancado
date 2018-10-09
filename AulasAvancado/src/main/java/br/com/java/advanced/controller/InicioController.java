package br.com.java.advanced.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java.advanced.entity.Biblioteca;
import br.com.java.advanced.entity.Livro;

/**
 * @author Davi Maçana
 *
 */
@WebServlet("/InicioController")
public class InicioController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
    private Biblioteca biblioteca;  // Isto é possível porque o bean está registrado em CDI (declara um escopo)
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
        
		PrintWriter out = response.getWriter();
		out.print("Aula 01.");

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

}
