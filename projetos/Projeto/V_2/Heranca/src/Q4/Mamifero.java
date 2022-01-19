package Q4;

public class Mamifero extends Animal{

	private String dataNascimento;
	private boolean pelo;

	public Mamifero() {
		super();
	}

	public Mamifero( String nome, double peso, double altura, String dataNascimento) {
		super(nome, peso, altura);
		this.setPelo(pelo);
		this.setDataNascimento(dataNascimento);
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	public void mamar() {
		System.out.println("o mamifero " + this.getNome() + " esta mamando");
	}
}
