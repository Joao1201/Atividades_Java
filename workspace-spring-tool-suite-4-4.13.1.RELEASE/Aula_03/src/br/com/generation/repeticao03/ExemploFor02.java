package br.com.generation.repeticao03;

public class ExemploFor02 {

	public static void main(String[] args) {
		
		int n=10, i, soma, res;
		
		for(i=0, soma=0; i<=n; i++, soma++) {
			System.out.print("Soma: "+soma+" + "+i);
			res = soma+i;
			System.out.println(" = "+ res);
		}

	}

}
