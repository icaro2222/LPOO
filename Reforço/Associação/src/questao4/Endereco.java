package questao4;

public class Endereco {

	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
		
	public Endereco() {
	}	
	
	public Endereco(String pais, String estado, String cidade, String bairro, String rua, int numero) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
