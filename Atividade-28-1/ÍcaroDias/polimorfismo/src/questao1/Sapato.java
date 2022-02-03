package questao1;

public class Sapato extends Calcado{

	private String marca;
	private String estilo;
	
	
	public Sapato() {
		super();
	}


	public Sapato(String cor, Double valor, String validade) {
		super(cor, valor, validade);
	}


	public Sapato(String cor, Double valor, String validade, String marca, String estilo) {
		super(cor, valor, validade);
		this.marca = marca;
		this.estilo = estilo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	public void funcao() {
		System.out.println("Proteger os pés e Ficar Bonito");
	}
}
