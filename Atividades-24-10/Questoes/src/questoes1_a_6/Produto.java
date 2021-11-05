
package questoes1_a_6;

import java.util.Arrays;

public class Produto {

    private String nome ;
    private String codigo ;
    private String validade ;
    private Double valor ;
    private int quantidade ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void nome(){
        System.out.println("Nome do produto: " + nome);
    }
    
    public void quatidade(){
        System.out.println("Quantidade do produto: " + quantidade +  " pacotes");
    }
    
    public void validade(){
        quantidade = 30;
        System.out.println("Validade do produto: " + validade);
    }
    
}
