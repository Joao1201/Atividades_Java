package br.com.generation.projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Esbo�o1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome,telefone, cpf; 
		int idade;
		double peso;
		char doou, aCom, def, gripe, tatu, endosc, dente;
		char vacina, covid, gest, posGest, tras, ist, resi;
		
		//Doen�as
		String d1 = "--> AIDS";
		String d2 = "--> HTLV 1 e 2";
		String d3 = "--> Doen�a de chagas";
		String d4 = "--> Hepatite (ap�s 11 anos de idade)";
		String d5 = "--> Mal�ria";
		String d6 = "--> Mal de Parkinson";
		String d7 = "--> Uso de drogas il�citas injet�veis";
		ArrayList<String> problemas = new ArrayList<>();
		problemas.add(d1);
		problemas.add(d2);
		problemas.add(d3);
		problemas.add(d4);
		problemas.add(d5);
		problemas.add(d6);
		problemas.add(d7);	
		
		//Endere�os
		String e1 = "[1]Posto Cl�nicas\nAv. En�as Carvalho de Aguiar, 155 1� andar\n";
		String e2 = "[2]Posto Dante Pazzanese\nAv. Doutor Dante Pazzanese, 500\n";
		String e3 = "[3]Posto Mandaqui\nRua Volunt�rios da P�tria, 4.227\n";
		String e4 = "[4]Posto Regional de Osasco\nRua Ari Barroso, 355\n";
		String e5 = "[5]Posto Barueri\nRua Angela Mirella, 354, t�rreo\n";
		String e6 = "[6]Posto Stella Maris\nRua Maria C�ndida Pereira, 568\n";
		ArrayList<String> enderecos = new ArrayList<>();
		enderecos.add(e1);
		enderecos.add(e2);
		enderecos.add(e3);
		enderecos.add(e4);
		enderecos.add(e5);
		enderecos.add(e6);
		
		//Orienta��oes
		String o1 = "--> Estar alimentado (evite alimentos gordurosos nas 3 horas que antecedem a doa��o de sangue)";
		String o2 = "--> Caso seja ap�s o almo�o, aguardar 2 horas";
		String o3 = "--> Ter dormido pelo menos 6 horas nas �ltimas 24 horas";
		String o4 = "--> N�o ingerir bebidas alco�licas nas �ltimas 12 horas";
		String o5 = "--> N�o consumir tabaco nas �ltimas 2 horas";
		String o6 = "--> N�o consumir subst�ncias il�citas nas �ltimas 10 horas";
		String o7 = "--> Levar documento original com foto";
		String o8 = "--> Menores de idade precisam estar acompanhados pelo respons�vel";
		ArrayList<String> orientacoes = new ArrayList<>();
		orientacoes.add(o1);
		orientacoes.add(o2);
		orientacoes.add(o3);
		orientacoes.add(o4);
		orientacoes.add(o5);
		orientacoes.add(o6);
		orientacoes.add(o7);
		orientacoes.add(o8);
		
		//Sangue
		String s1 = "[1] N�o sei";
		String s2 = "[2] O";
		String s3 = "[3] A";
		String s4 = "[4] B";
		String s5 = "[5] AB";
		ArrayList<String> sangue = new ArrayList<>();
		sangue.add(s1);
		sangue.add(s2);
		sangue.add(s3);
		sangue.add(s4);
		sangue.add(s5);
		
		//RH
		String r1 = "[1] N�o sei";
		String r2 = "[2] +Positivo";
		String r3 = "[3] -Negativo";
		ArrayList<String> rh = new ArrayList<>();
		rh.add(r1);
		rh.add(r2);
		rh.add(r3);
		
		System.out.println("=====================================================================================");
        System.out.println("                                      JADOOU?                                        ");
        System.out.println("                                FUNDA��O PR�-SANGUE                                  ");
        System.out.println("=====================================================================================\n");
        System.out.println("Informa��es para o preenchimento do formul�rio:");
        System.out.println("Caso a resposta de alguma pergunta seja (Sim) ou (N�o), utilize (S) e (N)\n");
        
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Ol� " + nome + ", digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade <= 15 || idade >= 70) {
			System.out.println("\nPessoas menores de 16 e maiores de 69 anos n�o podem doar");
			System.exit(0);
		}
		else {
		      if (idade >= 60 && idade <= 69) {
			     System.out.print("Voc� j� doou antes de completar 60 anos: ");
			     doou = leia.next().charAt(0);
			 
			          if(doou == 'n') {
			        	  System.out.println("\nInfelizmente voc� n�o est� apto a doar");
			        	  System.exit(0);
			          }
			   } 
		}
		if(idade >= 16 && idade < 18) {
			System.out.print("Seus pais ou respons�veis est�o cientes: ");
            aCom = leia.next().charAt(0);
            if(aCom == 'n') {
            	System.out.println("\nPessoas menores de idade n�o podem doar sem o concentimento dos respons�veis");
	            System.exit(0);
            }
		}
		  System.out.print("Digite o seu peso (kg): ");
          peso = leia.nextDouble();
          if(peso < 50.0) {
        	  System.out.println("\nVoc� n�o est� apto a doar");
        	  System.exit(0);
          }
          System.out.print("Digite seu telefone ou do respons�vel (apenas n�meros): ");
          telefone = leia.next();
          System.out.print("Digite seu CPF (apenas n�meros): ");
          cpf = leia.next();
          System.out.println();
          
          System.out.println("=====================================================================================");
          System.out.println("                              IMPEDIMENTOS DEFINITIVOS                               ");
          System.out.println("=====================================================================================");
          for(String i: problemas) {
  			System.out.println(i);
          }
          System.out.println("=====================================================================================\n");
          System.out.print("Vo�� j� apresentou algum desses pontos: ");
          def = leia.next().charAt(0);
          if(def == 's') {
        	  System.out.println("\nInfelizmente voc� n�o est� apto a doar");
        	  System.exit(0);
          }
          System.out.println();
          System.out.println("=====================================================================================");
          System.out.println("                              IMPEDIMENTOS TEMPOR�RIOS                               ");
          System.out.println("=====================================================================================");
          System.out.print("Voc� esteve gripado, resfriado ou teve febre nos �ltimos 7 dias: ");
          gripe = leia.next().charAt(0);
          if(gripe == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 7 dias ap�s o fim dos sintomas");
        	  System.exit(0);
          }
          System.out.print("Voc� fez tatuagem ou maquiaguem definitiva nos �ltimos 12 meses: ");
          tatu = leia.next().charAt(0);
          if(tatu == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 12 meses ap�s a realiza��o do procedimento");
        	  System.exit(0);
          }
          System.out.print("Voc� realizou algum procedimento endosc�pico nos �ltimos 6 meses: ");
          endosc = leia.next().charAt(0);
          if(endosc == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 6 meses ap�s o procedimento");
        	  System.exit(0);
          }
          System.out.print("Voc� realizou alguma cirurgia odontol�gica no �ltimo m�s: ");
          dente = leia.next().charAt(0);
          if(dente == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 1 m�s ap�s o procedimento");
        	  System.exit(0);
          }
          System.out.print("Voc� testou positivo para COVID-19 nos �ltimos 10 dias: ");
           covid= leia.next().charAt(0);
          if(covid == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 10 dias ap�s o fim dos sintomas");
        	  System.exit(0);
          }
          System.out.print("Voc� tomou a vacina da COVID-19 nos �ltimos 10 dias: ");
          vacina = leia.next().charAt(0);
          if(vacina == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 10 dias ap�s a aplica��o");
        	  System.exit(0);
          }
          System.out.print("Voc� est� gravida: ");
          gest = leia.next().charAt(0);
          if(gest == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Gestantes n�o podem doar");
        	  System.exit(0);
          }
          System.out.print("Voc� esteve gr�vida nos �ltimos 6 meses: ");
          posGest = leia.next().charAt(0);
          if(posGest == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 90 dias ap�s parto normal e 180 dias ap�s cesariana");
        	  System.exit(0);
          }
          System.out.print("Voc� fez transfus�o de sangue nos �ltimos 12 meses: ");
          tras= leia.next().charAt(0);
          if(tras == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 12 meses ap�s o procedimento");
        	  System.exit(0);
          }
          System.out.print("Voc� foi exposto a condi��es de risco � ISTs: ");
          ist = leia.next().charAt(0);
          if(ist == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 12 meses ap�s a exposi��o");
        	  System.exit(0);
          }
          System.out.print("Voc� residiu em pa�ses com surto de Mal�ria ou Febre Amarela nos �ltimos 12 meses: ");
          resi = leia.next().charAt(0);
          if(resi == 's') {
        	  System.out.println("\nVoc� n�o pode doar no momento");
        	  System.out.println("Retorne 12 meses ap�s o fim da moradia");
        	  System.exit(0);
          }
          System.out.println();
          System.out.println("=====================================================================================\n");
          System.out.println("VOC� EST� APTO A DOAR!\n");
          
          System.out.println("Qual seu tipo sangu�neo: \n");
          for(String i: sangue) {
    			System.out.println(i);
          }
          System.out.print("\nDigite o n�mero correspondente: ");
          String tipo = leia.next();
          switch(tipo) {
          	case "1":
          		tipo = "N�o sei";
          		break;
          	case "2":
          		tipo = "O";
          		break;
          	case "3":
          		tipo = "A";
          		break;
          	case "4":
          		tipo = "B";
          		break;
          	case "5":
          		tipo = "AB";
          		break;
          }
          System.out.println();
          System.out.println("Qual o fator RH: \n");
          for(String i: rh) {
  			System.out.println(i);
        }
        System.out.print("\nDigite o n�mero correspondente: ");
        String tipo2 = leia.next();
        switch(tipo2) {
        	case "1":
        		tipo2 = "N�o sei";
        		break;
        	case "2":
        		tipo2 = "+Positivo";
        		break;
        	case "3":
        		tipo2 = "-Negativo";
        		break;
        }
          System.out.println("\nESCOLHA A UNIDADE MAIS PR�XIMA DE VOC�:\n");
          for(String i: enderecos) {
    			System.out.println(i);
          }
          System.out.print("Digite o n�mero da unidade: ");
          int unidade = leia.nextInt();
          System.out.println("\n---------------------------------------------------------------------------------");
          switch(unidade) {
          	case 1:
          		System.out.println("\nUNIDADE SELECIONADA: \nPosto Cl�nicas\nHor�rio de funcionamento - seg a sex: 8 �s 18h / sab: 8 �s 17h / dom e fer: fechado");
          		break;
          	case 2:
          		System.out.println("\nUNIDADE SELECIONADA: \nPosto Dante Pazzanese\nHor�rio de funcionamento - seg a sex: 8 �s 16h30 / sab: 8 �s 16h / dom e fer: fechado");
          		break;
          	case 3:
          		System.out.println("\nUNIDADE SELECIONADA: \nPosto Mandaqui\nHor�rio de funcionamento - seg a sex: 8 �s 16h30 / sab: 8 �s 16h / dom e fer: fechado");
          		break;
          	case 4:
          		System.out.println("\nUNIDADE SELECIONADA: \nPosto Regional de Osasco\nHor�rio de funcionamento - seg a sex: 8 �s 16h30 / sab: 8 �s 16h / dom e fer: fechado");
          		break;
          	case 5:
          		System.out.println("\nUNIDADE SELECIONADA: \nPosto Barueri\nHor�rio de funcionamento - seg a sex: 8 �s 16h / sab, dom e fer: fechado");
          		break;
          	case 6:
          		System.out.println("\nUNIDADE SELECIONADA: \nPosto Stella Maris\nHor�rio de funcionamento - seg a sex: 8 �s 16h / sab, dom e fer: fechado");
          		break;
          }
          System.out.println("\nFICHA DE IDENTIFICA��O");
          System.out.println("---------------------------------------------------------------------------------");
          System.out.println("Nome do doador: "+nome);
          System.out.println("Idade: "+idade+" anos");
          System.out.println("Telefone para contato: "+telefone);
          System.out.println("CPF: "+cpf);
          System.out.println("Tipo sangu�neo: "+tipo);
          System.out.println("Fator RH: "+tipo2);
          
          System.out.println("\nORIENTA��ES PARA O DIA DA DOA��O");
          System.out.println("---------------------------------------------------------------------------------");
          for(String i: orientacoes) {
  			System.out.println(i);
        }
          leia.close();
	}
}