package br.com.generation.vetor;

public class ExemploVetor02 {

	public static void main(String[] args) {
		
		double minhaNota = 8.5, minhaNota2;
		double[] notas = new double[3];
		
		notas[0] = 9.6;
		notas[1] = minhaNota;
		notas[2] = 7.3;
		minhaNota2 = notas[2];
		
		System.out.println("O vetor na posi��o [0] cont�m: "+notas[0]);
		System.out.println("O vetor na posi��o [1] cont�m: "+notas[1]);
		System.out.println("O vetor na posi��o [2] cont�m: "+minhaNota2);

	}

}
