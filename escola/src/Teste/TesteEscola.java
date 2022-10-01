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
        aluno1.setCpf("105.569.858-76");
        //alunos.add(aluno1);

        Aluno aluno2 = new Aluno("Joao");
        aluno2.setEndereco(endereco);
        aluno2.setCpf("95.659.985-82");
        //alunos.add(aluno2);

        Aluno aluno3 = new Aluno("Claudio");
        aluno3.setEndereco(endereco);
        aluno3.setCpf("85.965.114-14");
        //alunos.add(aluno3);



        Turma turma01 = new Turma();

        turma01.setAlunos(alunos);
        turma01.setIdentificador("Turma01");
        turma01.setSerie("8 Serie");

        turma01.getAlunos().add(aluno1);
        turma01.getAlunos().add(aluno2);
        turma01.getAlunos().add(aluno3);


        Turma turma02 = new Turma();

        turma02.setAlunos(alunos);
        turma02.setIdentificador("Turma02");
        turma02.setSerie("9 Serie");

        Aluno aluno4 = new Aluno("TestePesquisa");
        aluno4.setCpf("Teste");
        ArrayList<Aluno> alunosTeste = new ArrayList<Aluno>();

       turma02.setAlunos(alunosTeste);
       turma02.getAlunos().add(aluno4);

       //turma01.pesquisarAluno("105.579.858-76");

        System.out.println("Alunos: ");
        for(Aluno aluno : alunos){
            System.out.print(aluno);
        }

        System.out.println();

        //System.out.println(turma01.getAlunos());



       // turma.alunos.add(aluno1);


        ArrayList<Turma> turmas = new ArrayList<Turma>();
        turmas.add(turma01);
        turmas.add(turma02);
        escola.setTurmas(turmas);

        escola.pesquisarAluno("105.569.858-76");


       // System.out.println(escola.getTurmas());




//        System.out.println(escola.getTurma().getAluno());
//
//        System.out.println(escola.getTurma().getAluno().getNome());
//        System.out.println(escola.getTurma().getAluno().getEndereco().getLogradouro());
//        System.out.println(escola.getEndereco().getNumero());

    }
}
