package br.com.generation.aula03;

import java.util.Scanner;

public class ExemploLaçoCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1+nota2)/2;
		System.out.println();
		//Laço Condicional
		if(media>=6.0 && media<=10) {
			System.out.println("Média: "+media);
			System.out.println("Aprovado!");
		}
		else if(media>=3.0 && media<6.0){
			System.out.println("Média: "+media);
			System.out.println("Recuperação");
		}
		else if(media>=0 && media<3.0){
			System.out.println("Média: "+media);
			System.out.println("Reprovado");
		}
		else {
			System.out.println("Valores Inválidos");
		}
		leia.close();
	}

}
