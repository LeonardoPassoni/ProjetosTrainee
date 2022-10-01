package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {


    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        System.out.println("Tamanho Coleção: " + alunos.size());

        alunos.add("Nico");

        System.out.println("Tamanho Coleção: " + alunos.size());
    }
}
