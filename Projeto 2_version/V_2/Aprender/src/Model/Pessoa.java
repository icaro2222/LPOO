package Model;

public class Pessoa {

	private int cdaluno;
	private String nome;
	
	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public int getCdaluno() {
		return cdaluno;
	}
	public void setCdaluno(int cdaluno) {
		this.cdaluno = cdaluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
