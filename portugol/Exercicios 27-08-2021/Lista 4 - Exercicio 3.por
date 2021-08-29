/* 3. Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos 
de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
de mesma posição das matrizes N1 e N2.
*/
programa
{
	inclua biblioteca Util
	funcao inicio()
	{

		inteiro n1[4][6] //
		inteiro n2[4][6]
		inteiro m1[4][6]
		inteiro m2[4][6]

		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0; coluna<6; coluna++){
				// escreva("Digite o valor em linha ",linha," coluna ",coluna,": ")
				// leia(n1[linha][coluna])
				n1[linha][coluna]=sorteia(1,9)
				n2[linha][coluna]=sorteia(1,9)
				m1[linha][coluna]=n1[linha][coluna]+n2[linha][coluna]
				m2[linha][coluna]=n1[linha][coluna]-n2[linha][coluna]
			}
		
		}
			escreva("\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0; coluna<6; coluna++){
				escreva("["+n1[linha][coluna]+"]")
			}
			escreva("\n")
			}
			escreva("\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0; coluna<6; coluna++){
				escreva("["+n2[linha][coluna]+"]")
			}
			escreva("\n")
			}
			escreva("\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0; coluna<6; coluna++){
				escreva("["+m1[linha][coluna]+"]")
			}
			escreva("\n")
			}
			escreva("\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0; coluna<6; coluna++){
				escreva("["+m2[linha][coluna]+"]")
			}
			escreva("\n")
			}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 828; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 10, 2}-{n2, 14, 10, 2}-{m1, 15, 10, 2}-{m2, 16, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */