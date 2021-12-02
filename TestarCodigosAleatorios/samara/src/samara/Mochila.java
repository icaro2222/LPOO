package samara;

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

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	public void abrir() {
		if(aberta == false) {
			this.aberta = true;
			System.out.println("\n\n---Abrindo a mochila de " +tipo);
			System.out.println("A mochila está aberta!");
			
		}else {
			System.out.println("A mochila já estava aberta!");
		}
	}

	public void fechar() {
		if(aberta == true) {
			this.aberta = false;
			System.out.println("---A mochila de " +tipo+  " está sendo fechada!");
			System.out.println("Sua mochila está fechada!");
			
		}else {
			System.out.println("A mochila já estava fechada!");
		}
	}

}