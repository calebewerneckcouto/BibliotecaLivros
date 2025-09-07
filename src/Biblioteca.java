import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Livro> listaLivros = new ArrayList<>();
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	// Getters e Setters
	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	// Métodos de cadastro
	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}	
	
	public void adicionarUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	// Listagens
	public void listarLivros() {
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
	}

	public void listarUsuarios() {
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario);
		}
	}
	
	// Regras de negócio
	public void emprestarLivro(Usuario usuario, Livro livro) {
		if (livro.isDisponivel()) {
			usuario.emprestarLivro(livro); // ✅ Correção
			livro.setDisponivel(false);
			System.out.println("Livro emprestado com sucesso!");
		} else {
			System.out.println("Este livro não está disponível no momento.");
		}
	}
	
	public void devolverLivro(Usuario usuario, Livro livro) {
		if (usuario.getLivrosEmprestados().contains(livro)) {
			usuario.devolverLivro(livro);
			livro.setDisponivel(true);
			System.out.println("Livro devolvido com sucesso!");
		} else {
			System.out.println("Este usuário não possui este livro emprestado.");
		}
	}
}
