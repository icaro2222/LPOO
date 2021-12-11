package questao1;

public class Aluno {

	private String nome;
	private String numMatricula;
	private int idade;
	private String serie;
	private Endereco endereco;
	
	public Aluno() {
	}
	
	public Aluno(String nome, String numMatricula, int idade, String serie, Endereco endereco) {
		super();
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.idade = idade;
		this.serie = serie;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void respondeAtividade() {
		System.out.println("O aluno " + this.getNome() + " está respondendo a atividade.");
	}
	
	public void fazPergunta() {
		System.out.println("O aluno " + this.getNome() + " está perguntando ao prefessor.");
	}
}
