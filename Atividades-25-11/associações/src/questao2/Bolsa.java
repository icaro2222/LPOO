package questao2;

public class Bolsa {
	
	private String tamanho;
	private String cor;
	private String modelo;
	private String fabricante;
	private double peso;
	private boolean aberta;
	private lapis lapis;
	private Caderno caderno;
	private Borracha borracha;
	private Estojo estojo;
	

	public Bolsa(String tamanho, String cor, String modelo, String fabricante, double peso, boolean aberta,
			lapis lapis, Caderno caderno, Borracha borracha, Estojo estojo) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.aberta = aberta;
		this.lapis = lapis;
		this.caderno = caderno;
		this.borracha = borracha;
		this.estojo = estojo;
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

	public Caderno getCaderno() {
		return caderno;
	}

	public void setCaderno(Caderno caderno) {
		this.caderno = caderno;
	}

	public Borracha getBorracha() {
		return borracha;
	}

	public void setBorracha(Borracha borracha) {
		this.borracha = borracha;
	}

	public Estojo getEstojo() {
		return estojo;
	}

	public void setEstojo(Estojo estojo) {
		this.estojo = estojo;
	}
	
	public void abrir() {
		if(aberta) {
			System.out.println("\nBolsa já está aberto.\n");
		}else {
			System.out.println("\nAbrindo Bolsa.\n");
		}
	}
	
	public void fechar() {
		if(aberta) {
			System.out.println("\nfechando Bolsa.\n");
		}else {
			System.out.println("\nBolsa já está fechado.\n");
		}
	}
}
