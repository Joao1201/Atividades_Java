package La�osCondicionais;

import java.util.Scanner;

public class Ex02 {/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite o 1� n�mero");
		n1 = entrada.nextInt();
		System.out.println("Digite o 2� n�mero");
		n2 = entrada.nextInt();
		System.out.println("Digite o 3� n�mero");
		n3 = entrada.nextInt();
		
		if(n1<n2 && n1<n3) {
			if(n2<n3) {
				System.out.println(n1+" --> "+n2+" --> "+n3);
			}
			else if(n3 < n2) {
				System.out.println(n1+" --> "+n3+" --> "+n2);
			}
		}
		if(n2<n1 && n2<n3) {
			if(n1<n3) {
				System.out.println(n2+" --> "+n1+" --> "+n3);
			}
			else if(n3 < n1) {
				System.out.println(n2+" --> "+n3+" --> "+n1);
			}
		}
		if(n3<n1 && n3<n2) {
			if(n1<n2) {
				System.out.println(n3+" --> "+n1+" --> "+n2);
			}
			else if(n2 < n1) {
				System.out.println(n3+" --> "+n2+" --> "+n1);
			}
		}
		entrada.close();
	}

}
