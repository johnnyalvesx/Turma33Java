package exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
			
			/*
			 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
			 * atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
			 * 
			 */
			Scanner leia = new Scanner(System.in);
			int vetor[] = new int[5];
			
			for (int x = 0 ; x< vetor.length ; x++) {
				System.out.print("Digite o valor "+(x+1)+" : ");
				vetor[x]= leia.nextInt();
				
			}
			
			//
			int maior = Arrays.stream(vetor).max().getAsInt();
			System.out.println(maior);
			
			
			//Arrays.sort(vetor);
			
			
			/*
			for (int lista : vetor) {
				System.out.println(lista);
			}
			*/
			for (int x = 0 ; x< vetor.length ; x++) {
				System.out.println(vetor[x]);
				
			}
			
			
			
		}
	
	}