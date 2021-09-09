package ListaExerciciosPOO;
/*3) Crie uma classe produto eletrônico e apresente os atributos 
 * e métodos referentes a esta classe, em seguida crie um objeto 
 * produto eletrônico, defina as instâncias deste objeto e apresente 
 * as informações deste objeto no console.
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
