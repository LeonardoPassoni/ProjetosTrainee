package controller;

import dao.AtendimentoDao;
import factory.ConnectionFactory;
import model.Atendimento;
import model.Medicamento;
import model.Servico;

import java.util.List;

public class AtendimentoController {


    private AtendimentoDao atendimentoDao;


    public AtendimentoController() {
        this.atendimentoDao = new AtendimentoDao(ConnectionFactory.obterConexao());
    }


    public void adicionar(Atendimento atendimento) {
        this.atendimentoDao.adicionar(atendimento);
    }

    public void remover(int id) {
        this.atendimentoDao.remover(id);
    }

    public List<Atendimento> listar() {
        return this.atendimentoDao.listar();
    }

    public void adicionarMedicamento(Atendimento atendimento, Medicamento medicamento){
        this.atendimentoDao.adicionarMedicamento(atendimento,medicamento);

    }

    public void adicionarServico(Atendimento atendimento, Servico servico) {
        this.atendimentoDao.adicionarServicos(atendimento,servico);
    }

    public void imprimirAtendimento(List<Atendimento> atendimentos){

        for(Atendimento atendimento: atendimentos){
            System.out.println("Numero Atendimento: " + atendimento.getId());
            System.out.println("Medico: " + atendimento.getMedico().getNome());
            System.out.println("Paciente:" + atendimento.getPaciente().getNome());
            System.out.println("Data:" + atendimento.getDataAtendimento());
            System.out.println("Medicamentos:" + atendimento.getMedicamentos());
            System.out.println("Servicos: " + atendimento.getServicos());
            System.out.println();
        }

    }

//    public void alterarNome(int id, String novoNome){
//        pacienteDao.alterarNome(id,novoNome);
//    }

//    public Atendimento buscar(int id) {
//        return this.atendimentoDao.buscar(id);
//    }
}
