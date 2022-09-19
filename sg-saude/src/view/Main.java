package view;

import controller.*;
import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//      MedicamentoController medicamentoController = new MedicamentoController();
//        List<Medicamento> medicamentos = new ArrayList<>();
//
//      Medicamento medicamento = new Medicamento("Engov","Remedio para digestao",55.00);
//
//        medicamentoController.adicionar(medicamento);
//        medicamentoController.remover(1);
//        medicamentoController.alterarNome(2,"NovoDoril");
//          medicamento = medicamentoController.buscar(2);
//         System.out.println(medicamento);
//        medicamentos = medicamentoController.listar();
//        medicamentos.forEach(medicamento1 -> System.out.println(medicamento1.getNome()));


//        List<Especialidade> especialidades = new ArrayList<>();
//        EspecialidadeController especialidadeController = new EspecialidadeController();
//
//        Especialidade especialidade = new Especialidade("Clinico Geral");
//        especialidadeController.adicionar(especialidade);
//        especialidadeController.remover(3);
//        especialidades = especialidadeController.listar();
//        especialidades.forEach(especialidade1 -> System.out.println(especialidade1));

//        especialidadeController.alterar(1,"Cirurgia Geral");
//        especialidade = especialidadeController.buscar(1);
//        System.out.println(especialidade);


//        ServicoController servicoController = new ServicoController();
//
//        Servico servico = new Servico("Vacina Covid",110.00);
//        servicoController.adicionar(servico);
     //   servicoController.remover(5);
//        servicoController.alterarNome(3,"Vacina Gripe");
//        servico = servicoController.buscar(1);
//        System.out.println(servico);
//        List<Servico> servicos = servicoController.listar();
//        servicos.forEach(servico1 -> System.out.println(servico1));


//        Date date = new Date();
//        Paciente paciente = new Paciente("Lucas Silva","65.456.847-76",date,
//                "Maria Helena","123456","Azul");
//
//        PacienteController pacienteController = new PacienteController();
//        pacienteController.adicionar(paciente);
//        pacienteController.remover(3);
//        paciente = pacienteController.buscar(7);
//        System.out.println(paciente);
//        List<Paciente> pacientes = pacienteController.listar();
//        pacientes.forEach(paciente1 -> System.out.println(paciente1));




//        Especialidade especialidade = new Especialidade("Clinico Geral");
//        especialidade.setId(4);
//        Date date = new Date();
//        Medico medico = new Medico("Castro asdqweMachado ","48.213.456-86",date,"CRM/PR856478",especialidade);
//        MedicoController medicoController = new MedicoController();
//        medicoController.adicionar(medico);
//        medicoController.remover(7);
//         medico =  medicoController.buscar(3);
//         System.out.println(medico);

//        List<Medico> medicos = medicoController.listar();
//        medicos.forEach(medico1 -> System.out.println(medico1));

        Date date = new Date();
        Paciente paciente = new Paciente(1,"Lucas Silva","65.456.847-76",date,
                "Maria Helena","123456","Azul");

        Especialidade especialidade = new Especialidade(5,"Clinico Geral");
        Medico medico = new Medico(5,"Castro Machado ","48.213.456-86",date,"CRM/PR856478",especialidade);

        Medicamento medicamento = new Medicamento(5,"Engov","Remedio para digestao",55.00);

        Servico servico = new Servico(3,"Raio-X",50);

        Atendimento atendimento = new Atendimento(5,date,paciente,medico);


        AtendimentoController atendimentoController = new AtendimentoController();
//        atendimentoController.adicionar(atendimento);
//        atendimentoController.remover(2);
//        atendimentoController.adicionarMedicamento(atendimento,medicamento);
//        atendimentoController.adicionarServico(atendimento,servico);
           List<Atendimento> atendimentos = atendimentoController.listar();
      // atendimentos.forEach(atendimento1 -> System.out.println(atendimento1));

          atendimentoController.imprimirAtendimento(atendimentos);


    }
}
