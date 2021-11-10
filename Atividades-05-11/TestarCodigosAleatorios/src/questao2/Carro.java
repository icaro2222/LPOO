package questao2;

public class Carro {
	
	
	private int vel_max;
	private int vel_atual;
	private int km_rodado;
	private boolean ligado = true;
	private boolean gasolina;
	
	public int vel_min;
	
	public String modelo;
	public String marca;
	public String cor;

	
	
	
	public int getVel_atual() {
		return vel_atual;
	}
	public void setVel_atual( int vel_atual) {
		this.vel_atual = vel_atual;
	}
	public int getVel_min() {
		return vel_min;
	}
	public void setVel_min(int vel_min) {
		this.vel_min = vel_min;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVel_max() {
		return vel_max;
	}
	public void setVel_max(int vel_max) {
		this.vel_max = vel_max;
	}
	public boolean getGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	public int getKm_rodado() {
		return km_rodado;
	}
	public void setKm_rodado(int km_rodado) {
		this.km_rodado = km_rodado;
	}

	public void estado(){
		
		if(vel_atual == 0){
			System.out.println("O carro "+modelo+" está em estado de repouso!");
		}else if(vel_atual > 0 && vel_atual < 20){
			System.out.println("O carro "+modelo+" está em até 20km//h!");
		}
	}
	
	public void ligar() {
		if(!ligado) {
			ligado = true;
			System.out.println("O carro está pronto para partir");
		}else {
			System.out.println("O carro já estava ligado");
		}
	}
	


}