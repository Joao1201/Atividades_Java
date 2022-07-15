package Atividades;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("Digite a 1ª nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite a 3ª nota: ");
		n3 = entrada.nextDouble();
		
		n1 = n1*0.2;
		n2 = n2*0.3;
		n3 = n3*0.5;
		media = n1+n2+n3;
		
		System.out.println();
		if(media>=6 && media <=10) {
			System.out.println("Média do aluno: "+media);
			System.out.println("Aprovado!");
		}
		else if(media>=0 && media<6) {
			System.out.println("Média do aluno: "+media);
			System.out.println("Reprovado!");
		}
		else {
			System.out.println("Valores inválidos");
		}
		entrada.close();
		
	}

}
