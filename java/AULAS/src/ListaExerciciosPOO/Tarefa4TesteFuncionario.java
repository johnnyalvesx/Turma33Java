package ListaExerciciosPOO;

/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
 * referentes a esta classe, em seguida crie um objeto funcion�rio, 
 * defina as inst�ncias deste objeto e apresente as informa��es 
 * deste objeto no console.
 */
public class Tarefa4TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.nome = "Andressa";
		func.salario = 1300;
		func.filhos = 4;
		
		func.salarioTotal();
		
		}
	}


