package br.com.generation.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num=0;
		
		while(num!=10) {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if(num==10) {
				System.out.println("Você acertou!");
			}
			else {
				System.out.println("Você errou!");
			}
		}
		
		entrada.close();
	}

}
