package br.com.generation.encapsulamento;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.setModelo("Fusca");
		c1.setMarca("Volks");
		c1.setCor("Azul");
		c1.setAno(1965);
		
		c2.setModelo("Civic");
		c2.setMarca("Honda");
		c2.setCor("Prata");
		c2.setAno(2022);
		
		
		System.out.println("Modelo: "+c1.getModelo());
		System.out.println("Marca: "+c1.getMarca());
		System.out.println("Cor: "+c1.getCor());
		System.out.println("Ano: "+c1.getAno());
		System.out.println();
		System.out.println("Modelo: "+c2.getModelo());
		System.out.println("Marca: "+c2.getMarca());
		System.out.println("Cor: "+c2.getCor());
		System.out.println("Ano: "+c2.getAno());
		
	}

}
