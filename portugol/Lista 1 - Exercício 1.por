/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.	*/
programa
{

	funcao inicio()
	{

	inteiro anos
	inteiro meses
	inteiro dias
	inteiro diasTotais
	
	escreva("Informe sua idade de expressa em:\n")
	
	escreva("Anos: ")
	leia(anos)

	escreva("Meses: ")
	leia(meses)

	escreva("Dias: ")
	leia(dias)

	diasTotais = (dias+(anos*365)+(meses*30))

	escreva("Idade total expressa em dias: "+diasTotais)
	

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */