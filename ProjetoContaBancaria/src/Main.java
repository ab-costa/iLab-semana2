import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int option;
		ContaBancaria c1;
		double deposito;
		double saque;
		
		c1 = new ContaBancaria("100001", "Nome do Titular da Conta Um", "10209234410", 0);
		
		do {
			System.out.println("=============================================");
			System.out.println("     BEM VINDO AO ABCOSTA BANCO DIGITAL");
			System.out.println("=============================================");
			System.out.println("Qual operação deseja realizar?");
			System.out.println("0 - ENCERRAR | 1 - DEPOSITAR | 2 - SACAR | 3 - Exibir dados da conta");
			
			option = input.nextInt();
			
			switch(option) {
				case 0:
					System.out.println("Obrigado pela preferência!");
					break;
				case 1:
					System.out.println("Digite o valor que deseja depositar:");
					deposito = input.nextDouble();
					c1.depositar(deposito);
					System.out.printf("Depósito no valor de R$ %.2f realizado com sucesso\n", deposito);
					break;
				case 2:
					System.out.println("Digite o valor que deseja sacar:");
					saque = input.nextDouble();
					System.out.printf(c1.sacar(saque) ? "Saque no valor de R$ %.2f realizado com sucesso" : "Saldo insuficiente", saque);
					break;
				case 3:
					c1.exibirDadosDaConta();
					break;
				default:
					System.out.println("Opção inválida");
			}
			
		} while(option != 0);
		
		System.out.println("F I M");
		
		input.close();
	}
}
