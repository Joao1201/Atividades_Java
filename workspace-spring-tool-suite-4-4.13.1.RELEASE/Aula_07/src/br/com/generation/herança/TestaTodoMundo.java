package br.com.generation.herança;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor pf1 = new Professor();
		Aluno al1 = new Aluno();
		
		al1.setNome("João");
		al1.setEndereço("Rua Antonio dos Santos, 53");
		al1.setIdade(23);
		al1.setCurso("Bootcamp JAVA");
		al1.setSemestre("1º Semestre - 2022");
		
		pf1.setNome("Jeff");
		pf1.setEndereço("Rua xyz, 100");
		pf1.setIdade(25);
		pf1.setDisciplina("SoftSkills");
		pf1.setSalario(2500.55);
		
		System.out.println("Nome: "			+pf1.getNome());
		System.out.println("Endereço: "		+pf1.getEndereço());
		System.out.println("Idade: "		+pf1.getIdade());
		System.out.println("Disciplina: "	+pf1.getDisciplina());
		System.out.println("Salário: R$"	+pf1.getSalario());
		System.out.println();
		System.out.println("Nome: "			+al1.getNome());
		System.out.println("Endereço: "		+al1.getEndereço());
		System.out.println("Idade: "		+al1.getIdade());
		System.out.println("Curso: "		+al1.getCurso());
		System.out.println("Semestre: "		+al1.getSemestre());
		
	}

}
