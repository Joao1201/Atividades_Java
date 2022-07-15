package br.com.generation.polimorfismo02;

import java.util.Scanner;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Tigre(nome, idade));
		System.out.println();
		t.fazerAnimalComer(new Cachorro());

		scan.close();
	}

}