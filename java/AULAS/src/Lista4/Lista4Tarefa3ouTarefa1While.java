package Lista4;

/* 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos 
 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina 
 * quando idade for =-99. (WHILE)*/
import java.util.Scanner;

public class Lista4Tarefa3ouTarefa1While {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade = 0, total = 0, totalPessoasMenos21Anos = 0, totalPessoasMais50Anos = 0;

		while (idade == -99) {

			if (idade < 21) {
				totalPessoasMenos21Anos++;
			}
			if (idade > 50) {
				totalPessoasMais50Anos++;
			}

		}
		System.out.print("Digite a idade a ser totalizada: ");
		idade = leia.nextInt();
	}

}
/*
 * int idade,contador21=0,contador50=0; printf("\n DIGITE A IDADE: ");
 * scanf("%d",&idade); while(idade!=-99) { if(idade<21) contador21++;
 * if(idade>50) contador50++;
 * printf("\n DIGITE A IDADE(PARA ENCERRAR DIGITE -99) : "); scanf("%d",&idade);
 * } printf("\n O TOTAL DE PESSOAS COM MENOS DE 21 ANOS E:%d",contador21);
 * printf("\n O TOTAL DE PESSOAS COM MAIS DE 50 ANOS E:%d",contador50);
 * printf("\n\n"); system("pause"); return(0); }
 */

/*
 * Scanner leia = new Scanner(System.in); double somatorio = 0.00, media, total
 * = 0.0, n = 0.0;
 * 
 * while (n >= 0) { System.out.print("Digite o número a ser somado: "); n =
 * leia.nextDouble(); if (n < 0) { break;
 * 
 * } somatorio = somatorio + n; total = total + 1; }
 * System.out.println("\nA somatória dos números digitados é de: " +
 * Math.round(somatorio)); media = somatorio / total;
 * System.out.println("\nA média dos valores digitados é de: " + media);
 * System.out.println("\nO total de números digitados é de: " +
 * Math.round(total));
 */