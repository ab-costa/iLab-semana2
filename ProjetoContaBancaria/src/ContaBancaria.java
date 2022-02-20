
public class ContaBancaria {
	private String numeroDaConta;
	private String nomeDoTitular;
	private String cpf;
	private int tipo;
	private double saldo;
	
	public ContaBancaria(String numeroDaConta, String nomeDoTitular, String cpf, int tipo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.cpf = cpf;
		this.tipo = tipo;
		this.saldo = 0.0;
	}
	
	public void depositar(double deposito) {
		this.setSaldo(deposito);
	}
	
	public boolean sacar(double saque) {
		if (saque <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - saque);
			return true;
		} else {
			return false;
		}
	}
	
	public void exibirDadosDaConta() {
		System.out.println("=======================================");
		System.out.println("           C O N TA " + this.getNumeroDaConta());
		System.out.println("=======================================");
		System.out.println("Titular: " + this.getNomeDoTitular());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Tipo: " + (this.getTipo() == 0 ? "Conca corrente" : this.getTipo() == 1 ? "Poupança" : "Investimento"));
		System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
		System.out.println("=======================================");
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
