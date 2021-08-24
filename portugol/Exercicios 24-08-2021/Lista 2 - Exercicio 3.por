programa
{
//3) Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{

		real a,b,c,d

			escreva("Valor de A: ")
			leia(a)
			escreva("Valor de B: ")
			leia(b)
			escreva("Valor de C: ")
			leia(c)
			escreva("Valor de D: ")
			leia(d)

			
			a = Mat.potencia(a, 2)
			b = Mat.potencia(b, 2)
			c = Mat.potencia(c, 2)
			d = Mat.potencia(d, 2)

			se (c >= 1000) {
			escreva("O valor de c é ",c)
			}
			senao {
			escreva("Os valores são, respectivamente: a) ",a,", b) ",b,", c) ",c," e d) ",d)
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */