package Atividades;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, total;
		
		System.out.println("Digite a quantidade de dias: ");
		total = entrada.nextInt();
		
		anos = total/365;
		total = total%365;
		meses = total/30;
		total = total%30;
		dias = total;
		
		System.out.println();
		System.out.println("A quantidade de anos �: "+anos+" anos");
		System.out.println("A quantidade de meses �: "+meses+" meses");
		System.out.println("A quantidade de dias �: "+dias+" dias");
		entrada.close();

	}

}