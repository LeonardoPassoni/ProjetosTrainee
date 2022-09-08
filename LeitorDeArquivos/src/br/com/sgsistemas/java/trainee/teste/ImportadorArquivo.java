package br.com.sgsistemas.java.trainee.teste;

import java.io.FileNotFoundException;

public class ImportadorArquivo {


    public static void main(String[] args) {


        GestorImportacao gestorImportacao = new GestorImportacao();


        try {
            gestorImportacao.importarArquivo("Tabela_4_3_10.txt");
            gestorImportacao.importarArquivo("Tabela_4_3_12.txt");
            gestorImportacao.importarArquivo("Tabela_4_3_13.txt");
            gestorImportacao.importarArquivo("Tabela_4_3_14.txt");
            gestorImportacao.importarArquivo("Tabela_4_3_15.txt");
            gestorImportacao.importarArquivo("Tabela_4_3_16.txt");


        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao existe");
        }


        gestorImportacao.imprimiLista();
       //  System.out.println(gestorImportacao.getNaturezaReceitas());
       // System.out.println(gestorImportacao.getTotalVaresInexistentes());

    }
}
