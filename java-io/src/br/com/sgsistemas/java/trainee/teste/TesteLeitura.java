package br.com.sgsistemas.java.trainee.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);




       // bufferedReader.ready()

        String linha = "";

        while (bufferedReader.ready()) {
            linha = bufferedReader.readLine();
            System.out.println(linha);
        }

        bufferedReader.close();
    }
}
