package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Ex05 {/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num=1, soma=0;
		
		do {
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			soma = soma+num;
			
		}while(num!=0);
		System.out.println();
		System.out.println("A soma dos números digitados é: "+soma);
		entrada.close();
	}

}