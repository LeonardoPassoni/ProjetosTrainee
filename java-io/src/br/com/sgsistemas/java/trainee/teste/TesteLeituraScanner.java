package br.com.sgsistemas.java.trainee.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Scanner scanner = new Scanner(new File("contas.csv"),"UTF");

        while (scanner.hasNext()) {

            String linha = scanner.nextLine();


            Scanner scannerLinha = new Scanner(linha);
            scannerLinha.useLocale(Locale.ENGLISH);
            scannerLinha.useDelimiter(",");


            String tipoConta = scannerLinha.next();
            int agencia = scannerLinha.nextInt();
            int numero = scannerLinha.nextInt();
            String titular = scannerLinha.next();
            double saldo = scannerLinha.nextDouble();

            System.out.format("%s %d %d %s %.2f %n",tipoConta,agencia,numero,titular,saldo);


        }
    }
}

