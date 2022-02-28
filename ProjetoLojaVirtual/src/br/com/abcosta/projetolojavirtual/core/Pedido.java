package br.com.abcosta.projetolojavirtual.core;

public class Pedido {
	private String data;
	private Cliente cliente;
	private Produto produto;
	
	public Pedido(String data, Cliente cliente, Produto produto) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	public String showInfos() {
		return "Pedido" + this.getData() + "\n" +
					"\t" + "Produto: " + this.getProduto().showInfos() + "\n" +
						"\t" + "Cliente: " + this.getCliente().showInfos();
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
