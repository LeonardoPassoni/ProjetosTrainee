package br.com.alura.teste;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

import java.util.*;

public class TestaCursoComAluno {


    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));


        Aluno a1 = new Aluno("Cassiano", 1);
        Aluno a2 = new Aluno("Hubner", 2);
        Aluno a3 = new Aluno("Felipe", 3);
        Aluno a4 = new Aluno("Aleph", 4);
        Aluno a5 = new Aluno("Passoni", 5);


        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        javaColecoes.matricula(a5);

//        System.out.println("Alunos Matriculados: ");

//        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
       // javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println(javaColecoes.estaMatriculado(a1));


//        Iterator iterator = javaColecoes.getAlunos().iterator();
//
//        while (iterator.hasNext()){
//            Aluno aluno = (Aluno) iterator.next();
//            System.out.println(aluno.getNome());

//            System.out.println(iterator.next());
//        }

        System.out.println("Buscando o aluno ");
        Aluno aluno = javaColecoes.buscaMatriculado(5);
        System.out.println(aluno);

//        System.out.println(a1.equals(a2));
//        System.out.println(a1.hashCode() == a2.hashCode());

//        System.out.println(javaColecoes.getMatriculaParaAuno());


    }

}
