programa
{
	
	funcao inicio()
	{
		cadeia nome, chefa
		inteiro valor = 600
		
		escreva("Qual é o seu nome? ")
		leia(nome)

		escreva("Voce é a chefa da família? (sim ou não): ")
		leia(chefa)

		se (chefa == "sim") {
			escreva("Valor do auxílio é " + (valor * 2) + "\n")
		} senao se (chefa == "não") {
			escreva("Valor do auxílio é " + valor + "\n")
		} senao {
			escreva("Você não respondeu a pergunta anterior corretamente!")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */