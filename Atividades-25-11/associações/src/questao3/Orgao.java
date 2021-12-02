package questao3;

public class Orgao {

	private String funcao;
	private String nome;
	private int tempoParaExecerFuncao;
	private Celula celula;

	public Orgao(String funcao, String nome, int tempo, Celula celula) {
		super();
		this.funcao = funcao;
		this.nome = nome;
		this.tempoParaExecerFuncao = tempo;
		this.celula = celula;
	}


	public Celula getCelula() {
		return celula;
	}


	public void setCelula(Celula celula) {
		this.celula = celula;
	}

	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTempoParaExecerFuncao() {
		return tempoParaExecerFuncao;
	}


	public void setTempoParaExecerFuncao(int tempoParaExecerFuncao) {
		this.tempoParaExecerFuncao = tempoParaExecerFuncao;
	}


	public void execerFuncao(String funcao) {
		System.out.println("Exercendo a funcao de "+ funcao);
	}
}
