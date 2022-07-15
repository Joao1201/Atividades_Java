package br.com.generation.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.print("Quantos alunos deseja adicionar: ");
		int numAlunos = sc.nextInt();
		
		System.out.println();
		for(int i=0; i<numAlunos; i++) {
			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();
			sc.nextLine();//consome/pula linha
			System.out.print("Idade do aluno: ");
			int idade = sc.nextInt();
			
			alunos.add(new Aluno(nome, idade));
		}
		System.out.println();
		for(Aluno i: alunos) {
			System.out.println(i);
		}
		sc.close();
	}

}
