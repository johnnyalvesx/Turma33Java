programa
{
	funcao linha(){
		escreva("\n-------------------------------------------------------------------------------")
	}
	funcao inicio()
	{
		const inteiro SUPREMO=10 
		inteiro codigo [SUPREMO]
 
		cadeia produto[SUPREMO]
		real valor [SUPREMO]
		inteiro estoque [SUPREMO]
		inteiro carrinho [SUPREMO]
		cadeia nomeLoja= "NANPPA"
		cadeia slogan= "A loja do Dev desesperado"
		caracter cliente
		inteiro respostaCliente, quantidadeProduto = 0, respostaC 
		real total = 0.00
		real precoPagar =0.00
		
		produto[0] = "LIVRO JAVA INICIANTE"
		produto[1] = "LIVRO JAVA INTERMEDIARIO"
		produto[2] = "LIVRO JAVA AVANÇADO    "
		produto[3] = "LIVRO HTML INICIANTE   "
		produto[4] = "LIVRO PYTHON INICIANTE"
		produto[5] = "LIVRO EXCEL AVANÇADO"
		produto[6] = "LIVRO PYTHON AVANÇADO"
		produto[7] = "LIVRO EXCEL INICIANTE"
		produto[8] = "LIVRO HTML AVANÇADO   "
		produto[9] = "LIVRO CSS AVANÇADO    "


		escreva("\n",nomeLoja)
		escreva("\n",slogan)

		escreva("\nOlá, deseja conhecer nossa loja? (S/N): ")
		leia(cliente)
		
		 se (cliente == 'N' ou cliente == 'n') {
		 	escreva("Ok, obrigado pela sua visita!!")
		 	
		 	}
		 	senao {
		 		escreva("\nCod\t produto \t valor \t estoque")
		para (inteiro x=0; x<SUPREMO; x++) {
			codigo[x]= x+1
			valor[x]= 100.00
			estoque[x]= 10 
			
			escreva("\nG6-",codigo[x], " - " , produto[x], "\t\t",valor[x],"\t",estoque[x])
			
			}
		
			escreva("\nSELECIONE O CODIGO DO PRODUTO: ")
			leia(respostaCliente)
			respostaC = respostaCliente - 1
			escreva(respostaC)
			se (respostaCliente >10){
				escreva ("DÍGITO INVÁLIDO")
			}
			

			
			escolha (respostaCliente){
				
				caso 1:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[0], " - " , produto[0], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[0]= (estoque[0]-quantidadeProduto)
				escreva(estoque[0])
			
				pare
				caso 2:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[1], " - " , produto[1], "\t\t",valor[1],"\t     ",estoque[1])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[1]= (estoque[1]-quantidadeProduto)
				
				pare
				caso 3:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[2], " - " , produto[2], "\t\t",valor[2],"\t     ",estoque[2])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[2]= (estoque[2]-quantidadeProduto)
			
				pare
				caso 4:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[3], " - " , produto[3], "\t\t",valor[3],"\t     ",estoque[3])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[3]= (estoque[3]-quantidadeProduto)
			
				pare
				caso 5:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[4], " - " , produto[4], "\t\t",valor[4],"\t     ",estoque[4])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[4]= (estoque[4]-quantidadeProduto)
			
				pare
				caso 6:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[5], " - " , produto[5], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[5]= (estoque[5]-quantidadeProduto)
				
				pare
				caso 7:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[6], " - " , produto[6], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[6]= (estoque[6]-quantidadeProduto)
			
				pare
				caso 8:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[7], " - " , produto[7], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[7]= (estoque[7]-quantidadeProduto)
				
				pare
				caso 9:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[8], " - " , produto[8], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[8]= (estoque[8]-quantidadeProduto)
				
				pare
				caso 10:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[9], " - " , produto[9], "\t\t",valor[9],"\t     ",estoque[9])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[9]= (estoque[9]-quantidadeProduto)
			
				pare
			}

				escreva("Continuar a compra S/N? ")
				leia(cliente)
				 se (cliente == 'N' ou cliente == 'n') {
		 	escreva("Ok, obrigado pela sua visita!!")
		 	
		 	}
		 	senao {
		 	escreva("\nCod\t produto \t valor \t estoque")
		para (inteiro x=0; x<SUPREMO; x++) {
			codigo[x]= x+1
			valor[x]= 100.00
			estoque[x]= 10 
			
			escreva("\nG6-",codigo[x], " - " , produto[x], "\t\t",valor[x],"\t",estoque[x])
			
			}
		
			escreva("\nSELECIONE O CODIGO DO PRODUTO: ")
			leia(respostaCliente)
			respostaC = respostaCliente - 1
			escreva(respostaC)
			se (respostaCliente >10){
				escreva ("DÍGITO INVÁLIDO")
			}
			

			
			escolha (respostaCliente){
				
				caso 1:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[0], " - " , produto[0], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[0]= (estoque[0]-quantidadeProduto)
				escreva(estoque[0])
			
				pare
				caso 2:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[1], " - " , produto[1], "\t\t",valor[1],"\t     ",estoque[1])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[1]= (estoque[1]-quantidadeProduto)
				
				pare
				caso 3:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[2], " - " , produto[2], "\t\t",valor[2],"\t     ",estoque[2])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[2]= (estoque[2]-quantidadeProduto)
			
				pare
				caso 4:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[3], " - " , produto[3], "\t\t",valor[3],"\t     ",estoque[3])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[3]= (estoque[3]-quantidadeProduto)
			
				pare
				caso 5:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[4], " - " , produto[4], "\t\t",valor[4],"\t     ",estoque[4])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[4]= (estoque[4]-quantidadeProduto)
			
				pare
				caso 6:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[5], " - " , produto[5], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[5]= (estoque[5]-quantidadeProduto)
				
				pare
				caso 7:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[6], " - " , produto[6], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[6]= (estoque[6]-quantidadeProduto)
			
				pare
				caso 8:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[7], " - " , produto[7], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[7]= (estoque[7]-quantidadeProduto)
				
				pare
				caso 9:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[8], " - " , produto[8], "\t\t",valor[0],"\t     ",estoque[0])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[8]= (estoque[8]-quantidadeProduto)
				
				pare
				caso 10:
				escreva("\nCod\t        produto \t       valor         \t estoque")
				escreva ("\nG6-",codigo[9], " - " , produto[9], "\t\t",valor[9],"\t     ",estoque[9])
				escreva("\n Digite a quantidade necessária:  ")
				leia(quantidadeProduto)
				estoque[9]= (estoque[9]-quantidadeProduto)
			
				pare
			}
			
				
			inteiro formaPagamento=0
		 	real desconto=0.00
		 	
		 	escreva("Formas de Pagamento ")
		 	escreva("\n1 - A VISTA COM 10% DESCONTO\n2 - NO CARTÃO COM ACRESCIMO DE 10%\n3- EM DUAS VEZES COM 15% TOTAL DE ACRESCIMENTO") 
		 	escreva("\nEscolha sua forma de pagamento: ")
		 	leia(formaPagamento)
		 	limpa()
		 	

		 		se ( formaPagamento == 1)
		 		{
		 			total = (quantidadeProduto*100.0)
		 		     desconto= (total*10)/100
		 		     precoPagar= (total-desconto)
		 		    // escreva("Você vai pagar: ",precoPagar)
		 		}
		 		senao se (formaPagamento == 2)
		 		{
		 			total = (quantidadeProduto*100.0)
		 			desconto= (total*10)/100
		 		     precoPagar= (total+desconto)
		 		    // escreva("Você vai pagar: ",precoPagar)
		 		}
		 		senao se (formaPagamento == 3)
		 		{
		 			total = (quantidadeProduto*100.0)
		 			desconto= (total*15)/100
		 		     precoPagar= (total+desconto)
		 		     real parcela= (precoPagar/2)
		 		    // escreva("Você vai pagar: ",precoPagar,"\nSendo em duas parcelas iguais de: ",parcela)
		 		}
		
		 		escreva("\n",nomeLoja)
				escreva("\n",slogan)
		 		linha()		 		
		 		escreva("\nNota Fiscal")
		 			
				linha()	
		 		escreva("\nCod\t        produto \t       valor unitario                \t Qtde")
		 		linha()
		 		escreva ("\nG6-",codigo[respostaC], " - " , produto[respostaC], "\t\t",valor[respostaC] , "\t\t\t\t  " ,quantidadeProduto)
		 		escreva("\n ")
		 		linha()
		 		escreva("\nValor da compra: ",precoPagar)
		
		
			}
		} 	

	} 
 
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10136; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {estoque, 13, 10, 7}-{carrinho, 14, 10, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */