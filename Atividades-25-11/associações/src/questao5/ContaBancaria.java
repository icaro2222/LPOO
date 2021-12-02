package questao5;

public class ContaBancaria {
	
	private int numeroConta;
	private String tipo;
	private double saldo;
	private boolean ativa;
	
	public ContaBancaria(int numeroConta, String tipo, double saldo, boolean ativa) {
		super();
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.saldo = saldo;
		this.ativa = ativa;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
}