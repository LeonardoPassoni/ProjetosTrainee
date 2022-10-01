package br.com.sgsistemas;

import br.com.sgsistemas.modelo.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListasObjetos {


    public static void main(String[] args) {

        Aula aula = new Aula("Aula 1",20);
        Aula aula1 = new Aula("Aula 1",10);
        Aula aula2 = new Aula("Aula 1",5);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(aula);
        aulas.add(aula1);
        aulas.add(aula2);

        aulas.sort(Comparator.comparing(Aula :: getTempoAula));
        aulas.forEach(aula5 -> System.out.println(aula5.getTempoAula()));


    }
}
