package Lista1;
/* 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em 
segundos e mostre-o expresso em horas, minutos e segundos.*/
import java.util.Scanner;

public class Lista1Tarefa3 {
	
	public static void main (String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int tempoExpressoEmSegundos;
		int horas;
		int minutos;
		int segundos;
		
		//entradas
		System.out.print("Informe o tempo do evento em segundos: ");
		tempoExpressoEmSegundos = leia.nextInt();
				
		//processamentos
		horas = tempoExpressoEmSegundos / 3600;
		minutos = (tempoExpressoEmSegundos % 3600) / 60;
		segundos = ((tempoExpressoEmSegundos % 3600) % 60);
		
		//sa�das
		System.out.println("\nHoras: "+horas);
		System.out.println("\nMinutos: "+minutos);
		System.out.println("\nSegundos: "+segundos);
		
	}
}
