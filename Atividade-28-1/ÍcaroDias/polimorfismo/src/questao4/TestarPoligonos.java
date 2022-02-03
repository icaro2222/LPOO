package questao4;

public class TestarPoligonos{
	
	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado(4.00, 4.00);
		Triangulo triangulo = new Triangulo(4.00, 4.00);
		Circulo circulo = new Circulo(4.00);
		
		
		
		
		
		quadrado.calcularArea();
		triangulo.calcularArea();
		circulo.calcularArea();
		
	}
}