package questao4;

public class Circulo extends Poligono{

	private Double raio;
	private Double pi = 3.14;

	public Circulo() {	}

	public Circulo(String nome, int quantLados, int quantVest) {
		super(nome, quantLados, quantVest);
	}

	public Circulo(Double Raio) {
		super();
		this.raio = Raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double Raio) {
		this.raio = Raio;
	}

	public Double getPi() {
		return pi;
	}

	public void setPi(Double pi) {
		this.pi = pi;
	}

	public void calcularArea() {
		double area = (this.getRaio()*this.getRaio()*this.getPi());
		System.out.println(area);
	}
}
