/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em 
segundos e mostre-o expresso em horas, minutos e segundos.*/
programa
{

	funcao inicio()
	{

	inteiro tempoExpressoEmSegundos
	inteiro horas
	inteiro minutos
	inteiro segundos
	
	escreva("Informe o tempo do evento em segundos: ")
	leia(tempoExpressoEmSegundos)
	
	horas = tempoExpressoEmSegundos / 3600
	minutos = (tempoExpressoEmSegundos % 3600)/60
	segundos = (tempoExpressoEmSegundos % 3600)%60

	escreva("\nHoras: "+horas)
	escreva("\nMinutos: "+minutos)
	escreva("\nSegundos: "+segundos)
	

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */