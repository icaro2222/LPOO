package questao3;

public class Celula {

	private String tipo;
	private String nucleo;
	private String ribossomos;
	private String funcao;
	
	public Celula(String tipo, String nucleo, String ribossomos, String funcao) {
		super();
		this.tipo = tipo;
		this.nucleo = nucleo;
		this.ribossomos = ribossomos;
		this.funcao = funcao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNucleo() {
		return nucleo;
	}

	public void setNucleo(String nucleo) {
		this.nucleo = nucleo;
	}

	public String getRibossomos() {
		return ribossomos;
	}

	public void setRibossomos(String ribossomos) {
		this.ribossomos = ribossomos;
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
}
