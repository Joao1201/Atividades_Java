package br.com.generation.exer.metodos1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		
		cl1.nome = "João";
		cl1.idade = 23;
		cl1.telefone = "(00)00000-0000";
		cl1.endereço = "Rua Antonio dos Santos, 00\n";
		
		System.out.println("Nome: "+cl1.nome);
		System.out.println("Idade: "+cl1.idade);
		System.out.println("Telefone: "+cl1.telefone);
		System.out.println("Endereço: "+cl1.endereço);
		System.out.print("Cliente deseja comprar: ");cl1.comprar();
		System.out.print("Motivo de troca: ");cl1.trocar();

	}

}
