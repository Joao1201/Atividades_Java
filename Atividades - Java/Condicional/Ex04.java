package La�osCondicionais;

import java.util.Scanner;

public class Ex04 {/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num, pot;
		
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		
		System.out.println();
		if(num%2 == 0) {
			
			System.out.println("O n�mero "+num+" � par!");
			System.out.printf("A ra�z quadrada de "+num+" �: %.2f", Math.sqrt(num));
		}
		else {
			pot = num*num;
			System.out.println("O n�mero "+num+" � �mpar!");
			System.out.printf("A pot�ncia ^2 de "+num+" �: "+pot);
		}
		entrada.close();

	}

}
