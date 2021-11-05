package questao10;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        
        Estudante estudante = new Estudante();
        
        System.out.println("-------------------------------");
        System.out.println("Olá, Seja Bem Vindo ao Sistema");
        System.out.println("-------------------------------\n");
        
        int opcaoint = 0;
        String nome = "icaro";
        String nome2 = "woquiton";
        
        
        do{
                opcaoint = Menu();

                switch(opcaoint){

                    case 1:
                        estudante.DeletarEstudante();
                        break;
                    case 2:
                        estudante.MostrarEstudantesCadastrados();
                        break;
                    case 3:
                        estudante.CadastrarEstudante();
                        break;
                    case 4:
                        estudante.ModificarEstudante();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!!");

                    }
                
                System.out.println("Dê Enter!");
                System.in.read();
                limparTela();
        }while(opcaoint != 0);
    }
    
    static public void limparTela(){
        for(int x = 100; x > 0; x--){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
    
    public static int Menu() {
        
        Scanner scan = new Scanner(System.in);
        
	System.out.println("------------------------------------------");
	DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println("Data: " + data_venda.format(LocalDateTime.now()));
	System.out.println("Hora: " + hora_venda.format(LocalDateTime.now()));
        
        System.out.println("- - - - - - MENU - - - - - - ");
        System.out.println("1  - Deletar Estudante");
        System.out.println("2 - Mostrar Estudantes");
        System.out.println("3 - Cadastrar Novo Estudante");
        System.out.println("4 - Modificar Estudante");
        System.out.println("0 - Sair");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("O que você deseja fazer? Escolha:");
	System.out.print(">>> ");
        int opcao = scan.nextInt();
    
    return opcao;
    }
}
