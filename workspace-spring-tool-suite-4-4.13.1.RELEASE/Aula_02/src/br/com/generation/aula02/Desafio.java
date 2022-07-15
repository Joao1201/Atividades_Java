package br.com.generation.aula02;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite a quantidade de galões: ");
		galoes = leia.nextDouble();
		
		litros = galoes*5;
		
		System.out.println(galoes+" Galões são: "+litros+" Litros.");
		leia.close();
	}

}
