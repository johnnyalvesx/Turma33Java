/* 7. Um sistema de equações lineares do tipo (imagem), 
pode ser resolvido segundo mostrado abaixo: (imagem).
Escreva um sistema que lê os coeficientes a, b, c, d, e e f 
e calcula e mostra os valores de x e y. */

programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
	
	real a
	real b
	real c
	real d
	real eita
	real f
	real x
	real y

	escreva("Valor de a: ")
	leia(a)
	escreva("Valor de b: ")
	leia(b)
	escreva("Valor de c: ")
	leia(c)
	escreva("Valor de d: ")
	leia(d)
	escreva("Valor de e: ")
	leia(eita)
	escreva("Valor de f: ")
	leia(f)

	x = ((c*eita)-(b*f))/((a*eita)-(b*d))

	y = ((a*f)-(c*d))/((a*eita)-(b*d))

	escreva("O valor de x é "+Mat.arredondar(x,2)+".")

	escreva("O valor de y é "+Mat.arredondar(y,2)+".")

	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 740; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */