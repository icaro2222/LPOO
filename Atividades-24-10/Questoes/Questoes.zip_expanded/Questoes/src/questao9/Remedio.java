
package questao9;

import questao10.*;
import java.io.IOException;
import java.util.Scanner;

public class Remedio {

    private int contador = 10;
    private String[] nomeRemedios = {"ACETATO DE MEDROXIPROGESTERONA 150MG ",
                                    "ALENDRONATO DE SÓDIO 70MG", 
                                    "ATENOLOL 25MG", 
                                    "BROMETO DE IPRATRÓPIO 0,02MG", 
                                    "BROMETO DE IPRATRÓPIO 0,25MG", 
                                    " ", 
                                    " ", 
                                    " ", 
                                    " ", 
                                    " "};
    private String nome;
    private String codigo;
    private String validade;
    private int quantidade;

    public String[] getNomeRemedios() {
        return nomeRemedios;
    }

    public void setNomeRemedios(String[] nomeRemedios) {
        this.nomeRemedios = nomeRemedios;
    }

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public  void CadastrarRemedio() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeRemedios){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        if(contador < 0 || contador == 10){
            System.out.println("Desculpa, não a mais espaço!");
        }else{
            System.out.println("Informe o nome do Remedio:");
            nomeRemedios[contador] = scan.nextLine();
        }
    }

    public void DeletarRemedio() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        for(String y:nomeRemedios){
            contador++;
            System.out.println((contador) + " Remedio: " + y);
        }
        
        contador = 10;
        
        for(String y:nomeRemedios){
            if(y.equals(" ")){
                contador--;
            }
        }
        System.out.println("Qual o codigo do remedio que voce deseja deletar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            DeletarRemedio();
        }else{
            contador--;
            nomeRemedios[id-1] = nomeRemedios[contador];
            nomeRemedios[contador] = " ";
        }
    }

    public void ModificarRemedio() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 0;
        
        for(String y:nomeRemedios){
            System.out.println((contador+1) + " Remedio: " + y);
            contador++;
        }
        contador = 10;
        
        for(String y:nomeRemedios){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("Qual o codigo do remedio que voce deseja modificar?");
        String codigo = scan.nextLine();
        int id = Integer.parseInt(codigo);
        
        if(id < 0 || id>= 10){
            System.out.println("Desculpa, codigo invalido!");
            ModificarRemedio();
        }else if(id > contador ){
            System.out.println("Informe o nome do Remedio:");
            nomeRemedios[contador] = scan.nextLine();
        }else{
            System.out.println("Informe o nome do Remedio:");
            nomeRemedios[id-1] = scan.nextLine();
        }
        }
    
    public void MostrarRemediosCadastrados() {
        
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        
        for(String y:nomeRemedios){
            if(y.equals(" ")){
                contador--;
            }
        }
        
        System.out.println("\n--------------Remedios-------------");
        for(int x = 0; x <contador; x++){
            System.out.println("ID:" + (x+1) +
                    " - Remedios: " +
                    nomeRemedios[x]);
        }
    }

}
