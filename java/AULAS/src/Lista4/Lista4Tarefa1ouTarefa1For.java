package Lista4;

/* 1 - Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/
public class Lista4Tarefa1ouTarefa1For {

	public static void main(String[] args) {

		for (int n = 1000; n < 2000; n++) {
			if (n % 11 == 5) {
				System.out.println(n);
			}
		}
	}
}

/*
 * int numero = 0;
 * 
 * for (int x = 1000; x <= 1999; x++) {
 * 
 * if (x % 11 == 5) { numero = numero + x;
 * 
 * System.out.println(numero);
 * 
 * } }
 */