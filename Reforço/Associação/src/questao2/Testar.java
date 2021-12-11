package questao2;

public class Testar {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Seu Zé", "4234.2442.24", "9887.8877-88");
		Carro carro = new Carro("2000", "T3000", "Rosa", "Ferrari");
		
		carro.ligar();
		cliente.analisaCarro(carro);

	}

}
