# 📚 Sistema de Biblioteca em Java

Este é um projeto simples desenvolvido em **Java** para treinar conceitos de **Programação Orientada a Objetos (POO)**, utilizando listas (`ArrayList`) para armazenar livros e usuários.

## 🚀 Funcionalidades

- 📖 Cadastrar livros  
- 👤 Cadastrar usuários  
- 📚 Listar todos os livros  
- 🧑‍🤝‍🧑 Listar todos os usuários  
- ✅ Emprestar livros a usuários  
- 🔄 Devolver livros  
- 📊 Exibir livros disponíveis e emprestados  

## 🛠 Estrutura do Projeto

- **Livro.java** → Classe que representa um livro, com atributos `id`, `titulo`, `autor`, `anoPublicacao` e `disponivel`.  
- **Usuario.java** → Classe que representa um usuário da biblioteca, com atributos `id`, `nome`, `email` e lista de livros emprestados.  
- **Biblioteca.java** → Classe responsável por gerenciar os livros e usuários (cadastro, empréstimos e devoluções).  
- **Main.java** → Classe principal para testar o sistema (pode ser adaptada com `Scanner` para menu interativo).  

## ▶️ Como Executar

1. Clone este repositório ou baixe os arquivos.  
2. Abra o projeto no **Eclipse** (ou outra IDE Java).  
3. Compile os arquivos `.java`.  
4. Execute a classe **`Main`**.  

Exemplo de uso rápido no `Main.java`:

```java
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


📌 Tecnologias Utilizadas

Java SE

Eclipse IDE

✨ Objetivo

Este projeto foi criado para treinar conceitos fundamentais de POO em Java:

Encapsulamento

Composição de classes

Manipulação de listas (ArrayList)

Métodos de negócio (emprestar/devolver livros)

👨‍💻 Desenvolvido para prática de Java e POO.
