package padrao;

import modelo.ConnectionFactory;
import modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem2 {

    public static void main(String[] args) throws SQLException {

        PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement(
                "SELECT id,nome,descricao  FROM PRODUTO where id > ?");

        preparedStatement.setInt(1,1);
        preparedStatement.execute();


        ResultSet resultSet = preparedStatement.getResultSet();


        while (resultSet.next()){
            Produto produto = new Produto(
                    resultSet.getInt("id"),
                    resultSet.getString("nome"),
                    resultSet.getString("descricao"));

            System.out.println(produto);
        }

    }
}
