package br.com.generation.exer.metodos3;

public class TestaProduto {

	public static void main(String[] args) {
		
		ProdutoElet p1 = new ProdutoElet();
		
		p1.produto = "Celular";
		p1.modelo = "PocoPhone";
		p1.marca = "Xiaomi";
		p1.pre�o = 1300.55;
		
		System.out.println("Produto: "+p1.produto);
		System.out.println("Modelo: "+p1.modelo);
		System.out.println("Marca: "+p1.marca);
		System.out.println("Pre�o: R$"+p1.pre�o+"\n");
		System.out.print("Caracter�stica: ");p1.caracteristica();
		System.out.print("Garantia: ");p1.garantia();

	}

}
