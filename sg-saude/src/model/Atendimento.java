package model;

import java.util.Date;
import java.util.List;

public class Atendimento {

    private int id;
    private Date dataAtendimento;
    private Paciente paciente;
    private Medico medico;
    private List<Servico> servicos;
    private List<Medicamento> medicamentos;


}
