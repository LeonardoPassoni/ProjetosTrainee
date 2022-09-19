package dao;

import model.Paciente;
import model.Servico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDao {

    private Connection connection;

    public PacienteDao(Connection connection) {
        this.connection = connection;
    }

    public void adicionar(Paciente paciente) {
        String sql = "INSERT INTO PACIENTE (NOME,CPF,DATA_NASCIMENTO,NOME_MAE,NUMERO_CARTEIRINHA,COR_DA_PULSEIRA)" +
                "VALUES (?,?,?,?,?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,paciente.getNome());
            preparedStatement.setString(2,paciente.getCpf());
            preparedStatement.setDate(3, java.sql.Date.valueOf("2017-09-24"));
            preparedStatement.setString(4,paciente.getNomeMae());
            preparedStatement.setString(5,paciente.getNumeroCarteirinha());
            preparedStatement.setString(6,paciente.getCorDaPulseira());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remover(int id) {
        String sql = "DELETE FROM PACIENTE WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Paciente> listar() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT ID,NOME,CPF,DATA_NASCIMENTO,NOME_MAE,NUMERO_CARTEIRINHA,COR_DA_PULSEIRA " +
                "FROM PACIENTE";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){
                    Paciente paciente = new Paciente(
                            resultSet.getInt("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("cpf"),
                            resultSet.getDate("data_nascimento"),
                            resultSet.getString("nome_mae"),
                            resultSet.getString("numero_carteirinha"),
                            resultSet.getString("cor_da_pulseira")
                    );
                    pacientes.add(paciente);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pacientes;
    }

    public Paciente buscar(int id) {
        String sql = "SELECT ID,NOME,CPF,DATA_NASCIMENTO,NOME_MAE,NUMERO_CARTEIRINHA,COR_DA_PULSEIRA " +
                "FROM PACIENTE WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                resultSet.next();
                return new Paciente(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf"),
                        resultSet.getDate("data_nascimento"),
                        resultSet.getString("nome_mae"),
                        resultSet.getString("numero_carteirinha"),
                        resultSet.getString("cor_da_pulseira")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
