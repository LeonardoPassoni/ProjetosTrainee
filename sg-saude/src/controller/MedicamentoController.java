package controller;

import dao.MedicamentoDao;
import factory.ConnectionFactory;
import model.Medicamento;

import java.util.List;

public class MedicamentoController {

    private MedicamentoDao medicamentoDao;

    public MedicamentoController(){
        medicamentoDao = new MedicamentoDao(ConnectionFactory.obterConexao());
    }

    public void adicionar(Medicamento medicamento){
        medicamentoDao.adicionar(medicamento);

    }

    public void remover(int id) {
        medicamentoDao.remover(id);
    }

    public void alterarNome(int id, String novoNome) {
        medicamentoDao.alterar(id,novoNome);
    }

    public Medicamento buscar(int id) {
       return medicamentoDao.buscar(id);

    }

    public List<Medicamento> listar(){
        return medicamentoDao.listar();
    }
}
