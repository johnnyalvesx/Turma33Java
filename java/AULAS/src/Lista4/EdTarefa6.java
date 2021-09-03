package Lista4;

import java.util.Locale;
import java.util.Scanner;

/* 6 - Escrever um programa que receba vários números inteiros positivos no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
*/
public class EdTarefa6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		// variáveis
		int numero = 0;
		int contador = 0;
		double media = 0.00;
		double total = 0.00;

		// entradas e processamentos
		do {
			System.out.print("Digite o número: ");
			numero = leia.nextInt();
			if (numero > 0 && (numero % 3) == 0) {
				// contador = contador + 1
				contador++;
				// total = total + número
				total += numero;
			}

		} while (numero > 0);
		if (contador > 0) {
			media = total / contador;
		}

		// saídas
		System.out.printf("Total de números %.0f, total de números digitados múltiplos de 3 é  %d e média %.2f", total,
				contador, media);

	}

}
