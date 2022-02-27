package br.com.abcosta.projetometodosestaticos.util;

public class Utilitarios {
	public double soma(double a, double b) {
		return a + b;
	}
	public double subtracao(double a, double b) {
		return a - b;
	}
	public double multiplicacao(double a, double b) {
		return a * b;
	}
	public double divisao(double a, double b) {
		return a / b;
	}
	public double potencia(double a, int e) {
		double resultado = 1;
		for(int i = 0; i < e; i++) {
			resultado *= a;
		}
		return resultado;
	}	
}
