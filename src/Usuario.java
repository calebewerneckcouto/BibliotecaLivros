import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private long id;
	private String nome;
	private String email;
	private List<Livro> livrosEmprestados = new ArrayList<>();
	
	public Usuario() {
	}
	
	public Usuario(long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	// Getters e Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

	// Métodos de controle de livros
	public void emprestarLivro(Livro livro) {
		livrosEmprestados.add(livro);
	}

	public void devolverLivro(Livro livro) {
		livrosEmprestados.remove(livro);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}
