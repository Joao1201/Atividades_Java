package br.com.generation.exer.metodos2;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao av1 = new Aviao();
		
		av1.empresa = "Azul";
		av1.destino = "Curitiba";
		av1.partida = "São Paulo";
		av1.passageiros = 86;
		
		System.out.println("Empresa: "+av1.empresa);
		System.out.println("Destino: "+av1.destino);
		System.out.println("Partida: "+av1.partida);
		System.out.println("Quantidade de Passageiros: "+av1.passageiros+"\n");
		System.out.print("Quantidade de paradas: ");av1.paradas();
		System.out.print("Status do voo: ");av1.cancelado();

	}

}
