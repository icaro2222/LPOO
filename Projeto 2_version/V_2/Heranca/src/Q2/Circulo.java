package Q2;

public class Circulo extends FormaGeometrica{

	private Double raio;
	
	
	public Circulo(Double area, Double perimetro, Double raio) {
		super(area, perimetro);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	public void calcularArea() {
		this.setArea((this.getRaio() * this.getRaio()) * 3.14);
	}
}
