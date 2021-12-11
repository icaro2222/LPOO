package questao2;

public class Carro {

	private String ano;
	private String modelo;
	private String cor;
	private String marca;
	
	
	
	public Carro() {
	}
	public Carro(String ano, String modelo, String cor, String marca) {
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar() {
		System.out.println("O carro está ligando");
	}
}