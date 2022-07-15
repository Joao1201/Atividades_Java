package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		
		String aula1 = "Bloco I - Back do BackEnd";
		String aula2 = "Bloco II - SpringBoot BackEnd";
		String aula3 = "Bloco III - FrontEnd";
		String aula4 = "Bloco IV - Java Mobile";
		
		//<tipo de dado dentro da lista>
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);//[0]
		aulas.add(aula2);//[1]
		aulas.add(aula3);//[2]
		aulas.add(aula4);//[3]
		
		/*System.out.println(aulas);
		aulas.remove(2);//removendo a posição 2 // ao apagar a posição 0 a posição 1 toma o seu lugar
		System.out.println(aulas);*/
		
		//For --> each
		for(String i: aulas) {
			System.out.print("Aula: "+i);
		}
		
		/*String segundaAula = aulas.get(1);//posição na lista
		System.out.println(aulas.get(0));
		System.out.println(segundaAula);*/
		
		/*for(int i=0; i<aulas.size(); i++) {
			System.out.println(i+1+"ª Aula: "+aulas.get(i));
		}*/
		
		//System.out.println(aulas.size()); //tamanho da lista
		
		/*Collections.sort(aulas); //organiza a lista de forma crescente/alfabética
		System.out.println(aulas);
		
		Collections.shuffle(aulas);//embaralha a lista
		System.out.println(aulas);*/
	}

}
