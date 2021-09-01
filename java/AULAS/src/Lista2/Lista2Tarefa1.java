package Lista2;

import java.util.Scanner;

/* 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class Lista2Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o 1º número: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o 2º número: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite o 3º número: ");
		n3 = leia.nextInt();
		
		
		if(n1 > n2 && n1>n3) {
		System.out.println("\nO 1º número é o maior.");
		}
		else if(n2 > n1 && n2>n3) {
			System.out.println("\nO 2º número é o maior.");
		}
		else if(n3 > n1 && n3>n2) {
			System.out.println("\nO 3º número é o maior.");

		}			
		
	}

}
