package Lista4;

import java.util.Scanner;

/* 6 - Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
*/
public class Lista4Tarefa6ouTarefa2DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0, media=0;
		
		do {
			System.out.println("Digite um número");
			System.out.println("----------------------");

			numero = leia.nextInt();
			
			if(numero % 3 == 0) {
				soma += numero;	
				contador++;
			}
			
		} while(numero != 0);
		
		media = soma / contador;		
		System.out.println("A média dos números digitados múltiplos de três é: " + media);
	}
}