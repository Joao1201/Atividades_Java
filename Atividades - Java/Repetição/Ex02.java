package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Ex02 {/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num=0, par=0, impar=0;
		
		System.out.println("Entre com os n�meros");
		for(int i=1; i<=10; i++) {
			System.out.print(i+"�: ");
			num = entrada.nextInt();
			if(num%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println();
		System.out.println("A quantidade de n�meros pares �: "+par);
		System.out.println("A quantidade de n�meros �mpares �: "+impar);
		entrada.close();

	}

}