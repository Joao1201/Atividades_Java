package br.com.generation.aula03;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra entre a e d: ");
		String letra = entrada.nextLine();
		
		System.out.println();
		switch(letra) {
			case "a", "A":
				System.out.println("Ana");
				break;
			case "b":
				System.out.println("Bruna");
				break;
			case "c":
				System.out.println("Cristina");
				break;
			case "d":
				System.out.println("Diana");
				break;
			default:
				System.out.println("Letra inválida");
				break;
		}
		entrada.close();

	}

}
