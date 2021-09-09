package AreaTriangulo;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		/*
		 * Receber valores de base e altura de um tri�ngulo e verificar se s�o valores
		 * v�lidos (positivos maiores que zero). Em caso afirmativo, calcular a �rea do
		 * tri�ngulo.
		 * 
		 */

		// variaveis
		Scanner leia = new Scanner(System.in);

		double base1 = 0, altura1 = 0, base2 = 0, altura2 = 0;
		double area1 = 0, area2 = 0;

		// entrada
		System.out.print("Digite a base do tri�ngulo 1: ");
		base1 = leia.nextDouble();
		System.out.print("Digite a altura do tri�ngulo 1: ");
		altura1 = leia.nextDouble();
		System.out.print("Digite a base do tri�ngulo 2: ");
		base2 = leia.nextDouble();
		System.out.print("Digite a altura do tri�ngulo 2: ");
		altura2 = leia.nextDouble();

		// processamento
		if (base1 > 0 && altura1 > 0 && base2 > 0 && altura2 > 0) {
			area1 = (base1 * altura1) / 2;
			area2 = (base2 * altura2) / 2;

		} else {
			System.out.println("Valor inv�lido!");

		}
		
		// saida
		if (area1 > area2) {
			System.out.printf("�rea do tri�ngulo 1 � %.2f | �rea do tri�ngulo 2 � %.2f | �REA DO TRI�NGULO 1 � MAIOR",
					area1, area2);
		}
		if (area1 < area2) {
			System.out.printf("�rea do tri�ngulo 1 � %.2f | �rea do tri�ngulo 2 � %.2f | �REA DO TRI�NGULO 2 � MAIOR",
					area1, area2);
		} 
		if (area1 == area2) {
			System.out.println("�reas iguais!");
		}
	}
}
