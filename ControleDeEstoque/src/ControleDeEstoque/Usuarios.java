/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeEstoque;

import static ControleDeEstoque.Funcoes.contador;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ícaro-Tatakae
 */
public class Usuarios {
    
    static Funcoes funcao = new Funcoes();
    
    public void MostrarClientesCadastrados(String[] nomeClientes) {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeClientes){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("\n--------------CLIENTES-------------");
        for(int x = 0; x <contador; x++){
            System.out.println("ID:" + (x+1) +
                    " - Cliente:" +
                    nomeClientes[x]);
        }  
        
        System.out.println("\n---------------------------------");
        System.out.println("Pressione 1 para sair do programa");
        System.out.println("Pressione 0 para voltar ao menu.");
        System.out.println("Escolha:");
        int opcao = scan.nextInt();
        
        if(opcao == 1){
            funcao.LimparTela();
            funcao.Logar();
        }
    }

    public void CadastrarCliente(String[] nomeClientes) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeClientes){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        if(contador < 0 || contador == 10){
            System.out.println("Desculpa, não a mais espaço!");
        }else{
            System.out.println("Informe o nome do cliente:");
            nomeClientes[contador-1] = scan.nextLine();
        }
        funcao.SalvaDados("BDadmin.txt");
    }

    static void DeletarUsuario(String[] nomeClientes) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        for(String y:nomeClientes){
            contador++;
            System.out.println((contador) + " Usuario: " + y);
        }
        
        contador = 10;
        
        for(String y:nomeClientes){
            if(y.equals(" ")){
                contador--;
            }
        }
        System.out.println("Qual o codigo do usuario que você deseja deletar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            DeletarUsuario(nomeClientes);
        }else{
            contador--;
            nomeClientes[id-1] = nomeClientes[contador];
            nomeClientes[contador] = " ";
        }
        funcao.SalvaDados("BDadmin.txt");
    }

    void ModificarUsuario(String[] nomeClientes) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        
        for(String y:nomeClientes){
            System.out.println((contador+1) + " Usuario: " + y);
            contador++;
        }
        contador = 10;
        
        for(String y:nomeClientes){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("Qual o codigo do usuario que você deseja modificar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            ModificarUsuario(nomeClientes);
        }else if(id > contador ){
            System.out.println("Informe o nome do cliente:");
            nomeClientes[contador] = scan.nextLine();
        }else{
            System.out.println("Informe o nome do cliente:");
            nomeClientes[id-1] = scan.nextLine();
        }
        funcao.SalvaDados("BDadmin.txt");
        }
}
