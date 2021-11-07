package questao4;

import questao3.Equacao_2_grau;

//<----Tatakae---->

public class Testar_Equacao_2_grau{
	
	static Equacao_2_grau equacao = new Equacao_2_grau();
	
	public static void main(String[] args) {

		equacao.setA(1);
		equacao.setB(-3);
		equacao.setC(2);
		
		equacao.equacao_2_grau();

	}

}
