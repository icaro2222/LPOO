package questao4;

public class Poligono {

	private String nome;
	private int quantLados;
	private int quantVest;
	
	public Poligono() {	}
	
	public Poligono(String nome, int quantLados, int quantVest) {
		this.nome = nome;
		this.quantLados = quantLados;
		this.quantVest = quantVest;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantLados() {
		return quantLados;
	}

	public void setQuantLados(int quantLados) {
		this.quantLados = quantLados;
	}

	public int getQuantVest() {
		return quantVest;
	}

	public void setQuantVest(int quantVest) {
		this.quantVest = quantVest;
	}
	
	public void calcularArea() {
		
	}
	
}
