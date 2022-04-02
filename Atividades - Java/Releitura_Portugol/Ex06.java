package Atividades;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x1, x2, y1, y2;
		
		System.out.println("Digite o ponto x1: ");
		x1 = entrada.nextInt();
		
		System.out.println("Digite o ponto y1: ");
		y1 = entrada.nextInt();
		
		System.out.println("Digite o ponto x2: ");
		x2 = entrada.nextInt();
		
		System.out.println("Digite o ponto y2: ");
		y2 = entrada.nextInt();
		
		System.out.println();
		System.out.printf("O resultado da operação é: %.2f", Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
		entrada.close();
	}

}
