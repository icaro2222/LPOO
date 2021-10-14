package ControleDeEstoque;

public class Variaveis {
    
    private final double valorEmCaixa = 0;
    private final int contador = 10;
    private String nome, senha;
        
    private final String nomeProduto[] = {" ",
                                   " ", 
                                   " ", 
                                   " ", 
                                   " ", 
                                   " ",  
                                   " ", 
                                   " ", 
                                   " ", 
                                   " "};


    private final String nomeClientes[] = {" ",
                                           " ", 
                                           " ", 
                                           " ", 
                                           " ", 
                                           " ",  
                                           " ", 
                                           " ", 
                                           " ", 
                                           " "};

    private final double valorProduto[] = {0,  
                                           0, 
                                           0, 
                                           0, 
                                           0, 
                                           0,  
                                           0, 
                                           0, 
                                           0, 
                                           0};

    private final int quantidadeProduto[] = {0,  
                                             0, 
                                             0, 
                                             0, 
                                             0, 
                                             0,  
                                             0, 
                                             0, 
                                             0, 
                                             0};
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public int getContador() {
        return contador;
    }

    public String getNome() {
        return nome;
    }
    
    public String getSenha() {
        return senha;
    }

    public String[] getNomeProduto() {
        return nomeProduto;
    }

    public String[] getNomeClientes() {
        return nomeClientes;
    }

    public double[] getValorProduto() {
        return valorProduto;
    }

    public int[] getQuantidadeProduto() {
        return quantidadeProduto;
    }
}
