import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		double inputDepositoDouble, inputCompraDouble;
		String inputOpcao, inputDeposito, inputCompra;
		
		CartaoPrePago cartao1 = new CartaoPrePago("11122233344", "Nome do Titular Do Cart�o Um", 2032, 12);
		
		do {
			inputOpcao = JOptionPane.showInputDialog(
					"==============================================" +
					"\n                            SISTEMA DE COMPRAS" +
					"\n==============================================" +
					"\nEscolha a opera��o voc� deseja realizar:" +
					"\n  0 - ENCERRAR" +
					"\n  1 - ADICIONAR VALOR" +
					"\n  2 - COMPRAR"
			);
			
			opcao = Integer.parseInt(inputOpcao);
			
			switch(opcao) {
				case 0:
					JOptionPane.showMessageDialog(null, "OBRIGADO PELA PREFERENCIA!");
					break;
				case 1:
					inputDeposito = JOptionPane.showInputDialog("Informe o valor que voce deseja adicionar:");
					inputDepositoDouble = Double.parseDouble(inputDeposito);
					cartao1.adicionarValor(inputDepositoDouble);
					JOptionPane.showMessageDialog(null, "Foi adicionado o valor: R$ " +
														String.format("%.2f", inputDepositoDouble) +
														"\nO seu no saldo �: R$ " +
														String.format("%.2f", cartao1.getSaldo())
					);
					break;
				case 2:
					inputCompra = JOptionPane.showInputDialog("Informe o valor da compra:");
					inputCompraDouble = Double.parseDouble(inputCompra);
					if(cartao1.comprar(inputCompraDouble)) {
						JOptionPane.showMessageDialog(null, "Compra no valor de R$ " + 
															String.format("%.2f", inputCompraDouble) +
															"\nO seu no saldo �: R$ " +
															String.format("%.2f", cartao1.getSaldo()), "Sucesso", JOptionPane.WARNING_MESSAGE
						);
					} else {
						JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE", "COMPRA N�O AUTORIZADA", JOptionPane.ERROR_MESSAGE);
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "OP��O IN�LIDA", "ERRO", JOptionPane.WARNING_MESSAGE);
			}
			
		} while(opcao != 0);
		
		input.close();
	}
}
