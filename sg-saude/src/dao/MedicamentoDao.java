package dao;

import factory.ConnectionFactory;
import model.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicamentoDao {

    Connection connection;

    public MedicamentoDao(){
        this.connection = ConnectionFactory.obterConexao();
    }

    public void adicionar(Medicamento medicamento) {
        String sql = "INSERT INTO MEDICAMENTO (NOME,DESCRICAO,VALOR) " +
                "VALUES (?, ?, ?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,medicamento.getNome());
            preparedStatement.setString(2,medicamento.getDescricao());
            preparedStatement.setDouble(3,medicamento.getValor());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(int id){
        String sql = "DELETE FROM MEDICAMENTO WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.
          //  preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
