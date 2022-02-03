package questao2;

public class Motor{
	
    private String fabricante;
    private double cilindrada;
    private String combustivel;

    public Motor(String fabricante, Double cilindrada, String combustivel){
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }

    public Motor(){
        this.fabricante = "Anônimo";
        this.cilindrada = 1.0;
        this.combustivel = "gasolina";
    }
    
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getCombustivel(){
        return combustivel;
    }
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    public void setCilindrada(Double cilindrada){
        this.cilindrada = cilindrada;
    }
    public Double getCilindrada(){
        return cilindrada;
    }
    // <-- Tatakae -->
}