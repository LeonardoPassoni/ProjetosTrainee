package br.com.sgsistemas.java.trainee.teste;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;


public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        //OutputStream fos = Files.newOutputStream((Paths.get("lorem2.txt")), APPEND);
        Writer  osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

       // FileWriter bw = new FileWriter("lorem2.txt");

        bw.newLine();
        bw.write("Fim arquivo");
        bw.append("Fim arquivo");
        bw.newLine();
        bw.close();

    }
}
