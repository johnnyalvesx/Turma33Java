package exemplos;

import java.util.Scanner;

public class Par�mpar {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		String resposta;
		
		System.out.print("Digite um n�mero inteiro positivo: ");
		numero = leia.nextInt();
		
		//(condi��o) ? VERDADEIRO : FALSO
		if (numero < 0) {
			System.out.print("O n�mero � negativo.");
		} else if (numero == 0) {
			System.out.print("O n�mero zero � neutro.");
		} else if (numero % 2 == 0) {
			System.out.print("O n�mero � par.");
		} else {
			System.out.print("O n�mero � �mpar.");
		}
		
	}

}