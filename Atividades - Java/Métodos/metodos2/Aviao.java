package br.com.generation.exer.metodos2;
/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

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
