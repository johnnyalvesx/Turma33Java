package Lista1;

/* 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e 
calcule a seguinte expressão (imagens das fórmulas) */

import java.util.Scanner;

public class Lista1Tarefa4 {

		public static void main (String[] args) {
			
			//variáveis
			Scanner leia = new Scanner(System.in);
			double A, B, C;
			double D, R, S;
			
			//entradas
			System.out.println("Expressão: \n");
			
			System.out.print("Valor A: ");
			A = leia.nextInt();
					
			System.out.print("Valor B: ");
			B = leia.nextInt();
			
			System.out.print("Valor C: ");
			C = leia.nextInt();
			
			R = Math.pow((A + B), 2);
			System.out.println("\nValor de R: "+R);
			
			S = Math.pow((B+C), 2);
			System.out.println("\nValor de S: "+S);
			
			D = (R+S)/2;
			System.out.println("\nValor de D: "+D);
			
			
			
		}
			
			
}

