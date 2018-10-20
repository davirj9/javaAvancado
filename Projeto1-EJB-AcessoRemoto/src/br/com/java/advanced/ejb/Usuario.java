package br.com.java.advanced.ejb;

import java.io.Serializable;

/**
 * @author Davi Maçana
 *
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 4545373481162350033L;
	
	private String nome;
	private String senha;
	
	public Usuario() {
	}
	
	public Usuario(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
