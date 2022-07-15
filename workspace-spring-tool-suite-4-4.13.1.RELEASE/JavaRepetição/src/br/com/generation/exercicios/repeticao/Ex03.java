package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Ex03 {/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int cont=0, i=0, total21=0, total50=0;
		
		System.out.println("Digite as idades (Para encerrar digite -99)");
		while(cont!=-99) {
			i++;
			System.out.print(i+"ª: ");
			cont = entrada.nextInt();
			if(cont<21 && cont>0) {
				total21++;
			}
			if(cont>50) {
				total50++;
			}
				
		}
		System.out.println();
		System.out.println("Quantidade de pessoas com menos de 21 anos: "+total21);
		System.out.println("Quantidade de pessoas com mais de 50 anos: "+total50);
		entrada.close();

	}

}