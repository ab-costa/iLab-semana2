import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Livro l1, l2, l3, l4, l5;
		
		l1 = new Livro("T�tulo do livro um", "Autor do Livro Um", 2003, "Categoria um", 1, 2);
		l2 = new Livro("T�tulo do livro Dois", "Autor do Livro Dois", 2009, "Categoria dois", 1, 3);
		l3 = new Livro("T�tulo do livro tr�s", "Autor do Livro Tr�s", 1995, "Categoria Tr�s", 1, 1);
		l4 = new Livro("T�tulo do livro quatro", "Autor do Livro Quatro", 2013, "Categoria quatro", 1, 4);
		l5 = new Livro("T�tulo do livro cinco", "Autor do Livro Cinco", 2017, "Categoria cinco", 1, 5);
		
		int opcao, livro;
		boolean acao;
		
		do {
			System.out.println("====================================================");
			System.out.println("             SISTEMA DE BIBLIOTECA");
			System.out.println("====================================================");
			System.out.println("                     ACERVO:");
			System.out.println(l1.getTitulo());
			System.out.println(l2.getTitulo());
			System.out.println(l3.getTitulo());
			System.out.println(l4.getTitulo());
			System.out.println(l5.getTitulo());
			System.out.println("Escolha uma das op��es abaixo:");
			System.out.println(" 0 - ENCERRAR");
			System.out.println(" 1 - EMPRESTAR");
			System.out.println(" 2 - DEVOLVER");
			System.out.println(" 3 - EXIBIR INFORMA��ES DE UM LIVRO");
			
			opcao = input.nextInt();
			
			switch(opcao) {
				case 0:
					System.out.println("Obrigado pela prefer�ncia!");
					break;
				case 1:
					System.out.println("Escolha o livro:");
					livro = input.nextInt();
					switch(livro) {
						case 1:
							acao = l1.emprestar();
							System.out.println(acao ? "Boa leitura!" : "Livro indipon�vel para empr�stimo");
							break;
						case 2:
							acao = l2.emprestar();
							System.out.println(acao ? "Boa leitura!" : "Livro indipon�vel para empr�stimo");
							break;
						case 3:
							acao = l3.emprestar();
							System.out.println(acao ? "Boa leitura!" : "Livro indipon�vel para empr�stimo");
							break;
						case 4:
							acao = l4.emprestar();
							System.out.println(acao ? "Boa leitura!" : "Livro indipon�vel para empr�stimo");
							break;
						case 5:
							acao = l5.emprestar();
							System.out.println(acao ? "Boa leitura!" : "Livro indipon�vel para empr�stimo");
							break;
						default:
							System.out.println("Op��o inv�lida");
							break;
					}
					break;
				case 2:
					System.out.println("Escolha o livro:");
					livro = input.nextInt();
					switch(livro) {
						case 1:
							acao = l1.devolver();
							System.out.println(acao ? "Esperamos que tenha gostado do livro" : "Livro dispon�vel para empr�stimo");
							break;
						case 2:
							acao = l2.devolver();
							System.out.println(acao ? "Esperamos que tenha gostado do livro" : "Livro dispon�vel para empr�stimo");
							break;
						case 3:
							acao = l3.devolver();
							System.out.println(acao ? "Esperamos que tenha gostado do livro" : "Livro dispon�vel para empr�stimo");
							break;
						case 4:
							acao = l4.devolver();
							System.out.println(acao ? "Esperamos que tenha gostado do livro" : "Livro dispon�vel para empr�stimo");
							break;
						case 5:
							acao = l5.devolver();
							System.out.println(acao ? "Esperamos que tenha gostado do livro" : "Livro dispon�vel para empr�stimo");
							break;
						default:
							System.out.println("Op��o inv�lida");
							break;
					}
					break;
				case 3:
					System.out.println("Escolha o livro:");
					livro = input.nextInt();
					switch(livro) {
						case 1:
							System.out.println(l1.showInfos());
							break;
						case 2:
							System.out.println(l2.showInfos());
							break;
						case 3:
							System.out.println(l3.showInfos());
							break;
						case 4:
							System.out.println(l4.showInfos());
							break;
						case 5:
							System.out.println(l5.showInfos());
							break;
						default:
							System.out.println("Op��o inv�lida");
							break;
					}
					break;
				default:
					System.out.println("Op��o inv�lida");
					break;
			}		
		} while(opcao != 0);
		
		System.out.println("F I M");
		
		input.close();
	}
}
