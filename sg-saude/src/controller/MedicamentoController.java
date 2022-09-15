package controller;

import dao.MedicamentoDao;
import model.Medicamento;

public class MedicamentoController {

    private MedicamentoDao medicamentoDao;

    public MedicamentoController(){
        medicamentoDao = new MedicamentoDao();
    }

    public void adicionarMedicamento(Medicamento medicamento){
        medicamentoDao.adicionar(medicamento);

    }

}
