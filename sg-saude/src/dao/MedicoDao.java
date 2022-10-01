package dao;

import model.Especialidade;
import model.Medico;
import model.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicoDao {

    private Connection connection;
    public MedicoDao(Connection connection) {
        this.connection = connection;
    }

    public void adicionar(Medico medico) {
        String sql = "INSERT INTO MEDICO (NOME, CPF, CRM, ESPECIALIDADE, DATA_NASCIMENTO)" +
                "VALUES (?,?,?,?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,medico.getNome());
            preparedStatement.setString(2,medico.getCpf());
            preparedStatement.setString(3,medico.getCrm());
            preparedStatement.setObject(4,medico.getEspecialidade().getId());
            preparedStatement.setDate(5, java.sql.Date.valueOf("2017-09-24"));
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM MEDICO WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Medico> listar() {
        List<Medico> medicos = new ArrayList<>();
        String sql = "SELECT MEDICO.ID, MEDICO.NOME as Medico, MEDICO.CPF, MEDICO.CRM, MEDICO.DATA_NASCIMENTO," +
                     "especialidade.id, especialidade.nome as Especialidade " +
                     "from medico " +
                     "inner join especialidade on (medico.especialidade = especialidade.id)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){
                    Medico medico = new Medico(
                            resultSet.getInt("id"),
                            resultSet.getString("medico"),
                            resultSet.getString("cpf"),
                            resultSet.getDate("data_nascimento"),
                            resultSet.getString("crm")
                    );
                    Especialidade especialidade = new Especialidade(
                            resultSet.getInt("id"),
                            resultSet.getString("especialidade"));
                    medico.setEspecialidade(especialidade);
                    medicos.add(medico);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return medicos;
    }


    public Medico buscar(int id) {
        String sql = "SELECT MEDICO.ID, MEDICO.NOME as Medico, MEDICO.CPF, MEDICO.CRM, MEDICO.DATA_NASCIMENTO, especialidade.id, especialidade.nome as especialidade \n" +
                "from medico \n" +
                "inner join especialidade on (medico.especialidade = especialidade.id)\n" +
                "where medico.id = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

            try(ResultSet resultSet = preparedStatement.getResultSet()){
                resultSet.next();
                 Medico medico =    new Medico(
                            resultSet.getInt("id"),
                            resultSet.getString("medico"),
                            resultSet.getString("cpf"),
                            resultSet.getDate("data_nascimento"),
                            resultSet.getString("crm")
                    );

                Especialidade especialidade = new Especialidade(
                        resultSet.getInt("id"),
                        resultSet.getString("especialidade"));
                 medico.setEspecialidade(especialidade);
                 return medico;


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
