package br.com.generation.aula03;

import java.util.Scanner;

public class ExemploLa�oCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1� nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1+nota2)/2;
		System.out.println();
		//La�o Condicional
		if(media>=6.0 && media<=10) {
			System.out.println("M�dia: "+media);
			System.out.println("Aprovado!");
		}
		else if(media>=3.0 && media<6.0){
			System.out.println("M�dia: "+media);
			System.out.println("Recupera��o");
		}
		else if(media>=0 && media<3.0){
			System.out.println("M�dia: "+media);
			System.out.println("Reprovado");
		}
		else {
			System.out.println("Valores Inv�lidos");
		}
		leia.close();
	}

}
