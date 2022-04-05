package br.com.generation.exercicios.matrizes_vetores;

import java.util.Scanner;

public class Ex03 {/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		
		System.out.println("Digite os valores da matriz N1");
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				System.out.print("Valor: ");
				N1[i][j] = entrada.nextInt();
			}
			System.out.println();
		}
		System.out.println("Digite os valores da matriz N2");
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				System.out.print("Valor: ");
				N2[i][j] = entrada.nextInt();
			}
			System.out.println();
		}
		System.out.println("--MATRIZ M1--");
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				M1[i][j] = N1[i][j]+N2[i][j];
				System.out.print("|"+M1[i][j]+"| ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("--MATRIZ M2--");
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				M2[i][j] = N1[i][j]-N2[i][j];
				System.out.print("|"+M2[i][j]+"| ");
			}
			System.out.println();
		}
		entrada.close();
	}

}
