package ListaExerciciosPOO;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes a 
 * esta classe, em seguida crie um objeto avi�o, defina as inst�ncias deste 
 * objeto e apresente as informa��es deste objeto no console.*/
public class Aviao {

	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A atutonomia do avi�o � " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		return capCombustivel * consumoCombustivel;
	}

}
