
package questoes1_a_6;

public class Funcionaio {

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
    
    public void acorda(){
        System.out.println("O Funcionario " + nome + " acordou");
    }
    
    public void comer(){
        System.out.println("O Funcionario " + nome + " foi comer");
    }
    
    public void dormi(){
        System.out.println("O Funcionario " + nome + " foi dormi");
    }
    
}
