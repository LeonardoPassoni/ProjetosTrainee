package controller;

import dao.PacienteDao;
import dao.ServicoDao;
import factory.ConnectionFactory;
import model.Paciente;
import model.Servico;

import java.util.List;

public class PacienteController {

    private PacienteDao pacienteDao;


    public PacienteController() {
        this.pacienteDao = new PacienteDao(ConnectionFactory.obterConexao());
    }


    public void adicionar(Paciente paciente) {
        pacienteDao.adicionar(paciente);
    }

    public void remover(int id) {
        pacienteDao.remover(id);
    }

    public List<Paciente> listar() {
        return pacienteDao.listar();
    }

//    public void alterarNome(int id, String novoNome){
//        pacienteDao.alterarNome(id,novoNome);
//    }

    public Paciente buscar(int id) {
        return pacienteDao.buscar(id);
    }


}
