package ControleDeEstoque;

import static ControleDeEstoque.Funcoes.nome;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ControleDeEstoque {

    static Funcoes funcao = new Funcoes();
    static Usuarios funcaoUsuario = new Usuarios();
            
    public static void main(String[] args) throws IOException, InterruptedException {

    //Path diretorio = Paths.get(C:/Users/Ícaro-Tatakae/Documents);
    
    Variaveis variaveis = new Variaveis();
    
        Scanner scan = new Scanner(System.in);
        
        funcao.CriarArquivo("BDadmin.txt");
        funcao.LerArquivoSalvo("BD.txt");
        boolean logado = funcao.Logar();

        if(logado){
            funcao.LimparTela();

            while(true){

                int opcaoint = funcao.Menu();

                switch(opcaoint){

                    case 1:
                        funcao.MostrarProdutosEmEstoque();
                        break;
                    case 2:
                        funcaoUsuario.MostrarClientesCadastrados(funcao.getNomeClientes());
                        break;
                    case 3:
                        funcaoUsuario.CadastrarCliente(funcao.getNomeClientes());
                        break;
                    case 4:
                        funcao.LimparTela();
                        funcao.ValorEmCaixa();
                        break;
                    case 5:
                        funcao.VenderProdutos();
                        break;
                    case 6:
                        funcao.LimparTela();
                        break;
                    case 7:
                        funcaoUsuario.ModificarUsuario(funcao.getNomeClientes());
                        break;
                    case 8:
                        funcaoUsuario.DeletarUsuario(funcao.getNomeClientes());
                        break;
                    default:
                        System.out.println("Opção invalida!!");

                    }
                if(opcaoint == 9){
                    System.out.println("- - - - - - Desconectado! COM SUCESSO - - - - - ");
                    break;
                }
            }
        }else{
            funcao.LimparTela();
            System.out.println("Desculpe Ouvi Algum Erro!!!\n");
        }
    }
}
