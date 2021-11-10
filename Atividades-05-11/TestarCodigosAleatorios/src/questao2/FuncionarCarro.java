package questao2;

import java.util.Scanner;

public class FuncionarCarro{
	
	static Scanner scan = new Scanner(System.in);
	
	static Carro carro1 = new Carro();
	static Carro carro2 = new Carro();
	
	
	
	public static void main(String[] args) {
		carro1.modelo = "Creta";
		carro1.marca ="Hyundai";
		carro1.cor = "Branco";
		carro1.setKm_rodado(345);
		carro1.setVel_atual(0);
		
		carro2.modelo ="Gol";
		carro2.marca ="Fiat";
		carro2.cor = "Vermelho";
		carro2.setKm_rodado(25678);
		carro2.setVel_atual(2);


		carro1.ligar();
		carro2.ligar();
		carro1.estado();
		carro2.estado();

		apresentacao(carro1);
		apresentacao(carro2);
	}

	public static void apresentacao(Carro carro) {
		System.out.println("\n\n------APRESENTAÇÃO DO CARRO------");
		System.out.println("Modelo do carro:"  +carro.modelo);
		System.out.println("Marca:" +carro.marca);
		System.out.println("Cor:" +carro.cor);
		System.out.println("km_rodado:" +carro.getKm_rodado());
		}
}
