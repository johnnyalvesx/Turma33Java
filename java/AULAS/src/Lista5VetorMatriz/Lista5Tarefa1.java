package Lista5VetorMatriz;

/* 1 - Fa�a um programa que crie um vetor por leitura com 5 valores de 
 * pontua��o de uma atividade e o escreva em seguida. Encontre ap�s a 
 * maior pontua��o e a apresente. 
*/
import java.util.Scanner;

public class Lista5Tarefa1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetor[] = { 0, 1, 2, 3, 4 }, maior;

		for (int x = 0; x < 5; x++) {
			System.out.print("\nDigite a " + (x + 1) + "� nota: ");
			vetor[x] = leia.nextInt();
		}
		maior = vetor[0];
		
		for (int x = 0; x < 5; x++) {
			System.out.println("["+vetor[x] + "]\t");
		}
		for (int x = 0; x < 5; x++) {
			if (maior < vetor[x]) {
				maior = vetor[x];
			}
		}

		System.out.println("\nA maior nota �: " + maior+"\n");
		leia.close();
	}
}
