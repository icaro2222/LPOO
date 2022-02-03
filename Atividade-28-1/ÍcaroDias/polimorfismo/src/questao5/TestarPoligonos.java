package questao5;

public class TestarPoligonos{
	
	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado("quad", 4, 4, 2.0, 2.0);
		
		quadrado.calcularArea();
		
		
		Poligono poligono = new Poligono();
		
		/*
			As classes abstratas são as que não permitem 
			realizar qualquer tipo de instância. 
			São classes feitas especialmente para serem 
			modelos para suas classes
			
			Descobri por que a um erro ao instanciar o Polígono?


			Resposta: porque é uma classe abstrata, logo não pode ser
			instanciada. Apenas classes filhos podem usar seus atributos
			e métodos.

			
		 */
	}
}