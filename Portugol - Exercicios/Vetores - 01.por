programa
{
	
	funcao inicio()
	{
		cadeia nome[5]
		/*nome[0] = "Marcelo"
		nome[1] = "Vitor"
		nome[2] = "Thalmai"
		nome[3] = "Igor"
		nome[4] = "Jéssica"*/

		para(inteiro i = 0; i <= 4; i++){
			escreva("Digite a posição "+i+": ")
			leia(nome[i])
		}
		escreva("\n")
		para(inteiro i = 0; i <= 4; i++){
			escreva(i + " : " +nome[i] + " | ")
		}
		escreva("\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */