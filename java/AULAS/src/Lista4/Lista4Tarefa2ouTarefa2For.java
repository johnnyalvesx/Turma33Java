package Lista4;

/* 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
import java.util.Scanner;

public class Lista4Tarefa2ouTarefa2For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		for(int x = 0; x<10; x++) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
				
			} else {
				impar++;
			}
		}
		
		System.out.printf("A quantidade de números pares é igual a: %d\nA quantidade de números ímpares é igual a: %d", par, impar);

		
		
		
		
	}
}