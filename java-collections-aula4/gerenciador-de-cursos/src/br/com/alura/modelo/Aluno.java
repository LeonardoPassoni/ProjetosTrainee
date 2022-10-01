package br.com.alura.modelo;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;


    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.nome);
//       return this.numeroMatricula == aluno.numeroMatricula;
    }

    @Override
    public int hashCode() {
//        return this.nome.hashCode();
        return this.numeroMatricula;
    }
}
