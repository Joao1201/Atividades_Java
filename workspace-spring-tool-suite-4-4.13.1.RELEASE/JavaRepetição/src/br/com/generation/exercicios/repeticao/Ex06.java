package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Ex06 {/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i=1, num=0, a=0, media=0;
		
		do {
			System.out.print("Digite um n�mero inteiro: ");
			i = entrada.nextInt();
			
			if(i%3==0 && i!=0) {
				num = num+i;
				a++;
			}
		}while(i!=0);
		
		media = num/a;
		System.out.println();
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+media);
		entrada.close();
	}

}