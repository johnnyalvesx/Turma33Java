package Lista2;

import java.util.Scanner;

/* 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class Lista2Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o 1� n�mero: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite o 3� n�mero: ");
		n3 = leia.nextInt();
		
		
		if(n1 > n2 && n1>n3) {
		System.out.println("\nO 1� n�mero � o maior.");
		}
		else if(n2 > n1 && n2>n3) {
			System.out.println("\nO 2� n�mero � o maior.");
		}
		else if(n3 > n1 && n3>n2) {
			System.out.println("\nO 3� n�mero � o maior.");

		}			
		
	}

}
