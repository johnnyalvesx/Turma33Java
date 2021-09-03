package Lista4;

import java.util.Locale;
import java.util.Scanner;

/* 6 - Escrever um programa que receba v�rios n�meros inteiros positivos no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
*/
public class EdTarefa6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		// vari�veis
		int numero = 0;
		int contador = 0;
		double media = 0.00;
		double total = 0.00;

		// entradas e processamentos
		do {
			System.out.print("Digite o n�mero: ");
			numero = leia.nextInt();
			if (numero > 0 && (numero % 3) == 0) {
				// contador = contador + 1
				contador++;
				// total = total + n�mero
				total += numero;
			}

		} while (numero > 0);
		if (contador > 0) {
			media = total / contador;
		}

		// sa�das
		System.out.printf("Total de n�meros %.0f, total de n�meros digitados m�ltiplos de 3 �  %d e m�dia %.2f", total,
				contador, media);

	}

}
