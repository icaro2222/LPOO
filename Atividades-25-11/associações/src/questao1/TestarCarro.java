package questao1;

public class TestarCarro
{
	public static void main(String[] args) {
		
		
	    Condutor meuCondutor;
	    Carro meuCarro;
	    
	    meuCondutor = new Condutor("123456-7");
	    meuCarro = new Carro("Kombi", new Motor("Fiat", 2.0, "Gasolina"));
	    
	    meuCondutor.dirigir(meuCarro);
	}
    // <-- Tatakae -->
}