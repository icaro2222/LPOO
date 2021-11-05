package questao9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);

    static ProdutoDeLimpeza produto = new ProdutoDeLimpeza();
    static Remedio remedio = new Remedio();
    static int opcaoint;
        
    public static void main(String[] args) throws IOException{
        System.out.println("-------------------------------");
        System.out.println("Olá, Seja Bem Vindo ao Sistema");
        System.out.println("-------------------------------\n");
        
        
        do{

            opcaoint = MenuInicial();
            
            switch(opcaoint){
                
                case 1:
                    MenuMedicamentos();
                    break;
                case 2:
                    MenuProdutos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }while(opcaoint != 0);
        
    }
    
    static public void limparTela(){
        for(int x = 100; x > 0; x--){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
    
    public static void MenuProdutos() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
	System.out.println("------------------------------------------");
	DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println("Data: " + data_venda.format(LocalDateTime.now()));
	System.out.println("Hora: " + hora_venda.format(LocalDateTime.now()));
        
        System.out.println("- - - - - - MENU - - - - - - ");
        System.out.println("1 - Deletar Produto");
        System.out.println("2 - Mostrar Produtos");
        System.out.println("3 - Cadastrar Novo Produto");
        System.out.println("4 - Modificar Produto");
        System.out.println("0 - Sair");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("O que você deseja fazer? Escolha:");
	System.out.print(">>> ");
        int opcao = scan.nextInt();
        
        if(opcao > 0 && opcao < 5){
            produtos(opcao);
        }else if(opcao == 0 ){
            limparTela();
        }else{
            limparTela();
            System.out.println("Opção Inválida");
            MenuMedicamentos();
        }
    
    
    }
    
    public static void MenuMedicamentos() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
	System.out.println("------------------------------------------");
	DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println("Data: " + data_venda.format(LocalDateTime.now()));
	System.out.println("Hora: " + hora_venda.format(LocalDateTime.now()));
        
        System.out.println("- - - - - - MENU - - - - - - ");
        System.out.println("1 - Deletar Remedeio");
        System.out.println("2 - Mostrar Remedeios");
        System.out.println("3 - Cadastrar Novo Remedeio");
        System.out.println("4 - Modificar Remdeeio");
        System.out.println("0 - Sair");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("O que você deseja fazer? Escolha:");
	System.out.print(">>> ");
        int opcao = scan.nextInt();
        
        if(opcao > 0 && opcao < 5){
            medicamento(opcao);
        }else if(opcao == 0 ){
            limparTela();
        }else{
            limparTela();
            System.out.println("Opção Inválida");
            MenuMedicamentos();
        }
    
    }
    
    public static int MenuInicial() {
        
        
        Scanner scan = new Scanner(System.in);
        
	System.out.println("------------------------------------------");
	DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println("Data: " + data_venda.format(LocalDateTime.now()));
	System.out.println("Hora: " + hora_venda.format(LocalDateTime.now()));
        
        System.out.println("- - - - - - MENU - - - - - - ");
        System.out.println("1 - Remedios");
        System.out.println("2 - Produtos");
        System.out.println("0 - Sair");
	System.out.print(">>> ");
        int opcao = scan.nextInt();
        
    return opcao;
    }
    
    public static void medicamento(int opcaoint) throws IOException{
        
        do{
            
                switch(opcaoint){

                    case 1:
                        remedio.DeletarRemedio();
                        break;
                    case 2:
                        remedio.MostrarRemediosCadastrados();
                        System.out.println("Dê Enter!");
                        System.in.read();
                        break;
                    case 3:
                        remedio.CadastrarRemedio();
                        break;
                    case 4:
                        remedio.ModificarRemedio();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!!");
                    }
                
                limparTela();
                MenuMedicamentos();
        }while(opcaoint != 0);
    }
    
    public static void produtos(int opcaoint) throws IOException{
        
        do{
            
                switch(opcaoint){

                    case 1:
                        produto.DeletarProduto();
                        break;
                    case 2:
                        produto.MostrarProdutosCadastrados();
                        System.out.println("Dê Enter!");
                        System.in.read();
                        break;
                    case 3:
                        produto.CadastrarProduto();
                        break;
                    case 4:
                        produto.ModificarProduto();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!!");
                    }
                
                limparTela();
                MenuProdutos();
        }while(opcaoint != 0);
    }
}
