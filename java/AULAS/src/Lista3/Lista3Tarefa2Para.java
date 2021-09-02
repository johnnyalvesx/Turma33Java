package Lista3;

/* 2- Desenvolver um sistema que efetue a soma de todos os números 
ímpares que são  múltiplos de três e que se encontram no 
conjunto dos números de 1 até 500.*/
public class Lista3Tarefa2Para {

	public static void main(String[] args) {

		int s = 0;

		for (int x = 1; x <= 500; x++) {
			if (x % 2 == 1 && x % 3 == 0) {
				s = s + x;
				System.out.println(x);

			}

		}
		System.out.println(s);

	}

}
