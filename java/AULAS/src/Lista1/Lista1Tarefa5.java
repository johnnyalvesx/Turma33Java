/* 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste 
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

package Lista1;

import java.util.Scanner;

public class Lista1Tarefa5 {
	
	public static void main (String[] args) {
		
		//variáveis
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
		//saídas
		
		System.out.println("\nA média de alune é: "+media);
	}
}
