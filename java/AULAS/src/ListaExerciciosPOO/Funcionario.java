package ListaExerciciosPOO;

/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
 * referentes a esta classe, em seguida crie um objeto funcion�rio, 
 * defina as inst�ncias deste objeto e apresente as informa��es 
 * deste objeto no console.*/
public class Funcionario {

	public String nome;
	public double salario;
	public int filhos;
	public double salarioFinal;

	public void salarioTotal() {
		
		 if (filhos != 0) {
			salarioFinal = salario + (salario * 0.20);
			System.out.println(nome + " possui " + filhos + " e receber� R$" + salarioFinal + " com acr�scimo.");

		} else {
			System.out.println(nome + " n�o possui filhos e receber� R$" + salario);
		}
		 
	}
}