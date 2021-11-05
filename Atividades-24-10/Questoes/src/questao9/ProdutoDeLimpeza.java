
package questao9;

import questao10.*;
import java.io.IOException;
import java.util.Scanner;

public class ProdutoDeLimpeza {

    private int contador = 10;
    private String[] nomeProdutos = {"Amacainte",
                                    "Sabão em pó", 
                                    "Água sanitária", 
                                    "Sabão de barra", 
                                    "Multiuso", 
                                    " ", 
                                    " ", 
                                    " ", 
                                    " ", 
                                    " "};
    private String nome;
    private String codigo;
    private String validade;
    private int quantidade;

    public String[] getNomeProdutos() {
        return nomeProdutos;
    }

    public void setNomeProdutos(String[] nomeProdutos) {
        this.nomeProdutos = nomeProdutos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public  void CadastrarProduto() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeProdutos){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        if(contador < 0 || contador == 10){
            System.out.println("Desculpa, não a mais espaço!");
        }else{
            System.out.println("Informe o nome do Produto:");
            nomeProdutos[contador] = scan.nextLine();
        }
    }

    public void DeletarProduto() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        for(String y:nomeProdutos){
            contador++;
            System.out.println((contador) + " Produto: " + y);
        }
        
        contador = 10;
        
        for(String y:nomeProdutos){
            if(y.equals(" ")){
                contador--;
            }
        }
        System.out.println("Qual o codigo do produto que voce deseja deletar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            DeletarProduto();
        }else{
            contador--;
            nomeProdutos[id-1] = nomeProdutos[contador];
            nomeProdutos[contador] = " ";
        }
    }

    public void ModificarProduto() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        
        for(String y:nomeProdutos){
            System.out.println((contador+1) + " Produto: " + y);
            contador++;
        }
        contador = 10;
        
        for(String y:nomeProdutos){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("Qual o codigo do produto que voce deseja modificar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            ModificarProduto();
        }else if(id > contador ){
            System.out.println("Informe o nome do Produto:");
            nomeProdutos[contador] = scan.nextLine();
        }else{
            System.out.println("Informe o nome do Produto:");
            nomeProdutos[id-1] = scan.nextLine();
        }
        }
    
    public void MostrarProdutosCadastrados() {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeProdutos){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("\n--------------Produtos-------------");
        for(int x = 0; x <contador; x++){
            System.out.println("ID:" + (x+1) +
                    " - Produtos: " +
                    nomeProdutos[x]);
        }
    }

}
