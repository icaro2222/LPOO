package questao2;

public class Cliente {

	private String nome;
	private String cpf;
	private String cnh;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf, String cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public void analisaCarro(Carro carro) {
		System.out.println("O cliente " + this.getNome() + " está analisando o carro " + carro.getModelo());
	}
	
}
