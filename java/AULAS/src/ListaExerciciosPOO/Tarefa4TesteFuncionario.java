package ListaExerciciosPOO;

/*4) Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes a esta classe, em seguida crie um objeto funcionário, 
 * defina as instâncias deste objeto e apresente as informações 
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


