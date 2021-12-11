package questao4;

public class Funcionario {

	private String nome;
	private String dataDeNascimento;
	private float salario;		
	private float bonus;
	private Setor setor;	
	private Endereco endereco;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String dataDeNascimento, float salario, float bonus, Setor setor,
			Endereco endereco) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
		this.bonus = bonus;
		this.setor = setor;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void lacalizaSe() {
		System.out.println("O funcionario " + this.getNome() + " se localiza no endereço " + getEndereco().getCidade());
	}

	public void trabalharEmSetor() {
		System.out.println("O funcionario " + this.getNome() + " trabalha no setor " + getSetor().getNome());
	}
}
