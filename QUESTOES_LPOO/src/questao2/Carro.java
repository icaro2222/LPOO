package questao2;

// <----Tatakae---->

public class Carro {
    
    private String fabricante;
    private String modelo;
    private String tracao;
    private String cambio;
    private int velocidade_max;
    private int velocidade_min;
    private int num_porta;
    private float capacidade_para_gasolina;

    public float preco;
    public String cor;
    public String rodas;
    public int velocidade_atual;
    public boolean ligado;
    
    
	public String getfabricante() {
		return fabricante;
	}
	public void setfabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String gettracao() {
		return tracao;
	}
	public void settracao(String tracao) {
		this.tracao = tracao;
	}
	public int getnum_porta() {
		return num_porta;
	}
	public void setnum_porta(int num_porta) {
		this.num_porta = num_porta;
	}
	public float getcapacidade_para_gasolina() {
		return capacidade_para_gasolina;
	}
	public void setcapacidade_para_gasolina(float capacidade_para_gasolina) {
		this.capacidade_para_gasolina = capacidade_para_gasolina;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade_min() {
		return velocidade_min;
	}
	public void setVelocidade_min(int velocidade_min) {
		this.velocidade_min = velocidade_min;
	}
	public int getVelocidade_max() {
		return velocidade_max;
	}
	public void setVelocidade_max(int velocidade_max) {
		this.velocidade_max = velocidade_max;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
}