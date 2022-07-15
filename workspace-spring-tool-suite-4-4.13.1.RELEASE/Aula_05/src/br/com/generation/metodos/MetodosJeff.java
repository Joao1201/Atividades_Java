package br.com.generation.metodos;

import java.util.Scanner;

public class MetodosJeff {
	//variaveis globais
	static int multiplicacao, numero3, numero4;
	static double numero7, numero8;

	//Método ou função principal
	public static void main(String[] args) {
		scanner();		
		metodo01();
		metodo02();
		metodo03();
		metodo04();
		metodo05();
		metodo06(10, 6);
		metodo07(numero7, numero8);
		metodo09();
		
	}
	
	public static void scanner() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º valor: ");
		numero7 = entrada.nextDouble();
		System.out.println("Digite o 2º valor: ");
		numero8 = entrada.nextDouble();
		entrada.close();
	}
	
	//Subrotina
	public static void metodo01() {
		System.out.println("Olá eu sou o método 01!");
	}
	
	public static void metodo02() {
		double soma, numero1 = 10, numero2 = 20;
		soma = numero1 + numero2;
		System.out.println("Soma no método 02: " + soma);
	}
	
	public static void metodo03() {
		numero3 = 5;
		numero4 = 2;
		multiplicacao = numero3 * numero4;
	}
	
	public static void metodo04() {
		System.out.println("Resultado da multiplicação do metodo03 no metodo04: " + multiplicacao);
	}
	
	public static void metodo05() {
		numero3 = 6;
		numero4 = 7;
		multiplicacao = numero3 * numero4;
		System.out.println("Resultado da multiplicação dentro do metodo 05: " + multiplicacao);
	}
	
	public static void metodo06(int numero5, int numero6) {
		int subtracao = numero5 - numero6;
		System.out.println("Resultado da subtração no metodo06: " + subtracao);
	}
	
	public static void metodo07(double num7, double num8) {
		double divisao = num7 / num8;
		System.out.printf("Resultado da divisão no método 07: %.2f" , divisao , "\n");
		System.out.println();
	}
	
	public static void metodo09() {
		Scanner input = new Scanner(System.in);
		int numero10, numero11;
		System.out.println("Digite um número para contagem inicial: ");
		numero10 = input.nextInt();
		System.out.println("Digite um número para contagem final: ");
		numero11 = input.nextInt();
		System.out.println("Contagem dos número do metodo 08 que está na classe" + 
				" MetodoExterno: \n" + MetodoExternoJeff.metodo08(numero10,numero11));
		input.close();
	}
}