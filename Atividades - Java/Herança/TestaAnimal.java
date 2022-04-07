package br.com.generation.heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro snoopy = new Cachorro();
		
		snoopy.setNome("Snoopy");
		snoopy.setIdade(6);
		snoopy.setSom("latido");
		snoopy.setAcao("Correr");
		
		System.out.println("Nome: "+snoopy.getNome());
		System.out.println("Idades: "+snoopy.getIdade()+" anos");
		System.out.println("Som: "+snoopy.getSom());
		System.out.println("Ação: "+snoopy.getAcao());

	}

}
