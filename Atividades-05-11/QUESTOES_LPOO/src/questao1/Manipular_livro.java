package questao1;

import java.util.Scanner;

public class Manipular_livro {

    static Scanner scan = new Scanner(System.in);
	static Livro livro1 = new Livro();
	static Livro livro2 = new Livro();
	
	static Menu menu = new Menu();
	
	static private int opcao;
	
	public static void main(String[] args) {
		
		
		livro1.setAditora("Paz e Terra");
		livro1.setAutor("FURTADO, C.");
		livro1.setNum_pag(92);
		livro1.setPreco(55.00f);
		livro1.setTitulo("O Mito do desenvolvimento econômico");
		
		livro2.setAditora("Paz e Terra");
		livro2.setAutor("FURTADO, C.");
		livro2.setNum_pag(84);
		livro2.setPreco(10.00f);
		livro2.setTitulo("O capitalismo global");
		
		
		while(true) {

			opcao = menu.menu_livro();
			if(opcao==0)break;
			System.out.println("\n\n");
			
			switch(opcao) {
			
			case 1:
				System.out.println(livro1.getTitulo());
				System.out.println(livro2.getTitulo());
				
			break;
			
			case 2:
				System.out.println(livro1.getAutor());
				System.out.println(livro2.getAutor());
			break;
			
			case 3:
				System.out.println(livro1.getAutor()+" : "+livro1.getTitulo());
				System.out.println(livro2.getAutor()+" : "+livro2.getTitulo());
			break;
			
			case 4:
				System.out.println(livro1.getTitulo()+" : "+livro1.getPreco()+" R$ reais");
				System.out.println(livro2.getTitulo()+" : "+livro1.getPreco()+" R$ reais");
			break;
			
			case 5:
				System.out.println(livro1.getTitulo()+" : "+livro1.getNum_pag());
				System.out.println(livro2.getTitulo()+" : "+livro2.getNum_pag());
			break;
			}
			System.out.println("\nDê enter");
			scan.nextLine();
		}
	}

}
