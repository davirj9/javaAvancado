package br.com.java.advanced.dao.impl;

import br.com.java.advanced.dao.BibliotecaDAO;
import br.com.java.advanced.entity.Biblioteca;

/**
 * @author Davi Maçana
 *
 */
public class BibliotecaDAOImpl implements BibliotecaDAO {

	/*@Inject
    private EntityManager em;*/
	
	@Override
	public Biblioteca consultaBiblioteca() {
		return new Biblioteca();
	}

}
