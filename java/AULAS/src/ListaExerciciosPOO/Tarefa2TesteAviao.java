package ListaExerciciosPOO;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes a 
 * esta classe, em seguida crie um objeto avi�o, defina as inst�ncias deste 
 * objeto e apresente as informa��es deste objeto no console.*/
public class Tarefa2TesteAviao {

	public static void main(String[] args) {
		
		Aviao boeing = new Aviao();
		boeing.marca = "Boeing";
		boeing.modelo = "737";
		boeing.numPassageiros = 150;
		boeing.capCombustivel = 1000;
		boeing.consumoCombustivel = 20;
	
		System.out.println(boeing.marca);
		System.out.println(boeing.modelo);
		
		boeing.exibirAutonomia();
		
		double autonomia = boeing.obterAutonomia();
	}

}
