package ListaExerciciosPOO;
/*3) Crie uma classe produto eletr�nico e apresente os atributos 
 * e m�todos referentes a esta classe, em seguida crie um objeto 
 * produto eletr�nico, defina as inst�ncias deste objeto e apresente 
 * as informa��es deste objeto no console.
*/
public class Tarefa3TesteEletronico {

	public static void main(String[] args) {
		Eletronico leitorDigital = new Eletronico();
		leitorDigital.marca = "Amazon";
		leitorDigital.modelo = "Paperwhite";
		leitorDigital.iluEmbutida = 5;
		leitorDigital.cor = "Preto";
		leitorDigital.peso = 182;
		leitorDigital.armazenamento = "8gb";
		leitorDigital.estoque = 221;
		leitorDigital.vendidos = 32;
		
		System.out.printf("O Kindle %s da empresa %s vendeu %d pe�as.", leitorDigital.modelo, leitorDigital.marca, leitorDigital.vendidos, "\n");
		System.out.println("O aparelho possui: ");
		System.out.println(" - " + leitorDigital.iluEmbutida + " leds de ilumina��o");
		System.out.println(" - cor " + leitorDigital.cor);
		System.out.println(" - "+ leitorDigital.peso + "g");
		System.out.println(" - "+ leitorDigital.armazenamento);
		
		leitorDigital.obterEstoqueAtual();
		
		System.out.printf("Restam no estoque " + leitorDigital.obterEstoqueAtual() + " pe�as.");
	}

}
