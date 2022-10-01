package padrao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/loja_virtual",
                "postgres" ,"senha1");


        System.out.println("Conexao fechada");

        connection.close();




    }

}
