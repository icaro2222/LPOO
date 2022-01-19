package Q4;

public class Teste {
	
	/*
	 
	Elabore uma herança usando a classe Animal, Mamíferos e
	Ovíparos. Também, é desejável a criação de métodos para as
	classes
	
	*/
	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero("Ícaro", 44.00, 1.2, "28-12-2000");
		
		mamifero.andar();
		
		Oviparo oviparo = new Oviparo("Ícaro", 20, 10, "aguatico", false);
		
		oviparo.porOvo();
		oviparo.andar();
	}

}
