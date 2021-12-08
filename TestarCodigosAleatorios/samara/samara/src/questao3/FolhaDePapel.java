package questao3;

public class FolhaDePapel {
	

	private boolean emBranco;
	private int tipo;
	

	public FolhaDePapel(boolean emBranco, int tipo) {
		super();
		this.emBranco = emBranco;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isEmBranco() {
		return emBranco;
	}

	public void setEmBranco(boolean emBranco) {
		this.emBranco = emBranco;
	}
	

}