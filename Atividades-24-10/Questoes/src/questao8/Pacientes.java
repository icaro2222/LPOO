
package questao8;

public class Pacientes {

    String nome;
    String funcao;
    int idade;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void nome(){
        System.out.println("Nome do paciênte: " + nome);
    }
    
    public void funcao(){
        System.out.println("Funcão do paciênte: " + funcao);
    }
    
    public void idade(){
        System.out.println("Idade do paciênte: " + idade);
    }
    
}
