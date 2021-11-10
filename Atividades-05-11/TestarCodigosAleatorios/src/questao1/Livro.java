package questao1;

public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private int paginas;
	private float preco;
	private boolean comprar;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora ) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco( float preco) {
		this.preco =preco;
	}
	public boolean getComprar() {
		return comprar;
	}
	public void setComprar(boolean Comprar ) {
		this.comprar = Comprar;
	}
	
	
	public  void classificacao() {
		if(comprar) {
			System.out.println("Se prepare para se apaixonar!");
		}else  {
			System.out.println("\n\nObrigada por ter nos visitado!");
			
		}
	}

		
	}