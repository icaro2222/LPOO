package menu;
import java.util.Scanner;


public class menu {
	

    Scanner scan = new Scanner(System.in);
	private static int opcao;
	
	public int menu_livro() {
		
		System.out.println("1-ferw");		
		System.out.println("1-ferf");		
		System.out.println("1-fqwef");		
		System.out.println("1-wefweqf");	
		
		opcao = scan.nextInt();
		
		return opcao;
	}
}
