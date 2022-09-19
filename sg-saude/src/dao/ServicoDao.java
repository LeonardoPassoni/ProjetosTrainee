package dao;

import model.Servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicoDao {

private Connection connection;

    public ServicoDao(Connection connection) {
        this.connection = connection;
    }

    public void adicionar(Servico servico) {
        String sql = "INSERT INTO SERVICO (NOME_SERVICO, VALOR_SERVICO) VALUES (?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,servico.getNomeServico());
            preparedStatement.setDouble(2,servico.getValorServico());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remover(int id) {
        String sql = "DELETE FROM SERVICO WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void alterarNome(int id, String novoNome) {
        String slq = "UPDATE SERVICO SET NOME_SERVICO = ? WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(slq)){
            preparedStatement.setString(1,novoNome);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Servico buscar(int id) {
        String sql = "SELECT ID,NOME_SERVICO,VALOR_SERVICO FROM SERVICO WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                resultSet.next();
                return new Servico(
                        resultSet.getInt("id"),
                        resultSet.getString("nome_servico"),
                        resultSet.getDouble("valor_servico"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Servico> listar() {
        List<Servico> servicos = new ArrayList<>();
        String sql = "SELECT ID,NOME_SERVICO,VALOR_SERVICO FROM SERVICO";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){
                    Servico servico = new Servico(resultSet.getInt("id"),
                            resultSet.getString("nome_servico"),
                            resultSet.getDouble("valor_servico")
                    );
                    servicos.add(servico);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return servicos;
    }
}
