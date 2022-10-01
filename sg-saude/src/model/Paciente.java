package model;

import java.util.Date;

public class Paciente extends Pessoa{


    private String nomeMae;
    private String numeroCarteirinha;
    private String corDaPulseira;


    public Paciente(int id,String nome,String cpf,Date dataNascimento,String nomeMae, String numeroCarteirinha, String corDaPulseira) {
        super(id,nome,cpf,dataNascimento);
        this.nomeMae = nomeMae;
        this.numeroCarteirinha = numeroCarteirinha;
        this.corDaPulseira = corDaPulseira;
    }

    public Paciente(String nome,String cpf,Date dataNascimento,String nomeMae, String numeroCarteirinha, String corDaPulseira) {
        super(nome,cpf,dataNascimento);
        this.nomeMae = nomeMae;
        this.numeroCarteirinha = numeroCarteirinha;
        this.corDaPulseira = corDaPulseira;
    }

    public Paciente() {

    }


    public String getNomeMae() {
        return nomeMae;
    }

    public String getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public String getCorDaPulseira() {
        return corDaPulseira;
    }


    @Override
    public String toString() {
        return
                super.toString()+
                "nomeMae='" + nomeMae + '\'' +
                ", numeroCarteirinha='" + numeroCarteirinha + '\'' +
                ", corDaPulseira='" + corDaPulseira + '\'' +
                '}';
    }
}
