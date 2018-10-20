package br.com.java.advanced.ejb;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Davi Maçana
 *
 */
public class AcessoRemotoEJB {
	
	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws NamingException {
	
		Properties prop = new Properties();
        prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(prop);
        
        BibliotecaServicesRemote bibliotecaService = (BibliotecaServicesRemote) 
        		context.lookup("ejb:/AulasAvancado/BibliotecaServices!br.com.java.advanced.ejb.BibliotecaServicesRemote");
        
        System.out.println(bibliotecaService.consulta());
        
        Usuario usuario = bibliotecaService.consultaUsuario();
        
        usuario.getNome();
	}


}
