programa
{
//7) Receber valores de base e altura de um triângulo e verificar 
//se são valores válidos (positivos maiores que zero). Em caso afirmativo, 
//calcular a área do triângulo.
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		real base, altura, area

		escreva("Base do triângulo: ")
		leia(base)

		escreva("Altura do triângulo: ")
		leia(altura)

		area = (base*altura)/2
		limpa()
		
		se (altura < 0 ou base < 0){
		escreva("Números negativos não são aceitos!")
		}
		senao se (altura == 0 ou base == 0){
		escreva("0 é um número neutro, favor inserir valores superiores.")
		}
		senao {
		escreva("A área do triângulo é de ",area)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */