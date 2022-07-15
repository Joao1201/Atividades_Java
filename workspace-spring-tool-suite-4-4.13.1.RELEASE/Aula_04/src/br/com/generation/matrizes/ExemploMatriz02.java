package br.com.generation.matrizes;

import java.util.Scanner;

public class ExemploMatriz02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas: ");
		int linhas = entrada.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int colunas = entrada.nextInt();
		System.out.println();
		
		double[][] notasAlunos1 = new double[linhas][colunas];
		
		System.out.println("---- NOTAS DOS ALUNOS ----");
		System.out.println();
		for(int l=0; l<notasAlunos1.length; l++) {
			for(int c=0; c<notasAlunos1[l].length; c++) {
				System.out.printf("Digite as notas [%d][%d]: ", l, c);
				notasAlunos1[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		for(int l=0; l<notasAlunos1.length; l++) {
			for(int c=0; c<notasAlunos1[l].length; c++) {
				System.out.print(notasAlunos1[l][c]+" | ");
			}
			System.out.println();
		}
		entrada.close();
	}

}