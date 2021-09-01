package exemplos;

import java.util.Scanner;

public class ParÍmpar {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		String resposta;
		
		System.out.print("Digite um número inteiro positivo: ");
		numero = leia.nextInt();
		
		//(condição) ? VERDADEIRO : FALSO
		if (numero < 0) {
			System.out.print("O número é negativo.");
		} else if (numero == 0) {
			System.out.print("O número zero é neutro.");
		} else if (numero % 2 == 0) {
			System.out.print("O número é par.");
		} else {
			System.out.print("O número é ímpar.");
		}
		
	}

}