package dao;

import model.Medicamento;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoDao {

    Connection connection;

    public MedicamentoDao(Connection connection){
        this.connection = connection;
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
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(int id, String novoNome) {
        String sql = "UPDATE MEDICAMENTO SET NOME = ? WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(2,id);
            preparedStatement.setString(1,novoNome);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Medicamento buscar(int id) {
        String sql = "SELECT ID,NOME,DESCRICAO,VALOR FROM MEDICAMENTO WHERE ID = ?";

                try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                    preparedStatement.setInt(1,id);
                    preparedStatement.execute();

                    try(ResultSet resultSet = preparedStatement.getResultSet()){
                        resultSet.next();
                        return new Medicamento(resultSet.getInt("id"),
                                resultSet.getString("nome"),
                                resultSet.getString("descricao"),
                                resultSet.getDouble("valor"));
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
    }

    public List<Medicamento> listar(){
        List<Medicamento> medicamentos = new ArrayList<>();
        String sql = "SELECT ID,NOME,DESCRICAO,VALOR FROM MEDICAMENTO";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){
                    Medicamento medicamento = new Medicamento(resultSet.getInt("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("descricao"),
                            resultSet.getDouble("valor"));
                    medicamentos.add(medicamento);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return medicamentos;
    }


}
