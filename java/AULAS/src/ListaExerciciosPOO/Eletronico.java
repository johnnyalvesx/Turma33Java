package ListaExerciciosPOO;
/*3) Crie uma classe produto eletr�nico e apresente os atributos 
 * e m�todos referentes a esta classe, em seguida crie um objeto 
 * produto eletr�nico, defina as inst�ncias deste objeto e apresente 
 * as informa��es deste objeto no console.
*/
public class Eletronico {
	public String marca;
	public String modelo;
	public int iluEmbutida; // quantos leds
	public String cor;
	public int peso;
	public String armazenamento;
	public int estoque;
	public int vendidos;
	
	
	int obterEstoqueAtual() {
		return (estoque - vendidos);
	}
	
}
