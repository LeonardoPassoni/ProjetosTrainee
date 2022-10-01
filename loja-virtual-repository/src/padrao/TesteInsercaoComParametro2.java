package padrao;

import modelo.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteInsercaoComParametro2 {

    public static void main(String[] args) throws SQLException {

//        Connection con = ConnectionFactory.obterConexao();
//        PreparedStatement preparedStatement = con.prepareStatement(
//                ("INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES(?,?)"),
//                PreparedStatement.RETURN_GENERATED_KEYS
//        );

        try (
                PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement((
                                "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES(?,?)"),
                        PreparedStatement.RETURN_GENERATED_KEYS
                );
        ) {
            preparedStatement.getConnection().setAutoCommit(false);

            preparedStatement.setString(1, "Feijao Branco");
            preparedStatement.setString(2, "Feijao branco da marca xyz");
            preparedStatement.execute();

            preparedStatement.getConnection().commit();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            resultSet.next();
            System.out.println("id: " + resultSet.getInt("id") +
                    "\nNome: " + resultSet.getString("nome"));


            resultSet.close();
        }


    }
}
