package padrao;

import modelo.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {


    public static void main(String[] args) throws SQLException {

        String nome = "Mouse";
        String descricao = "Mouse sem fim";

        PreparedStatement preparedStatement = ConnectionFactory.obterConexao().prepareStatement(
                "INSERT INTO PRODUTO (NOME,DESCRICAO) VALUES(?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1,nome);
        preparedStatement.setString(2,descricao);
        preparedStatement.execute();

        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            System.out.println("O id gerado foi: " + id);
        }

    }
}
