package br.com.bootcamp;
import java.sql.*;

public class Database {
    private static final String URL = "jdbc:h2:./nutridb;AUTO_SERVER=TRUE";

    public static void inicializar() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, "sa", "")) {
            String sql = "CREATE TABLE IF NOT EXISTS REFEICOES (id INT AUTO_INCREMENT, nome VARCHAR(255), saudavel BOOLEAN)";
            conn.createStatement().execute(sql);
        }
    }

    public static void salvar(Refeicao r) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, "sa", "")) {
            String sql = "INSERT INTO REFEICOES (nome, saudavel) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, r.getNome());
            pstmt.setBoolean(2, r.isSaudavel());
            pstmt.executeUpdate();
        }
    }
}
