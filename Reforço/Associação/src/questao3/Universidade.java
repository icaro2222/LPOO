package questao3;

public class Universidade {

	private String nome;
	private String reputacao;
	private Endereco endereco;
	
	
	public Universidade() {
	}
	public Universidade(String nome, String reputacao, Endereco endereco) {
		this.nome = nome;
		this.reputacao = reputacao;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getReputacao() {
		return reputacao;
	}
	public void setReputacao(String reputacao) {
		this.reputacao = reputacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
