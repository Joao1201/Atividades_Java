package br.com.generation.matrizes;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 8.7;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 8.5;
		notasAlunos[0][3] = 3.9;
		
		notasAlunos[1][0] = 2.7;
		notasAlunos[1][1] = 8.0;
		notasAlunos[1][2] = 5.5;
		notasAlunos[1][3] = 3.9;
		
		notasAlunos[2][0] = 8.7;
		notasAlunos[2][1] = 7.9;
		notasAlunos[2][2] = 8.5;
		notasAlunos[2][3] = 3.9;
		
		for(int x=0; x<notasAlunos.length; x++) {
			for(int y=0; y<notasAlunos[x].length; y++) {
				System.out.print(notasAlunos[x][y]+" | ");
			}
			System.out.println();
		}
	}

}
