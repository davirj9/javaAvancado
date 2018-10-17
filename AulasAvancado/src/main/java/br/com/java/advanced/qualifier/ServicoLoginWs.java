package br.com.java.advanced.qualifier;

/**
 * Serviço de login que realiza a checagem de credenciais a partir de um Serviço WS.
 *
 * @author pedrobrigatto
 */
public class ServicoLoginWs implements ServicoLogin {

	@Override
	public boolean fazerLogin(String usuario) {
		System.out.println("Realizando a operação de login via Serviço WS.");
	    return true;
	}

}
