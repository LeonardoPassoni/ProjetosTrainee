package model;

import java.util.Date;

public class Medico extends Pessoa{

    private String crm;
    private Especialidade especialidade;


    public Medico(int id, String nome, String cpf, Date dataNascimento, String crm, Especialidade especialidade ) {
        super(id, nome, cpf, dataNascimento);
        this.crm = crm;
        this.especialidade = especialidade;

    }

    public Medico( String nome, String cpf, Date dataNascimento, String crm, Especialidade especialidade ) {
        super(nome, cpf, dataNascimento);
        this.crm = crm;
        this.especialidade = especialidade;

    }
    public Medico(int id, String nome, String cpf, Date dataNascimento, String crm ) {
        super(id, nome, cpf, dataNascimento);
        this.crm = crm;

    }

    public Medico() {
        super();
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }



    @Override
    public String toString() {
        return  super.toString() +
                "crm='" + crm + '\'' +
                ", especialidade=" + especialidade +
                '}';
    }
}
