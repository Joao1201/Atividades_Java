package br.com.generation.exer.metodos2;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Aviao {
	
	String empresa;
	String destino;
	String partida;
	int passageiros;
	double tempo;
	
	void cancelado() {
		System.out.println("Confirmado");
	}
	
	void paradas() {
		System.out.println("2 paradas");
	}
	
}
