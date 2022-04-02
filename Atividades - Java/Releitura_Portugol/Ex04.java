package Atividades;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int A, B, C, R, S, D;
		
		System.out.println("Digite o valor de A: ");
		A = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = entrada.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = entrada.nextInt();
		
		R = (A+B)*(A+B);
		S = (B+C)*(B+C);
		
		D = (R+S)/2;
		System.out.println();
		System.out.println("O valor da operação D=(R+S)/2 é: "+D);

		entrada.close();
	}

}
