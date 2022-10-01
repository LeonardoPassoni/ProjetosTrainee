package Modelo;

import Modelo.Aluno;

import java.util.ArrayList;

public class Turma {

    String serie;
    String identificador;

    ArrayList<Aluno> alunos;


//    public Turma() {
//        this.alunos = new ArrayList<Aluno>();
//    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aluno pesquisarAluno(String cpf){

        for (Aluno aluno : this.alunos){
            if (aluno.getCpf().equals(cpf)){
                System.out.println("O aluno está na turma" + this.identificador);
                System.out.println(aluno);
            }
        }
        return null;
    }
}
