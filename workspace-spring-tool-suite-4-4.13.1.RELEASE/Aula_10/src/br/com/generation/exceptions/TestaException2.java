package br.com.generation.exceptions;

import java.util.Scanner;

public class TestaException2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[4]; // [0] - [1] - [2] - [3]
        boolean verdade = false;
        
        while(verdade == false){
            try {
                System.out.print("Digite um valor: ");
                leia.nextLine();
                int variavel = leia.nextInt();
                vetor[2] = variavel;
                verdade = true;
            }
            catch(java.util.InputMismatchException eita) {
                System.out.println("\nNão pode");
            }
        }
        System.out.println("Número aceito");
        leia.close();
    }

}
