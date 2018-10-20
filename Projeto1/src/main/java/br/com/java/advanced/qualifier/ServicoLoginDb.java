package br.com.java.advanced.qualifier;

/**
 * Serviço de login que realiza a checagem de credenciais a partir de um BD.
 *
 * @author pedrobrigatto
 */
@QualificadorLogin
public class ServicoLoginDb implements ServicoLogin {

	@Override
	public boolean fazerLogin(String usuario) {
		System.out.println("Realizando a operação de login via banco de dados.");
	    return true;
	}

}
