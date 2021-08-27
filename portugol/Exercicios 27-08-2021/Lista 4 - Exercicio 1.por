/* 1. Faça um programa que crie um vetor por leitura com 5 valores 
 * de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. 
*/
programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], maior
		para(inteiro x=0; x <5; x++){
			escreva ("\nDigite a ",x+1,"ª nota: ")
			leia(vetor[x])
		
		}
		limpa()
		maior = vetor[0]

		para(inteiro x=0; x<5; x++){
			escreva(vetor[x], "\t")
		}
		para(inteiro x=0; x<5; x++){
			se(maior < vetor[x]){
				maior = vetor[x]
			}
		}
		escreva("\nA maior nota é: ",maior)
	}
		
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */