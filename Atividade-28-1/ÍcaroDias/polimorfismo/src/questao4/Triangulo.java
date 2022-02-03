package questao4;

public class Triangulo extends Poligono {

	private Double base;
	private Double altura;
	
	public Triangulo() {	}

	public Triangulo(String nome, int quantLados, int quantVest, Double base, Double altura) {
		super(nome, quantLados, quantVest);
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public void calcularArea() {
		double area = (this.getBase()*this.getAltura())/2;
		System.out.println(area);
	}
}
