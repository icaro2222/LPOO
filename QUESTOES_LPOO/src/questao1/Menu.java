package questao1;
import java.util.Scanner;


public class Menu {
	

    Scanner scan = new Scanner(System.in);
	private static int opcao;
	
	public int menu_livro() {

		System.out.println("1- Listar Titulo dos Livros");		
		System.out.println("2- Listar Nome dos Autores");		
		System.out.println("3- Listar Nome dos Autores e seus livros");		
		System.out.println("4- Listar Titulo dos Livros e seu preço");		
		System.out.println("5- Listar Titulo dos Livros e numero de paginas");				
		System.out.println("0- Sair");		
		
		opcao = scan.nextInt();
		
		return opcao;
	}
}
