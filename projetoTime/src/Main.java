import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Time t = new Time();
		
		t.setTime(23, 47, 0);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHorasUniversal());
		
		t.setTime(23, 47);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHorasUniversal());
		
		t.setTime(23);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHorasUniversal());
		
		input.close();
	}
}
