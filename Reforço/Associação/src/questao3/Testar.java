package questao3;

public class Testar {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Brasil", "BA", "Guanambi", "Alto Caiçara", "Rua 5", 75);
		Universidade universidade = new Universidade("IFBaiano", "Boa", endereco);
		Pessoa pessoa = new Pessoa("Ícaro", "28/12/2000", universidade);
		
		pessoa.getNome();
		pessoa.irAuniversidade(universidade);
		
	}

}
