package br.com.generation.classes01;

public class Veiculo {

	//Atributos --> características --> variaveis
	String marca;
	String cor;
	String tipo;
	String modelo;
	int ano;
	int velocidade;
	
	//verbos --> ações --> Métodos
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void frear(int freagem) {
		velocidade = velocidade-freagem;
	}
	
}