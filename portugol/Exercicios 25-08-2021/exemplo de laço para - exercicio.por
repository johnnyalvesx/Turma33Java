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
	funcao inicio()
	{
	//TERMINAR DEPOIS SEM FALTA	
		caracter genero
		cadeia nome
		real notas, notasTotal, media
		
		notasTotal = 0.0
		escreva("Olá, qual o seu nome? ")
		leia (nome)
		escreva("Como você se identifica?\n A - feminino\n O - masculino\n E - neutro\n")
		leia (genero)
		para (inteiro x=1; x<=5; x++){
			escreva ("Escreva a nota da sua " + x + " ª prova: ")
			leia (notas)
			notasTotal = notasTotal + notas
			}
		media = (notasTotal/5)

		se (media < 5.00){
			escreva("Oi, "+nome+"! sua média é "+ media+" você será recuparad"+genero+" em notas.")	
		}
		senao se (media >= 5.00){
			escreva("Oi, "+nome+"! sua média é "+ media+" e você está aprovad"+genero+".")	
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */