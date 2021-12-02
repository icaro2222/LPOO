package samara;


public class TestarMochila {
	
	public static void main(String[] args) {
		
		Mochila m1 = new Mochila();
		Mochila m2= new Mochila();
		Mochila m3 = new Mochila();
		
		m1.setMaterial("Couro");
		m1.setPeso(18);
		m1.setTipo("negócio");
		
		m1.abrir();
		m1.fechar();
		

		m2.setMaterial("Nylon");
		m2.setPeso(8);
		m2.setTipo("Notebook");

    	m2.abrir();
    	m2.fechar();
    	
    	
		m3.setMaterial("Emborrachado");
		m3.setPeso(25);
		m3.setTipo("viagem");
		
		m3.abrir();
		m3.fechar();
		
		infor(m1, m2, m3);
	}
		
	public static void infor(Mochila m1, Mochila m2, Mochila m3) {
		
		if(m1.getPeso() > m2.getPeso()  &&  m1.getPeso() > m3.getPeso()) {
			System.out.println("--A mochila que aguenta mais peso é a de negócio--");
			
		}else if(m2.getPeso() > m1.getPeso()  &&  m2.getPeso() > m3.getPeso()) {
			System.out.println("--A mochila que aguenta mais peso é a de Notebook--");	
		
		}	else {
			System.out.println("--A mochila que aguenta mais peso é a de Viagem--");	
			
		}
		}
}