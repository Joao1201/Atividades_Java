package Atividades;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, total;
		
		System.out.println("Digite sua idade");
		System.out.println("Anos: ");
		anos = entrada.nextInt();
		anos = anos *365;
		
		System.out.println("Meses: ");
		meses = entrada.nextInt();
		meses = meses * 30;
		
		System.out.println("Dias: ");
		dias = entrada.nextInt();
		
		total = anos+meses+dias;
		System.out.println();
		System.out.println("O total de dias já vividos é: "+total);
		
		entrada.close();

	}

}
