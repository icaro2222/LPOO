package banana.model;

public class Curso {

	private int cdaluno;
	private String nome;
	private String nmatricula;
	private String status;
	
	public Curso() {
	}
	public Curso(int cdaluno, String nome, String nmatricula, String status) {
		this.cdaluno = cdaluno;
		this.nome = nome;
		this.nmatricula = nmatricula;
		this.status = status;
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
	public String getNmatricula() {
		return nmatricula;
	}
	public void setNmatricula(String nmatricula) {
		this.nmatricula = nmatricula;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}