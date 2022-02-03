package questao3;

public class Calcado {
	
	private String cor;
	private Double valor;
	private String validade;
	
	
	public Calcado() {}
	
	public Calcado(String cor, Double valor, String validade) {
		this.cor = cor;
		this.valor = valor;
		this.validade = validade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	public void funcao() {
		System.out.println("Proteger os pés");
	}
}
