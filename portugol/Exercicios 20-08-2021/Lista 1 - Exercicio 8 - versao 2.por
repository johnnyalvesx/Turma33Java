programa
{
/* 8. O custo ao consumidor de um carro novo é a soma do custo de 
fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de 
fábrica). Supondo que a percentagem do distribuidor seja de 28% e os imposto
s de 45%, escrever um sistema que leia o custo de fábrica de um 
carro e escreva o custo ao consumidor. */

//Acho que agora foi
	
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
	
	real impostos
	real distribuidor
	real valorCarro
	real valorCliente

	escreva("Custo de fábrica do carro: ")
	leia(valorCarro)
	
	distribuidor = (valorCarro*0.28)
	escreva("Porcentagem do distribuidor: "+Mat.arredondar(distribuidor, 2))
	
	impostos = (valorCarro*0.45)
	escreva("\nImpostos: "+Mat.arredondar(impostos,2))

	valorCliente = (valorCarro + distribuidor + impostos)
	escreva("\nCusto do carro ao consumidor: "+Mat.arredondar(valorCliente, 2))
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */