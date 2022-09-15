package padrao;

import modelo.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestaUpdate {


    public static void main(String[] args) throws SQLException {

        PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement(
                "UPDATE PRODUTO SET NOME = 'Mouse LogTech' where id = ?"
        );


        preparedStatement.setInt(1,44);
        preparedStatement.execute();

        ResultSet resultSet = preparedStatement.getResultSet();

    }
}
