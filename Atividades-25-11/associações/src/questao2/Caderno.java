package questao2;

public class Caderno {

	private String tamanho;
	private String cor;
	private String modelo;
	private String fabricante;
	private String TipoCapa;
	private int numeroDeFolha;
	private boolean aberta;
	private boolean usado;
	private FolhaDePapel folhaDePapel;
	
	public Caderno(String tamanho, String cor, String modelo, String fabricante, String tipoCapa, int numeroDeFolha,
			boolean aberta, boolean usado, FolhaDePapel folhaDePapel) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		TipoCapa = tipoCapa;
		this.numeroDeFolha = numeroDeFolha;
		this.aberta = aberta;
		this.usado = usado;
		this.folhaDePapel = folhaDePapel;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
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
	public String getTipoCapa() {
		return TipoCapa;
	}
	public void setTipoCapa(String tipoCapa) {
		TipoCapa = tipoCapa;
	}
	public int getNumeroDeFolha() {
		return numeroDeFolha;
	}
	public void setNumeroDeFolha(int numeroDeFolha) {
		this.numeroDeFolha = numeroDeFolha;
	}
	public boolean isUsado() {
		return usado;
	}
	public void setUsado(boolean usado) {
		this.usado = usado;
	}
	public FolhaDePapel getFolhaDePapel() {
		return folhaDePapel;
	}
	public void setFolhaDePapel(FolhaDePapel folhaDePapel) {
		this.folhaDePapel = folhaDePapel;
	}
	public void abrir() {
		if(aberta) {
			System.out.println("\nCaderno já está aberto.\n");
		}else {
			System.out.println("\nAbrindo Caderno.\n");
		}
	}
	
	public void fechar() {
		if(aberta) {
			System.out.println("\nfechando Caderno.\n");
		}else {
			System.out.println("\nCaderno já está fechado.\n");
		}
	}
}
