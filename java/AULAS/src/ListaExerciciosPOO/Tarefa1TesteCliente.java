package ListaExerciciosPOO;

import java.util.Scanner;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes  
 * a esta classe, em seguida crie um objeto cliente, defina as instâncias deste 
 * objeto e apresente as informações deste objeto no console.
*/
public class Tarefa1TesteCliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String cpf;
		String nome;

		System.out.println("Digite o cpf ");
		cpf = leia.next();
		leia.nextLine();
		System.out.println("Digite o nome ");
		nome = leia.nextLine();

		Cliente cli1 = new Cliente(cpf, nome);

		System.out.println(cli1.getNome());
		
	}

}