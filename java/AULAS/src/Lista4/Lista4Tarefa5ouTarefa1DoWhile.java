package Lista4;

import java.util.Scanner;

/* 5 - Crie um programa que leia um número do teclado até que 
 * encontre um número igual a zero. No final, mostre a soma 
 * dos números digitados.(DO...WHILE)
*/
public class Lista4Tarefa5ouTarefa1DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número");
			System.out.println("----------------------");

			numero = leia.nextInt();
			
			soma += numero;			
		} while(numero != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
	}

}