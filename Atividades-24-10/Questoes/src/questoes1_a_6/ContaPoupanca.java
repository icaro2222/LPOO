
package questoes1_a_6;

public class ContaPoupanca {

    boolean ativa;
    String cpfDoProprietario;
    double valorAtual;
    String numeroConta;
    String historicoDeTransacoes;

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public String getCpfDoProprietario() {
        return cpfDoProprietario;
    }

    public void setCpfDoProprietario(String cpfDoProprietario) {
        this.cpfDoProprietario = cpfDoProprietario;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getHistoricoDeTransacoes() {
        return historicoDeTransacoes;
    }

    public void setHistoricoDeTransacoes(String historicoDeTransacoes) {
        this.historicoDeTransacoes = historicoDeTransacoes;
    }
    
    public void valor(){
        System.out.println("Valor na conta: " + valorAtual);
    }
    
    public void numero(){
        System.out.println("Numero da conta: " + numeroConta);
    }
    
    public void ativada(){
        if(ativa){
            System.out.println("A conta esta ativa");
        }else{
            System.out.println("A conta não esta ativa");
        }
    }
    
}
