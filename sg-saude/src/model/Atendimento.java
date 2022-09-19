package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Atendimento {

    private int id;
    private Date dataAtendimento;
    private Paciente paciente;
    private Medico medico;
    private List<Servico> servicos;
    private List<Medicamento> medicamentos;

    public Atendimento(int id, Date dataAtendimento, Paciente paciente, Medico medico) {
        this.id = id;
        this.dataAtendimento = dataAtendimento;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Atendimento() {
        this.servicos = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Atendimento(Date dataAtendimento, Paciente paciente, Medico medico) {
        this.dataAtendimento = dataAtendimento;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }


    public List<Servico> getServicos() {
        return servicos;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "dataAtendimento=" + dataAtendimento +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", servicos=" + servicos +
                ", medicamentos=" + medicamentos +
                '}';
    }
}
