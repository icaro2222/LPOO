package questao6;

public class Funcionario {

    private String nome;
    private String cpf;
    private String endereco;
    private String funcao;
    private String numeroTelefonico;
    private int idade;
    
    public Funcionario(String nome, String cpf, String endereco, String funcao, String numeroTelefonico, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.funcao = funcao;
		this.numeroTelefonico = numeroTelefonico;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void execerFuncao(String funcao) {
    	System.out.print("O funcionário " + getNome());
    	System.out.println(" exerce a função de " + funcao);
    }
}
