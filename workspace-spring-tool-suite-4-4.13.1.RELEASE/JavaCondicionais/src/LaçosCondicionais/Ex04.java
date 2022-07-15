package LaçosCondicionais;

import java.util.Scanner;

public class Ex04 {/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num, pot;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		System.out.println();
		if(num%2 == 0) {
			
			System.out.println("O número "+num+" é par!");
			System.out.printf("A raíz quadrada de "+num+" é: %.2f", Math.sqrt(num));
		}
		else {
			pot = num*num;
			System.out.println("O número "+num+" é ímpar!");
			System.out.printf("A potência ^2 de "+num+" é: "+pot);
		}
		entrada.close();

	}

}
