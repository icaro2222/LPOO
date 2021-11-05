package questoes1_a_6;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        
        Funcionaio funcionario1 = new Funcionaio();
        Funcionaio funcionario2 = new Funcionaio();
        
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        
        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaCorrente contaCorrente2 = new ContaCorrente();
        
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        
        System.out.println("-------------------------------");
        System.out.println("Olá, Seja Bem Vindo ao Sistema");
        System.out.println("-------------------------------\n");
        
        int opcaoint = 0;
        String nome = "icaro";
        String nome2 = "woquiton";
        
        cliente1.setNome(nome);
        cliente2.setNome(nome2);
        
        do{
            
            System.out.println("-------------------------------");
            System.out.println("Escolha uma das opcões:");
            System.out.println("1_Clientes");
            System.out.println("2_Produtos");
            System.out.println("3_Funcionarios");
            System.out.println("4_Estudantes");
            System.out.println("5_ContaCorrente");
            System.out.println("6_ContaPoupança");
            System.out.println("0_SAIR");
            String opcao = scan.nextLine();
            opcaoint = Integer.parseInt(opcao) ;
            
            limpartela();
            switch(opcaoint){
                case 1:
                cliente1.acordar();
                cliente2.acordar();

                System.out.println("-------------------------------");
                cliente1.comer();
                cliente2.comer();

                System.out.println("-------------------------------");
                cliente1.dormir();
                cliente2.dormir();
                break;
                case 2:
                    produto1.setNome("Feijão");
                    produto2.setNome("Arroz");
                    
                    produto1.setQuantidade(10);
                    produto2.setQuantidade(10);
                    
                    produto1.setValidade("10/20/2022");
                    produto2.setValidade("10/20/2022");
                            
                    
                    produto1.nome();
                    produto2.nome();
                    
                    produto1.quatidade();
                    produto2.quatidade();
                    
                    produto1.validade();
                    produto2.validade();
                break;
                case 3:
                    
                    funcionario1.setNome(nome);
                    funcionario2.setNome(nome2);
                    
                    System.out.println("-------------------------------");
                    funcionario1.acorda();
                    funcionario2.acorda();

                    System.out.println("-------------------------------");
                    funcionario1.comer();
                    funcionario2.comer();

                    System.out.println("-------------------------------");
                    funcionario1.dormi();
                    funcionario2.dormi();
                break;
                case 4:
                    
                    estudante1.setNome(nome);
                    estudante2.setNome(nome2);
                    
                    estudante1.acordar();
                    estudante2.acordar();

                    System.out.println("-------------------------------");
                    estudante1.comer();
                    estudante2.comer();

                    System.out.println("-------------------------------");
                    estudante1.dormir();
                    estudante2.dormir();
                break;
                case 5:
                    
                    contaCorrente1.setAtiva(true);
                    contaCorrente2.setAtiva(false);
                    
                    contaCorrente1.setNumeroConta("2222");
                    contaCorrente2.setNumeroConta("1111");
                    
                    contaCorrente1.setValorAtual(400.00);
                    contaCorrente2.setValorAtual(0);
                    
                    contaCorrente1.ativada();
                    contaCorrente1.numero();
                    contaCorrente1.valor();
                    
                    contaCorrente2.numero();
                    contaCorrente2.ativada();
                    contaCorrente2.valor();
                    
                break;
                case 6:

                    contaPoupanca1.setAtiva(true);
                    contaPoupanca2.setAtiva(false);
                    
                    contaPoupanca1.setNumeroConta("3333");
                    contaPoupanca2.setNumeroConta("4444");
                    
                    contaPoupanca1.setValorAtual(111.00);
                    contaPoupanca2.setValorAtual(0);
                    
                    contaPoupanca1.ativada();
                    contaPoupanca1.numero();
                    contaPoupanca1.valor();
                    
                    contaPoupanca2.numero();
                    contaPoupanca2.ativada();
                    contaPoupanca2.valor();
                    
                break;
                default:
            }
        }while(opcaoint != 0);
    }
    
    static public void limpartela(){
        for(int x = 100; x > 0; x--){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
}
