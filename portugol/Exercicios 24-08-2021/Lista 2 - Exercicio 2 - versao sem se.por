programa
{
/*2) Elabore um sistema que leia as variáveis C e N, respectivamente 
código e número de horas trabalhadas de um operário. E calcule o salário 
sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 
calcule o excesso de pagamento armazenando-o na variável E, caso contrário 
zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final 
do processamento imprimir o salário total e o salário excedente.*/

	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		real c, n, salario, E, excesso, codigo, total

			escreva("Código: ")
			leia(codigo)

			escreva("Número de horas trabalhadas: ")
			leia(n)

			escreva("Horas excedentes: ")
			leia(excesso)
			
			salario = ( n * 10.00 ) Mat.arredondar(salario, 2)
			escreva("\nSeu salário é de ",salario)
			
			E = ( excesso * 20.00 ) Mat.arredondar(E, 2)
			escreva("\nO salário pelas horas excedentes é de ",E)

			total = ( salario + E ) Mat.arredondar(total, 2)
			escreva("\nSeu salário total é de ",total)
			
			
			
			
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */