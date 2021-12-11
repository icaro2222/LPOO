package questao4;

import questao4.Endereco;

public class Testar {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Brasil", "BA", "Guanambi", "Alto Caiçara", "Rua 5", 75);
		Setor setor = new Setor("Comunicação", 4);
		Funcionario funcionario = new Funcionario("Ícaro", "28/12/2000", 5000f, 0.01f, setor, endereco);
		
		funcionario.lacalizaSe();
	}

}
