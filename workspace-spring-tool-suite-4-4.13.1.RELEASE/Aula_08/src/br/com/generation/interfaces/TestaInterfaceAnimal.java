package br.com.generation.interfaces;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Gato g1 = new Gato();
		
		c1.somAnimal();
		c1.dormir();
		System.out.println();
		g1.somAnimal();
		g1.dormir();

	}

}
