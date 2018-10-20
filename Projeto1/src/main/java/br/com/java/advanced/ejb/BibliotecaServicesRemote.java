package br.com.java.advanced.ejb;

import javax.ejb.Remote;

import br.com.java.advanced.entity.Biblioteca;
import br.com.java.advanced.entity.Usuario;

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
