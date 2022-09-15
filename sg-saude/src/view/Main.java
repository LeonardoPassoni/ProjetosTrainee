package view;

import controller.MedicamentoController;
import model.Medicamento;

public class Main {


    public static void main(String[] args) {

        MedicamentoController medicamentoController = new MedicamentoController();


        Medicamento medicamento = new Medicamento("Doril","Remedio para dor",25.00);
        medicamentoController.adicionarMedicamento(medicamento);
    }
}
