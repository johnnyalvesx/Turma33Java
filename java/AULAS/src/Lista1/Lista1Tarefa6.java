package Lista1;

/* 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �: (imagem 
da f�rmula) */

import java.util.Scanner;

public class Lista1Tarefa6 {
	
	public static void main (String[] args) {
		
		//vari�veis
		Scanner leia = new Scanner (System.in);
		double x1, x2, y1, y2, d;
		
		//entradas
		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.print("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.print("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.print("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		//processamentos
		d = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
	
		//sa�das
		System.out.println("\nO resultado de D � "+d);
		
	
		
	}
}
