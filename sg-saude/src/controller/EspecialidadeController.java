package controller;

import dao.EspecialidadeDao;
import dao.MedicamentoDao;
import factory.ConnectionFactory;
import model.Especialidade;
import model.Medicamento;

import java.util.List;

public class EspecialidadeController {

    private EspecialidadeDao especialidadeDao;

    public EspecialidadeController() {
        this.especialidadeDao = new EspecialidadeDao(ConnectionFactory.obterConexao());
    }

    public void adicionar(Especialidade especialidade){
        especialidadeDao.adicionar(especialidade);

    }

    public void remover(int id) {
        especialidadeDao.remover(id);
    }

    public List<Especialidade> listar() {
        return especialidadeDao.listar();
    }

    public void alterar(int id, String novoNome){
        especialidadeDao.alterar(id,novoNome);
    }

    public Especialidade buscar(int id) {
        return especialidadeDao.buscar(id);
    }
}
