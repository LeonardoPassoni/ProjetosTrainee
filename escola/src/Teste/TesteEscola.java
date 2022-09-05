package Teste;

import Modelo.Aluno;
import Modelo.Endereco;
import Modelo.Escola;
import Modelo.Turma;

import java.util.ArrayList;

public class TesteEscola {


    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Escola escola = new Escola();
        escola.setNome("Modelo.Escola 1234");


        Endereco endereco = new Endereco("Rua123","12546");
        escola.setEndereco(endereco);


        Aluno aluno1 = new Aluno("Leonardo");
        aluno1.setEndereco(endereco);
        //alunos.add(aluno1);

        Aluno aluno2 = new Aluno("Joao");
        aluno2.setEndereco(endereco);
        //alunos.add(aluno2);

        Aluno aluno3 = new Aluno("Claudio");
        aluno3.setEndereco(endereco);
        //alunos.add(aluno3);



        Turma turma01 = new Turma();

        turma01.setAlunos(alunos);
        turma01.setIdentificador("Turma 01");
        turma01.setSerie("8 Serie");

        turma01.getAlunos().add(aluno1);
        turma01.getAlunos().add(aluno2);
        turma01.getAlunos().add(aluno3);


        System.out.println("Alunos: ");
        for(Aluno aluno : alunos){
            System.out.print(aluno);
        }

        System.out.println();

        //System.out.println(turma01.getAlunos());



       // turma.alunos.add(aluno1);


        ArrayList<Turma> turmas = new ArrayList<Turma>();
        turmas.add(turma01);
        escola.setTurmas(turmas);

       // System.out.println(escola.getTurmas());




//        System.out.println(escola.getTurma().getAluno());
//
//        System.out.println(escola.getTurma().getAluno().getNome());
//        System.out.println(escola.getTurma().getAluno().getEndereco().getLogradouro());
//        System.out.println(escola.getEndereco().getNumero());

    }
}
