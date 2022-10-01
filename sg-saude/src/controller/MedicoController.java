package controller;

import dao.MedicoDao;
import dao.PacienteDao;
import factory.ConnectionFactory;
import model.Medico;
import model.Paciente;

import java.util.List;

public class MedicoController {

    private MedicoDao medicoDao;


    public MedicoController() {
        this.medicoDao = new MedicoDao(ConnectionFactory.obterConexao());
    }


    public void adicionar(Medico medico) {
        medicoDao.adicionar(medico);
    }

    public void remover(int id) {
        medicoDao.remover(id);
    }

    public List<Medico> listar() {
        return medicoDao.listar();
    }

//    public void alterarNome(int id, String novoNome){
//        pacienteDao.alterarNome(id,novoNome);
//    }

    public Medico buscar(int id) {
        return medicoDao.buscar(id);
    }
}
