package questao5;

public class Testar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("icaro", 20, 75, (float) 1.65);
		Imc imc = new Imc(0, pessoa);
		
		imc.calcularImc(pessoa);
	}

}
