package questao2;

public class FolhaDePapel {

	private String tamanho;
	private String cor;
	private boolean usada;
	private String tipo;
	
	public FolhaDePapel(String tamanho, String cor, boolean usada, String tipo) {

		this.tamanho = tamanho;
		this.cor = cor;
		this.usada = usada;
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isUsada() {
		return usada;
	}
	public void setUsada(boolean usada) {
		this.usada = usada;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
