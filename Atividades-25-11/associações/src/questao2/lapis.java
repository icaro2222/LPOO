package questao2;

public class lapis {

	private String tamanho;
	private String cor;
	private String modelo;
	private String fabricante;
	private double peso;

	public lapis(String tamanho, String cor, String modelo, String fabricante, double peso) {
		super();
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

	public void riscar(FolhaDePapel folha) {
		System.out.println("Riscando a folha");
	}

	public void escrever(FolhaDePapel folha) {
		System.out.println("Escrevendo na folha");
	}
	
	public void escreverNaLinha(FolhaDePapel folha, int linha) {
		System.out.println("Escrevendo na flinha "+ linha);
	}
}
