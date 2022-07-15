package br.com.generation.repeticao;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		
		int cont = 10;
		
		while(cont>=0) {
			System.out.println("Repetição: "+cont);
			cont--;	
			Thread.sleep(500);
		}

	}

}
