package br.com.generation.exercicios.matrizes_vetores;

import java.util.Scanner;

public class Ex02 {/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] dado = new int[10];
		int soma=0, maior=0, j=0;
		double media=0.0;
		
		System.out.println("Registre os lançamentos do dado");
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(i+1+"º lancamento: ");
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
		System.out.println("A média dos lançamentos registrados é: "+media);
		System.out.println("A quantidade de vezes que a maior pontuação, "+maior+", se repetiu foi: "+j);
		entrada.close();
	}

}