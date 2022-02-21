import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		CartaoPrePago cartao1 = new CartaoPrePago("11122233344", "Nome do Titular Do Cartão Um", 2032, 12);		
		int opcao;
		double valor;
		
		do {
			System.out.println("==============================================");
			System.out.println("              SISTEMA DE COMPRAR");
			System.out.println("==============================================");
			System.out.println("Escolha a operação você deseja realizar:");
			System.out.println("  0 - ENCERRAR");
			System.out.println("  1 - ADICIONAR VALOR");
			System.out.println("  2 - COMPRAR");
			
			opcao = input.nextInt();
			
			switch(opcao) {
				case 0:
					System.out.println("OBRIGADO PELA PREFERENCIA!");
					break;
				case 1:
					System.out.println("Informe o valor que voce deseja adicionar:");
					valor = input.nextDouble();
					cartao1.adicionarValor(valor);
					System.out.println("O seu novo saldo é de: R$ " + String.format("%.2f", cartao1.getSaldo()));
					break;
				case 2:
					System.out.println("Informe o valor da compra:");
					valor = input.nextDouble();
					System.out.println(cartao1.comprar(valor) ?
							"Compra no valor de R$ " + String.format("%.2f", valor) :
								"SALDO INSUFICIENTE");
					System.out.println("O seu novo saldo é de: R$ " + String.format("%.2f", cartao1.getSaldo()));
					break;
			}
		} while(opcao != 0);
		
		System.out.println("F I M");
		
		input.close();
	}
}
