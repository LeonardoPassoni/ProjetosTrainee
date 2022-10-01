package controller;


import dao.ServicoDao;
import factory.ConnectionFactory;
import model.Servico;

import java.util.List;

public class ServicoController {

    private ServicoDao servicoDao;


    public ServicoController() {
        this.servicoDao = new ServicoDao(ConnectionFactory.obterConexao());
    }


    public void adicionar(Servico servico) {
        servicoDao.adicionar(servico);
    }

    public void remover(int id) {
        servicoDao.remover(id);
    }

    public List<Servico> listar() {
        return servicoDao.listar();
    }

    public void alterarNome(int id, String novoNome){
        servicoDao.alterarNome(id,novoNome);
    }

    public Servico buscar(int id) {
        return servicoDao.buscar(id);
    }
}
