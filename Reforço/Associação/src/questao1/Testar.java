package questao1;

public class Testar {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Brasil", "BA", "Pndai", "Sanharo", "Rua B", 5);
		Endereco endereco1 = new Endereco("Brasil", "BA", "Guanambi", "Alto Caiçara", "Rua 5", 75);
		
		Aluno aluno = new Aluno("icaro", "2021GBI023", 20, "3 Semestre", endereco);
		Professor professor = new Professor("Woquiton", "2021GBI2222", 37, "LPOO", aluno, endereco1);
		
		
		professor.escreverNoQuadro();
		professor.apagarQuadro();
		aluno.fazPergunta();
		aluno.respondeAtividade();

	}

}
