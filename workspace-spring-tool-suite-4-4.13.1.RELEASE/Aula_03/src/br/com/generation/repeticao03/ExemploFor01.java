package br.com.generation.repeticao03;

public class ExemploFor01 {

	public static void main(String[] args) throws InterruptedException {
		
		//inicialição;condição;incremento
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}

	}

}
