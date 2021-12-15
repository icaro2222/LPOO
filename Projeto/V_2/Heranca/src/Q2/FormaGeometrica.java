package Q2;

public class FormaGeometrica {
	

	private Double area;
	private Double perimetro;
	
	
	public FormaGeometrica() {
	}
	
	public FormaGeometrica(Double area, Double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}
	
}

