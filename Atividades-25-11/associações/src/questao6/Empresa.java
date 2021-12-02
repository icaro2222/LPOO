package questao6;

public class Empresa {

    private String nome;
    private String cnpj;
    private String endereco;
    private String servico;
    private String numeroTelefonico;
    private Funcionario funcionario;
     
    public Empresa(String nome, String cnpj, String endereco, String servico, String numeroTelefonico) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.servico = servico;
		this.numeroTelefonico = numeroTelefonico;
	}

	public Empresa(String nome, String cnpj, String endereco, String servico, String numeroTelefonico,
			Funcionario funcionario) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.servico = servico;
		this.numeroTelefonico = numeroTelefonico;
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public void prestaServico(String servico) {
    	System.out.println("A empresa " + getNome() + " presta o serviço de "+ servico);
    }

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
