package classes;

public class Cavalo2 extends Animal2 {

	public Cavalo2(String nome, int idade) {
		super(nome, idade);
		
	}
	
	//metodos
	public void correr() {
		
		System.out.println("Correndo");
	}
	
	@Override // polimorfismo
	public void emiteSom() {
		
		System.out.println("Rirc rirc.........");
	}

}