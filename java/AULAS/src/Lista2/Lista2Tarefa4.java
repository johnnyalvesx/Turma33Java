package Lista2;

import java.util.Scanner;

/* 4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
 * raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/
public class Lista2Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite o n�mero inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.printf("\n%d � par e sua ra�z quadrada � "+(Math.sqrt(numero)),numero);
		}
		else if (numero % 2 == 1) {
			
			System.out.printf("\n%d � �mpar e elevado ao quadrado � "+(Math.pow(numero,2)),numero);
		}
		
	}
		
}


