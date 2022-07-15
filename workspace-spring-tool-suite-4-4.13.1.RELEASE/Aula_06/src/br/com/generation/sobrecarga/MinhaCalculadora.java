package br.com.generation.sobrecarga;

public class MinhaCalculadora {
	
	public int soma(int num1, int num2) {
		System.out.println("Soma de Inteiros:");
		return num1+num2;
	}

	public double soma(double num1, double num2) {
		System.out.println("Soma de Fracionários:");
		return num1+num2;
	}
}