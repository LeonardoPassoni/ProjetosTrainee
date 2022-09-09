package br.com.sgsistemas;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoListas {


    public static void main(String[] args) {

        ArrayList<String> cursos = new ArrayList<>();

        System.out.println("Adicionando Cursos: ");
        cursos.add("Java 8: Tire proveito dos novos recursos da linguagem");
        cursos.add("Apache Camel");
        cursos.add("Certificado Java SE 8 Programmer I");
        cursos.forEach(curso -> System.out.println(curso));


        System.out.println("\nRemovendo o segundo curso: ");
        cursos.remove(1);
        cursos.forEach(curso -> System.out.println(curso));


        System.out.println("\nO primeiro curso da lista é o  " + cursos.get(0));


//        for (int i = 0; i <= cursos.size(); i++){
//            System.out.println(cursos.get(i));
//        }

//        cursos.sort((curso1,curso2) -> curso1.compareTo());

        cursos.forEach(curso -> System.out.println(curso));

    }

}
