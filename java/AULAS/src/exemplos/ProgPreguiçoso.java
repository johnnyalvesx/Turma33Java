package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ProgPregui�oso {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char op = 'S';

		while (true) {

			System.out.println("La�o infinito");
			System.out.println("Continua S/N :");
			op = leia.next().toUpperCase().charAt(0);

			if (op == 'N') {
				break;
			}
		}
	}
}
