package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		al1.nome = "Milene";
		al1.curso = "Programação";
		al1.idade = 22;
		
		al2.nome = "Vagner";
		al2.curso = "Geologia";
		al2.idade = 30;
		
		System.out.println("Nome do aluno: "+al1.nome);
		System.out.println("Curso do aluno: "+al1.curso);
		System.out.println("Idade do aluno: "+al1.idade+" anos\n");
		
		System.out.println("Nome do aluno: "+al2.nome);
		System.out.println("Curso do aluno: "+al2.curso);
		System.out.println("Idade do aluno: "+al2.idade+" anos\n");
		
		al1.estudar();
		al2.assistirAula();
	}

}
