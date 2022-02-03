package questao2;

public class Taxi extends Carro{

	private String licenca;
	private double taxaAnual;
	
	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Taxi(String modelo, 
			Motor motor, 
			int velocidadeMax, 
			String licenca, 
			double taxaAnual,
			Double preco) {
		super(modelo, velocidadeMax, motor, preco);
		this.licenca = licenca;
		this.taxaAnual = taxaAnual;
	}
	public String getLicenca() {
		return licenca;
	}
	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}
	public double getTaxaAnual() {
		return taxaAnual;
	}
	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}

    public Double getValorVenda(){
       Double deprec = 0.75d;
       return deprec * getPreco();
    }
	
    // <-- Tatakae -->
}