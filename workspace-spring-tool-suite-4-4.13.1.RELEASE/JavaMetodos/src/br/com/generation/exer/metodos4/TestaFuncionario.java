package br.com.generation.exer.metodos4;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		
		f1.nome = "Eduardo";
		f1.empresa = "Ita�";
		f1.cargo = "Analista de Atendimento";
		f1.salario = 2500.90;
		
		System.out.println("Nome: "+f1.nome);
		System.out.println("Empresa: "+f1.empresa);
		System.out.println("Cargo: "+f1.cargo);
		System.out.println("Sal�rio: R$"+f1.salario+"\n");
		System.out.print("Aumento sal�rial: ");f1.aumento();
		System.out.print("Per�odo de f�rias: ");f1.ferias();

	}

}
