package questao2;

public class ProfessorManda {

	public static void main(String[] args) {
		
		FolhaDePapel folha = new FolhaDePapel("30X15", "branca", (false), "A4");
		Caderno caderno = new Caderno("12X90", "azul", "yyy", "cxx", "Dura", 340, (false), (true), folha);
		Borracha borracha = new Borracha("1X9", "azul", "yerfy", "cxx", 0.07);
		lapis lapis = new lapis("8", "azul", "yfefery", "cefer", 0.08);
		
		Estojo estojo = new Estojo("12X90", "azul", "yyy", "cxx", 0.5, (false), lapis, borracha);
		Bolsa bolsa = new Bolsa("12X90", "azul", "yyy", "cxx", 2.0, (false), null, caderno, null, estojo);
				
		Aluno aluno = new Aluno("Ícaro", 2222, bolsa);
		
		aluno.andar();
		aluno.pergunta();
		aluno.desenhar(folha, lapis, 15);
		lapis.escrever(folha);
	}

}