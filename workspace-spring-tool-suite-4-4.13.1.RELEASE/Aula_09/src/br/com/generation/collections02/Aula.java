package br.com.generation.collections02;

public class Aula {
	
	//Atributos da Classe
	private String titulo;
	private int tempo;
	
	//Construtor da Classe
	public Aula(String titulo, int tempo) {
		super(); // --> Classe Object: dentro do java.lang
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//Métodos de acesso
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	//Polimorfismo do método toString que se encontra dentro da Classe String
	public String toString() {
		return "Aula: "+this.titulo+" | "+this.tempo+" minutos";
	}

}