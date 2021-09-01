package Lista2;

import java.util.Scanner;

/* 4 - Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a 
 * raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/
public class Lista2Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite o número inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.printf("\n%d é par e sua raíz quadrada é "+(Math.sqrt(numero)),numero);
		}
		else if (numero % 2 == 1) {
			
			System.out.printf("\n%d é ímpar e elevado ao quadrado é "+(Math.pow(numero,2)),numero);
		}
		
	}
		
}


