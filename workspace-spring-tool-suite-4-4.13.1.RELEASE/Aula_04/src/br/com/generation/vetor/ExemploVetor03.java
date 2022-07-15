package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[4];
		double soma=0.0, media=0.0;
		
		System.out.println("Digite as 4 notas do aluno");
		for(int i=0; i<4; i++) {
			System.out.print(i+1+"ª: ");
			notas[i] = entrada.nextDouble();
			soma = soma+notas[i];
			media = soma/4;
		}
		System.out.println();
		System.out.println("A média anual do aluno é: "+media);
		entrada.close();
	}

}
