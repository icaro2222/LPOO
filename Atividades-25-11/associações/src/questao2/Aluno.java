package questao2;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	private Bolsa bolsa;

	public Aluno(String nome, int numeroMatricula, Bolsa bolsa) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		this.bolsa = bolsa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

	public void pergunta() {
		System.out.println("O aluno está fazendo uma pergunta.\n");
	}

	public void levantar() {
		System.out.println("O aluno está levantando.\n");
	}

	public void andar() {
		System.out.println("O aluno está andando.\n");
	}

	public void desenhar(FolhaDePapel folha, lapis lapis,int linha) {
		System.out.println("O aluno está escrendo na linha "+ linha+" .\n");
		lapis.escreverNaLinha(folha, linha);
	}
	
	
}
