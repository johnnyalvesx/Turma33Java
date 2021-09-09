package ListaExerciciosPOO;

/*4) Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes a esta classe, em seguida crie um objeto funcionário, 
 * defina as instâncias deste objeto e apresente as informações 
 * deste objeto no console.*/
public class Funcionario {

	public String nome;
	public double salario;
	public int filhos;
	public double salarioFinal;

	public void salarioTotal() {
		
		 if (filhos != 0) {
			salarioFinal = salario + (salario * 0.20);
			System.out.println(nome + " possui " + filhos + " e receberá R$" + salarioFinal + " com acréscimo.");

		} else {
			System.out.println(nome + " não possui filhos e receberá R$" + salario);
		}
		 
	}
}