import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO { // DAO = Data Access Object

    public void adicionarLivro(Livro livro) {
        String sql = "insert into livros (titulo, autor, ano_publicacao) values (?, ?, ?) ";

        try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conexão com banco de dados estabelecida com sucesso.");

            PreparedStatement pstmt = conn.prepareStatement(sql);

            //Preenchendo os placeholders (?) com os dados do objeto Livro
            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setInt(3, livro.getAnoPublicacao());

            //Executanto a inserção
            pstmt.executeUpdate();

            System.out.println("Livro " + livro.getTitulo() + " foi adicionado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao adicionar livro: " + e.getMessage());
        }
    }

    public List<Livro> listarTodosLivros() {
        String sql = "select id, titulo, autor, ano_publicacao, disponivel from livros";
        List<Livro> livros = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setAnoPublicacao(rs.getInt("ano_publicacao"));
                livro.setDisponivel(rs.getBoolean("disponivel"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar livros: " + e.getMessage());
        }
        return livros;
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        String sql = "select * from livros where titulo = ?";
        Livro livro = null;

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, titulo);

            try (ResultSet rs = pstmt.executeQuery()){
                if (rs.next()) {
                    livro = new Livro();
                    livro.setId(rs.getInt("id"));
                    livro.setTitulo(rs.getString("titulo"));
                    livro.setAutor(rs.getString("autor"));
                    livro.setAnoPublicacao(rs.getInt("ano_publicacao"));
                    livro.setDisponivel(rs.getBoolean("disponivel"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar livro: " + e.getMessage());
        }

        return livro;
    }
}
