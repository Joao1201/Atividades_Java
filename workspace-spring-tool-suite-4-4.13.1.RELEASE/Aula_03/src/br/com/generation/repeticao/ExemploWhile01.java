package br.com.generation.repeticao;

public class ExemploWhile01 {

	public static void main(String[] args) throws InterruptedException {
		
		int cont=0;//inicializa��o da vari�vel
		
		//enquanto
		while(cont<=10) {//condi��o
			System.out.println("Repeti��o: "+cont);
			cont++;
			Thread.sleep(1000);
		}

	}

}