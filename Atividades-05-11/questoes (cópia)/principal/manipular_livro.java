package principal;

import livro.livro;
import menu.menu;

public class manipular_livro {

	static livro livro1 = new livro();
	static livro livro2 = new livro();
	
	static menu menu = new menu();
	
	static private int opcao;
	
	public static void main(String[] args) {
		
		while(true) {

			opcao = menu.menu_livro();
			
			switch(opcao) {
			
			case 1:
				livro1.getAutor();
			break;
			
			case 2:
				
			break;
			
			}
		}
	}

}
