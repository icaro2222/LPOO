package questao6;

public class SistemaEmpresarial {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("José", "5345435", "rua 3", "soldar", "41 (88)42342422", 32);
		Empresa empresa = new Empresa("Take", "64365456", "Logo alí", "montagem de veiculo", "55 (77)991020374", funcionario);
		
		empresa.prestaServico(empresa.getServico());
		
		empresa.getFuncionario().execerFuncao(funcionario.getFuncao());
	}

}
