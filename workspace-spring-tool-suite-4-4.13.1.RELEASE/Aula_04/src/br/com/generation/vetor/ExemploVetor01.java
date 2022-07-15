package br.com.generation.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) throws InterruptedException {
		//Vetor --> coleção de dados..
		
		int[] arrayVetor = new int[5];//[0]..[4]
		
		//Vetor --> é um array de uma única dimensão..
		
		arrayVetor[0] = 5;
		arrayVetor[3] = 250;
		for(int i=0; i<5; i++) {
			System.out.println("Posição "+i+":" +" | "+arrayVetor[i]);
			Thread.sleep(500);
		}
	}

}
