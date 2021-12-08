package questao3;

public class Lapis{
	
    private String cor;
    private boolean escrever;
    private  int tipo;

    
    public Lapis(String cor, boolean escrever, int tipo){
        this.setCor(cor);
        this.setEscrever(escrever);
        this.setTipo(tipo);
    }
    

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isEscrever() {
		return escrever;
	}

	public void setEscrever(boolean escrever) {
		this.escrever = escrever;
	}

	public void material() {
		if(getTipo() == 1) {
			System.out.println("O lápis usado émcomun");
			
		}else {
			System.out.println("O lápis usado é para textos profissionais");
			
			
		}
	}

	public void escrever(FolhaDePapel folha, int posicao) {
		if(folha.isEmBranco()) {
			folha.setEmBranco(false);
			System.out.println("A Lapís esta riscando");
			
		}else {
			System.out.println("A papel não está em branco");
			
		}
	}
}
