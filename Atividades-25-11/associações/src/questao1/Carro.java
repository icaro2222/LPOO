package questao1;

public class Carro{
    private String modelo;
    private int velocidadeMaxima, velocidadeAtual;
    private Motor motor;
    
    public Carro(){
        this.modelo = "Carro Qualque";
        this.velocidadeMaxima = 120;
        this.velocidadeAtual = 0;
    }
    
    public Carro(String mo, Motor mt){
        this.modelo = mo;
        this.motor = mt;
    }
    
    public void ligarCarro(){
        System.out.println("O carro está ligado.......");
    }
    public void desligarCarro(){
        System.out.println("O carro está desligado.......");
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public Motor getMotor(){
        return motor;
    }
    
    public void acelera(int veloc){
        if(this.velocidadeAtual + veloc <= this.velocidadeMaxima){
            this.velocidadeAtual += veloc;
            System.out.println("acelerando, Velocidade Atual: "+this.velocidadeAtual);
        }
        else{
            this.velocidadeAtual = this.velocidadeMaxima;
            System.out.println("Velocidade Máxima atingida! \n"+"Velocidade Atual: "+this.velocidadeAtual);
        }
    }
    
    public void reduzir(int veloc){
        if((this.velocidadeAtual - veloc) > 0){
            this.velocidadeAtual -= veloc;
            System.out.println("Reduzindo, Velocidade Atual: "+this.velocidadeAtual);
        }
        else{
            pararCarro();
        }
    }
    
    public void pararCarro(){
        this.velocidadeAtual = 0;
        System.out.println("O carro parou, Velocidade Atual: "+this.velocidadeAtual);
    }
    // <-- Tatakae -->
}