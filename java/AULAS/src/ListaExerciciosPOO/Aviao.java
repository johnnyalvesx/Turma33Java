package ListaExerciciosPOO;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes a 
 * esta classe, em seguida crie um objeto avião, defina as instâncias deste 
 * objeto e apresente as informações deste objeto no console.*/
public class Aviao {

	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A atutonomia do avião é " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		return capCombustivel * consumoCombustivel;
	}

}
