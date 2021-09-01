package Lista1;

/* 7. Um sistema de equa��es lineares do tipo (imagem), 
pode ser resolvido segundo mostrado abaixo: (imagem).
Escreva um sistema que l� os coeficientes a, b, c, d, e e f 
e calcula e mostra os valores de x e y. */

import java.util.Locale;
import java.util.Scanner;

public class Lista1Tarefa7 {
		
	public static void main (String [] args) {
		
		//vari�veis
		Locale.setDefault(Locale.US); //Perfumaria
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		//entradas
		System.out.print("Escreva o valor de A: ");
		a = leia.nextDouble();
		
		System.out.print("Escreva o valor de B: ");
		b = leia.nextDouble();
		
		System.out.print("Escreva o valor de C: ");
		c = leia.nextDouble();
		
		System.out.print("Escreva o valor de D: ");
		d = leia.nextDouble();
		
		System.out.print("Escreva o valor de E: ");
		e = leia.nextDouble();
		
		System.out.print("Escreva o valor de F: ");
		f = leia.nextDouble();
		
		
		//processamentos
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		//sa�das
			//classe String
		//%s - String - texto
			//tipo
		//%d - int - n�mero inteiro
		//%f [%.2f] - double - n�mero real
		//%c - character - caracter
		//%b - boolean - l�gico 
		
			//sa�da com println
		System.out.println("\nO valor de X � "+x+" e o de Y � "+y);
		
			//sa�da com printf
		System.out.printf("\nO valor de X � %.2f e o de Y � %.3f",x,y);
		leia.close(); //fechar teclado - perfumaria
		
	}
}
