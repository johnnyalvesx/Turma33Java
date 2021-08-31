import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {
		
		//variáveis
		Scanner leia = new Scanner(System.in); //instanciamento
		String nome;
		int anoNascimento=0;
		int anoAtual = 2021;
		
		nome = "EPAMINONDAS";
				
		System.out.print("Oi, mundo!\nSou da turma 33! <3");
		System.out.println("\nMeu nome é Johnny!");
		System.out.println("Teste do println");
		
		System.out.println("\n\n"+nome+ ", sua idade é "+(anoAtual-anoNascimento)+"\n\n");
		
		//entradas
		System.out.println("Digite o nome: ");
		
		//leia(nome)
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		//saída
		System.out.println(nome.toUpperCase()+" sua idade é "+(anoAtual-anoNascimento)+" anos");
		System.out.println("O nome digitado tem "+nome.length()+" letras no total");
		
	}
}
