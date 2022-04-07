package br.com.generation.heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguiça preg1 = new Preguiça();
		
		dog1.setNome("Snoopy");
		dog1.setIdade(6);
		dog1.setSom("latido");
		
		horse1.setNome("Spirit");
		horse1.setIdade(10);
		horse1.setSom("relincho");
		
		preg1.setNome("Sid");
		preg1.setIdade(15);
		preg1.setSom("Zzzzz..");
		
		
		System.out.println("Nome: "+dog1.getNome());
		System.out.println("Idades: "+dog1.getIdade()+" anos");
		System.out.println("Som: "+dog1.getSom());
		dog1.correr();
		
		System.out.println("\nNome: "+horse1.getNome());
		System.out.println("Idades: "+horse1.getIdade()+" anos");
		System.out.println("Som: "+horse1.getSom());
		horse1.correr();
		
		System.out.println("\nNome: "+preg1.getNome());
		System.out.println("Idades: "+preg1.getIdade()+" anos");
		System.out.println("Som: "+preg1.getSom());
		preg1.subir();

	}

}
