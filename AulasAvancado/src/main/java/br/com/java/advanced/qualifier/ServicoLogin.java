package br.com.java.advanced.qualifier;

/**
 * Define um modelo para serviços que realizam a operação de login no sistema.
 *
 * @author pedrobrigatto
 */
public interface ServicoLogin {

	/**
     * Busca credenciais compatíveis com o usuário em procedimento de login.
     * 
     * @param usuario Objeto que encapsula os dados do usuário em tentativa de login.
     * 
     * @return <code>true</code> se as credenciais correspondem a um usuário válido.
     *         <code>false</code> caso contrário.
     */
    public boolean fazerLogin(String usuario);
}
