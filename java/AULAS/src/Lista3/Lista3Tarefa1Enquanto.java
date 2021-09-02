package Lista3;

/*1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos 
 * e apresente no final o total do somat�rio, a m�dia e o total de valores 
 * lidos. O programa deve fazer as leituras dos valores enquanto o usu�rio 
 * estiver fornecendo valores positivos. Ou seja, o programa deve parar 
 * quando o usu�rio fornecer um valor negativo.
*/
import java.util.Scanner;

public class Lista3Tarefa1Enquanto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double somatorio = 0.00, media, total = 0.0, n = 0.0;

		while (n >= 0) {
			System.out.print("Digite o n�mero a ser somado: ");
			n = leia.nextDouble();
			if (n < 0) {
				break;

			}
			somatorio = somatorio + n;
			total = total + 1;
		}
		System.out.println("\nA somat�ria dos n�meros digitados � de: " + Math.round(somatorio));
		media = somatorio / total;
		System.out.println("\nA m�dia dos valores digitados � de: " + media);
		System.out.println("\nO total de n�meros digitados � de: " + Math.round(total));

	}

}
