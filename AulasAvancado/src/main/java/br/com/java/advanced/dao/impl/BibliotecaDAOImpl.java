package br.com.java.advanced.dao.impl;

import br.com.java.advanced.dao.BibliotecaDAO;
import br.com.java.advanced.entity.Biblioteca;

public class BibliotecaDAOImpl implements BibliotecaDAO {

	@Override
	public Biblioteca consultaBiblioteca() {
		return new Biblioteca();
	}

}
