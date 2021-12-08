package questao3;


public class Escritor {

	private String nome;
	private int quantexto;
	private Lapis lapis1;
	private Borracha borracha1;
	private FolhaDePapel papel1;
	
	
	public Escritor(String nome, int quantexto, Lapis lapis1, Borracha borracha1, FolhaDePapel papel1) {
		super();
		this.nome = nome;
		this.quantexto = quantexto;
		this.lapis1 = lapis1;
		this.borracha1 = borracha1;
		this.papel1 = papel1;
	}

	public Lapis getLapis1() {
		return lapis1;
	}

	public void setLapis1(Lapis lapis1) {
		this.lapis1 = lapis1;
	}

	public Borracha getBorracha1() {
		return borracha1;
	}

	public void setBorracha1(Borracha borracha1) {
		this.borracha1 = borracha1;
	}

	public FolhaDePapel getPapel1() {
		return papel1;
	}

	public void setPapel1(FolhaDePapel papel1) {
		this.papel1 = papel1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantexto() {
		return quantexto;
	}

	public void setQuantexto(int quantexto) {
		this.quantexto = quantexto;
	}
	
	
	public void apresentacao() {
		System.out.println("O escritor " +getNome()+
						   " já escreveu " +getQuantexto()+
						   " textos para o seu novo lançamento");
	}
}





