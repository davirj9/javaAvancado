package br.com.java.advanced.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Davi Maçana
 *
 */
@WebServlet("/inicioController")
public class InicioController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
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
