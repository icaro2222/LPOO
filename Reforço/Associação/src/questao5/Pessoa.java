package questao5;

public class Pessoa {

	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade, float peso, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
