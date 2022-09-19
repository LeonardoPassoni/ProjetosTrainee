package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {



    public static Connection obterConexao(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/sg_saude","postgres","senha1");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
