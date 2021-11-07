package questao5;

public class Mochila {

	private String material;
	private float peso;
	private String tipo;
	private boolean aberta;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	public void abrir() {
		if(aberta==false) {
			this.aberta = true;
			System.out.println("Abrindo Mochila de "+tipo+" ...");
			System.out.println("17%...");
			System.out.println("43%...");
			System.out.println("65%...");
			System.out.println("82%...");
			System.out.println("98%...");
			System.out.println("Mochila  de "+tipo+" Aberta com Sucesso!");
		}else {
			System.out.println("Não é possivél a ação, pois a mochila de "+tipo+" já está Aberta!");
		}
	}

	public void fechar() {
		if(aberta==true) {
			this.aberta = false;
			System.out.println("Fechando Mochila de "+tipo+" ...");
			System.out.println("17%...");
			System.out.println("43%...");
			System.out.println("65%...");
			System.out.println("82%...");
			System.out.println("98%...");
			System.out.println("Mochila de "+tipo+" Fechanda com Sucesso!");
		}else {
			System.out.println("Não é possivél a ação, pois a mochila de "+tipo+" já está Fechanda!");
		}
	}
	
	
	
	
}
