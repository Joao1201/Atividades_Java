package br.com.generation.aula03;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2, res=0.0;
		char opera;
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		num2 = entrada.nextDouble();
		System.out.println("Defina a opera��o a ser realizada: ");
		opera = entrada.next().charAt(0);
		
		if(opera == '+') {
			res = num1+num2;
		}
		else if(opera == '-') {
			res = num1-num2;
		}
		else if(opera == '*') {
			res = num1*num2;
		}
		else if(opera == '/') {
			res = num1/num2;
		}
		else {
			System.out.println("Op��o inv�lida");
		}
		
		System.out.printf("O resultado da opera��o �: %.2f", res);
		entrada.close();
	}

}