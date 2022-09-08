package br.com.sgsistemas.java.trainee.teste;

import java.io.*;

public class TesteCopiaArquivo {


    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("lorem.txt"); //System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fos = new FileOutputStream("lorem2.txt"); // System.out; // new FileOutputStream("lorem2.txt");
        Writer  osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        // bufferedReader.ready()

        String linha = bufferedReader.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bw.close();
    }
}
