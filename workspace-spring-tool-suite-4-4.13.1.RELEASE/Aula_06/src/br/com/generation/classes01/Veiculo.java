package br.com.generation.classes01;

public class Veiculo {

	//Atributos --> caracter�sticas --> variaveis
	String marca;
	String cor;
	String tipo;
	String modelo;
	int ano;
	int velocidade;
	
	//verbos --> a��es --> M�todos
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void frear(int freagem) {
		velocidade = velocidade-freagem;
	}
	
}