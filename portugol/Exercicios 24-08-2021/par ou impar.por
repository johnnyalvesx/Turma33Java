programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número inteiro: ")
		leia(numero)

		se (numero < 0) {
			escreva("O número é negativo.")
		} senao se (numero == 0) {
			escreva("O número zero é neutro.")
		} senao se (numero % 2 == 0) {
			escreva("O número é par.")
		} senao {
			escreva("O número é ímpar.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */