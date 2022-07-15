package br.com.generation.vetor;

public class ExemploVetor02 {

	public static void main(String[] args) {
		
		double minhaNota = 8.5, minhaNota2;
		double[] notas = new double[3];
		
		notas[0] = 9.6;
		notas[1] = minhaNota;
		notas[2] = 7.3;
		minhaNota2 = notas[2];
		
		System.out.println("O vetor na posição [0] contém: "+notas[0]);
		System.out.println("O vetor na posição [1] contém: "+notas[1]);
		System.out.println("O vetor na posição [2] contém: "+minhaNota2);

	}

}
