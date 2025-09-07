
public class Livro {
   
	
	public long id;
	public String titulo;
	public String autor;
	public int anoPublicacao;
	public boolean disponivel;
	
	public Livro() {
	
	}

	public Livro(long id, String titulo, String autor, int anoPublicacao, boolean disponivel) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.disponivel = disponivel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao
				+ ", disponivel=" + disponivel + "]";
	}
	
	
}
