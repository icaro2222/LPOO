package questao3;


public class TestarTexto {
public static void main(String[] args) {
		
		Lapis lapis1 = new Lapis("preto",(true),1);
		
		Borracha borracha1 = new Borracha();
        
		FolhaDePapel papel1 = new FolhaDePapel(true, 1);
		
		Escritor escritor1 = new Escritor("Miguel Cotrim", 4, lapis1, borracha1, papel1);
		
		escritor1.apresentacao();
		
		escritor1.getBorracha1().apagar(papel1, 23);
		escritor1.getLapis1().escrever(papel1, 12);
		escritor1.getBorracha1().apagar(papel1, 33);
		escritor1.getLapis1().escrever(papel1, 33);
		escritor1.getLapis1().escrever(papel1, 12);
}
}




