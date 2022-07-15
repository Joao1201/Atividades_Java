package br.com.generation.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaException {

	private static boolean InputMismatchException = false;
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[4];//[0]..[1]..[2]..[3]

		try {//Tente
		System.out.println("Digite um valor: ");
	    vetor[2] = entrada.nextInt();
		vetor[4] = 10;		
		System.out.println(vetor[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {//pegar - catar
			System.out.println("Erro no código na linha 9, tente fazer login novamente");
		}
		catch(InputMismatchException f) {
			System.out.println("Não podemos adicionar letras... no sistema");	
			
			while(InputMismatchException == true) {				
				System.out.println("Digite um valor: ");
				vetor[2] = entrada.nextInt();
			}					
		}
	}		
}
