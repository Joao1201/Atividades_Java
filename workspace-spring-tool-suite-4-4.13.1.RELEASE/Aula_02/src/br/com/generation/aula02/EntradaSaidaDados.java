package br.com.generation.aula02;

import java.util.Scanner;

public class EntradaSaidaDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);//ctrl + shift + o
		
		double a, b, soma, sub, mult, div;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		soma = a+b;
		sub = a-b;
		mult = a*b;
		div = a/b;
		
		System.out.println("A soma de A + B �: "+soma);
		System.out.println("A subtra��o de A - B �: "+sub);
		System.out.println("A multiplica��o de A * B �: "+mult);
		System.out.println("A divis�o de A / B �: "+div);
		
		leia.close();
	}

}
