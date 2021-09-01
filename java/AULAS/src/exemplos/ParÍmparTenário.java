package exemplos;

import java.util.Scanner;

public class ParÍmparTenário {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		//(condição) ? VERDADEIRO : FALSO
		System.out.print("Digite um numero inteiro positivo: ");
		numero = leia.nextInt();
		System.out.println(((numero%2)==0)?"\nNÚMERO PAR":"\nNÚMERO ÍMPAR");
		
	}
}
