/* 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 *  Faça um programa que gere um vetor com os lançamentos, escreva 
 *  esse vetor. A seguir determine e imprima a média aritmética dos 
 *  lançamentos, contabilize e apresente também quantas foram as 
 *  ocorrências da maior pontuação.
*/
programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		//variaveis
		const inteiro QUANTIDADE_LANCAMENTOS=10
		inteiro lancamentosDado[QUANTIDADE_LANCAMENTOS]
		real mediaAritmetica=0.00
		real total=0.00
		inteiro maiorPonto=0
		inteiro contadorMaiorPonto=0

		//entradas
		para(inteiro x=0; x<QUANTIDADE_LANCAMENTOS; x++){
			//carga do vetor
			lancamentosDado[x]=Util.sorteia(1,6)
			//pra usuario ver
			escreva("Lancamento número "+(x+1)+" resultado = "+lancamentosDado[x])
			escreva("\n")
			total = total + lancamentosDado[x]
			se (lancamentosDado[x] >= maiorPonto){
								
				se (maiorPonto == lancamentosDado[x]){
					contadorMaiorPonto++	
				} 
				senao {
					contadorMaiorPonto=1
				}
				maiorPonto = lancamentosDado[x]
			}
			
		}
		mediaAritmetica = total / QUANTIDADE_LANCAMENTOS
		//saidas
		escreva("\nO total dos lançamentos é: "+total)
		escreva("\nA média aritmética dos lançamentos é: ",mediaAritmetica)
		escreva("\nO maior ponto lançado é: "+maiorPonto)
		escreva("\nQuantidade de vezes que aparece ",maiorPonto," nos lançamentos é ",contadorMaiorPonto)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */