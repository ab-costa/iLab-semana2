import javax.swing.JOptionPane;

public class BancoInterfaceGrafica {
	public static void main(String[] args) {
		int opcao;
		double deposito, saque;
		String mensagem;
		ContaBancaria c1;
	
		c1 = new ContaBancaria("100001", "Nome do Titular da Conta Um", "10209234410", 0);
		
		do {
			mensagem = JOptionPane.showInputDialog(
					"=============================================" +
					"\n     BEM VINDO AO ABCOSTA BANCO DIGITAL" +
					"\n=============================================" +
					"\nQual operação deseja realizar?" +
					"\n0 - ENCERRAR" +
					"\n1 - DEPOSITAR" +
					"\n2 - SACAR" +
					"\n3 - Exibir dados da conta\n\n"
			);
			opcao = Integer.parseInt(mensagem);
			
			switch(opcao) {
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
					break;
				case 1:
					mensagem = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					deposito = Double.parseDouble(mensagem);
					c1.depositar(deposito);
					break;
				case 2:
					mensagem = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					saque = Double.parseDouble(mensagem);
					if(c1.sacar(saque)) {
						JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso - Novo saldo R$ " + c1.getSaldo(), "Sucesso", JOptionPane.WARNING_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Débito não autorizado", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, c1.exibirDadosDaConta());
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
					break;
			}
		} while(opcao != 0);
	}
}
