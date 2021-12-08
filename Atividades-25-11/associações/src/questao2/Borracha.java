package questao2;

public class Borracha {

	private String tamanho;
	private String cor;
	private String modelo;
	private String fabricante;
	private double peso;

	public Borracha(String tamanho, String cor, String modelo, String fabricante, double peso) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void apagarFolha(FolhaDePapel folha) {
		System.out.println("Apagando a folha inteira");
	}
	
	public void apagarLinha(FolhaDePapel folha, int linha) {
		System.out.println("Apagando a linha "+ linha);
	}
}
