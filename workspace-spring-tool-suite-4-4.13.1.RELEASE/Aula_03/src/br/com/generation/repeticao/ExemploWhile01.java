package br.com.generation.repeticao;

public class ExemploWhile01 {

	public static void main(String[] args) throws InterruptedException {
		
		int cont=0;//inicialização da variável
		
		//enquanto
		while(cont<=10) {//condição
			System.out.println("Repetição: "+cont);
			cont++;
			Thread.sleep(1000);
		}

	}

}