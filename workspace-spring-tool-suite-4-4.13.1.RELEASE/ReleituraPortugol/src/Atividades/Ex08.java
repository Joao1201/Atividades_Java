package Atividades;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08 {

	public static void main(String[] args) {
		
		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
				
		
		Scanner entrada = new Scanner(System.in);
		double fabrica, consumidor, j1, j2;
		
		System.out.println("Digite o custo de fábrica: ");
		fabrica = entrada.nextInt();
		
		j1 = fabrica*0.28;
		j2 = fabrica*0.45;
		
		consumidor = fabrica+j1+j2;
		
		System.out.println();
		System.out.println("O custo ao consumidor é de: R$"+df.format(consumidor));
		entrada.close();

	}

}
