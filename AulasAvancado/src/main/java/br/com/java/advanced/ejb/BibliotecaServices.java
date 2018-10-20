package br.com.java.advanced.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.java.advanced.bo.BibliotecaBO;
import br.com.java.advanced.entity.Biblioteca;

/**
 * @author DaviMacana
 *
 * Session Bean implementation class cotacaoService
 */
@Stateless
public class BibliotecaServices implements BibliotecaServicesRemote {

	@Inject
	private BibliotecaBO bibliotecaBO;
	
    /**
     * Default constructor. 
     */
	public BibliotecaServices() {
	}

	@Override
	public Biblioteca consultaBiblioteca() {
		return bibliotecaBO.consultaBiblioteca();
	}
	
	@Override
	public String consulta() {
		return "Consulta realizada com sucesso !";
	}
	
}
