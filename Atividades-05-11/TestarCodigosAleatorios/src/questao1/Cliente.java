package questao1;
import java.util.Scanner;


public class Cliente {
    
    private int id_cliente;
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    
    public Cliente(){}
    
    public Cliente(int id_cliente, String nome, String rg, String cpf, String endereco)
    {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    //Gets
    public int getIdCliente()   { return id_cliente;}
    public String getNome()     { return nome;      }
    public String getRG()       { return rg;        }
    public String getCPF()      { return cpf;       }
    public String getEndereco() { return endereco;  }
    //Sets
    public void setID_Cliente(int id_cliente) { this.id_cliente = id_cliente; }
    public void setNome(String nome) { this.nome = nome; }
    public void setRG(String rg) { this.rg = rg; }
    public void setCPF(String cpf) { this.cpf = cpf; }
    
    public void exibirDadosCliente()
    {
        System.out.println("ID: " + id_cliente);
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}

public class Array_Clientes {
    
    private Cliente[] cliente;  //referencia para o array de objetos
    private int contador;       //para contagem da quantidade de objetos
    
    public Array_Clientes(int limite) //Construtor
    {
        cliente  = new Cliente[limite]; //Cria o array e isntancia a quantidade do array de objetos
        contador = 0;       //Contador inicia com o valor zero
    }
    
    //Metodo que retorna o objeto na memoria, usado para pesquisar um objeto
    public Cliente pesquisar(String nome)//Pesquisa um valor especifico
    {
        int j;
        for(j = 0; j < contador; j++)
        
            if(cliente[j].getNome().equals(nome))
            break;
            
            if(j == contador)
                return null;
            else
                return cliente[j];
    }
    //=========================================================================
    //coloca cada cliente dentro do Array
    public void inserirCliente(int id_cliente, String nome, String rg, String cpf, String endereco)
    {
        cliente[contador] = new Cliente(id_cliente, nome, rg, cpf, endereco);
        contador++; //incrementa o tamanho
    }
    //metodo para excluir um Cliente do Array
    public boolean excluirCliente(String nome)
    {
        int j;
        for(j = 0; j < contador; j++)
            if(cliente[j].getNome().equals(nome))
        break;
        
        if(j == contador)
            return false;
        else
        {
            for(int k = j; k < contador; k++)
                cliente[k] = cliente[k + 1];
            contador--;
            
            return true;
        }
    }
    
    //exibir os dados co Cliente
    public void exibirArrayClientes()
    {
        for(int j = 0; j < contador; j++)
            cliente[j].exibirDadosCliente();
    }
}