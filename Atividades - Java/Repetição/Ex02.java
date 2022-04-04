package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Ex02 {/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num=0, par=0, impar=0;
		
		System.out.println("Entre com os números");
		for(int i=1; i<=10; i++) {
			System.out.print(i+"º: ");
			num = entrada.nextInt();
			if(num%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println();
		System.out.println("A quantidade de números pares é: "+par);
		System.out.println("A quantidade de números ímpares é: "+impar);
		entrada.close();

	}

}