package br.com.generation.aula03;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2, res=0.0;
		char opera;
		
		System.out.println("Digite o 1º número: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o 2º número: ");
		num2 = entrada.nextDouble();
		System.out.println("Defina a operação a ser realizada: ");
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
			System.out.println("Opção inválida");
		}
		
		System.out.printf("O resultado da operação é: %.2f", res);
		entrada.close();
	}

}