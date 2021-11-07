package questao1;

// <----Tatakae---->

public class Livro {
    
    private String titulo;
    private String autor;
    private String aditora;
    
    
    private int num_pag;
    private float preco;
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAditora() {
		return aditora;
	}
	public void setAditora(String aditora) {
		this.aditora = aditora;
	}
	public int getNum_pag() {
		return num_pag;
	}
	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}