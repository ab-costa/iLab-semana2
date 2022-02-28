package br.com.abcosta.projetolojavirtual.corecore;

public class Cliente {
	private int numero;
	private String nome;
	private String email;
	
	public Cliente(int numero, String nome, String email) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.email = email;
	}
	
	public String showInfos() {
		return this.getNumero() + " - " + this.getNome() + " - " + this.getEmail();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
