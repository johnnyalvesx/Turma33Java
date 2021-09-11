package classes;

public class Cachorro2 extends Animal2 {
	
	//construtor
	public Cachorro2(String nome, int idade) {
		super(nome, idade);
		
	}
	
	//metodo
	public void correr() {
		System.out.println("O cachorro está correndo");
	}
	
	@Override //polimorfismo
	public void emiteSom() {
		// TODO Auto-generated method stub
		System.out.println("Au, au ....");
	}
	
}