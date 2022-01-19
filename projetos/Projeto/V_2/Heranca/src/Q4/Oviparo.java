package Q4;

public class Oviparo extends Animal{

	private String tipo;
	private boolean pelo;
	
	public Oviparo( String nome, double peso, double altura, String tipo, boolean pelo) {
		super(nome, peso, altura);
		this.tipo = tipo;
		this.pelo = pelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isPelo() {
		return pelo;
	}
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	
	public void porOvo() {
		System.out.println("O oviparo " + this.getNome() + " esta pondo ovo");
	}
	
}
