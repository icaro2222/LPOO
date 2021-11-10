package questao1;
import java.util.Scanner;

public class testarLivro {
		
	static Scanner scan = new Scanner(System.in);
	
	static Livro livro1 = new Livro();
	static Livro livro2 = new Livro();
	static Livro livro3 = new Livro();
	
	public static void main(String[] args) {
		livro1.setTitulo("A moreninha");
		livro1.setAutor("Joaquim Manoel de Macêdo");
		livro1.setEditora(" B.L.Garnier");
		livro1.setPaginas(105);
		livro1.setPreco(22.00f);
		livro1.setComprar(true);
	
		
		
		
		livro2.setTitulo("Dom Casmurro");
		livro2.setAutor("Machado de Assis");
		livro2.setEditora(" B.L.Garnier");
		livro2.setPaginas(115);
		livro2.setPreco(27.00f);
		livro2.setComprar(false);
	   
		
		
		livro3.setTitulo("A Bela e a Fera");
		livro3.setAutor("Gabrielle-Suzanne Barbot");
		livro3.setEditora(" Universo dos Livros");
		livro3.setPaginas(98);
		livro3.setPreco(27.90f);
		livro3.setComprar(true);
	 
		
		
		
		
		infor(livro1);
		livro1.classificacao();
		infor(livro2);
		livro2.classificacao();
		infor(livro3);
		livro3.classificacao();
		
	}
		
		public static void infor(Livro livro) {
			System.out.println("\n\n------INFORMAÇÕES------");
			System.out.println("Nome do livro:" +livro.getTitulo());
			System.out.println("Autor do livro: " +livro.getAutor());
			System.out.print("Editora:" +livro.getEditora());
			System.out.print("\nPáginas:" +livro.getPaginas());
			System.out.print("\nValor do livro:" +livro.getPreco());
		
		
		}		
			
		
		
	}