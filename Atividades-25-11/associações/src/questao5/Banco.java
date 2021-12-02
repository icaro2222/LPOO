package questao5;

public class Banco {

	private String nome;

	public Banco(String nome) {
		super();
		this.nome = nome;
	}
	public void consultarSaldo(Cliente cliente) {
		
		System.out.println("O saldo do cliente " + cliente.getNome() + " é de: " + cliente.getConta().getSaldo());
	}

	public void fazerDeposito(Cliente cliente, double valor) {
		
		if(cliente.getConta().isAtiva()) {
			double valorAtual = (cliente.getConta().getSaldo()+valor);
			cliente.getConta().setSaldo(valorAtual);
			System.out.println("SUCESSO!!!");
		}else {
			System.out.println("Não foi possivél!");
		}
	}

	public void sacarDinheiro(Cliente cliente, double valor) {

		if(cliente.getConta().isAtiva()) {
			if(valor <= cliente.getConta().getSaldo()) {
				double valorAtual = (cliente.getConta().getSaldo()-valor);
				cliente.getConta().setSaldo(valorAtual);;
				System.out.println("SUCESSO!!!");
				System.out.println("Já pode pegar seu dinheiro");
			}else {
				System.out.println("Não a essa quantia de dinheiro na conta!");
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
