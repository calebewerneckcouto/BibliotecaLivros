public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(1, "O Hobbit", "J.R.R. Tolkien", 1937, true);
        Usuario usuario1 = new Usuario(1, "Calebe", "calebe@email.com");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarUsuario(usuario1);

        biblioteca.emprestarLivro(usuario1, livro1);
        biblioteca.listarLivros();
        biblioteca.devolverLivro(usuario1, livro1);
        biblioteca.listarLivros();
    }
}
