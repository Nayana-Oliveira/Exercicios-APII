import java.sql.Connection;
import java.util.List;

public class Main {

    public static void testeConnection() {
        try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conexão com banco de dados com sucesso.");
        } catch (Exception e) {
            System.err.println("Falha ao conectar ao banco de dados.");
            e.printStackTrace();
        }
    }

    public static void testeAdicionarlivro() {
        LivroDAO dao = new LivroDAO();

        Livro livro1 = new Livro("A Revolução dos Bichos", "Geoger Orwell", 1945);
        Livro livro2 = new Livro("1984", "Geoger Orwell", 1949);
        Livro livro3 = new Livro("O grande Gatsby", "F. Scott Fitzgerald", 1925);

        dao.adicionarLivro(livro1);
        dao.adicionarLivro(livro2);
        dao.adicionarLivro(livro3);
    }

    public static  void testeListarLivros() {
        LivroDAO dao = new LivroDAO();

        List<Livro> livros = dao.listarTodosLivros();

        System.out.println("-- Lista de todos os livros -- ");
        for (Livro l : livros) {
            System.out.println("ID: " + l.getId() +
                               ", Titulo: " + l.getTitulo() +
                               ", Autor: " + l.getAutor() +
                               ", Ano: " + l.getAnoPublicacao() +
                               ", Disponivel: " + l.isDisponivel());
        }
    }

    public static void testeBuscarLivro() {
        LivroDAO dao = new LivroDAO();

        //Teste 1: buscar livro existente
        System.out.println("-- Buscando livro 1984 --");
        Livro livro1 = dao.buscarLivroPorTitulo("1984");
        if (livro1 != null) {
            System.out.println("Livro encontrado");
        } else {
            System.out.println("livro não encontrado");
        }

        //Teste 2: buscar livro inexistente
        System.out.println("-- Buscando livro Dom Quixote --");
        Livro livro2 = dao.buscarLivroPorTitulo("Dom Quixote");
        if (livro1 != null) {
            System.out.println("Livro encontrado");
        } else {
            System.out.println("livro não encontrado");
        }
    }
    public static void main(String[] args) {
        //testeConnection();
        //testeListarLivros();
        //testeAdicionarlivro();
        testeBuscarLivro();
    }
}
