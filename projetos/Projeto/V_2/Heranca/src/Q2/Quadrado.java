package Q2;

public class Quadrado extends FormaGeometrica{

	private Double altura;
	private Double largura;
	
	public Quadrado() {
		super();
	}

	public Quadrado(Double area, Double perimetro, Double altura, Double largura) {
		super(area, perimetro);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public void calcularArea() {
		this.setArea((this.getAltura() * this.getLargura()));
	}
}
