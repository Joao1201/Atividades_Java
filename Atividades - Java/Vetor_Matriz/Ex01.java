package br.com.generation.exercicios.matrizes_vetores;

import java.util.Scanner;

public class Ex01 {/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[5];
		double maior=0.0;
		
		System.out.println("DIGITE AS PONTUA��ES DA ATIVIDADE");
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"� nota: ");
			notas[i] = entrada.nextDouble();
			
			if(notas[i]>maior) {
				maior = notas[i];
			}
		}
		System.out.println();
		for(int i=0; i<5; i++) {
		System.out.print("|"+notas[i]+"| ");
		}
		System.out.println();
		System.out.println();
		System.out.println("A maior pontua��o da atividade foi: "+maior);
		entrada.close();
	}

}
