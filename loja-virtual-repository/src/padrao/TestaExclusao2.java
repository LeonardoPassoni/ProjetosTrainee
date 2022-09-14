package padrao;

import modelo.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaExclusao2 {


    public static void main(String[] args) throws SQLException {


        PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement(
                "DELETE FROM PRODUTO WHERE ID > ? ");

        preparedStatement.setInt(1,3);
        preparedStatement.execute();


        ResultSet resultSet = preparedStatement.getResultSet();
         int linhasModificadas = preparedStatement.getUpdateCount();


        System.out.println("Quantidade de linhas modificadas: " + linhasModificadas);
    }
}
