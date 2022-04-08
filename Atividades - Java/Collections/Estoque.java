package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("ESTOQUE DA LOJA DO BRANCO");
		System.out.println("=========================\n");
		
		String produto1 = "Brinquedos";
		String produto2 = "Produtos de Limpeza";
		String produto3 = "Artigos para festa";
		String produto4 = "Artigos para cozinha";
		
		ArrayList<String> loja = new ArrayList<>();
		
		loja.add(produto1);
		loja.add(produto2);
		loja.add(produto3);
		loja.add(produto4);
		
		System.out.println("ESTOQUE DESATUALIZADO:");
		System.out.println("----------------------");
		for(String i: loja) {
			System.out.println("Produto: "+i);
		}
		System.out.println();
		
		loja.remove(3);
		loja.remove(1);
		
		System.out.println("ESTOQUE ATUALIZADO:");
		System.out.println("----------------------");
		for(String i: loja) {
			System.out.println("Produto: "+i);
		}
		leia.close();
	}

}
