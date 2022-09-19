package dao;

import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoDao {
    private Connection connection;
    public AtendimentoDao(Connection connection) {
        this.connection = connection;
    }

    public void adicionar(Atendimento atendimento) {
        String sql = "INSERT INTO ATENDIMENTO (DATA_ATENDIMENTO, PACIENTE, MEDICO) " +
                "VALUES (?,?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setDate(1, java.sql.Date.valueOf("2017-09-24"));
            preparedStatement.setInt(2,atendimento.getPaciente().getId());
            preparedStatement.setInt(3,atendimento.getMedico().getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void remover(int id) {
        String sql = "DELETE FROM ATENDIMENTO WHERE ID = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Atendimento> listar() {
        List<Atendimento> atendimentos = new ArrayList<>();
        Atendimento ultimoAtendimento = null;

        String sql = "select atendimento.id, MEDICO.nome as medico, PACIENTE.nome as paciente , atendimento.data_atendimento, " +
                "medicamento.nome as medicamento,  servico.nome_servico as servicos\n" +
                "from atendimento \n" +
                "inner join medico  on (medico.id = atendimento.medico)\n" +
                "inner join paciente on (paciente.id = atendimento.paciente)\n" +
                "inner join medicamento_atendimento ON (medicamento_atendimento.atendimento  = atendimento.id )\n" +
                "inner join medicamento  on (medicamento.id  = medicamento_atendimento.medicamento) \n" +
                "inner join servico_atendimento on(servico_atendimento.atendimento  = atendimento.id)\n" +
                "inner join servico on (servico.id = servico_atendimento.servico)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.execute();
            try(ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()){

                    if ( ultimoAtendimento == null || resultSet.getInt("id") != ultimoAtendimento.getId()) {
                        Atendimento atendimento = new Atendimento();
                        Medico medico = new Medico();
                        Paciente paciente = new Paciente();

                        medico.setNome(resultSet.getString("medico"));
                        paciente.setNome(resultSet.getString("paciente"));
                        atendimento.setDataAtendimento(resultSet.getDate("data_atendimento"));
                        atendimento.setPaciente(paciente);
                        atendimento.setMedico(medico);
                        atendimento.setId(resultSet.getInt("id"));
                        ultimoAtendimento = atendimento;
                        atendimentos.add(ultimoAtendimento);

                    }

                    Medicamento medicamento = new Medicamento();
                    medicamento.setNome(resultSet.getString("medicamento"));

                    Servico servico = new Servico();
                    servico.setNomeServico(resultSet.getString("servicos"));


                    ultimoAtendimento.getMedicamentos().add(medicamento);
                    ultimoAtendimento.getServicos().add(servico);



                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return atendimentos;
    }



    public void adicionarMedicamento(Atendimento atendimento, Medicamento medicamento) {
        String sql = "insert into medicamento_atendimento (medicamento, atendimento)  VALUES(?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(2,atendimento.getId());
            preparedStatement.setInt(1,medicamento.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void adicionarServicos(Atendimento atendimento, Servico servico)     {
        String sql = "insert into servico_atendimento (servico, atendimento)  VALUES(?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(2,atendimento.getId());
            preparedStatement.setInt(1,servico.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


//    public Atendimento buscar(int id) {
//
//    }
}
