package padrao;

import modelo.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {


    public static void main(String[] args) throws SQLException {


        Statement statement = ConnectionFactory.obterConexao().createStatement();

        statement.execute("INSERT INTO PRODUTO (NOME,DESCRICAO) VALUES('Mouse', 'Mouse sem fio')",
                Statement.RETURN_GENERATED_KEYS);

        ResultSet resultSet = statement.getGeneratedKeys();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            System.out.println("O id gerado foi: " + id);
        }
    }
}
