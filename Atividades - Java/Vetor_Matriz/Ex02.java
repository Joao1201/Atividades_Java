package br.com.generation.exercicios.matrizes_vetores;

import java.util.Scanner;

public class Ex02 {/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] dado = new int[10];
		int soma=0, maior=0, j=0;
		double media=0.0;
		
		System.out.println("Registre os lan�amentos do dado");
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(i+1+"� lancamento: ");
			dado[i] = entrada.nextInt();
			soma = soma + dado[i];
			
			if(dado[i]>maior) {
				maior = dado[i];
			}
		}
		for(int i=0; i<10; i++) {
			if(dado[i]==maior) {
				j++;
			}
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print("|"+dado[i]+"| ");
		}
		media = soma/10.0;
		System.out.println();
		System.out.println();
		System.out.println("A m�dia dos lan�amentos registrados �: "+media);
		System.out.println("A quantidade de vezes que a maior pontua��o, "+maior+", se repetiu foi: "+j);
		entrada.close();
	}

}