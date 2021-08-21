/* 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e 
calcule a seguinte expressão (imagens das fórmulas) */
programa{
	
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		
		escreva("Expressão:\n")
	
	inteiro A
	inteiro B
	inteiro C
	real D
	real R
	real S

	escreva("Valor A: ")
	leia(A)

	escreva("Valor B: ")
	leia(B)

	escreva("Valor C: ")
	leia(C)
	
	R = Matematica.potencia((A+B),2)
	escreva("\nValor de R: "+R)

	S = Matematica.potencia((B+C),2)
	escreva("\nValor de S: "+S)

	D = (R+S)/2
	escreva("\nValor de D: "+D)
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */