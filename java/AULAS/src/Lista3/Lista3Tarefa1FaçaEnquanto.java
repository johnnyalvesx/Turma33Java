package Lista3;

/* 1- Faça um programa que mostre uma contagem na tela de 233 a 456, 
só que contando de 3 em 3 quando estiver entre 300 e 400 
e de 5 em 5 quando não estiver.*/
import java.util.Locale;
import java.util.Scanner;

public class Lista3Tarefa1FaçaEnquanto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int x = 233, y = 0;

		do {

			System.out.println(x);

			if (x <= 300 || x >= 400) {
				y = 5;
				x = x + y;

			} else {

				y = 3;
				x = x + y;
			}

		} while (x <= 456);

	}

}