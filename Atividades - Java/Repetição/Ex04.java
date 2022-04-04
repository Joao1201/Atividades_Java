package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Ex04 {/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i=1, idade=0, sexo=0, comp;
		int tot1=0, tot2=0, tot3=0, tot4=0, tot5=0, tot6=0;
		
		System.out.println("  PESQUISA DE CARACTERÍSTICAS  ");
		System.out.println();
		
		while(i<=150) {
			System.out.print("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.print("Digite seu sexo (1)Feminino, (2)Masculino ou (3)Outros: ");
			sexo = entrada.nextInt();
			System.out.print("Você se considera uma pessoa (1)Calma, (2)Nervosa ou (3)Agressiva: ");
			comp = entrada.nextInt();
			System.out.println();
			i++;
			
			if(comp==1) {
				tot1++;
			}
			if(sexo==1 && comp==2) {
				tot2++;
			}
			if(sexo==2 && comp==3) {
				tot3++;
			}
			if(sexo==3 && comp==1) {
				tot4++;
			}
			if(idade>40 && comp==2) {
				tot5++;
			}
			if(idade<18 && comp==1) {
				tot6++;
			}
		}
		System.out.println();
		System.out.println("Número de pessoas calmas: "+tot1);
		System.out.println("Número de mulheres nervosas: "+tot2);
		System.out.println("Número de homens agressivos: "+tot3);
		System.out.println("Número de outros calmos: "+tot4);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+tot5);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+tot6);
		entrada.close();

	}

}