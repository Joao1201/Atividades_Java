package br.com.generation.polimorfismo02;

public class Tigre extends Animal{
	
	Tigre(String n, int i){
		nome = n;
		idade = i;
		System.out.println("Nome do Tigre: "+nome);
		System.out.println("Idade do Tigre: "+idade);
	}
	
	//Polimorfismo...sobrescrita de método
	public void comer() {
		System.out.println(nome+" está comendo..");
	}

}