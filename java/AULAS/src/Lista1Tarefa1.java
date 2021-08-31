/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.	*/

import java.util.Scanner;

public class Lista1Tarefa1 {
	
	public static void main (String[] args) {
		
		//variáveis
		Scanner leia = new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int diasTotais;
		
		System.out.println("Informe a idade expressa em: \n");
		
		System.out.print("Anos: ");
		anos = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Dias: ");
		dias = leia.nextInt();
		
		diasTotais = (dias+(anos*365)+(meses*30));
		
		System.out.println("\nIdade total expressa em dias: "+diasTotais);
		
		
	}

}
