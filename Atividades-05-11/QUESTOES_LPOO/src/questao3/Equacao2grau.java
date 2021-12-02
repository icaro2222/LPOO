package questao3;

// <----Tatakae---->

public class Equacao2grau {
    
    private float a, b, c, delta, raiz_de_delta, raiz1, raiz2;    
    

    public void equacao2grau() {
    	
    	primeira_parte();
    	segunda_parte();
    	terceira_parte();

    	System.out.println("Delta:  "+delta);
    	System.out.println("Raiz1: "+raiz1);
    	System.out.println("Raiz2: "+raiz2);
    }

	public float getA() {
		return a;
	}
	public void setA(float a) {
		if(a==0)a=1;
		this.a = a;
	}
    public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	
	private void primeira_parte() {
    	
    	this.delta = (b*b)-(4*a*c);
    	
    }
    
    private void segunda_parte() {
    	
    	raiz_de_delta = (float) Math.sqrt(delta);
 	
    }
    
    private void terceira_parte() {

    	raiz1 = (-b+raiz_de_delta)/(2*getA());
    	raiz2 = (-b-raiz_de_delta)/(2*getA());
    	
    }
}
    