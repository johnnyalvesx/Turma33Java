programa
{
/* -Nome do aluno
 * -Definir gênero
 * -Notas 1 a 5 - variáveis
 * -Pedir média
 *   - se for > 5, aprovado
 *   - se for < 5, recuperação
 * -Mostrar média e mostrar se foi aprovado/a/e
 * -Mostrar a maior nota e quantos % foram acima ou igual a 5
*/
	inclua biblioteca Matematica
	funcao inicio()
	{
	//TERMINAR DEPOIS SEM FALTA	
		const inteiro QUANTIDADE = 5
		const real MEDIA_ESCOLAR = 5.00
		cadeia nome
		caracter pronome
		real nota=0.00, media=0.00, somaNotas=0.00, maiorNota = 0.00, quantosAcima5=0.00, percentualAcima5=0.00

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Como prfere ser chamado (A - O - E)? ")
		leia(pronome)

		para(inteiro x=1; x<=QUANTIDADE; x++){
			escreva("\nDigite uma nota: ")
			leia(nota)
			//somatória
			somaNotas = somaNotas + nota
			//inversao
			se(nota > maiorNota){
				maiorNota = nota
			}
			//contador quantosAcima
			se(nota>=5){
			quantosAcima5 = quantosAcima5 + 1
			
			}
		}

				percentualAcima5 = (quantosAcima5 / QUANTIDADE) * 100.00
		media = (somaNotas / QUANTIDADE)
		
		se (media < MEDIA_ESCOLAR){
			escreva("Oi, "+nome+"! Sua média é " + media+". Você será recuparad"+pronome+" em notas.")	
		}
		senao se (media >= MEDIA_ESCOLAR){
			escreva("Oi, "+nome+"! Sua média é: " + media+". Você está aprovad"+pronome+".")	
		}
		escreva("\nA maior nota foi "+maiorNota)
		escreva("\nQuantidade de notas acima de 5: "+quantosAcima5)
		escreva("\nPercentual de notas acima de 5: "+Matematica.arredondar(percentualAcima5,2)+"%")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 701; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */