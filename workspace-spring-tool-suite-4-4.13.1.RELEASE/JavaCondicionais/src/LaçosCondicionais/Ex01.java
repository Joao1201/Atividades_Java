package La�osCondicionais;

import java.util.Scanner;

public class Ex01 {/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3, maior; 
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		n2 = entrada.nextInt();
		System.out.println("Digite o 3� n�mero: ");
		n3 = entrada.nextInt();
		
		maior = n1;
		if(n2>n1) {
			maior = n2;
		}
		if(n3>n1) {
			maior = n3;
		}
		System.out.println();
		System.out.println("O n�mero "+maior+" foi o maior n�mero digitado!");
		entrada.close();

	}

}