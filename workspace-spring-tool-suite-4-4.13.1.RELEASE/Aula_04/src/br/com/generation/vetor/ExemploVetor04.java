package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {
		
		Scanner entradaVetor = new Scanner(System.in);
		System.out.print("Entre com o tamanho do vetor: ");
		int tamanhoVetor = entradaVetor.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		System.out.println("Entre com os valores do Vetor");
		for(int i=0; i<tamanhoVetor; i++) {
			System.out.print(i+1+"ª: ");
			vetor[i] = entradaVetor.nextInt();
		}
		System.out.println();
		for(int i=0; i<tamanhoVetor; i++) {
			System.out.println("Posição "+(i+1)+": "+vetor[i]);
		}
		entradaVetor.close();
	}

}
