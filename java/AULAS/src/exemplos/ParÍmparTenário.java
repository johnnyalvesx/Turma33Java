package exemplos;

import java.util.Scanner;

public class Par�mparTen�rio {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		//(condi��o) ? VERDADEIRO : FALSO
		System.out.print("Digite um numero inteiro positivo: ");
		numero = leia.nextInt();
		System.out.println(((numero%2)==0)?"\nN�MERO PAR":"\nN�MERO �MPAR");
		
	}
}
