package br.com.generation.metodos;

import java.util.Scanner;

public class Metodos {

	//Variaveis globais
	static int multiplicacao, num3, num4;
	static double num7, num8;
	//M�todo ou fun��o inicio
	public static void main(String[] args) {

		scanner();
		metodo01();
		metodo02();
		metodo03();
		metodo04(15,6);
		metodo05(num7,num8);
		metodo07();
		
	}
	
	public static void scanner() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1� valor: ");
		num7 = entrada.nextDouble();
		System.out.print("Digite o 2� valor: ");
		num8 = entrada.nextDouble();
		entrada.close();
		
	}
	//Subrotina
	public static void metodo01() {
		System.out.println("Ol� eu sou o m�todo 01!");
	}
	public static void metodo02() {
		double soma, num1=10, num2=20;
		soma = num1+num2;
		System.out.println("Soma no m�todo 02: "+soma);
		num3=7;
		num4=8;
		multiplicacao = num3*num4;
		System.out.println("Resultado da multiplica��o no m�todo 02: "+multiplicacao);
	}
	public static void metodo03() {
		num3=5;
		num4=7;
		multiplicacao = num3*num4;
		System.out.println("Resultado da multiplica��o no m�todo 03: "+multiplicacao);
	}
	public static void metodo04(int num5, int num6) {
		int subtracao = num5-num6;
		System.out.println("Resultado da subtra��o no m�todo 04: "+subtracao);
	}
	public static void metodo05(double num7, double num8) {
		double divisao = num7/num8;
		System.out.printf("Resultado da divis�o no m�todo 05: %.2f",divisao,"\n");
	}
	public static void metodo07() {
		Scanner entrada2 = new Scanner(System.in);
		int num9, num10;
		System.out.print("\nDigite um valor para inicio da contagem: ");
		num9 = entrada2.nextInt();
		System.out.print("Digite um valor para fim da contagem ");
		num10 = entrada2.nextInt();
		System.out.println("\nContagem do m�todo 06: que esta na classe M�todo Externo: \n"+ MetodosExterno.metodo06(num9, num10));
		entrada2.close();
	}

}
