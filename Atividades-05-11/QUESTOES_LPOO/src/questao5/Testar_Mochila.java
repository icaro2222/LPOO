package questao5;

public class Testar_Mochila {

	static Mochila mochila_de_negocio = new Mochila();
	static Mochila mochila_de_notebook = new Mochila();
	static Mochila mochila_de_viagem = new Mochila();
	
	public static void main(String[] args) {

		// Mochila de Négocio
		
		mochila_de_negocio.setMaterial("Poliéster 600");
		mochila_de_negocio.setPeso(14);
		mochila_de_negocio.setTipo("negocio");
		

		// Mochila de Notebook
		
		mochila_de_notebook.setMaterial("tecido sintético");
		mochila_de_notebook.setPeso(6);
		mochila_de_notebook.setTipo("notebook");
		

		// Mochila de Négocio
		mochila_de_viagem.setMaterial("couro");
		mochila_de_viagem.setPeso(30);
		mochila_de_viagem.setTipo("viagem");
		

		mochila_de_negocio.abrir();
		System.out.println("\n");
		mochila_de_negocio.fechar();
		System.out.println("\n");
		
		mochila_de_notebook.abrir();
		System.out.println("\n");
		mochila_de_notebook.fechar();
		System.out.println("\n");
		
		mochila_de_viagem.abrir();
		System.out.println("\n");
		mochila_de_viagem.fechar();
		
		System.out.println("\n\n");
		
		System.out.println(" A mochila do tipo  "+
							mochila_de_negocio.getTipo()+
							" suporta "+mochila_de_negocio.getPeso()+" Kg");
		System.out.println("\n");

		System.out.println(" A mochila do tipo  "+
							mochila_de_notebook.getTipo()+
							" suporta "+mochila_de_notebook.getPeso()+" Kg");
		System.out.println("\n");

		System.out.println(" A mochila do tipo  "+
							mochila_de_viagem.getTipo()+
							" suporta "+mochila_de_viagem.getPeso()+" Kg");
		System.out.println("\n");
		
	}

}
