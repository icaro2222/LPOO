package questao5;

public class SistemaBancario{
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(2222, "corrente", 1450, true);
		Cliente cliente = new Cliente("Ícaro", "22222222", conta);
		Banco banco = new Banco("MaisBrasil");
		
		banco.consultarSaldo(cliente);
		banco.fazerDeposito(cliente, 550);
		banco.consultarSaldo(cliente);
		banco.sacarDinheiro(cliente, 3000);
		banco.consultarSaldo(cliente);
		banco.sacarDinheiro(cliente, 2000);
		banco.consultarSaldo(cliente);
		
	}
}