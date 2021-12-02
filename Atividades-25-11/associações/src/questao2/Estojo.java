package questao2;

public class Estojo {

	private String tamanho;
	private String cor;
	private String modelo;
	private String fabricante;
	private double peso;
	private boolean aberta;
	private lapis lapis;
	private Borracha borracha;

	
	public Estojo(String tamanho, String cor, String modelo, String fabricante, double peso, boolean aberta,
			questao2.lapis lapis, Borracha borracha) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.aberta = aberta;
		this.lapis = lapis;
		this.borracha = borracha;
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

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public lapis getLapis() {
		return lapis;
	}

	public void setLapis(lapis lapis) {
		this.lapis = lapis;
	}

	public Borracha getBorracha() {
		return borracha;
	}

	public void setBorracha(Borracha borracha) {
		this.borracha = borracha;
	}

	public void abrir() {
		if(aberta) {
			System.out.println("\nEstojo já está aberto.\n");
		}else {
			System.out.println("\nAbrindo Estojo.\n");
		}
	}
	
	public void fechar() {
		if(aberta) {
			System.out.println("\nfechando Estojo.\n");
		}else {
			System.out.println("\nEstojo já está fechado.\n");
		}
	}
}
