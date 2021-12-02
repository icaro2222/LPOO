package questao3;

public class Corpo {

	private double tamanho;
	private String tipo;
	private int idade;
	private Orgao orgao;
	private Sistema sistema;

	public Corpo(double tamanho, String tipo, int idade, Orgao orgao, Sistema sistema) {
		super();
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.idade = idade;
		this.orgao = orgao;
		this.sistema = sistema;
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


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public void mover() {
		System.out.println("corpo esta se movendo!\n");
	}


	public Sistema getSistema() {
		return sistema;
	}


	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}


	public Orgao getOrgao() {
		return orgao;
	}


	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
}
