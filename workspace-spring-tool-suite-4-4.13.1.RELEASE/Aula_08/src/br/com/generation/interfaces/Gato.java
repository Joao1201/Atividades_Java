package br.com.generation.interfaces;

public class Gato implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do gato: miau miau");		
	}

	@Override //Sobrescrita de método
	public void dormir() {
		System.out.println("O gato está dormindo..");		
	}

}
