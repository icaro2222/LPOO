package questao3;

public class EstudarCorpo {

	public static void main(String[] args) {
		
		Celula celula = new Celula("absortivas", "Teste", "Teste", "Absorver nutrientes");
		Orgao orgao = new Orgao("Absover os nutrientes para corrente sanguínea", "intestino delgado", 16, celula);
		Sistema sistema = new Sistema(0.03, "Disgentivo", "Digerir", orgao);
		
		Corpo corpo = new Corpo(1.8, "Animal", 2, orgao, sistema);
		
		corpo.mover();
	}

}
