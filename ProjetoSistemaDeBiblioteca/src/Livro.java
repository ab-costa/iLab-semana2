
public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, int anoPublicacao, String categoria, int estante, int prateleira) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.estante = estante;
		this.prateleira = prateleira;
		this.emprestado = false;
	}
	
	public boolean emprestar() {
		if(this.getEmprestado()) {
			return false;
		} else {
			this.setEmprestado(true);
			return true;
		}
	}
	
	public boolean devolver() {
		if(this.getEmprestado()) {
			this.setEmprestado(false);
			return true;
		} else {
			return false;
		}
	}
	
	public String showInfos() {
		String mensagem = 
				"==============================================" +
				"\n            Livro: " + this.getTitulo() +
				"\n==============================================" +
				"\n Autor: " + this.getAutor() +
				"\n Ano de publicação: " + this.getAnoPublicacao() +
				"\n Categoria: " + this.getCategoria() +
				"\n Estante/Prateleira: " + this.getEstante() + "/" + this.getPrateleira() +
				"\n Diponível para empréstimo? " + (this.getEmprestado() ? "NÃO" : "SIM");
		return mensagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
}
