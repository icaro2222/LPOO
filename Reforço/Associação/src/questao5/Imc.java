package questao5;

public class Imc {
	
	private float imc;
	private Pessoa pessoa;
	
	public Imc() {
	}
	public Imc(float imc, Pessoa pessoa) {
		this.imc = imc;
		this.pessoa = pessoa;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public void calcularImc(Pessoa pessoa) {
		this.imc = pessoa.getPeso() / (pessoa.getAltura()*pessoa.getAltura());
		System.out.println("O IMC da pessoa " + pessoa.getNome() + " é " + this.getImc());
	}
}
