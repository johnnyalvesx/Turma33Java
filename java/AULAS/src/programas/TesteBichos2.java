package programas;
	
		import classes.Cachorro2;
		import classes.Cavalo2;
		import classes.Preguica2;

		public class TesteBichos2 {
			public static void main(String[] args) {
				
				Cachorro2 boris = new Cachorro2("Boris", 5);
				Cavalo2 brabo = new Cavalo2("Brabo", 7);
				Preguica2 berenice = new Preguica2("Berenice", 9);
				
				brabo.emiteSom();
				brabo.correr();
				
				boris.emiteSom();
				boris.correr();
				
				berenice.subirArvore();
				berenice.emiteSom();
				
			}
		}

	

	
	
