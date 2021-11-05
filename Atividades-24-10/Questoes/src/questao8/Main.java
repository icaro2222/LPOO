package questao8;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    
    /*
    8)Escreva 3 atributos e 3 métodos para uma classe de pacientes, 
    e o mesmo para médicos em uma consulta rotineira. 
    A própria consulta poderia ser também uma classe? 
    Comente sobre essa possibilidade.
    */
    
    /*
    Eu acho que sim, essa consuta na classe main 
    pode sim se torna uma classe para outra parte do sistema.
    E a classe que receber essa classe como objeto ja ira ter dois objetos desta classe instanciados(medico e paciênte).
    */
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        
        Medicos medico = new Medicos();
        Pacientes paciente = new Pacientes();
        
        medico.setIdade(34);
        medico.setNome("woquiton");
        medico.setFuncao("atender pacientes");
        
        paciente.setFuncao("ser atendido");
        paciente.setIdade(21);
        paciente.setNome("Icaro");
        
        
        System.out.println("-------------------------------");
        System.out.println("Olá, Seja Bem Vindo ao Sistema");
        System.out.println("-------------------------------\n");
        
        int opcaoint = 0;
        
        
        do{
                opcaoint = Menu();

                switch(opcaoint){

                    case 1:
                        medico.funcao();
                        break;
                    case 2:
                        medico.idade();
                        break;
                    case 3:
                        medico.nome();
                        break;
                    case 4:
                        limparTela();
                        break;
                    case 5:
                        paciente.funcao();
                        break;
                    case 6:
                        paciente.idade();
                        break;
                    case 7:
                        paciente.nome();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!!");
                    }
                
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
        System.out.println("1 - Função do medico");
        System.out.println("2 - Idade do médico");
        System.out.println("3 - Nome do medico");
        System.out.println("4 - Limpar tela");
        System.out.println("5 - Função do paciênte");
        System.out.println("6 - Idade do paciênte");
        System.out.println("7 - Nome do paciênte");
        System.out.println("0 - Sair");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("O que vocÃª deseja fazer? Escolha:");
	System.out.print(">>> ");
        int opcao = scan.nextInt();
        limparTela();
        
    return opcao;
    }
}
