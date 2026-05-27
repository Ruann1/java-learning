package mysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
    private static final String URL = "jdbc:mysql://localhost:3306/crud_java";
    private static final String USER = "root";
    private static final String PASSWORD = "";
	
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        	}		
	}
}

