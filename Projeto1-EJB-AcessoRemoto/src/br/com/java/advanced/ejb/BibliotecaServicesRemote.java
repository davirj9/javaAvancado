package br.com.java.advanced.ejb;

import javax.ejb.Remote;

/**
 * @author Davi Maçana
 *
 */
@Remote
public interface BibliotecaServicesRemote {

	Biblioteca consultaBiblioteca();

	String consulta();
	
	Usuario consultaUsuario();
}
