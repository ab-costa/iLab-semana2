package br.com.abcosta.projetolojavirtual.ui;

import br.com.abcosta.projetolojavirtual.core.Cliente;
import br.com.abcosta.projetolojavirtual.core.Pedido;
import br.com.abcosta.projetolojavirtual.core.Produto;

public class Main {
	public static void main(String[] args) {
		Produto mostruario[] = new Produto[3];
		
		mostruario[0] = new Produto(1001, "Produto um", 15.00);
		mostruario[1] = new Produto(1002, "Produto dois", 25.00);
		mostruario[2] = new Produto(1003, "Produto três", 75.00);
		
		Cliente clientes[] = new Cliente[2];
		
		clientes[0] = new Cliente(2001, "Cliente Um", "clienteUm@email.com");
		clientes[1] = new Cliente(2002, "Cliente Dois", "clienteDois@email.com");
		
		Pedido pedido = new Pedido("28/02/2022", clientes[0], mostruario[2]);
		
		System.out.println(pedido.showInfos());
	}
}
