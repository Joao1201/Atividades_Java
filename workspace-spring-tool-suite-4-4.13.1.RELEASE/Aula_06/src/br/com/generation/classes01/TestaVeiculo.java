package br.com.generation.classes01;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		Veiculo moto = new Veiculo();
		
		carro.tipo = "hatch";
		carro.modelo = "Fusca";
		carro.marca = "Volkswagen";
		carro.ano = 1985;
		carro.cor = "Azul";
		carro.velocidade = 0;
		
		carro.acelerar(80);
		System.out.println(carro.tipo);
		System.out.println(carro.modelo);
		System.out.println(carro.marca);
		System.out.println(carro.ano);
		System.out.println(carro.cor+"\n");
		System.out.println("Velocidade de aceleração: "+carro.velocidade+"Km/h");
		
		carro.frear(40);
		System.out.println("Velocidade após reduzir: "+carro.velocidade+"Km/h\n");

		moto.modelo = "Fan";
		moto.marca = "Honda";
		moto.velocidade = 0;
		System.out.println(moto.modelo);
		System.out.println(moto.marca+"\n");
		
		moto.acelerar(90);
		System.out.println("Velocidade de aceleração: "+moto.velocidade+"Km/h");
		moto.frear(30);
		System.out.println("Velocidade após reduzir: "+moto.velocidade+"Km/h");
		
	}

}
