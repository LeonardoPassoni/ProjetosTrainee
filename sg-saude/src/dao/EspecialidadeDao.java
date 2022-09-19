package dao;

import model.Especialidade;
import model.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadeDao {

    Connection connection;
    public EspecialidadeDao(Connection connection) {
        this.connection = connection;
    }

    public void adicionar(Especialidade especialidade) {
        String sql = "INSERT INTO ESPECIALIDADE (NOME) VALUES (?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,especialidade.getNome());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM ESPECIALIDADE WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

    public List<Especialidade> listar(){
        List<Especialidade> especialidades = new ArrayList<>();
        String sql = "SELECT ID,NOME FROM ESPECIALIDADE";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){
                    Especialidade especialidade = new Especialidade(resultSet.getInt("id"),
                            resultSet.getString("nome")
                            );
                    especialidades.add(especialidade);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return especialidades;

    }


    public void alterar(int id, String novoNome) {
        String slq = "UPDATE ESPECIALIDADE SET NOME = ? WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(slq)){
            preparedStatement.setString(1,novoNome);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Especialidade buscar(int id) {
        String sql = "SELECT ID,NOME FROM ESPECIALIDADE WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                resultSet.next();
                return new Especialidade(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
