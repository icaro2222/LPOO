package questao2;

public class TestarCarro
{
	public static void main(String[] args) {
		
		
		Motor motor = new Motor("Fiat", 2.0, "Gasolina");
		Carro carro = new Carro("Fusca Verde", 120, motor, 10000d);
		Carro carro1 = new Taxi("corola", motor, 70, "X-man", 130, 10000d);
		Taxi taxi = new Taxi("corola", motor, 70, "X-man", 130, 10000d);

		System.out.println(carro.getValorVenda());

		System.out.println(carro1.getValorVenda());

		System.out.println(taxi.getValorVenda());
		
		
		
	}
}