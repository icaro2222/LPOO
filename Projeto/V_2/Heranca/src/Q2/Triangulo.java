package Q2;

public class Triangulo extends FormaGeometrica{

	private Double altura;
	private Double base;
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangulo(Double area, Double perimetro, Double altura, Double base) {
		super(area, perimetro);
		this.altura = altura;
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	
	public void calcularArea() {
		this.setArea((this.getBase() * this.getAltura())/2);
	}
}
