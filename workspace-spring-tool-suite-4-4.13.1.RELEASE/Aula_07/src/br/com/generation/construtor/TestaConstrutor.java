package br.com.generation.construtor;

import java.util.Scanner;

public class TestaConstrutor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String n = entrada.next();
		System.out.print("Digite a idade: ");
		int i = entrada.nextInt();
		
		Pessoa p1 = new Pessoa(n, i);
		
		System.out.println();
		System.out.println(p1.nome);
		System.out.println(p1.idade+" anos");
		entrada.close();
	}

}