package br.com.abcosta.projetolojavirtual.corecore;

public class Produto {
	private int id; 
	private String descricao; 
	private double preco;
	
	public Produto(int id, String descricao, double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String showInfos() {
		return this.getId() + " | " + this.getDescricao()+ " | Preço: R$ " + String.format("%.2f", this.getPreco());  
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
