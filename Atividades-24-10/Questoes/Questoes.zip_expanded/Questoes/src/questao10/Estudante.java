
package questao10;

import java.io.IOException;
import java.util.Scanner;

public class Estudante {

    private int contador = 10;
    private String[] nomeEstudantes = {"Icaro",
                                    "woquiton", 
                                    "Pedro", 
                                    "Josao", 
                                    "Jaco", 
                                    " ", 
                                    " ", 
                                    " ", 
                                    " ", 
                                    " "};
    private String nome;
    private String cpf;
    private String endereco;
    private String numeroTelefonico;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public  void CadastrarEstudante() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeEstudantes){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        if(contador < 0 || contador == 10){
            System.out.println("Desculpa, não a mais espaço!");
        }else{
            System.out.println("Informe o nome do Estudante:");
            nomeEstudantes[contador] = scan.nextLine();
        }
    }

    public void DeletarEstudante() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        for(String y:nomeEstudantes){
            contador++;
            System.out.println((contador) + " Estudante: " + y);
        }
        
        contador = 10;
        
        for(String y:nomeEstudantes){
            if(y.equals(" ")){
                contador--;
            }
        }
        System.out.println("Qual o codigo do estudante que voce deseja deletar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            DeletarEstudante();
        }else{
            contador--;
            nomeEstudantes[id-1] = nomeEstudantes[contador];
            nomeEstudantes[contador] = " ";
        }
    }

    public void ModificarEstudante() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        
        for(String y:nomeEstudantes){
            System.out.println((contador+1) + " Estudante: " + y);
            contador++;
        }
        contador = 10;
        
        for(String y:nomeEstudantes){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("Qual o codigo do estudante que voce deseja modificar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            ModificarEstudante();
        }else if(id > contador ){
            System.out.println("Informe o nome do estudante:");
            nomeEstudantes[contador] = scan.nextLine();
        }else{
            System.out.println("Informe o nome do estudante:");
            nomeEstudantes[id-1] = scan.nextLine();
        }
        }
    
    public void MostrarEstudantesCadastrados() {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeEstudantes){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("\n--------------Estudantes-------------");
        for(int x = 0; x <contador; x++){
            System.out.println("ID:" + (x+1) +
                    " - Estudante:" +
                    nomeEstudantes[x]);
        }
    }

}
