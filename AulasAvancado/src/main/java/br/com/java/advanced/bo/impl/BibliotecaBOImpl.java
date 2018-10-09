package br.com.java.advanced.bo.impl;

import javax.inject.Inject;

import br.com.java.advanced.bo.BibliotecaBO;
import br.com.java.advanced.dao.BibliotecaDAO;
import br.com.java.advanced.entity.Biblioteca;

/**
 * @author DaviMacana
 *
 */
public class BibliotecaBOImpl implements BibliotecaBO {

	@Inject
	private BibliotecaDAO bibliotecaDAO;
	
	@Override
	public Biblioteca consultaBiblioteca() {
		return bibliotecaDAO.consultaBiblioteca();
	}
}
