package AcademiaJava.Apostila04.Capitulo02;

import java.io.Serializable;

public class Usuario implements Serializable{
	private String nome;
	private transient String senha;
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
