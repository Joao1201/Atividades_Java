package br.com.generation.aula02;

public class ExemploVariavel02 {

	public static void main(String[] args) {
		
		int var1; //variavel inteiro
		double var2; //variavel real
		
		var1 = 10;
		var2 = 10.0;
		
		System.out.println("Valor original da 1ª variável: "+var1);
		System.out.println("Valor original da 2ª variável: "+var2);
		System.out.println();
		
		var1 = var1/4;
		var2 = var2/4;
		
		System.out.println("Valor da 1ª variável após a divisão: "+var1);
		System.out.println("Valor da 2ª variável após a divisão: "+var2);
		
	}

}
