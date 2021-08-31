package Lista1;

/* 8. O custo ao consumidor de um carro novo é a soma do custo de 
fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de 
fábrica). Supondo que a percentagem do distribuidor seja de 28% e os imposto
s de 45%, escrever um sistema que leia o custo de fábrica de um 
carro e escreva o custo ao consumidor. */

import java.util.Scanner;

public class Lista1Tarefa8 {
	
	public static void main (String [] args) {
		
		/*inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
	
	real impostos
	real distribuidor
	real valorCarro
	real valorCliente

	escreva("Custo de fábrica do carro: ")
	leia(valorCarro)
	
	distribuidor = (valorCarro*0.28)
	escreva("Porcentagem do distribuidor: "+Mat.arredondar(distribuidor, 2))
	
	impostos = (valorCarro*0.45)
	escreva("\nImpostos: "+Mat.arredondar(impostos,2))

	valorCliente = (valorCarro + distribuidor + impostos)
	escreva("\nCusto do carro ao consumidor: "+Mat.arredondar(valorCliente, 2))*/
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		double impostos, distribuidor, valorCarro, valorCliente;
		
		//entradas
		System.out.print("Custo de fábrica do carro: R$");
		valorCarro = leia.nextDouble();
				
		//processamentos e saídas
		distribuidor = (valorCarro*0.28);
		System.out.println("Porcentagem do distribuidor: 28% = R$"+Math.round(distribuidor));
		
		impostos = (valorCarro*0.45);
		System.out.println("Impostos: 45% = R$"+Math.round(impostos));
		
		valorCliente = (valorCarro + distribuidor + impostos);
		System.out.println("Custo do carro ao consumidor: R$"+Math.round(valorCliente));
				
		
	}
	
}
