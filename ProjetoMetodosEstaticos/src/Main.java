import br.com.abcosta.projetometodosestaticos.util.Utilitarios;

public class Main {
	public static void main(String[] args) {
		Utilitarios u = new Utilitarios();
		System.out.println(u.soma(13.768, 2));
		System.out.println(u.subtracao(-20, -2));
		System.out.println(u.multiplicacao(23.5, 2));
		System.out.println(u.divisao(200.8, 2));
		System.out.println(u.potencia(2, 10));
	}
}
