package Lista1;
import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
	
		//variaveis
		Scanner leia = new Scanner(System.in);//instanciamento
		String nome;
		int anoNascimento;
		double fahrenheit, celsius;
		int anoAtual=2021;
		
		//entradas
		System.out.print("Digite o nome: ");
		nome = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		//saida
		System.out.println(nome+" sua idade é "+(anoAtual-anoNascimento)+" anos.");
		System.out.println("O nome digitado tem o total de letras: "+nome.length());
		
		System.out.print("Digite a temperatura em celsius: ");
		celsius = leia.nextDouble();
				
		fahrenheit = ( 1.8 * celsius + 32);
		
		System.out.println("A temperatura em fahrenheit é de "+fahrenheit+" ºF");
		
	}

}