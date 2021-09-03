package Lista5VetorMatriz;

import java.util.Scanner;

public class Lista5Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int vetor[] = {0,1,2,3,4,5}, maior;
		
		for (int x=0; x<5; x++) {
			System.out.println("\nDigite a "+(x+1)+"ª nota: ");
			vetor[x] = leia.nextInt();
			
		}
		maior = vetor[0];
		
		for(int x=0; x<5; x++) {
		System.out.println(vetor[x]+"\t");
			
		}
		for(int x=0;x<5;x++) {
			if(maior < vetor [x]) {
				maior = vetor[x];
				
			}
		}
		System.out.println("\nA maior nota é :"+maior);
	}
}


