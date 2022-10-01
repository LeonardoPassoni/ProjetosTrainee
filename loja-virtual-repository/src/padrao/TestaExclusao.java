package padrao;

import modelo.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaExclusao {

    public static void main(String[] args) throws SQLException {


        Statement statement = ConnectionFactory.obterConexao().createStatement();

//        statement.execute(("DELETE FROM PRODUTO WHERE ID = 5 or id = 6"),
//                Statement.RETURN_GENERATED_KEYS);
        statement.execute(("DELETE FROM PRODUTO WHERE ID = 4"),
                Statement.RETURN_GENERATED_KEYS);

       ResultSet resultSet = statement.getGeneratedKeys();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            System.out.println("O produto " + id + " foi removido");
        }


    }
}
