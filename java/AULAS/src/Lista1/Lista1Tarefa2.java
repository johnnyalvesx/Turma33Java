package Lista1;

/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
mostre-a expressa em anos, meses e dias. */

import java.util.Scanner;

public class Lista1Tarefa2 {
	
	public static void main (String[] args) {
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		int idadePessoaEmDias;
		int anos;
		int meses;
		int dias;
		
		//entradas
		System.out.print("Informe a idade de uma pessoa expressa em dias: ");
		idadePessoaEmDias = leia.nextInt();
		
		//processamentos
		anos = idadePessoaEmDias / 365;
		meses = (idadePessoaEmDias % 365) / 30;
		dias = (idadePessoaEmDias % 365) % 30;
		
		System.out.println("\nAnos: "+anos);
		System.out.println("\nMeses: "+meses);
		System.out.println("\nDias: "+dias);
		
	}
	
}
