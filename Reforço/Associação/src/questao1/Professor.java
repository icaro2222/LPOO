package questao1;

public class Professor {

	private String nome;
	private String numCadastro;
	private int idade;
	private String materia;
	private Aluno aluno;
	private Endereco endereco;
	
	public Professor() {
	}
	
	public Professor(String nome, String numCadastro, int idade, String materia, Aluno aluno, Endereco endereco) {
		super();
		this.nome = nome;
		this.numCadastro = numCadastro;
		this.idade = idade;
		this.materia = materia;
		this.aluno = aluno;
		this.endereco = endereco;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumCadastro() {
		return numCadastro;
	}
	public void setNumCadastro(String numCadastro) {
		this.numCadastro = numCadastro;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void escreverNoQuadro() {
		System.out.println("O professor " + this.getNome() + " está escrevendo no quadro.");
	}
	
	public void apagarQuadro() {
		System.out.println("O professor " + this.getNome() + " está apagando quadro.");
	}
}
