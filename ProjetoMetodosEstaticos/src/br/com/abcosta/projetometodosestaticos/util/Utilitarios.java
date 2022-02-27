package br.com.abcosta.projetometodosestaticos.util;

public class Utilitarios {
	public static final double PI = 3.1415;
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double potencia(double a, int e) {
		double resultado = 1;
		for(int i = 0; i < e; i++) {
			resultado *= a;
		}
		return resultado;
	}	
}
