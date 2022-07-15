package br.com.generation.collections02;

import java.util.ArrayList;

public class TestaAulas {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Geografia", 60);
		Aula a2 = new Aula("Matemática", 120);
		Aula a3 = new Aula("Português", 90);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
	}

}
