package Lista2;

import java.util.Scanner;

/* 2 - Faça um programa que entre com três números e coloque em ordem crescente.
*/
public class Lista2Tarefa2 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, res;
		
		System.out.print("Digite o valor de n1: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o valor de n2: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite o valor de n3: ");
		n3 = leia.nextInt();
		
		if(n1==n2 && n2==n3) {
			System.out.printf("%d, %d, %d",n1,n2,n3);
		}
		else if(n1<=n2 && n2<=n3) {
			System.out.printf("%d, %d, %d",n1,n2,n3);
		}
		else if(n1<=n3 && n3<=n2) {
			System.out.printf("%d, %d, %d",n1,n3,n2);
		}
		else if(n2<=n1 && n2<=n3 && n1<=n3) {
			System.out.printf("%d, %d, %d",n2,n1,n3);
		}
		else if(n3<=n1 && n3<=n2 && n2<=n1) {
			System.out.printf("%d, %d, %d",n3,n2,n1);
		}
		else {
			System.out.printf("%d, %d, %d",n3,n1,n2);
		}
	}
}
