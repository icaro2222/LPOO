package questao3;

public class Borracha {

	public void apagar(FolhaDePapel folha, int posicao) {
		if(!folha.isEmBranco()) {
			folha.setEmBranco(true);
			System.out.println("A borrachar está apagando texto");
		}else {
			System.out.println("Não a nada no papel");
			
		}
	}
}