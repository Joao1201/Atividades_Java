package Atividades;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int h, m, s, tot;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		tot = entrada.nextInt();
		
		h = tot/3600;
		tot = tot%3600;
		m = tot/60;
		tot = tot%60;
		s = tot; 
		
		System.out.println();
		System.out.println("A quantidade de horas �: "+h+" hora(s)");
		System.out.println("A quantidade de minutos �: "+m+" minuto(s)");
		System.out.println("A quantidade de segundos �: "+s+" segundo(s)");
		entrada.close();

	}

}
