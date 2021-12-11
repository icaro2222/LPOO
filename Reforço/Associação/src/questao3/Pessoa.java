package questao3;

public class Pessoa {

	private String nome;
	private String dataDeNascimento;
	private Universidade universidade;
	
	
	public Pessoa() {
	}
	public Pessoa(String nome, String dataDeNascimento, Universidade universidade) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.universidade = universidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public Universidade getUniversidade() {
		return universidade;
	}
	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	

	public void irAuniversidade(Universidade universidade) {
		System.out.println("A pessoa " + this.getNome() + " está indo para a universidade " + universidade.getNome());
	}
	
	
}
