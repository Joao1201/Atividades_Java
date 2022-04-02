package LaçosCondicionais;

import java.util.Scanner;

public class Ex01 {/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3, maior; 
		
		System.out.println("Digite o 1º número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o 2º número: ");
		n2 = entrada.nextInt();
		System.out.println("Digite o 3º número: ");
		n3 = entrada.nextInt();
		
		maior = n1;
		if(n2>n1) {
			maior = n2;
		}
		if(n3>n1) {
			maior = n3;
		}
		System.out.println();
		System.out.println("O número "+maior+" foi o maior número digitado!");
		entrada.close();

	}

}