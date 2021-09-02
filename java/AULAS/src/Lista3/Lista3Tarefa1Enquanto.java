package Lista3;

/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
 * e apresente no final o total do somatório, a média e o total de valores 
 * lidos. O programa deve fazer as leituras dos valores enquanto o usuário 
 * estiver fornecendo valores positivos. Ou seja, o programa deve parar 
 * quando o usuário fornecer um valor negativo.
*/
import java.util.Scanner;

public class Lista3Tarefa1Enquanto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double somatorio = 0.00, media, total = 0.0, n = 0.0;

		while (n >= 0) {
			System.out.print("Digite o número a ser somado: ");
			n = leia.nextDouble();
			if (n < 0) {
				break;

			}
			somatorio = somatorio + n;
			total = total + 1;
		}
		System.out.println("\nA somatória dos números digitados é de: " + Math.round(somatorio));
		media = somatorio / total;
		System.out.println("\nA média dos valores digitados é de: " + media);
		System.out.println("\nO total de números digitados é de: " + Math.round(total));

	}

}
