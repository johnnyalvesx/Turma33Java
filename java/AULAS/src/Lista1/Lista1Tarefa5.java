/* 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste 
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/

package Lista1;

import java.util.Scanner;

public class Lista1Tarefa5 {
	
	public static void main (String[] args) {
		
		//vari�veis
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		//entradas
		System.out.println("Notas:\n");
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Nota 3: ");
		nota3 = leia.nextDouble();
		
		//processamentos
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		//sa�das
		
		System.out.println("\nA m�dia de alune �: "+media);
	}
}
