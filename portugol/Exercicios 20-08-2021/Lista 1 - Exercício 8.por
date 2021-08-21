/* 8. O custo ao consumidor de um carro novo é a soma do custo de 
fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de 
fábrica). Supondo que a percentagem do distribuidor seja de 28% e os imposto
s de 45%, escrever um sistema que leia o custo de fábrica de um 
carro e escreva o custo ao consumidor. */

programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{

	real custoFabrica
     real custoConsumidor
     real porcentagemDistribuidor
     real percentualImpostos
     real distribuidor
     real valorImpostos

     porcentagemDistribuidor = 28
     percentualImpostos = 45
	
	escreva("Custo de fábrica de um carro novo: ")
	leia(custoFabrica)

     valorImpostos = ((custoFabrica*percentualImpostos)/100)

	distribuidor = ((custoFabrica+percentualImpostos)*porcentagemDistribuidor)/100.000
 
 	custoConsumidor = (distribuidor + valorImpostos)
 	escreva("O custo ao consumidor é de "+custoConsumidor)
     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */