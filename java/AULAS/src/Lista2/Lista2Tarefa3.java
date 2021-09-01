package Lista2;

import java.util.Scanner;

/* 3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/
public class Lista2Tarefa3 {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
				
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
				
		if (idade < 10) {
			System.out.printf("%s é uma criança.", nome);
		} 
		else if (idade >=10 && idade <=14) {
			System.out.printf("%s é uma criança.", nome);
		}
		else if (idade >=15 && idade <=17) {
			System.out.printf("%s é juvenil.", nome);
		}
		else if (idade >=18) {
			System.out.printf("%s é uma adulto.", nome);
		}
		leia.close();
		
	}
}
