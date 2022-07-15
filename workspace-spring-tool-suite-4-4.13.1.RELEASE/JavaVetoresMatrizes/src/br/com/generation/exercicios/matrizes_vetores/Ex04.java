package br.com.generation.exercicios.matrizes_vetores;

import java.util.Scanner;

public class Ex04 {/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[][] m1 = new int[3][3];
		int soma=0, somaP=0;
		
		System.out.println("Entre com os valores da Matriz");
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("Valores [%d][%d]: ", i, j);
				m1[i][j] = entrada.nextInt();
				soma = soma+m1[i][j];
			}
			System.out.println();
		}
		somaP = m1[0][0]+m1[1][1]+m1[2][2];
		System.out.println();
		System.out.println("A soma dos valores da matriz é igual a: "+soma);
		System.out.println("A soma dos valores da diagonal principal é: "+somaP);
		entrada.close();
	}

}