package questao3;

public class Sistema {

	private double tamanho;
	private String tipo;
	private String funcao;
	private Orgao orgao;


	public Sistema(double tamanho, String tipo, String funcao, Orgao orgao) {
		super();
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.funcao = funcao;
		this.setOrgao(orgao);
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void execerFuncao(String funcao) {
		System.out.println("Exercendo a funcao de "+ funcao);
	}

	public Orgao getOrgao() {
		return orgao;
	}

	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
}
